package N1exercici1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MesesTest {
    //comprobar que la lista tiene 12 posiciones
    @Test
    public void comprobarNumPosicionesLista(){
        Meses cantidadMeses = new Meses();
        ArrayList <String> listaMeses = cantidadMeses.verListaMeses();
        assertEquals(12, listaMeses.size());
    }
    //comprobar que la lista no es nula
    @Test
    public void comprobarListaNoNula(){
        Meses cantidadMeses = new Meses();
        ArrayList <String> listaMeses = cantidadMeses.verListaMeses();
        assertNotNull(listaMeses);//los assert dan true
    }
    //comprobar posición 8 está agosto
    @Test
    public void comprobarPosicionAgosto(){
        Meses meses = new Meses();
        ArrayList <String> listaMeses = meses.verListaMeses();
        assertEquals("Agosto", listaMeses.get(7));
    }



}