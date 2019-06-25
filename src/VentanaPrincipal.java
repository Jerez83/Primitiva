import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class VentanaPrincipal  extends JFrame {

    private PanelOeste panelOeste;
    private PanelCentral panelCentral;


    public VentanaPrincipal() throws HeadlessException {


        setTitle("Loteria");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setJMenuBar(crearMenu());


        panelOeste = new PanelOeste();
        add(panelOeste,BorderLayout.WEST);


        panelCentral = new PanelCentral();
        add(panelCentral,BorderLayout.CENTER);

    }

    private JMenuBar crearMenu() {
        JMenuBar barraMenu = new JMenuBar();

        JMenu opcion1 = new JMenu("Boleto");
        barraMenu.add(opcion1);

        JMenuItem exit = new JMenuItem("Salir");
        JMenuItem comprobar = new JMenuItem("Comprobar");

        opcion1.add(comprobar);
        opcion1.addSeparator();
        opcion1.add(exit);


        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        comprobar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                panelOeste.accionComprobar();
            }
        });

        exit.setMnemonic(KeyEvent.VK_X);
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));





        return barraMenu;
    }
}
