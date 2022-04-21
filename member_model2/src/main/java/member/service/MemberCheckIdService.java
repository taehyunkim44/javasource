package member.service;

import static member.dao.JdbcUtil.close;
import static member.dao.JdbcUtil.getConnection;

import java.sql.Connection;

import member.dao.MemberDAO;

public class MemberCheckIdService {

	public boolean dupId(String userid) {
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);

		boolean result = dao.checkId(userid);

		close(con);

		return result;
	}
}
