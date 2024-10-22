package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import visual.Frame;
import visual.Home;
import visual.PaneljogoVelha;

public class ControladorFrame implements ActionListener {
	Frame frame;
	Home home; 
	ControladorHome controladorHome; 
	
	public ControladorFrame() {
		frame = new Frame();
		home = new Home();
	    frame.setContentPane(home);
	    controladorHome = new ControladorHome(home, frame);
	    frame.revalidate();
		frame.repaint();
		addEventos();
	}
	
	private void addEventos() {
		
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		new ControladorFrame();
	}
}
