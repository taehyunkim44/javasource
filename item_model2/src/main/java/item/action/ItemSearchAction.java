package item.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import item.dto.ItemDTO;
import item.service.ItemSearchService;

public class ItemSearchAction implements Action {

	private String path;

	public ItemSearchAction(String path) {
		super();
		this.path = path;
	}

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String category = request.getParameter("category");
		String name = request.getParameter("name");

		ItemSearchService service = new ItemSearchService();

		List<ItemDTO> list = service.list(category, name);

		request.setAttribute("list", list);

		return new ActionForward(path, false);
	}

}
