package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import visual.Frame; 
import visual.PaneljogoVelha;

public class ControladorFrame implements ActionListener {
	Frame frame;
	PaneljogoVelha paneljogoVelha; 
	ControladorjogoVelha controladorjogoVelha; 
	
	public ControladorFrame() {
		frame = new Frame();
		paneljogoVelha = new PaneljogoVelha();
		paneljogoVelha.getBtn9().setBounds(362, 271, 81, 40);
		paneljogoVelha.getBtn8().setBounds(271, 271, 81, 40);
		paneljogoVelha.getBtn7().setBounds(180, 271, 81, 40);
		paneljogoVelha.getBtn6().setBounds(362, 220, 81, 40);
		paneljogoVelha.getBtn5().setBounds(271, 220, 81, 40);
		paneljogoVelha.getBtn4().setBounds(180, 220, 81, 40);
		paneljogoVelha.getBtn3().setBounds(362, 169, 81, 40);
		paneljogoVelha.getBtn2().setBounds(271, 169, 81, 40);
		paneljogoVelha.getBtn1().setBounds(179, 170, 81, 40);
	    frame.getContentPane().add(paneljogoVelha);
	    
	    controladorjogoVelha = new ControladorjogoVelha(paneljogoVelha);
	    paneljogoVelha.setLayout(null);
	    
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
