package board.service;

import static board.dao.JdbcUtil.close;
import static board.dao.JdbcUtil.commit;
import static board.dao.JdbcUtil.getConnection;
import static board.dao.JdbcUtil.rollback;

import java.sql.Connection;

import board.dao.BoardDAO;
import board.dto.BoardDTO;

public class BoardInsertService {
	public boolean insert(BoardDTO insertDto) {

		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);
		boolean result = dao.insertArticle(insertDto);

		if (result) {
			commit(con);
		} else {
			rollback(con);
		}

		close(con);

		return result;

	}
}
