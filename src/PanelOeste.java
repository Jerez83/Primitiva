import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class PanelOeste extends JPanel {

    private JLabel logo;
    private JLabel seleccionaFecha;
    private static JTextField numero1;
    private static JTextField numero2;
    private static  JTextField numero3;
    private static  JTextField numero4;
    private static  JTextField numero5;
    private static  JTextField numero6;
    private static  JTextField numero7;
    private JLabel apuesta;
    private JLabel reintegro;
    private JButton comprobar;
    private JComboBox comboBox;
    private ListaPremio listaPremio;
    private ArrayList<String> claves;
    private String itemSeleccionado;
    private CombinacionPremio combinacionPremio;
    private CombinacionUsuario combinacionUsuario;


    public PanelOeste() {

        // Cambiamos Ancho del formulario
        Dimension dimension = getPreferredSize();
        dimension.width = 250;
        setPreferredSize(dimension);

        Border interior = BorderFactory.createTitledBorder("");
        Border exterior = BorderFactory.createEmptyBorder(5,5,5,5);
        //setBackground(Color.darkGray);
        setBorder(BorderFactory.createCompoundBorder(exterior, interior));


        setLayout(new GridBagLayout());

        logo = new JLabel();
        logo.setIcon(new ImageIcon("src/primitiva.png"));

        seleccionaFecha = new JLabel("Selecciona la fecha del sorteo:");

        numero1 = new JTextField(2);
        numero2 = new JTextField(2);
        numero3 = new JTextField(2);
        numero4 = new JTextField(2);
        numero5 = new JTextField(2);
        numero6 = new JTextField(2);
        numero7 = new JTextField(2);

        apuesta = new JLabel("Seleccione sus numeros:");
        reintegro = new JLabel("Seleccione el rintegro: ");

        comprobar = new JButton("COMPROBAR");
        comprobar.setActionCommand("comprobar");


        listaPremio = new ListaPremio();
        comboBox = new JComboBox();

        claves = new ArrayList<>();

        // Agrego las claves a un ArrayList para luego obtenerla por el indice
        claves.addAll(listaPremio.getMapa().keySet());
        // Recorra la lista de claves para agregarla al comboBox
        for (int i = 0; i < claves.size() ; i++) {
            comboBox.addItem(claves.get(i));

        }

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0; // El logo empieza en la columna cero.
        constraints.gridy = 0; // El logo empieza en la fila cero
        constraints.gridwidth = 6; // El logo ocupa 6 columnas.
        constraints.gridheight = 1; // El logo ocupa 1 filas.
        //constraints.weighty = 0.5;                  // La fila 0 debe estirarse, le ponemos un 1.0
        constraints.insets = new Insets(10,0,50,0);    //  top, left, bottom, right
        add(logo,constraints);
        //constraints.weighty=0;                      // restablecemos


        // Selecciona la fecha del sorteo
        constraints.gridx = 0; // El numero empieza en la columna 0.
        constraints.gridy = 1; // El numero empieza en la fila 1
        constraints.gridwidth = 6; // El numero ocupa 1 columnas.
        constraints.gridheight = 1; // El numero ocupa 1 filas.
        //constraints.anchor = GridBagConstraints.FIRST_LINE_START;
        constraints.insets = new Insets(0,0,0,0);    //  top, left, bottom, right
        add(seleccionaFecha,constraints);

        // ComboBOx
        constraints.gridx = 0; // El numero empieza en la columna 3
        constraints.gridy = 2; // El numero empieza en la fila 3
        constraints.gridwidth = 6; // El numero ocupa 1 columnas.
        constraints.gridheight = 2; // El numero ocupa 1 filas.
        constraints.insets = new Insets(10,0,50,0);    //  top, left, bottom, right
        add(comboBox,constraints);

        // Introduza sus numeros
        constraints.gridx = 0; // El numero empieza en la columna 1.
        constraints.gridy = 3; // El numero empieza en la fila 1
        constraints.gridwidth = 6; // El numero ocupa 1 columnas.
        constraints.gridheight = 1; // El numero ocupa 1 filas.
        //constraints.anchor = GridBagConstraints.FIRST_LINE_START;
        constraints.insets = new Insets(50,0,0,0);    //  top, left, bottom, right
        constraints.weightx = 1.0;
        add(apuesta,constraints);

        // numero 1
        constraints.gridx = 0; // El numero empieza en la columna 0.
        constraints.gridy = 4; // El numero empieza en la fila 2
        constraints.gridwidth = 1; // El numero ocupa 1 columnas.
        constraints.gridheight = 1; // El numero ocupa 1 filas.
        //constraints.anchor = GridBagConstraints.FIRST_LINE_START;
        constraints.insets = new Insets(5,0,0,0);
        constraints.weightx = 1.0;
        add(numero1,constraints);

        // numero 2
        constraints.gridx = 1; // El numero empieza en la columna cero.
        constraints.gridy = 4; // El numero empieza en la fila cero
        constraints.gridwidth = 1; // El numero ocupa 1 columnas.
        constraints.gridheight = 1; // El numero ocupa 1 filas.
        add(numero2,constraints);

        // numero 3
        constraints.gridx = 2; // El numero empieza en la columna cero.
        constraints.gridy = 4; // El numero empieza en la fila cero
        constraints.gridwidth = 1; // El numero ocupa 1 columnas.
        constraints.gridheight = 1; // El numero ocupa 1 filas.
        add(numero3,constraints);

        // numero 4
        constraints.gridx = 3; // El numero empieza en la columna cero.
        constraints.gridy = 4; // El numero empieza en la fila cero
        constraints.gridwidth = 1; // El numero ocupa 1 columnas.
        constraints.gridheight = 1; // El numero ocupa 1 filas.
        add(numero4,constraints);

        // numero 5
        constraints.gridx = 4; // El numero empieza en la columna cero.
        constraints.gridy = 4; // El numero empieza en la fila cero
        constraints.gridwidth = 1; // El numero ocupa 1 columnas.
        constraints.gridheight = 1; // El numero ocupa 1 filas.
        add(numero5,constraints);

        // numero 6
        constraints.gridx = 5; // El numero empieza en la columna cero.
        constraints.gridy = 4; // El numero empieza en la fila cero
        constraints.gridwidth = 1; // El numero ocupa 1 columnas.
        constraints.gridheight = 1; // El numero ocupa 1 filas.
        add(numero6,constraints);

        // Texto reintegro
        constraints.insets = new Insets(30,0,0,0);    //  top, left, bottom, right
        constraints.gridx = 0; // El numero empieza en la columna 3
        constraints.gridy = 5; // El numero empieza en la fila 3
        constraints.gridwidth = 6; // El numero ocupa 1 columnas.
        constraints.gridheight = 1; // El numero ocupa 1 filas.
        add(reintegro,constraints);

        // numero7 reintegro
        constraints.gridx = 0; // El numero empieza en la columna 3
        constraints.gridy = 6; // El numero empieza en la fila 3
        constraints.gridwidth = 6; // El numero ocupa 1 columnas.
        constraints.gridheight = 1; // El numero ocupa 1 filas.
        constraints.insets = new Insets(10,0,20,0);    //  top, left, bottom, right
        add(numero7,constraints);

        // Boton comprobar
        constraints.gridx = 0; // El numero empieza en la columna 3
        constraints.gridy = 7; // El numero empieza en la fila 3
        constraints.gridwidth = 6; // El numero ocupa 1 columnas.
        constraints.gridheight = 1; // El numero ocupa 1 filas.
        constraints.insets = new Insets(0,0,0,5);
        add(comprobar,constraints);

        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                int item = comboBox.getSelectedIndex();
                itemSeleccionado  = claves.get(item);
                combinacionPremio = listaPremio.getMapa().get(comboBox.getItemAt(0));
            }
        });


        comprobar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                accionComprobar();
                limpiar();
            }
        });




    }

    public  void accionComprobar() {


        if (itemSeleccionado==null)
            combinacionPremio = listaPremio.getMapa().get(claves.get(0));
        else
            combinacionPremio = listaPremio.getMapa().get(itemSeleccionado);

        if (numero1 != null && numero2 != null && numero3 != null
                &&numero4 != null || numero5 != null || numero6 != null || numero7 != null) {
            combinacionUsuario = new CombinacionUsuario(PanelNumeros.getNumeros(),PanelReintegro.getReintegro());

            switch (comprobarAciertos(combinacionUsuario,combinacionPremio)){
                case 1:
                    JOptionPane.showMessageDialog(null,
                            "Su boleto no ha sido premiado (1 acierto)","Resultado",
                            JOptionPane.OK_CANCEL_OPTION);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,
                            "Su boleto no ha sido premiado (2 aciertos)","Resultado",
                            JOptionPane.OK_CANCEL_OPTION);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,
                            "Su boleto esta premiado (3 aciertos)","Resultado",
                            JOptionPane.OK_CANCEL_OPTION);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,
                            "Su boleto ha sido premiado (4 aciertos)","Resultado",
                            JOptionPane.OK_CANCEL_OPTION);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,
                            " Su boleto ha sido premiado (5 aciertos)","Resultado",
                            JOptionPane.OK_CANCEL_OPTION);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null,
                            "Su boleto ha sido premiado (6 aciertos)","Resultado",
                            JOptionPane.OK_CANCEL_OPTION);
                    break;
                default:
                    System.err.println("Error: opcion de aciertos no comtemplado");
            }

        }
    }

    public static JTextField getNumero1() {
        return numero1;
    }

    public static JTextField getNumero2() {
        return numero2;
    }

    public static JTextField getNumero3() {
        return numero3;
    }

    public static JTextField getNumero4() {
        return numero4;
    }

    public static JTextField getNumero5() {
        return numero5;
    }

    public static JTextField getNumero6() {
        return numero6;
    }

    public static JTextField getNumero7() {
        return numero7;
    }

    private int comprobarAciertos(CombinacionUsuario combinacionUsuario, CombinacionPremio combinacionPremio) {
        int contador = 0;

        for (int i = 0; i < combinacionPremio.getNumeros().length; i++) {

            for (int j = 0; j < combinacionUsuario.getNumeros().length; j++) {
                if (combinacionPremio.getNumeros()[i] == combinacionUsuario.getNumeros()[j])
                    ++contador;
            }
        }

        return contador;
    }

    private boolean comprobarReintegro(CombinacionPremio p, CombinacionUsuario u) {
        if (p.getReintegro() == u.getReintegro())
            return true;
        return false;
    }

    public void limpiar() {

    }

}
