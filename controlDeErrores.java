import java.util.Scanner;

public class controlDeErrores {

    //COLORES
    final String BLACK = "\033[30m";
    static final String RED = "\033[31m";
    final String GREEN = "\033[32m";
    final String YELLOW = "\033[33m";
    final String BLUE = "\033[34m";
    final String PURPLE = "\033[35m";
    final String CYAN = "\033[36m";
    final String WHITE = "\033[37m";
    static final String RESET = "\u001B[0m";


    /**
     * Metode per llegir un float per teclat amb control d'errors i de domini de valors
     *
     * @param missatge Missatge d'entrada personalitzat, para cambiarlo tenemos que ir al otro metodo de arriba y cambiarlo
     * @param min      Lo que hace es poner un limite minimo personalizado, para cambiarlo tenemos que ir al otro metodo de arriba y cambiarlo
     * @param max      Lo que hace es poner un limite maxima personalizado, para cambiarlo tenemos que ir al otro metodo de arriba y cambiarlo
     * @return Retorna el numero inicial que posa l'usuari
     */
    public static float llegirFloat(String missatge, float min, float max) {
        //FLOAT CON CONTROL DE ERRORES

        Scanner llegir = new Scanner(System.in);

        float x = 0;
        boolean valorCorrecte = false;

        do {
            System.out.println("");
            System.out.print(missatge);
            valorCorrecte = llegir.hasNextFloat();

            if (!valorCorrecte) {
                System.out.println(RED + "ERROR: Tipus de dades no correcte!" + RESET);
            } else {
                x = llegir.nextFloat();
                if (x < min || x > max) {
                    System.out.println(RED + "WARNING: Valor no acceptat!" + RESET);
                    valorCorrecte = false;
                }
            }

            llegir.nextLine();

        } while (!valorCorrecte);

        return x;
    }

    /**
     * Es una lecutra del entero con control de errores i de valores
     *
     * @param
     * @param missatge Es el mensaje que dice la maquina al usuario
     * @return Devuelve el enterro con el control de errores aplicado
     */
    public static int llegirEnter(String missatge, int max, int min) {
        Scanner llegir = new Scanner(System.in);

        int x = 0;

        boolean valorCorrecte = false;

        do {
            System.out.println(missatge);
            valorCorrecte = llegir.hasNextInt();

            if (!valorCorrecte) {
                System.out.println("ERROR: Valor no enter.");
                llegir.nextLine();

            } else { // Tinc un enter
                x = llegir.nextInt();
                llegir.nextLine();
                if (x < min || x > max) {
                    System.out.println("Opció no vàlida");
                    valorCorrecte = false;

                }
            }
        } while (!valorCorrecte);

        return x;
    }

    /**
     * Metode per llegir un float per teclat amb control d'errors
     *
     * @param missatge Missatge d'entrada personalitzat, para cambiarlo tenemos que ir al otro metodo de arriba y cambiarlo
     * @return Retorna el numero inicial que posa l'usuari
     */
    public static float llegirFloat(String missatge) {
        //FLOAT CON CONTROL DE ERRORES

        Scanner llegir = new Scanner(System.in);

        float x = 0;
        boolean valorCorrecte = false;

        do {
            System.out.println("");
            System.out.print(missatge);
            valorCorrecte = llegir.hasNextFloat();

            if (!valorCorrecte) {
                System.out.println(RED + "ERROR: Tipus de dades no correcte!" + RESET);
            } else {
                x = llegir.nextFloat();

            }

            llegir.nextLine();

        } while (!valorCorrecte);

        return x;
    }

    /**
     * Es una lecutra del entero con control de errores
     *
     * @param missatge Es el mensaje que dice la maquina al usuario
     * @return Devuelve el enterro con el control de errores aplicado
     */
    public static int llegirEnter(String missatge) {
        Scanner llegir = new Scanner(System.in);

        int x = 0;

        boolean valorCorrecte = false;

        do {
            System.out.println(missatge);
            valorCorrecte = llegir.hasNextInt();

            if (!valorCorrecte) {
                System.out.println("ERROR: Valor no enter.");
                llegir.nextLine();

            } else {
                x = llegir.nextInt();


            }

        } while (!valorCorrecte);

        return x;
    }
}

