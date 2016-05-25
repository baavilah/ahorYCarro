/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

/**
 *
 * @author Estudiante
 */
public class Circulo {
    int x = 0;
    int y = 0;
    
    public Circulo(int x , int y){
        this.x = x;
        this.y = y;
    }
    
    public void dibujar (Graphics g){
        g.setColor(Color.red);
        g.fillOval(20+x, 110+y, 25, 25);
        g.setColor(Color.GREEN);
        g.drawRect(20+x, 110+y, 25, 25);
    }
    
     public void keyTyped(KeyEvent e) {
        
    }

    public void keyPressed2(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_S: y += 10; break;
            case KeyEvent.VK_W: y -= 10; break;
            case KeyEvent.VK_A: x -= 10; break;
            case KeyEvent.VK_D: x += 10; break;
          }
    }

 
    public void keyReleased(KeyEvent e) {
        
    }
    
    public Rectangle obtenetRectangulo(){
        return new Rectangle(20+x,110+y,25,25);
    }
    
    public void mover(){
        this.x = x-1;
        this.y = y-1;
    }
}
