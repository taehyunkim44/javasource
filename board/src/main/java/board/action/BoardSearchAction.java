package board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardSearchAction implements Action {

	private String path;

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

//		// searchForm에서 넘기는 값 가져오기
//		SearchDTO searchDto = new SearchDTO();
//		searchDto.setCriteria(request.getParameter("criteria"));
//		searchDto.setKeyword(request.getParameter("keyword"));
//
//		// service 작업
//		BoardSearchService service = new BoardSearchService();
//		List<BoardDTO> list = service.searchList(searchDto);
//
//		request.setAttribute("list", list);
//		// 페이지 이동
//		return new ActionForward(path, false);
		return null;
	}

}
