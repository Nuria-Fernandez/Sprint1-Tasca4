package N1exercici3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LanzarExcepcionTest {

    @Test
    public void comprobarExcepcion(){
        LanzarExcepcion nuevaLista = new LanzarExcepcion();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {nuevaLista.accederIndice(6);});
    }

}