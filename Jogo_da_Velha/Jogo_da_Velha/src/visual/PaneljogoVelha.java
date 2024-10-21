package visual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PaneljogoVelha extends JPanel {
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	JButton btn7;
	JButton btn8;
	JButton btn9;
	JLabel jogadorAtual;
	private JLabel lblVez;
	private JLabel lblResultado;
	
	
	public PaneljogoVelha() {
		this.setLayout(null);
		this.setSize(500, 510);
		
		this.add(getBtn1());
		this.add(getBtn2());
		this.add(getBtn3());
		this.add(getBtn4());
		this.add(getBtn5());
		this.add(getBtn6());
		this.add(getBtn7());
		this.add(getBtn8());
		this.add(getBtn9());
		add(getLblVez());
		add(getLblResultado());
	}

	public JButton getBtn1() {
		if(btn1 == null) {
			btn1 = new JButton();
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btn1.setText("1");
			btn1.setSize(109, 109);
			btn1.setLocation(70, 93);
			//btn1.setText("1");

		}
		return btn1;
	}


	public JButton getBtn2() {
		if(btn2 == null) {
			btn2 = new JButton();
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btn2.setText("2");
			btn2.setSize(109, 109);
			btn2.setLocation(189, 93);
			//btn2.setText("2");

		}
		return btn2;
	}


	public JButton getBtn3() {
		if(btn3 == null) {
			btn3 = new JButton();
			btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btn3.setText("3");
			btn3.setSize(109, 109);
			btn3.setLocation(308, 93);
			//btn3.setText("3");

		}
		
		return btn3;
	}

	
	public JButton getBtn4() {
		if(btn4 == null) {
			btn4 = new JButton();
			btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btn4.setText("4");
			btn4.setSize(109, 109);
			btn4.setLocation(70, 212);
			//btn4.setText("4");

		}
		
		return btn4;
	}

	public JButton getBtn5() {
		if(btn5 == null) {
			btn5 = new JButton();
			btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btn5.setText("5");
			btn5.setSize(109, 109);
			btn5.setLocation(189, 212);
			//btn5.setText("5");

		}
		return btn5;
	}


	public JButton getBtn6() {
		if(btn6 == null) {
			btn6 = new JButton();
			btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btn6.setText("6");
			btn6.setSize(109, 109);
			btn6.setLocation(308, 212);
			//btn6.setText("6");

		}
		return btn6;
	}


	public JButton getBtn7() {
		if(btn7 == null) {
			btn7 = new JButton();
			btn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btn7.setText("7");
			btn7.setSize(109, 109);
			btn7.setLocation(70, 331);
			//btn7.setText("7");

		}
		return btn7;
	}

	public JButton getBtn8() {
		if(btn8 == null) {
			btn8 = new JButton();
			btn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btn8.setText("8");
			btn8.setSize(109, 109);
			btn8.setLocation(189, 331);
			//btn8.setText("8");

		}
		return btn8;
	}


	public JButton getBtn9() {
		if(btn9 == null) {
			btn9 = new JButton();
			btn9.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btn9.setText("9");
			btn9.setSize(109, 109);
			btn9.setLocation(308, 331);
			//btn9.setText("9");

		}
		return btn9;
	}
	
	public JLabel getLblVez() {
		if (lblVez == null) {
			lblVez = new JLabel("Vez do Jogador 1 (X)");
			lblVez.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblVez.setBounds(158, 30, 269, 25);
		}
		return lblVez;
	}
	public JLabel getLblResultado() {
		if (lblResultado == null) {
			lblResultado = new JLabel("Resultado");
			lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblResultado.setBounds(70, 464, 94, 25);
		}
		return lblResultado;
	}
}
