package item.service;

import static item.dao.JdbcUtil.close;
import static item.dao.JdbcUtil.getConnection;

import java.sql.Connection;
import java.util.List;

import item.dao.ItemDAO;
import item.dto.ItemDTO;

public class ItemListService {
	public List<ItemDTO> listAll() {

		Connection con = getConnection();
		ItemDAO dao = new ItemDAO(con);

		List<ItemDTO> list = dao.getList();

		close(con);

		return list;
	}
}
