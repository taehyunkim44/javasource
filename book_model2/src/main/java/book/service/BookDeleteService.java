package book.service;

import static book.dao.JdbcUtil.close;
import static book.dao.JdbcUtil.commit;
import static book.dao.JdbcUtil.getConnection;
import static book.dao.JdbcUtil.rollback;

import java.sql.Connection;

import book.dao.BookDAO;

public class BookDeleteService {
	public boolean remove(int code) {
		// db작업
		Connection con = getConnection();
		BookDAO dao = new BookDAO(con);

		boolean result = dao.delete(code);

		if (result) {
			commit(con);
		} else {
			rollback(con);
		}
		close(con);

		return result;
	}
}
