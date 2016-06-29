package View;

public class MainView {

	public static final int STANDAR_WIDTH = 800;
	public static final int STANDAR_HEIGHT = 600;
	
	private int widthAdmin;
	private int heightAdmin;
	private int widthClient;
	private int heightClient;
	
	private AdminView adminView;
	private ClientView clientView;
	
	public MainView () {
		setHeightAdmin(STANDAR_HEIGHT);
		setHeightClient(STANDAR_HEIGHT);
		setWidthAdmin(STANDAR_WIDTH);
		setWidthClient(STANDAR_WIDTH);
		setAdminView(null);
		setClientView(null);
	}
	
	public MainView (int widthAdmin, int heightAdmin, int widthClient, int heightClient) {
		setHeightAdmin(heightAdmin);
		setHeightClient(heightClient);
		setWidthAdmin(widthAdmin);
		setWidthClient(widthClient);
		setAdminView(null);
		setClientView(null);
	}
	
	public void start () {
		if ((getAdminView() == null) && (getClientView() == null)) {
			setAdminView(new AdminView(getWidthAdmin(), getHeightAdmin()));
			setClientView(new ClientView(getWidthAdmin(), getWidthClient(), getHeightClient()));
		}
	}

	public void setAdminSize (int weidth, int height) {
		setWidthAdmin(weidth);
		setHeightAdmin(height);
	}
	
	public void setClientSize (int weidth, int height) {
		setWidthClient(weidth);
		setHeightClient(height);
	}
	
	public int getWidthAdmin() {
		return widthAdmin;
	}

	public void setWidthAdmin(int widthAdmin) {
		this.widthAdmin = widthAdmin;
	}

	public int getHeightAdmin() {
		return heightAdmin;
	}

	public void setHeightAdmin(int heightAdmin) {
		this.heightAdmin = heightAdmin;
	}

	public int getWidthClient() {
		return widthClient;
	}

	public void setWidthClient(int widthClient) {
		this.widthClient = widthClient;
	}

	public int getHeightClient() {
		return heightClient;
	}

	public void setHeightClient(int heightClient) {
		this.heightClient = heightClient;
	}

	private AdminView getAdminView() {
		return adminView;
	}

	private void setAdminView(AdminView adminView) {
		this.adminView = adminView;
	}

	private ClientView getClientView() {
		return clientView;
	}

	private void setClientView(ClientView clientView) {
		this.clientView = clientView;
	}
	
}
