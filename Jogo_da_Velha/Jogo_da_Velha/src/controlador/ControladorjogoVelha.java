package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton; 
import visual.PaneljogoVelha;

public class ControladorjogoVelha implements ActionListener {

    PaneljogoVelha paneljogoVelha;
    private boolean isJogador1Turno = true; // Controla quem está jogando

    /**
     * @wbp.parser.entryPoint
     */
    public ControladorjogoVelha(PaneljogoVelha paneljogoVelha) {
        this.paneljogoVelha = paneljogoVelha;
        addEventos();
    }

    private void addEventos() {
        paneljogoVelha.getBtn1().addActionListener(this);
        paneljogoVelha.getBtn2().addActionListener(this);
        paneljogoVelha.getBtn3().addActionListener(this);
        paneljogoVelha.getBtn4().addActionListener(this);
        paneljogoVelha.getBtn5().addActionListener(this);
        paneljogoVelha.getBtn6().addActionListener(this);
        paneljogoVelha.getBtn7().addActionListener(this);
        paneljogoVelha.getBtn8().addActionListener(this);
        paneljogoVelha.getBtn9().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        JButton btnClicado = (JButton) e.getSource(); // armazenar o botão que foi acionado 
        
        // Verifica se o botão já está marcado
        if (btnClicado.getText().equals("")) {
            
            if (isJogador1Turno) {
                btnClicado.setText("X"); // Jogador 1
            } else {
                btnClicado.setText("O"); // Jogador 2
            }
            
            isJogador1Turno = !isJogador1Turno;
        }
    }
}
