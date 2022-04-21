package board.service;

import static board.dao.JdbcUtil.close;
import static board.dao.JdbcUtil.commit;
import static board.dao.JdbcUtil.getConnection;
import static board.dao.JdbcUtil.rollback;

import java.sql.Connection;

import board.dao.BoardDAO;

public class BoardHitUpdateService {

	public void readUpdate(int bno) {
		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);

		if (dao.hitUpdate(bno)) {
			commit(con);
		} else {
			rollback(con);
		}
		close(con);
	}
}
