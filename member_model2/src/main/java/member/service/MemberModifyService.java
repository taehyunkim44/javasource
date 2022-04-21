package member.service;

import static member.dao.JdbcUtil.close;
import static member.dao.JdbcUtil.commit;
import static member.dao.JdbcUtil.getConnection;
import static member.dao.JdbcUtil.rollback;

import java.sql.Connection;

import member.dao.MemberDAO;

public class MemberModifyService {

	public boolean modify(String newPassword, String confirmPassword) {
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);

		boolean result = dao.changePassword(newPassword, confirmPassword);

		if (result) {
			commit(con);
		} else {
			rollback(con);
		}
		close(con);

		return result;
	}

}
