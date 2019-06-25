import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelReintegro extends JPanel {

    private JButton[] botones;
    private JLabel texto;
    private int contador;
    private static int reintegro;

    public PanelReintegro() {

        botones = new JButton[10];
        texto = new JLabel("Escoge el reintegro: ");
        add(texto);


        for (int i = 0; i < botones.length ; i++) {

            botones[i] = new JButton(String.valueOf(i));
            botones[i].setSize(new Dimension(5,10));
            add(botones[i]);
            botones[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() instanceof JButton) {
                        JButton clicado = (JButton) e.getSource();
                       if (!haySeleccionados()) {
                           clicado.setBackground(Color.GREEN);
                           PanelOeste.getNumero7().setText(clicado.getText());
                           reintegro=Integer.valueOf(clicado.getText());
                       }
                       else {
                           clicado.setBackground(null);
                           PanelOeste.getNumero7().setText(null);
                       }
                    }
                    System.out.println(contador);

                }
            });

        }
    }

    private boolean haySeleccionados() {

        for (int i = 0; i <botones.length ; i++) {
            if (botones[i].getBackground()==Color.GREEN)
                return true;

        }
        return false;

    }

    public static int getReintegro() {
        return reintegro;
    }
}
