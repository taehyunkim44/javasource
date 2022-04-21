package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lombok.AllArgsConstructor;
import member.dto.MemberDTO;
import member.service.MemberLoginService;
import member.service.MemberModifyService;

@AllArgsConstructor
public class MemberModifyAction implements Action {

	private String path;

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String password = request.getParameter("current_password");
		String newPassword = request.getParameter("new_password");
		String confirmPassword = request.getParameter("confirm_password");

		HttpSession session = request.getSession();
		MemberDTO loginDto = (MemberDTO) session.getAttribute("loginDto");
		String userid = loginDto.getUserid();

		MemberLoginService loginService = new MemberLoginService();
		if (loginService.login(userid, confirmPassword) != null) {// 현재비밀번호가 일치하면

			MemberModifyService service = new MemberModifyService();

			if (newPassword.equals(confirmPassword)) { // 두 개의 비밀번호가 같은지 확인
				if (service.modify(userid, confirmPassword)) { // 변경실패
					path = "/view/modifyForm.jsp";
				} else { // 비밀번호 변경 성공
					session.invalidate();
				}
			}
		} else { // 현재 비밀번호가 일치하지 않을때
			path = "/view/modifyForm.jsp";
		}
		return new ActionForward(path, true);
	}

}
