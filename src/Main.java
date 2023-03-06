public class Main {
    public static void main(String[] args) {
        // bucle for
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        String[] nombres = {"tete", "kolsto", "murmu"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        // bucle forEach
        int cont = 0;
        String idiomasStr = "";
        String[] idiomas = {"Esperanto", "Klingon", "Elfico"};
        for (String idioma : idiomas) {
            idiomasStr += idioma + " ";
            cont += 1;
            if (cont == idiomas.length){
                System.out.println(idiomasStr);
            }
        }

    }
}