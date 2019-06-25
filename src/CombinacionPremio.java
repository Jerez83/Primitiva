import java.util.Arrays;

public class CombinacionPremio {
    private int[] numeros;                      // [1-49]
    private int reintegro;                      // [0-9]
    private int complementario;                 // [1-49]

    public CombinacionPremio(int[] numeros, int reintegro, int complementario) {

        setNumeros(numeros);
        setReintegro(reintegro);
        setComplementario(complementario);

    }

    public void setNumeros(int[] numeros) {

        if (numeros.length!=6)
            throw new IllegalArgumentException("Error: el numero de elementos del array tiene que ser 6");

        for (int i = 0; i <numeros.length ; i++) {
          if(numeros[i]>49 || numeros[i]<1)
              throw new IllegalArgumentException("Error: los numeros tienen que estar en un rango [1-49]");
        }
        this.numeros = numeros;
    }

    public void setReintegro(int reintegro) {
        if (reintegro<0 || reintegro > 9)
            throw new IllegalArgumentException("Error: el reintegro debe estar comprendido entre [0-9]");
        this.reintegro = reintegro;
    }

    public void setComplementario(int complementario) {

        if (complementario < 1 || complementario > 49)
            throw new IllegalArgumentException("Error: el reintegro debe estar comprendido entre [1-49]");
        this.complementario = complementario;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public int getReintegro() {
        return reintegro;
    }

    public int getComplementario() {
        return complementario;
    }

    @Override
    public String toString() {
        return Arrays.toString(numeros) +
                ", reintegro=" + reintegro +
                ", complementario=" + complementario +
                '}';
    }
}
