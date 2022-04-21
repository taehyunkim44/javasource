package board.service;

import static board.dao.JdbcUtil.close;
import static board.dao.JdbcUtil.commit;
import static board.dao.JdbcUtil.getConnection;
import static board.dao.JdbcUtil.rollback;

import java.sql.Connection;

import board.dao.BoardDAO;

public class BoardDeleteService {
	public boolean delete(int bno, String password) {
		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);
		boolean result = dao.delete(bno, password);

		if (result) {
			commit(con);
		} else {
			rollback(con);
		}
		close(con);

		return result;
	}
}
