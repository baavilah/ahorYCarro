/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
/**
 *
 * @author Estudiante
 */
public class Tablero extends JPanel implements ActionListener, KeyListener{
    private Timer timer;
    private int x=0;
    private int y=0;
    private Carro2 carro;
    private Circulo circulo;
    
    public Tablero(){
        this.timer = new Timer(20,this);
        this.carro = new Carro2(10,10);
        this.circulo = new Circulo(900,500);
        this.timer.start();
        this.setFocusable(true);
        addKeyListener(this);
        this.timer.start();
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);  
        this.carro.dibujar(g);
        this.circulo.dibujar(g);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        validarColision();
        repaint();
    }
    
    public void validarColision(){
        Rectangle r1 = this.carro.obtenetRectangulo();
        Rectangle r2 = this.circulo.obtenetRectangulo();
        if(r1.intersects(r2)){
            System.out.println("Choque");
        }
        this.circulo.mover();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        this.carro.keyPressed(e);
        this.circulo.keyPressed2(e);
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}
