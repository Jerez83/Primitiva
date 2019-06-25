import javax.swing.*;
import java.awt.*;

public class PanelCentral extends JPanel {
    private PanelNumeros panelNumeros;
    private PanelReintegro panelReintegro;

    public PanelCentral() {

        panelNumeros = new PanelNumeros();
        panelNumeros.setPreferredSize(new Dimension(500,400));
        add(panelNumeros);

        panelReintegro = new PanelReintegro();
        panelReintegro.setPreferredSize(new Dimension(400,300));
        add(panelReintegro);
    }
}
