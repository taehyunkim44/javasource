package member.service;

import static member.dao.JdbcUtil.close;
import static member.dao.JdbcUtil.commit;
import static member.dao.JdbcUtil.getConnection;
import static member.dao.JdbcUtil.rollback;

import java.sql.Connection;

import member.dao.MemberDAO;

public class MemberLeaveService {
	public boolean remove(String userid, String password) {

		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);

		boolean result = dao.leave(userid, password);

		if (result) {
			commit(con);
		} else {
			rollback(con);
		}

		close(con);

		return result;
	}

}
