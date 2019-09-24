import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VentanaPrincipal() {
		setTitle("Ventana 4K");
		this.setSize(640,480);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		VentanaPrincipal mainWindow = new VentanaPrincipal();
		mainWindow.setVisible(true);
		System.out.println("Hola mundoo");
		
	}

}
