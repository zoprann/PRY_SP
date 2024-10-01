
package Zoma;

/**
 * Keyner Alejandro Rivera
 * 1990-23-10442
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.SwingConstants.CENTER;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Ventana1 extends JFrame {
    public JPanel panel;
    public JTextField nom;
    
    public Ventana1(){
        setSize(350,520);
        setLocationRelativeTo(null);
        setTitle("Zoma Coffe Shop - Bienvenida");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();        
    }
    
    private void iniciarComponentes(){
        crearPanel();
        crearEtiquetas();
        crearBotones();
        cajaTexto();
    }
    
    private void crearPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.decode("#A18262"));
        Image icon = Toolkit.getDefaultToolkit().getImage("zoma4.png");
        setIconImage(icon);
        this.getContentPane().add(panel);
        
    }
    
    private void crearEtiquetas(){
        JLabel etiqueta = new JLabel();
        etiqueta.setText("Zoma Coffe Shop");
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setBounds(-40,160,410,30);
        etiqueta.setForeground(Color.white);
        etiqueta.setFont(new Font("Lexend Deca", 3,30));
        panel.add(etiqueta);
        
        JLabel sub = new JLabel();
        sub.setText("Sistema de control vacacional");
        sub.setHorizontalAlignment(SwingConstants.CENTER);
        sub.setBounds(-45,185,410,30);
        sub.setForeground(Color.white);
        sub.setFont(new Font("Lexend Deca", 3,15));
        panel.add(sub);
        
        JLabel ing = new JLabel();
        ing.setText("Ingrese su nombre:");
        ing.setHorizontalAlignment(SwingConstants.CENTER);
        ing.setBounds(-40,245,410,30);
        ing.setForeground(Color.white);
        ing.setFont(new Font("Lexend Deca",0,15));
        panel.add(ing);
        
        JLabel leyenda = new JLabel();
        leyenda.setText("©2024 Zoma Coffe Shop");
        leyenda.setHorizontalAlignment(SwingConstants.CENTER);
        leyenda.setBounds(40,435,250,30);
        leyenda.setForeground(Color.white);
        leyenda.setFont(new Font("Lexend Deca",0,15));
        panel.add(leyenda);
        
        JLabel subLey = new JLabel();
        subLey.setText("Keyner Alejandro Rivera Axpuac - Sección B");
        subLey.setHorizontalAlignment(SwingConstants.CENTER);
        subLey.setBounds(40,450,250,30);
        subLey.setForeground(Color.white);
        subLey.setFont(new Font("Lexend Deca",0,10));
        panel.add(subLey);
        
        ImageIcon  imagen = new ImageIcon("zoma2.png");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(90, 10, 150, 150);
        etiqueta2.setIcon(new  ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_DEFAULT)));
        panel.add(etiqueta2);
    }
    
    private void cajaTexto(){
        nom = new JTextField();
        nom.setBounds(40,275,250,40);
        nom.setBackground(Color.white);
        nom.setForeground(Color.decode("#6C4D2D"));
        nom.setHorizontalAlignment(CENTER);
        nom.setFont(new Font("Lexend Deca",0,15));
        panel.add(nom);
    }
    
    private void crearBotones(){
        JButton bot1 = new JButton();
        bot1.setText("Aceptar");
        bot1.setBounds(90,325,150,40);
        bot1.setBackground(Color.decode("#b39980"));
        bot1.setBorderPainted(false);
        bot1.setForeground(Color.white);
        bot1.setFont(new Font("Lexend Deca",1,20));
        bot1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(nom.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Ingrese un nombre para continuar.");
                } else {
                    String texto = nom.getText();
                    Ventana2 v2 = new Ventana2(texto);
                    v2.setVisible(true);
                    dispose();
                }
            }
        });
        panel.add(bot1);
    }
}
