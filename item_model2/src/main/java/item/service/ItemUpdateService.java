package item.service;

import static item.dao.JdbcUtil.close;
import static item.dao.JdbcUtil.commit;
import static item.dao.JdbcUtil.getConnection;
import static item.dao.JdbcUtil.rollback;

import java.sql.Connection;

import item.dao.ItemDAO;

public class ItemUpdateService {

	public boolean modify(int num, int price, String psize) {
		Connection con = getConnection();
		ItemDAO dao = new ItemDAO(con);
		boolean result = dao.update(num, price, psize);

		if (result) {
			commit(con);
		} else {
			rollback(con);
		}
		close(con);

		return result;
	}
}
