package co.edu.uniquindio.poo;

public class Vocal {

    //Realizar un programa que dada una palabra indique la cantidad de vocales.


    /**
     * Metodo que determina si un caracter es vocal
     * @param letra
     * @return
     */
    public static boolean isVocal(char letra){
        boolean centinela = false;
        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            centinela = true;
        }
        return centinela;
    }

    //2. necesito algo que me indique que dadado palabra cuente las vocales
    public static int contarVocales(String palabra){
        int cont=0;
        for(int i = 0; i<palabra.length(); i++){
            char letra = palabra.charAt(i);
            if(isVocal(letra)){
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        String palabra = "murcielago";
        System.out.println("La cantidad de vocales que tiene la palabra " + palabra + " son " + contarVocales(palabra) + " vocales");
    }




    
}
