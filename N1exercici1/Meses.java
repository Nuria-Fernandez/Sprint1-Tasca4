package N1exercici1;
import java.util.ArrayList;
/*Crea una classe Java que insereixi en una llista ordenada els noms dels mesos de l'any.
Verifica amb jUnit que la llista té 12 posicions, que no és nul·la i que en la seva posició 8 conté el nom 'agost'.*/
public class Meses {
    ArrayList <String> listaMeses;

    public Meses(){
        listaMeses = new ArrayList<>();
        listaMeses.add("Enero");
        listaMeses.add("Febrero");
        listaMeses.add("Marzo");
        listaMeses.add("Abril");
        listaMeses.add("Mayo");
        listaMeses.add("Junio");
        listaMeses.add("Julio");
        listaMeses.add("Agosto");
        listaMeses.add("Septiembre");
        listaMeses.add("Octubre");
        listaMeses.add("Noviembre");
        listaMeses.add("Diciembre");
    }
    public ArrayList <String> verListaMeses(){
        return listaMeses;
    }
    public ArrayList <String> getListaMeses(){
        return listaMeses;
    }
    public void setListaMeses(ArrayList <String> listaMeses){
        this.listaMeses = listaMeses;
    }
    public String toString(){
        return "Los meses son" + listaMeses;
    }


}
