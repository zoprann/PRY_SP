
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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Ventana3 extends JFrame {
        public JPanel panel;
        public JLabel bien, sub, nom, dep, apPa, ant, apMa, cal, leyenda, nomV1, logo, subLey;
        public ImageIcon imagen;
        public JTextField ingNom, ingapPa, ingapMa;
        public JComboBox depOpc, antOpc;
        public JTextArea areaTx;
        public JMenuBar menus;
        public JMenu opciones, aceDe, tema;
        public JMenuItem nuevo, salir, cafe, claro, oscuro, desa;
        public JButton bot2;
    
    public Ventana3(String text2){
        setTitle("Zoma Coffe Shop - Sistema de Control Vacacional");
        setSize(550,520);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage("zoma4.png");
        setIconImage(icon);
        iniciarComponentes();
        
        nomV1 = new JLabel();
        nomV1.setText("Bienvenido "+text2);
        nomV1.setHorizontalAlignment(SwingConstants.CENTER);
        nomV1.setBounds(153,20,250,30);
        nomV1.setForeground(Color.white);
        nomV1.setFont(new Font("Lexend Deca", 0,20));
        panel.add(nomV1);      
        
    }
    
    private void iniciarComponentes(){
        crearPanel();
        crearMenu();
        crearEtiquetas();
        crearDesple();
        crearBotones();
        crearText();
        crearArea();
    }
    
        private void crearPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.decode("#A18262"));
        this.getContentPane().add(panel);
    }
        
        private void crearMenu(){
            menus = new JMenuBar();
            opciones = new JMenu("Opciones");
            aceDe = new JMenu("Acerca De");
            tema = new JMenu("Tema");
            
            nuevo = new JMenuItem("Nuevo");
            salir = new JMenuItem("Salir");
            desa = new JMenuItem("Desarrollador");
            cafe = new JMenuItem("Tema Café");
            claro = new JMenuItem("Tema Claro");
            oscuro = new JMenuItem("Tema Oscuro");
            
            opciones.add(tema);
            opciones.add(nuevo);
            opciones.add(salir);
            
            tema.add(cafe);
            tema.add(claro);
            tema.add(oscuro);
            
            aceDe.add(desa);
            
            menus.add(opciones);
            menus.add(aceDe);
            setJMenuBar(menus);
            
            menus.setBackground(Color.decode("#A18262"));
            menus.setBorderPainted(false);
            
            opciones.setForeground(Color.white);
            opciones.setFont(new Font("Lexend Deca",1,15));
            
            aceDe.setFont(new Font("Lexend Deca",1,15));
            aceDe.setForeground(Color.white);
            
            desa.setFont(new Font("Lexend Deca",1,15));
            desa.setForeground(Color.decode("#6C4D2D"));
            
            tema.setBorderPainted(false);
            tema.setFont(new Font("Lexend Deca",1,15));
            tema.setForeground(Color.decode("#6C4D2D"));
            
            cafe.setBorderPainted(false);
            cafe.setFont(new Font("Lexend Deca",1,15));
            cafe.setForeground(Color.decode("#6C4D2D"));
            
            claro.setBorderPainted(false);
            claro.setFont(new Font("Lexend Deca",1,15));
            claro.setForeground(Color.decode("#6C4D2D"));
            
            oscuro.setBorderPainted(false);
            oscuro.setFont(new Font("Lexend Deca",1,15));
            oscuro.setForeground(Color.decode("#6C4D2D"));
            
            nuevo.setBorderPainted(false);
            nuevo.setFont(new Font("Lexend Deca",1,15));
            nuevo.setForeground(Color.decode("#6C4D2D"));
            
            salir.setBorderPainted(false);
            salir.setFont(new Font("Lexend Deca",1,15));
            salir.setForeground(Color.decode("#6C4D2D"));
            
            cafe.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    panel.setBackground(Color.decode("#A18262"));
                    menus.setBackground(Color.decode("#A18262"));
                    menus.setForeground(Color.white);
                    opciones.setBackground(Color.decode("#A18262"));
                    opciones.setForeground(Color.white);
                    aceDe.setBackground(Color.decode("#A18262"));
                    aceDe.setForeground(Color.white);
                    
                    tema.setForeground(Color.decode("#6C4D2D"));                    
                    nuevo.setForeground(Color.decode("#6C4D2D"));
                    salir.setForeground(Color.decode("#6C4D2D"));
                    cafe.setForeground(Color.decode("#6C4D2D"));
                    claro.setForeground(Color.decode("#6C4D2D"));
                    oscuro.setForeground(Color.decode("#6C4D2D"));
                    desa.setForeground(Color.decode("#6C4D2D"));
                    
                    bien.setForeground(Color.white);
                    sub.setForeground(Color.white);
                    nom.setForeground(Color.white);
                    dep.setForeground(Color.white);
                    apPa.setForeground(Color.white);
                    ant.setForeground(Color.white);
                    apMa.setForeground(Color.white);
                    cal.setForeground(Color.white);
                    leyenda.setForeground(Color.white);
                    subLey.setForeground(Color.white);
                    nomV1.setForeground(Color.white);
                    
                    ingNom.setBackground(Color.white);
                    ingNom.setForeground(Color.decode("#6C4D2D"));
                    ingapPa.setBackground(Color.white);
                    ingapPa.setForeground(Color.decode("#6C4D2D"));
                    ingapMa.setBackground(Color.white);
                    ingapMa.setForeground(Color.decode("#6C4D2D"));
                    
                    depOpc.setBackground(Color.white);
                    depOpc.setForeground(Color.decode("#6C4D2D"));
                    antOpc.setBackground(Color.white);
                    antOpc.setForeground(Color.decode("#6C4D2D"));
                    
                    areaTx.setBackground(Color.white);
                    areaTx.setForeground(Color.decode("#6C4D2D"));
                    
                    bot2.setBackground(Color.decode("#b39980"));
                    bot2.setForeground(Color.white);
                }
            });
            
            claro.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    panel.setBackground(Color.decode("#fefffe"));
                    menus.setBackground(Color.decode("#fefffe"));
                    menus.setForeground(Color.decode("#363538"));
                    opciones.setBackground(Color.decode("#fefffe"));
                    opciones.setForeground(Color.decode("#363538"));
                    aceDe.setBackground(Color.decode("#fefffe"));
                    aceDe.setForeground(Color.decode("#363538"));
                    
                    tema.setForeground(Color.decode("#363538"));                    
                    nuevo.setForeground(Color.decode("#363538"));
                    salir.setForeground(Color.decode("#363538"));
                    cafe.setForeground(Color.decode("#363538"));
                    claro.setForeground(Color.decode("#363538"));
                    oscuro.setForeground(Color.decode("#363538"));
                    desa.setForeground(Color.decode("#363538"));
                    
                    bien.setForeground(Color.decode("#363538"));
                    sub.setForeground(Color.decode("#363538"));
                    nom.setForeground(Color.decode("#363538"));
                    dep.setForeground(Color.decode("#363538"));
                    apPa.setForeground(Color.decode("#363538"));
                    ant.setForeground(Color.decode("#363538"));
                    apMa.setForeground(Color.decode("#363538"));
                    cal.setForeground(Color.decode("#363538"));
                    leyenda.setForeground(Color.decode("#929498"));
                    subLey.setForeground(Color.decode("#929498"));
                    nomV1.setForeground(Color.decode("#363538"));
                    
                    ingNom.setBackground(Color.decode("#F4F5F5"));
                    ingNom.setForeground(Color.decode("#363538"));
                    ingapPa.setBackground(Color.decode("#F4F5F5"));
                    ingapPa.setForeground(Color.decode("#363538"));
                    ingapMa.setBackground(Color.decode("#F4F5F5"));
                    ingapMa.setForeground(Color.decode("#363538"));
                    
                    depOpc.setForeground(Color.decode("#363538"));
                    depOpc.setBackground(Color.decode("#F4F5F5"));
                    antOpc.setForeground(Color.decode("#363538"));
                    antOpc.setBackground(Color.decode("#F4F5F5"));
                    
                    areaTx.setBackground(Color.decode("#F4F5F5"));
                    areaTx.setForeground(Color.decode("#363538"));
                    
                    bot2.setBackground(Color.decode("#060606"));
                    bot2.setForeground(Color.decode("#f4f4f4"));
                }
            });
            
            oscuro.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    panel.setBackground(Color.decode("#202120"));
                    menus.setBackground(Color.decode("#202120"));
                    menus.setForeground(Color.decode("#cbcacb"));
                    opciones.setBackground(Color.decode("#202120"));
                    opciones.setForeground(Color.decode("#cbcacb"));
                    aceDe.setBackground(Color.decode("#202120"));
                    aceDe.setForeground(Color.decode("#cbcacb"));
                    
                    tema.setForeground(Color.decode("#161617"));                    
                    nuevo.setForeground(Color.decode("#161617"));
                    salir.setForeground(Color.decode("#161617"));
                    cafe.setForeground(Color.decode("#161617"));
                    claro.setForeground(Color.decode("#161617"));
                    oscuro.setForeground(Color.decode("#161617"));
                    desa.setForeground(Color.decode("#161617"));
                    
                    bien.setForeground(Color.decode("#fefffe"));
                    sub.setForeground(Color.decode("#fefffe"));
                    nom.setForeground(Color.decode("#fefffe"));
                    dep.setForeground(Color.decode("#fefffe"));
                    apPa.setForeground(Color.decode("#fefffe"));
                    ant.setForeground(Color.decode("#fefffe"));
                    apMa.setForeground(Color.decode("#fefffe"));
                    cal.setForeground(Color.decode("#fefffe"));
                    leyenda.setForeground(Color.decode("#fefffe"));
                    subLey.setForeground(Color.decode("#fefffe"));
                    nomV1.setForeground(Color.decode("#fefffe"));
                    
                    ingNom.setBackground(Color.decode("#2f2e2e"));
                    ingNom.setForeground(Color.white);
                    ingapPa.setBackground(Color.decode("#2f2e2e"));
                    ingapPa.setForeground(Color.white);
                    ingapMa.setBackground(Color.decode("#2f2e2e"));
                    ingapMa.setForeground(Color.white);
                    
                    depOpc.setForeground(Color.decode("#d3d3d3"));
                    depOpc.setBackground(Color.decode("#2f2e2e"));
                    antOpc.setForeground(Color.decode("#d3d3d3"));
                    antOpc.setBackground(Color.decode("#2f2e2e"));
                    
                    areaTx.setBackground(Color.decode("#2f2e2e"));
                    areaTx.setForeground(Color.decode("#d3d3d3"));
                    
                    bot2.setBackground(Color.decode("#fefffe"));
                    bot2.setForeground(Color.decode("#010001"));
                }
            });
            
            nuevo.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ingNom.setText("");
                    ingapPa.setText("");
                    ingapMa.setText("");
                    depOpc.setSelectedItem("");
                    antOpc.setSelectedItem("");
                    areaTx.setText("\n Resultado del calculo de vacaciones.");
                }
            });
            
            salir.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                new Ventana1().setVisible(true);
                dispose();                    
                }
            });
                
            desa.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Desarrollado por Zoma Coffe Shop,"+ "\n" +"de Keyner Alejandro Rivera Axpuac");
                }
            });
        }
        
        private void crearEtiquetas(){
            
            bien = new JLabel();
            bien.setText("Zoma Coffe Shop");
            bien.setHorizontalAlignment(SwingConstants.CENTER);
            bien.setBounds(60,47,450,30);
            bien.setForeground(Color.white);
            bien.setFont(new Font("Lexend Deca", 3,30));
            panel.add(bien);      
            
            sub = new JLabel();
            sub.setText("Datos del trabajador para le cálculo de vacaciones");
            sub.setHorizontalAlignment(SwingConstants.CENTER);
            sub.setBounds(70,70,450,30);
            sub.setForeground(Color.white);
            sub.setFont(new Font("Lexend Deca", 1,15));
            panel.add(sub);
        
            imagen = new ImageIcon("zoma2.png");
            logo = new JLabel();
            logo.setBounds(15, 30, 75, 75);
            logo.setIcon(new  ImageIcon(imagen.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT)));
            panel.add(logo);
            
            nom = new JLabel();
            nom.setText("Nombre completo:");
            nom.setHorizontalAlignment(SwingConstants.LEFT);
            nom.setBounds(45,105,150,30);
            nom.setForeground(Color.white);
            nom.setFont(new Font("Lexend Deca", 0,15));
            panel.add(nom);
            
            dep = new JLabel();
            dep.setText("Seleccione el departamento:");
            dep.setHorizontalAlignment(SwingConstants.LEFT);
            dep.setBounds(265,105,250,30);
            dep.setForeground(Color.white);
            dep.setFont(new Font("Lexend Deca", 0,15));
            panel.add(dep);
            
            apPa = new JLabel();
            apPa.setText("Apellido paterno:");
            apPa.setHorizontalAlignment(SwingConstants.LEFT);
            apPa.setBounds(45,180,150,30);
            apPa.setForeground(Color.white);
            apPa.setFont(new Font("Lexend Deca", 0,15));
            panel.add(apPa);
            
            ant = new JLabel();
            ant.setText("Seleccione la antigüedad:");
            ant.setHorizontalAlignment(SwingConstants.LEFT);
            ant.setBounds(265,180,250,30);
            ant.setForeground(Color.white);
            ant.setFont(new Font("Lexend Deca", 0,15));
            panel.add(ant);
            
            apMa = new JLabel();
            apMa.setText("Apellido materno:");
            apMa.setHorizontalAlignment(SwingConstants.LEFT);
            apMa.setBounds(45,255,150,30);
            apMa.setForeground(Color.white);
            apMa.setFont(new Font("Lexend Deca", 0,15));
            panel.add(apMa);
            
            cal = new JLabel();
            cal.setText("Resultado del cálculo:");
            cal.setHorizontalAlignment(SwingConstants.LEFT);
            cal.setBounds(265,255,250,30);
            cal.setForeground(Color.white);
            cal.setFont(new Font("Lexend Deca", 0,15));
            panel.add(cal);
        
            leyenda = new JLabel();
            leyenda.setText("©2024 Zoma Coffe Shop | Todos los derechos reservados");
            leyenda.setHorizontalAlignment(SwingConstants.CENTER);
            leyenda.setBounds(90,420,350,30);
            leyenda.setForeground(Color.white);
            leyenda.setFont(new Font("Lexend Deca",0,10));
            panel.add(leyenda);
        
            subLey = new JLabel();
            subLey.setText("Keyner Alejandro Rivera Axpuac - Sección B");
            subLey.setHorizontalAlignment(SwingConstants.CENTER);
            subLey.setBounds(90,430,350,30);
            subLey.setForeground(Color.white);
            subLey.setFont(new Font("Lexend Deca",0,9));
            panel.add(subLey);
        }
        
        private void crearText(){
        ingNom = new JTextField();
        ingNom.setBounds(45,135,175,30);
        ingNom.setBackground(Color.white);
        ingNom.setForeground(Color.decode("#6C4D2D"));
        ingNom.setHorizontalAlignment(SwingConstants.LEFT);
        ingNom.setFont(new Font("Lexend Deca",1,12));
        panel.add(ingNom);
        
        ingapPa = new JTextField();
        ingapPa.setBounds(45,210,175,30);
        ingapPa.setBackground(Color.white);
        ingapPa.setForeground(Color.decode("#6C4D2D"));
        ingapPa.setHorizontalAlignment(SwingConstants.LEFT);
        ingapPa.setFont(new Font("Lexend Deca",1,12));
        panel.add(ingapPa);
        
        ingapMa = new JTextField();
        ingapMa.setBounds(45,285,175,30);
        ingapMa.setBackground(Color.white);
        ingapMa.setForeground(Color.decode("#6C4D2D"));
        ingapMa.setHorizontalAlignment(SwingConstants.LEFT);
        ingapMa.setFont(new Font("Lexend Deca",1,12));
        panel.add(ingapMa);
        }
        
        private void crearDesple(){
            String[] depa = {"", "Barista", "Mesero", "Gerente"};
            depOpc = new JComboBox(depa);
            depOpc.setBounds(265,135,175,30);            
            depOpc.setFont(new Font("Lexend Deca",1,12));
            depOpc.setBackground(Color.white);
            depOpc.setForeground(Color.decode("#6C4D2D"));
            panel.add(depOpc);
            
            String[] anti = {"", "0 - 1 año de servicio", "2 - 6 años de servicio", "7 o más años de servicio"};
            antOpc = new JComboBox(anti);
            antOpc.setBounds(265,210,175,30);            
            antOpc.setFont(new Font("Lexend Deca",1,12));
            antOpc.setBackground(Color.white);
            antOpc.setForeground(Color.decode("#6C4D2D"));
            panel.add(antOpc);
        }
        
        private void crearBotones(){
            
            bot2 = new JButton();
            bot2.setText("Calcular");
            bot2.setBounds(180,385,175,30);
            bot2.setBackground(Color.decode("#b39980"));
            bot2.setBorderPainted(false);
            bot2.setForeground(Color.white);
            bot2.setFont(new Font("Lexend Deca",1,20));
            
            bot2.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    String selec = (String) depOpc.getSelectedItem();
                    String selec2 = (String) antOpc.getSelectedItem();
                    if(ingNom.getText().trim().isEmpty() || ingapPa.getText().trim().isEmpty() || ingapMa.getText().trim().isEmpty() || "".equals(selec) || "".equals(selec2)){
                        JOptionPane.showMessageDialog(null, "Llene todos los datos para calcular.");
                        
                    } else if ("Barista".equals(selec) && "0 - 1 año de servicio".equals(selec2)) {
                        areaTx.setText(" El trabajador " + "\n "
                                + ingNom.getText() + " "
                                + ingapPa.getText() + " "
                                + ingapMa.getText() + "\n quien labora en el area de "
                                + depOpc.getSelectedItem() + "\n con "
                                + antOpc.getSelectedItem() + "\n recibe 6 días de vacaciones.");
                        
                    } else if ("Barista".equals(selec) && "2 - 6 años de servicio".equals(selec2)) {
                        areaTx.setText(" El trabajador " + "\n "
                                + ingNom.getText() + " "
                                + ingapPa.getText() + " "
                                + ingapMa.getText() + "\n quien labora en el area de "
                                + depOpc.getSelectedItem() + "\n con "
                                + antOpc.getSelectedItem() + "\n recibe 14 días de vacaciones.");
                        
                    } else if ("Barista".equals(selec) && "7 o más años de servicio".equals(selec2)) {
                        areaTx.setText(" El trabajador " + "\n "
                                + ingNom.getText() + " "
                                + ingapPa.getText() + " "
                                + ingapMa.getText() + "\n quien labora en el area de "
                                + depOpc.getSelectedItem() + "\n con "
                                + antOpc.getSelectedItem() + "\n recibe 20 días de vacaciones.");
                        
                    } else if ("Mesero".equals(selec) && "0 - 1 año de servicio".equals(selec2)) {
                        areaTx.setText(" El trabajador " + "\n "
                                + ingNom.getText() + " "
                                + ingapPa.getText() + " "
                                + ingapMa.getText() + "\n quien labora en el area de "
                                + depOpc.getSelectedItem() + "\n con "
                                + antOpc.getSelectedItem() + "\n recibe 7 días de vacaciones.");
                        
                    } else if ("Mesero".equals(selec) && "2 - 6 años de servicio".equals(selec2)) {
                        areaTx.setText(" El trabajador " + "\n "
                                + ingNom.getText() + " "
                                + ingapPa.getText() + " "
                                + ingapMa.getText() + "\n quien labora en el area de "
                                + depOpc.getSelectedItem() + "\n con "
                                + antOpc.getSelectedItem() + "\n recibe 15 días de vacaciones.");
                        
                    } else if ("Mesero".equals(selec) && "7 o más años de servicio".equals(selec2)) {
                        areaTx.setText(" El trabajador " + "\n "
                                + ingNom.getText() + " "
                                + ingapPa.getText() + " "
                                + ingapMa.getText() + "\n quien labora en el area de "
                                + depOpc.getSelectedItem() + "\n con "
                                + antOpc.getSelectedItem() + "\n recibe 22 días de vacaciones.");
                        
                    } else if ("Gerente".equals(selec) && "0 - 1 año de servicio".equals(selec2)) {
                        areaTx.setText(" El trabajador " + "\n "
                                + ingNom.getText() + " "
                                + ingapPa.getText() + " "
                                + ingapMa.getText() + "\n quien labora en el area de "
                                + depOpc.getSelectedItem() + "\n con "
                                + antOpc.getSelectedItem() + "\n recibe 10 días de vacaciones.");
                        
                    } else if ("Gerente".equals(selec) && "2 - 6 años de servicio".equals(selec2)) {
                        areaTx.setText(" El trabajador " + "\n "
                                + ingNom.getText() + " "
                                + ingapPa.getText() + " "
                                + ingapMa.getText() + "\n quien labora en el area de "
                                + depOpc.getSelectedItem() + "\n con "
                                + antOpc.getSelectedItem() + "\n recibe 20 días de vacaciones.");
                        
                    } else if ("Gerente".equals(selec) && "7 o más años de servicio".equals(selec2)) {
                        areaTx.setText(" El trabajador " + "\n "
                                + ingNom.getText() + " "
                                + ingapPa.getText() + " "
                                + ingapMa.getText() + "\n quien labora en el area de "
                                + depOpc.getSelectedItem() + "\n con "
                                + antOpc.getSelectedItem() + "\n recibe 30 días de vacaciones.");
                    }
                }
            });
            
            panel.add(bot2);
        }
        
        private void crearArea(){
            areaTx = new JTextArea();
            areaTx.setBounds(265, 285, 225, 75);
            areaTx.setEditable(false);
            areaTx.setFont((new Font("Lexend Deca", 1,10)));
            areaTx.setForeground(Color.decode("#6C4D2D"));
            areaTx.setText("\n Resultado del calculo de vacaciones.");
            panel.add(areaTx);
        }
}
