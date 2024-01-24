package N1exercici2;

public class CalculoDni {
    private String numeroDni;
    private char letraDni;

    public CalculoDni(String numeroDni, char letraDni){
        this.numeroDni = numeroDni;
        this.letraDni = calcularLetra(numeroDni);

    }
    public char calcularLetra(String numeroDni) throws NumberFormatException {
        char letras [] = {'T','R','W','A','G','M','Y','F','P','D',
                'X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        char letraDni;
        if(numeroDni.length() != 8){
            throw new NumberFormatException("El numero de DNI no es válido");
        }else{
            int numDni = Integer.parseInt(numeroDni);//Pasa un String a un int
            letraDni = letras[numDni % 23];//El resto da el índice del array y lo que guarda es lo que hay guardado en el índice
        }
        return letraDni;
    }

    public String toString(){
        return numeroDni + calcularLetra(numeroDni);
    }
}
