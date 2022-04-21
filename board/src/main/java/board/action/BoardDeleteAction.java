package board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.service.BoardDeleteService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardDeleteAction implements Action {

	private String path;

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		int bno = Integer.parseInt(request.getParameter("bno"));
		String password = request.getParameter("password");

		BoardDeleteService service = new BoardDeleteService();

		if (!service.delete(bno, password)) {
			path = "/view/qna_board_pwdCheck.jsp?bno=" + bno;
		}

		return new ActionForward(path, true);
	}

}
