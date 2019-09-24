import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VentanaPrincipal() {
		setTitle("Mi primera ventana");
		this.setSize(320,240);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		VentanaPrincipal mainWindow = new VentanaPrincipal();
		mainWindow.setVisible(true);
		
	}

}
