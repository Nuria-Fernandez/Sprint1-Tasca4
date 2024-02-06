package N1exercici2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class CalculoDniTest {

    @ParameterizedTest//nos indica que el test va a dar todas las vueltas de todos los datos que guardemos en @ValueSource
    @CsvSource ({"43550004, X", "47182347, D", "12345678, Z", "12365498, P", "45612378, C","12457896, S", "79854612, S",
    "45678923, A", "41758262, Z", "25879641, H"})//Estas cadenas son el String numDni
    public void comprobarCalculoDni(String num, char letra) {
        CalculoDni nuevoDni = new CalculoDni(num, letra);
        assertEquals(letra, nuevoDni.calcularLetra(num));//comparo la letra original con la calculada y deben coincidir(dar true)
        //comprueba mediante .calcularLetra, que la letra del String numDni sea correcta
    }
}