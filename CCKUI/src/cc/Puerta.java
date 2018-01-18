
package cc;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 * Clase para iniciar secion
 * @author Zush18
 */
public class Puerta extends JFrame{
    /**
     * Panel para iniciar secion
     */
    private JPanel cerradura =new JPanel();
    
    //componenetes 
    /**
     * Para indicar si debe introducir usuario o contraseña
     */
    private JLabel label1;
    /**
     * Lugar donde introducir el usuario
     */
    private JTextField field1;
    /**
     * Lugar donde introducir la contraseña
     */
    private JPasswordField field2;
    
    /**
     * Constructor (hace visible la ventana)
     */
    public Puerta(){
        java.awt.Toolkit monitor = Toolkit.getDefaultToolkit();
        java.awt.Dimension pantalla = monitor.getScreenSize();
        this.setLocation(pantalla.width/16*4 , pantalla.height/9 * 3);
        this.setSize(pantalla.width/16 *8, pantalla.height/9 * 3);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        generarCerradura();
        generarLogo();
        this.mesError(this.getGraphics(), "Error");
        this.setVisible(true);

    }
    /**
     * Construye el panel para iniciar seción
     */
    private void generarCerradura() {
        //Configurar Panel
        this.cerradura.setLayout(null);
        
        //Configurar componenetes
            //field1
        this.field1 =  new JTextField();
        this.field1.setLocation(this.getWidth() /10 * 5, this.getHeight() / 10 *4);
        this.field1.setSize(this.getWidth() / 10 * 3, this.getHeight() / 10 );
        
            //label1
        this.label1 = new JLabel();
        this.label1.setLocation(this.getWidth() /10 * 5, this.getHeight() / 10 *2);
        this.label1.setSize(this.getWidth() / 10 * 3, this.getHeight() / 10 );
        this.label1.setText("Usuario");
        this.label1.setFont(new Font(Font.SANS_SERIF,Font.TRUETYPE_FONT,20));
        
        //Añadir componenetes
        this.cerradura.add(this.field1);
        this.cerradura.add(this.label1);
        this.add(this.cerradura);
    }

    private void generarLogo() {
        
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(new Color(12,237,147));
        g.fillOval(this.getWidth() /10 *1, this.getHeight() / 5 , this.getHeight()/3*2, this.getHeight()/3*2);
        
    }
    
    private void mesError(Graphics g, String mensaje){
       
    }
}
