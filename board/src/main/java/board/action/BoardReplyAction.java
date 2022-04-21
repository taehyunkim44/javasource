package board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.BoardDTO;
import board.service.BoardReplyService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardReplyAction implements Action {

	private String path; // /qList.do

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// qna_board_reply.jsp 넘기는 값 가져오기(댓글 + 원본글의 re~~~)

		BoardDTO replyDto = new BoardDTO();
		// 댓글
		replyDto.setTitle(request.getParameter("title"));
		replyDto.setContent(request.getParameter("content"));
		replyDto.setName(request.getParameter("name"));
		replyDto.setPassword(request.getParameter("password"));

		// 원본글
		int bno = Integer.parseInt(request.getParameter("bno"));
		replyDto.setRe_lev(Integer.parseInt(request.getParameter("re_lev")));
		replyDto.setRe_seq(Integer.parseInt(request.getParameter("re_seq")));
		replyDto.setRe_ref(Integer.parseInt(request.getParameter("re_ref")));

		BoardReplyService service = new BoardReplyService();

		if (!service.reply(replyDto)) {
			path = "/qReplyView.do?bno=" + bno;
		}

		return new ActionForward(path, true);
	}

}
