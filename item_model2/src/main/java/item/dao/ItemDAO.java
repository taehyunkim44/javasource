package item.dao;

import static item.dao.JdbcUtil.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import item.dto.ItemDTO;

public class ItemDAO {
	private Connection con;

	public ItemDAO(Connection con) {
		super();
		this.con = con;
	}

	// CRUD
	public List<ItemDTO> getList() {
		List<ItemDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from item";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ItemDTO dto = new ItemDTO();
				dto.setNum(rs.getInt("num"));
				dto.setCategory(rs.getString("category"));
				dto.setName(rs.getString("name"));
				dto.setPsize(rs.getString("psize"));
				dto.setPrice(rs.getInt("price"));
				dto.setRegisterAt(rs.getDate("register_at"));
				list.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return list;
	}

	public boolean insert(ItemDTO insertDto) {

		PreparedStatement pstmt = null;
		String sql = "insert into item (num,category,name,content,psize,price)" + "values(item_seq.nextval,?,?,?,?,?)";
		boolean flag = false;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, insertDto.getCategory());
			pstmt.setString(2, insertDto.getName());
			pstmt.setString(3, insertDto.getContent());
			pstmt.setString(4, insertDto.getPsize());
			pstmt.setInt(5, insertDto.getPrice());

			int result = pstmt.executeUpdate();

			if (result > 0)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return flag;
	}

	public boolean delete(int num) {

		PreparedStatement pstmt = null;
		String sql = "delete from item where num=?";
		boolean flag = false;

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);

			int result = pstmt.executeUpdate();

			if (result > 0)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return flag;
	}

	public boolean update(int num, int price, String psize) {

		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "update item set price=?, psize=? where num=?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, price);
			pstmt.setString(2, psize);
			pstmt.setInt(3, num);

			int result = pstmt.executeUpdate();

			if (result > 0)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return flag;
	}

	public List<ItemDTO> searchList(String category, String name) {
		List<ItemDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select num,category,name,psize,price,register_at from item where category=? and name=?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, category);
			pstmt.setString(2, name);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				ItemDTO itemDto = new ItemDTO();
				itemDto.setNum(rs.getInt("num"));
				itemDto.setCategory(rs.getString("category"));
				itemDto.setName(rs.getString("name"));
				itemDto.setPrice(rs.getInt("price"));
				itemDto.setPsize(rs.getString("psize"));
				itemDto.setRegisterAt(rs.getDate("registerAt"));

				list.add(itemDto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return list;
	}
}
