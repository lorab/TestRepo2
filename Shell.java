public class Shell extends Shell_Base {

	private final Logger LOGGER = LoggerFactory.getLogger(Shell.class);

	/**
	 * Constructs the class <code>Shell</code>
	 */
	protected Shell(String id, Frame frame) {
		super(id, frame);
	}

	protected NavigationBar getWorksetBar() {
		return find(UI5By.jsId("_oWorksetBar.getId()"));
	}

	protected NavigationBar getFacetBar() {
		return find(UI5By.jsId("_oFacetBar.getId()"));
	}

	protected WebElement getLogoutElement() {
		return findWebElement(UI5By.idSuffix("-logout"));
	}

	protected WebElement getCanvasBackground() {
		return findWebElement(UI5By.idSuffix("-canvasBackground"));
	}
}
