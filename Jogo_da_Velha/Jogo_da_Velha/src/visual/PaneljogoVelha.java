package visual;

import javax.swing.*;
import java.awt.*;

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
	
	JTextField jogador1;
	JTextField jogador2;
	JLabel jogadorAtual;
	
	
	public PaneljogoVelha() {
		this.setLayout(null);
		this.setSize(1000, 700);
		
		this.add(getBtn1());
		this.add(getBtn2());
		this.add(getBtn3());
		this.add(getBtn4());
		this.add(getBtn5());
		this.add(getBtn6());
		this.add(getBtn7());
		this.add(getBtn8());
		this.add(getBtn9());
		this.add(getTextFielJogador1());
		this.add(getTextFielJogador2());
		
		JLabel lblNewLabel = new JLabel("Nome Jogador 1: ");
		lblNewLabel.setBounds(41, 24, 199, 14);
		add(lblNewLabel);
		
		JLabel lblNomeJogador = new JLabel("Nome Jogador 2: ");
		lblNomeJogador.setBounds(40, 94, 199, 14);
		add(lblNomeJogador);
	}

	public JButton getBtn1() {
		if(btn1 == null) {
			btn1 = new JButton();
			btn1.setSize(81, 40);
			btn1.setLocation(10, 198);
			//btn1.setText("1");

		}
		return btn1;
	}


	public JButton getBtn2() {
		if(btn2 == null) {
			btn2 = new JButton();
			btn2.setSize(81, 40);
			btn2.setLocation(102, 197);
			//btn2.setText("2");

		}
		return btn2;
	}


	public JButton getBtn3() {
		if(btn3 == null) {
			btn3 = new JButton();
			btn3.setSize(81, 40);
			btn3.setLocation(193, 197);
			//btn3.setText("3");

		}
		
		return btn3;
	}

	
	public JButton getBtn4() {
		if(btn4 == null) {
			btn4 = new JButton();
			btn4.setSize(81, 40);
			btn4.setLocation(11, 248);
			//btn4.setText("4");

		}
		
		return btn4;
	}

	public JButton getBtn5() {
		if(btn5 == null) {
			btn5 = new JButton();
			btn5.setSize(81, 40);
			btn5.setLocation(102, 248);
			//btn5.setText("5");

		}
		return btn5;
	}


	public JButton getBtn6() {
		if(btn6 == null) {
			btn6 = new JButton();
			btn6.setSize(81, 40);
			btn6.setLocation(193, 248);
			//btn6.setText("6");

		}
		return btn6;
	}


	public JButton getBtn7() {
		if(btn7 == null) {
			btn7 = new JButton();
			btn7.setSize(81, 40);
			btn7.setLocation(11, 299);
			//btn7.setText("7");

		}
		return btn7;
	}

	public JButton getBtn8() {
		if(btn8 == null) {
			btn8 = new JButton();
			btn8.setSize(81, 40);
			btn8.setLocation(102, 299);
			//btn8.setText("8");

		}
		return btn8;
	}


	public JButton getBtn9() {
		if(btn9 == null) {
			btn9 = new JButton();
			btn9.setSize(81, 40);
			btn9.setLocation(193, 299);
			//btn9.setText("9");

		}
		return btn9;
	}
	
	public JTextField getTextFielJogador1() {
		if(jogador1 == null) {
			jogador1 = new JTextField();
			jogador1.setSize(200, 40);
			jogador1.setLocation(40, 43);
		}
		
		return jogador1;
	}
	
	public JTextField getTextFielJogador2() {
		if(jogador2 == null) {
			jogador2 = new JTextField();
			jogador2.setSize(200, 40);
			jogador2.setLocation(40, 119);
		}
		
		return jogador2;
	}
	
	 public String getNomeJogador1() {
	        return jogador1.getText();
	    }

	 public String getNomeJogador2() {
	        return jogador2.getText();
	    }
}
