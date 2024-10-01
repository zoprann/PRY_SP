
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
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Ventana2 extends JFrame {
    public JPanel panel;
    public JButton bot1, bot2;
    public String nomc;
    
    public Ventana2(String texto){
        setSize(650,420);
        setLocationRelativeTo(null);
        setTitle("Zoma Coffe Shop - Licencia de Uso");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Image icon = Toolkit.getDefaultToolkit().getImage("zoma4.png");
        setIconImage(icon);
        iniciarComponentes();
        
        nomc = texto;
        
        JCheckBox acep = new JCheckBox();
        acep.setText("Yo " + texto + " acepto los téminos y condiciones");
        acep.setBounds(30,280,300,50);  
        acep.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(acep.isSelected()){
                    bot1.setEnabled(true);
                    bot2.setEnabled(false);
                } else {
                    bot1.setEnabled(false);
                    bot2.setEnabled(true);                    
                }
            }
        });
        panel.add(acep);
    }
    
    private void iniciarComponentes(){
        crearPanel();
        crearEtiquetas();
        crearAreas();
        crearBotones();
    }
    
    private void crearPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
        
    private void crearEtiquetas(){
        JLabel etiqueta = new JLabel();
        etiqueta.setText("TÉRMINOS Y CONDICIONES");
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setBounds(115,10,410,30);
        etiqueta.setForeground(Color.black);
        etiqueta.setFont(new Font("Lexend Deca", 1,15));
        panel.add(etiqueta);
        
        ImageIcon  imagen = new ImageIcon("zoma2.png");
        JLabel logo = new JLabel();
        logo.setBounds(150, 0, 50, 50);
        logo.setIcon(new  ImageIcon(imagen.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_REPLICATE)));
        panel.add(logo);
    }
        
    private void crearAreas(){
            JTextArea areaTx = new JTextArea();
            areaTx.setBounds(30, 55, 575, 221);
            areaTx.setEditable(false);
            areaTx.setFont((new Font("Lexend Deca", 0,10)));
            areaTx.setText("\n\n     TÉRMINOS Y CONDICIONES\n" +
"\n" +
"     A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA GEEKIPEDIA DE ERNESTO.\n" +
"     B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS.\n" +
"     C.  ZOMA COFFE SHOP NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE.\n" +
"\n" +
"     LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE\n" +
"     (ZOMA COFFE SHOP DE KEYNER ALEJANDRO RIVERA), NO SE RESPONSABILIZAN DEL USO QUE USTED\n" +
"     HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)\n" +
"     SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE.\n" +
"\n" +
"     PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE\n" +
"     http://www.zomacoffeshop.com \n\n");
            panel.add(areaTx);
        }
    
    private void crearBotones(){
            
            bot1 = new JButton();
            bot1.setText("Acepto");
            bot1.setEnabled(false);
            bot1.setBounds(30,330,100,30);
            bot1.setFont(new Font("Lexend Deca",1,15));
            bot1.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text2 = nomc;
                    Ventana3 v3 = new Ventana3(text2);
                    v3.setVisible(true);
                    dispose();
                }
            });
            panel.add(bot1);

            bot2 = new JButton();
            bot2.setText("No Acepto");
            bot2.setBounds(135, 330, 120, 30);
            bot2.setFont(new Font("Lexand Deca",1,15));
            bot2.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    new Ventana1().setVisible(true);
                    dispose();
                }
            });
            panel.add(bot2);
    }
}
