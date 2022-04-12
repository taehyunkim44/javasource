package web2.main;

import java.sql.Connection;

import web2.dao.JdbcUtil;
import web2.dao.MemberDAO;

public class main {
	public static void main(String[] args) {
		Connection con = JdbcUtil.getConnection();
		MemberDAO dao = new MemberDAO(con);

		if (dao.update(2, "서울")) {
			System.out.println("o");
		} else {
			System.out.println("x");
		}
		JdbcUtil.commit(con);

	}
}
