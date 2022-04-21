package item.service;

import static item.dao.JdbcUtil.close;
import static item.dao.JdbcUtil.commit;
import static item.dao.JdbcUtil.getConnection;
import static item.dao.JdbcUtil.rollback;

import java.sql.Connection;

import item.dao.ItemDAO;
import item.dto.ItemDTO;

public class ItemInsertService {
	public boolean insertItem(ItemDTO itemDto) {

		Connection con = getConnection();
		ItemDAO dao = new ItemDAO(con);

		boolean result = dao.insert(itemDto);

		if (result) {
			commit(con);
		} else {
			rollback(con);
		}
		close(con);

		return result;
	}

}
