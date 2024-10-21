package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton; 
import visual.PaneljogoVelha;

public class ControladorjogoVelha implements ActionListener {
    PaneljogoVelha paneljogoVelha;
    private boolean isJogador1Turno = true; // Controla quem está jogando
    private char[] jogadas = new char[9]; 
    private int contVez = 0;
    private boolean empate = false;

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
        paneljogoVelha.getLblResultado();
        paneljogoVelha.getLblVez();
    }
    
    /* =====================================> EVENTOS <===================================== */
    
    public void actionPerformed(ActionEvent e) {
        JButton btnClicado = (JButton) e.getSource(); // armazena o botão que foi acionado 
       
        if (isJogador1Turno) {
        	paneljogoVelha.getLblVez().setText("Vez do jogador 2 (O).");
            btnClicado.setText("X"); // Jogador 1
            
            if (btnClicado == paneljogoVelha.getBtn1()) {
                jogadas[0] = 'X';
            } else if (btnClicado == paneljogoVelha.getBtn2()) {
                jogadas[1] = 'X';
            } else if (btnClicado == paneljogoVelha.getBtn3()) {
                jogadas[2] = 'X';
            } else if (btnClicado == paneljogoVelha.getBtn4()) {
                jogadas[3] = 'X';
            } else if (btnClicado == paneljogoVelha.getBtn5()) {
                jogadas[4] = 'X';
            } else if (btnClicado == paneljogoVelha.getBtn6()) {
                jogadas[5] = 'X';
            } else if (btnClicado == paneljogoVelha.getBtn7()) {
                jogadas[6] = 'X';
            } else if (btnClicado == paneljogoVelha.getBtn8()) {
                jogadas[7] = 'X';
            } else if (btnClicado == paneljogoVelha.getBtn9()) {
                jogadas[8] = 'X';
            }   
        } else {
        	paneljogoVelha.getLblVez().setText("Vez do jogador 1 (X).");
            if (btnClicado == paneljogoVelha.getBtn1()) {
                jogadas[0] = 'O';
            } else if (btnClicado == paneljogoVelha.getBtn2()) {
                jogadas[1] = 'O';
            } else if (btnClicado == paneljogoVelha.getBtn3()) {
                jogadas[2] = 'O';
            } else if (btnClicado == paneljogoVelha.getBtn4()) {
                jogadas[3] = 'O';
            } else if (btnClicado == paneljogoVelha.getBtn5()) {
                jogadas[4] = 'O';
            } else if (btnClicado == paneljogoVelha.getBtn6()) {
                jogadas[5] = 'O';
            } else if (btnClicado == paneljogoVelha.getBtn7()) {
                jogadas[6] = 'O';
            } else if (btnClicado == paneljogoVelha.getBtn8()) {
                jogadas[7] = 'O';
            } else if (btnClicado == paneljogoVelha.getBtn9()) {
                jogadas[8] = 'O';
            }
            btnClicado.setText("O"); // Jogador 2
        }
        btnClicado.setEnabled(false);
        isJogador1Turno = !isJogador1Turno;
        contVez++;
        
        // Verificando condições de vitória
        verificarVitoria();
    }
    
    /* =====================================> FUNÇÕES <===================================== */
   
    private void verificarVitoria() {   	
        if (jogadas[0] != '\0' && jogadas[0] == jogadas[1] && jogadas[1] == jogadas[2]) {
			finalizarJogo();
        } else if (jogadas[3] != '\0' && jogadas[3] == jogadas[4] && jogadas[4] == jogadas[5]) {
			finalizarJogo();
        } else if (jogadas[6] != '\0' && jogadas[6] == jogadas[7] && jogadas[7] == jogadas[8]) {
			finalizarJogo();
        } else if (jogadas[0] != '\0' && jogadas[0] == jogadas[3] && jogadas[3] == jogadas[6]) {        	finalizarJogo();
        } else if (jogadas[1] != '\0' && jogadas[1] == jogadas[4] && jogadas[4] == jogadas[7]) {
			finalizarJogo();
        } else if (jogadas[2] != '\0' && jogadas[2] == jogadas[5] && jogadas[5] == jogadas[8]) {
			finalizarJogo();
        } else if (jogadas[0] != '\0' && jogadas[0] == jogadas[4] && jogadas[4] == jogadas[8]) {
			finalizarJogo();
        } else if (jogadas[2] != '\0' && jogadas[2] == jogadas[4] && jogadas[4] == jogadas[6]) {
			finalizarJogo();
        } else if(contVez==9) {
        	empate=true;
			finalizarJogo();
        }
    }
    
    private void finalizarJogo() {
    	paneljogoVelha.getBtn1().setEnabled(false);
    	paneljogoVelha.getBtn2().setEnabled(false);
    	paneljogoVelha.getBtn3().setEnabled(false);
    	paneljogoVelha.getBtn4().setEnabled(false);
    	paneljogoVelha.getBtn5().setEnabled(false);
    	paneljogoVelha.getBtn6().setEnabled(false);
    	paneljogoVelha.getBtn7().setEnabled(false);
    	paneljogoVelha.getBtn8().setEnabled(false);
    	paneljogoVelha.getBtn9().setEnabled(false);

    	paneljogoVelha.getLblVez().setText("FIM DE JOGO!");

    	if(!empate) {
    		if(contVez%2!=0) {
    			paneljogoVelha.getLblResultado().setText("Vitória! Jogador 1 ganhou.");
    		} else {
    			paneljogoVelha.getLblResultado().setText("Vitória! Jogador 2 ganhou.");
    		}    		
    	} else {
    		paneljogoVelha.getLblResultado().setText("Empate. Deu velha!");
    	} 	
    }
}
