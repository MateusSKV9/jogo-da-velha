package visual;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;

public class Home extends JPanel {
	private JButton btnJogar;
	public Home() {
		setLayout(null);
		add(getBtnJogar());
		
	}
	public JButton getBtnJogar() {
		if (btnJogar == null) {
			btnJogar = new JButton("Jogar");
			btnJogar.setFont(new Font("Tahoma", Font.PLAIN, 25));
			btnJogar.setBounds(160, 184, 179, 132);
		}
		return btnJogar;
	}
}
