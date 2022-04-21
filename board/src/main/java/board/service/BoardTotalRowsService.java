package board.service;

import static board.dao.JdbcUtil.close;
import static board.dao.JdbcUtil.getConnection;

import java.sql.Connection;

import board.dao.BoardDAO;

public class BoardTotalRowsService {
	public int total() {
		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);

		int totalRows = dao.totalRows();

		close(con);

		return totalRows;
	}
}
