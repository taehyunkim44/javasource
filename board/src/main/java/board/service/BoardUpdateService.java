package board.service;

import static board.dao.JdbcUtil.close;
import static board.dao.JdbcUtil.commit;
import static board.dao.JdbcUtil.getConnection;
import static board.dao.JdbcUtil.rollback;

import java.sql.Connection;

import board.dao.BoardDAO;
import board.dto.BoardDTO;

public class BoardUpdateService {
	public boolean update(BoardDTO updateDto) {

		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);

		boolean flag = false;

		if (dao.updateArticle(updateDto)) {
			commit(con);
			flag = true;
		} else {
			rollback(con);
		}
		close(con);

		return flag;
	}
}
