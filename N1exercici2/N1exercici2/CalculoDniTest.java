package N1exercici2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDniTest {

    @ParameterizedTest
    @ValueSource(strings = {"43550004X", "47182347D", "12345678Z", "12365498P", "45612378C","12457896S", "79854612S",
    "45678923A", "41758262Z", "25879641H"})//Estass cadenas son el String numDni
    public void comprobarCalculoDni(String numDni) { //me dan el numero y la letra
        String num = numDni.substring(0, 8); //divido la cadena en numeros(de la posicion 0 a la 8 -la última posición no la cuenta-)
        char letra = numDni.charAt(8); //divido de la cadena la letra (posición 8)
        CalculoDni nuevoDni = new CalculoDni(num, letra);
        assertEquals(letra, nuevoDni.calcularLetra(num));//comparo la letra original con la calculada y deben coincidir(dar true)
        //comprueba mediante .calcularLetra, que la letra del String numDni sea correcta
    }
}