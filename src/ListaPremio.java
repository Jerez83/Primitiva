import java.util.ArrayList;
import java.util.HashMap;

public class ListaPremio {

    private  HashMap<String, CombinacionPremio> mapa;

    public ListaPremio() {
        mapa = new HashMap<>();
        mapa.put("02-05-2018",new CombinacionPremio(new int[]{3,6,34,26,42,23},2,49));
        mapa.put("03-05-2018",new CombinacionPremio(new int[]{13,16,24,44,32,19},4,22));
        mapa.put("04-05-2018",new CombinacionPremio(new int[]{1,13,21,34,44,47},7,12));

    }

    public void agregarPremio(String fecha, CombinacionPremio combinacionPremio) {
        mapa.put(fecha,combinacionPremio);
    }

    public  HashMap<String, CombinacionPremio> getMapa() {
        return mapa;
    }
}
