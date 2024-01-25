package N1exercici3;

public class LanzarExcepcion {
    private int [] arrayPrueba = new int []{1, 2, 3, 4, 5};
    public void accederIndice(int indice) throws ArrayIndexOutOfBoundsException{

            System.out.println(arrayPrueba[indice]);


    }
}
