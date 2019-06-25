import java.util.Arrays;

public class CombinacionUsuario {

    private int[] numeros;                      // [1-49]
    private int reintegro;                      // [0-9]

    public CombinacionUsuario(int[] numeros, int reintegro) {

        setNumeros(numeros);
        setReintegro(reintegro);

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



    public int[] getNumeros() {
        return numeros;
    }

    public int getReintegro() {
        return reintegro;
    }


    @Override
    public String toString() {
        return "CombinacionPremio{" +
                "numeros=" + Arrays.toString(numeros) +
                ", reintegro=" + reintegro +
                '}';
    }
}
