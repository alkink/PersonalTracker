/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimildiran
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
* @file stok_takip.java
* @description Belirli bir şirketin stok durumunu kontrol eden program.
* @assignment Bahar Dönemi 1.Proje
* @date 17/05/2022
* @author Muhammed Mesut Bahadır - muhammed.bahadir@stu.fsm.edu.tr
*/
public class Graphic extends JFrame {
    String text="";
    public Graphic(String metin) {
        super("Hoşgeldiniz");
        setSize(400, 200);
        setVisible(true);
        setLocationRelativeTo(null);
        this.text=metin;
        
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.MAGENTA);
        g.fillRect(25, 50, 350, 10);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Times New Roman", Font.BOLD, 24));
        g.drawString(text, 40, 100);

        g.setColor(Color.MAGENTA);
        g.fillRect(25, 150, 350, 10);
    }

    public static void main(String[] args) {
        String text="";
        Graphic app = new Graphic(text);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setResizable(false);
    }
}