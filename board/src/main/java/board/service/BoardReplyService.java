package board.service;

import static board.dao.JdbcUtil.close;
import static board.dao.JdbcUtil.commit;
import static board.dao.JdbcUtil.getConnection;
import static board.dao.JdbcUtil.rollback;

import java.sql.Connection;

import board.dao.BoardDAO;
import board.dto.BoardDTO;

public class BoardReplyService {
	public boolean reply(BoardDTO replyDto) {

		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);
		boolean result = dao.reply(replyDto);

		if (result) {
			commit(con);
		} else {
			rollback(con);
		}
		close(con);

		return result;
	}
}
