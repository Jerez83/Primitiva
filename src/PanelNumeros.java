import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelNumeros extends JPanel {

    private JButton[] botones;
    private int contador = 1;
    private Color MICOLOR = new Color(51,158,54);
    private static int[] numeros = new int[6];


    public PanelNumeros() {
        setLayout(new GridLayout(5,10));
        botones = new JButton[50];


        for (int i = 0; i < botones.length -1 ; i++) {
            botones[i] = new JButton(String.valueOf(i+1));
            add(botones[i]);
            botones[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() instanceof JButton) {
                        JButton clicado = (JButton) e.getSource();
                        if (contador < 7) {
                            if (clicado.getBackground() == MICOLOR) {
                                clicado.setBackground(null);
                                contador--;
                            } else {
                                clicado.setBackground(MICOLOR);
                                switch (contador) {
                                    case 1:
                                        PanelOeste.getNumero1().setText(clicado.getText());
                                        numeros[0]= Integer.valueOf(clicado.getText());
                                        break;
                                    case 2:
                                        PanelOeste.getNumero2().setText(clicado.getText());
                                        numeros[1]= Integer.valueOf(clicado.getText());
                                        break;
                                    case 3:
                                        PanelOeste.getNumero3().setText(clicado.getText());
                                        numeros[2]= Integer.valueOf(clicado.getText());
                                        break;
                                    case 4:
                                        PanelOeste.getNumero4().setText(clicado.getText());
                                        numeros[3]= Integer.valueOf(clicado.getText());
                                        break;
                                    case 5:
                                        PanelOeste.getNumero5().setText(clicado.getText());
                                        numeros[4]= Integer.valueOf(clicado.getText());
                                        break;
                                    case 6:
                                        PanelOeste.getNumero6().setText(clicado.getText());
                                        numeros[5]= Integer.valueOf(clicado.getText());
                                        break;
                                }
                                contador++;
                            }
                        }

                    }
                }
            });

            botones[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() instanceof JButton) {
                        JButton clicado = (JButton) e.getSource();

                        if (clicado.getBackground()==null) {
                            clicado.setBackground(Color.GREEN);
                        }
                    }
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

    public static int[] getNumeros() {
        return numeros;
    }
}
