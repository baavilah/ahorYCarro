/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

/**
 *
 * @author Estudiante
 */
public class Carro2 {
    private int x=0;
    private int y=0;

    public Carro2(int x, int y) {
        this.x =x ;
        this.y =y;
    }
    
    public void dibujar(Graphics g){
        g.setColor(Color.red);
        g.fillOval(20+x, 110+y, 50, 50);
        g.setColor(Color.blue);
        g.fillOval(100+x, 110+y, 50, 50);
        g.setColor(Color.yellow);
        g.fillRect(10+x, 60+y, 150, 50);
        Polygon  poligono = new Polygon();
        poligono.addPoint(30+x,60+y);
        poligono.addPoint(60+x,30+y);
        poligono.addPoint(110+x,30+y);
        poligono.addPoint(140+x,60+y);
        g.drawPolygon(poligono);
        g.setColor(Color.GREEN);
        g.fillPolygon(poligono);
        g.drawRect(10+x, 30+y, 150, 130);
        
    }


    public void keyTyped(KeyEvent e) {
        
    }


    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_DOWN: y += 10; break;
            case KeyEvent.VK_UP: y -= 10; break;
            case KeyEvent.VK_LEFT: x -= 10; break;
            case KeyEvent.VK_RIGHT: x += 10; break;
          }
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
        return new Rectangle(10+x,30+y,150,130);
    }
    
}
