package item.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import item.service.ItemUpdateService;

public class ItemUpdateAction implements Action {

	private String path;

	public ItemUpdateAction(String path) {
		super();
		this.path = path;
	}

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		int num = Integer.parseInt(request.getParameter("num"));
		int price = Integer.parseInt(request.getParameter("price"));
		String psize = request.getParameter("psize");

		ItemUpdateService service = new ItemUpdateService();

		if (!service.modify(num, price, psize)) {
			path = "/update.jsp";
		}

		return new ActionForward(path, true);
	}

}
