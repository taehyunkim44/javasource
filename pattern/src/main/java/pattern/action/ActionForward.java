package pattern.action;

public class ActionForward {
	// path,이동방식
	private String path;
	private boolean redirect; // true(sendRedirect), false(forward)

	public String getPath() {
		return path;
	}

	public ActionForward() {
		super();
	}

	public ActionForward(String path, boolean redirect) {
		super();
		this.path = path;
		this.redirect = redirect;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public boolean isRedirect() {
		return redirect;
	}

	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}

}
