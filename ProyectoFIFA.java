import java.util.Scanner;

public class ProyectoFIFA {

                                                                     //PROGRAMA FIFA

//De que va el programa:

//Puedes comprar jugadores para tu equipo

//Los jugadores que compre el usuario irán hacia su equipo

//El usuario podrá elegir de que posiciones quiere comprar a los jugadores, en cada posicion habrá diferentes jugadores

//El usuario podrá ver su equipo cuando quiera


    static final String BLACK = "\033[30m";
    static final String RED = "\033[31m";
    static final String GREEN = "\033[32m";
    static final String YELLOW = "\033[33m";
    static final String BLUE = "\033[34m";
    static final String PURPLE = "\033[35m";
    static final String CYAN = "\033[36m";
    static final String WHITE = "\033[37m";
    static final String RESET = "\u001B[0m";


    /**
     * Son los jugadores y sus caracteristicas
     */
    static String[][] jugadores;

    /**
     * Es un array para contabilizar las veces que el usuario puede coger jugadores
     */
    public static int variable[] = new int [5];

    /**
     * Es el contador de los jugadores que lleva el usuario escogidos
     */
    public static int contadorJugadors = 0;

    /**
     * Es donde se guardan los jugadores que elige el usuario y luego se utilizan para mostrar la plantilla
     */
    public static String guardarJugadores[] = new String[5];


    /**
     * Es el metode executable
     * @param args
     */
    public static void main(String[] args) {

        jugadores = initJugadores();

        buscarJugadoresPosicion();

    }

    /**
     * Inicializacion de jugadores por el nombre, precio, posicion, velocidad, chute y defensa
     * @return Devuelve los nombres y estadisticas de los jugadores
     */
    public static String[][] initJugadores() {

        /*
        0.Posicion - Nombre
        1.Posicion - Precio
        2.Posicion - Posicion
        3.Posicion - Velocidad
        4.Posicion - Chute
        5.Posicion - Defensa
        */

        String[][] jugadores = new String[25][6];

        jugadores[0][0] = "Lionel Messi";
        jugadores[0][1] = "55";
        jugadores[0][2] = "Delantero";
        jugadores[0][3] = "87";
        jugadores[0][4] = "92";
        jugadores[0][5] = "40";
        jugadores[1][0] = "Cristiano Ronaldo";
        jugadores[1][1] = "55";
        jugadores[1][2] = "Delantero";
        jugadores[1][3] = "86";
        jugadores[1][4] = "91";
        jugadores[1][5] = "40";
        jugadores[2][0] = "Kylian Mbappé";
        jugadores[2][1] = "50";
        jugadores[2][2] = "Delantero";
        jugadores[2][3] = "93";
        jugadores[2][4] = "85";
        jugadores[2][5] = "40";
        jugadores[3][0] = "Robert Lewandowski";
        jugadores[3][1] = "45";
        jugadores[3][2] = "Delantero";
        jugadores[3][3] = "79";
        jugadores[3][4] = "94";
        jugadores[3][5] = "40";
        jugadores[4][0] = "Luka Modric";
        jugadores[4][1] = "35";
        jugadores[4][2] = "Medio";
        jugadores[4][3] = "75";
        jugadores[4][4] = "82";
        jugadores[4][5] = "82";
        jugadores[5][0] = "Pedri";
        jugadores[5][1] = "30";
        jugadores[5][2] = "Medio";
        jugadores[5][3] = "75";
        jugadores[5][4] = "80";
        jugadores[5][5] = "80";
        jugadores[6][0] = "Papi Gavi";
        jugadores[6][1] = "35";
        jugadores[6][2] = "Medio";
        jugadores[6][3] = "84";
        jugadores[6][4] = "79";
        jugadores[6][5] = "80";
        jugadores[7][0] = "David TheGrefg";
        jugadores[7][1] = "10";
        jugadores[7][2] = "Portero";
        jugadores[7][3] = "42";
        jugadores[7][4] = "55";
        jugadores[7][5] = "75";
        jugadores[8][0] = "Eric Ruiz";
        jugadores[8][1] = "20";
        jugadores[8][2] = "Medio";
        jugadores[8][3] = "72";
        jugadores[8][4] = "35";
        jugadores[8][5] = "74";
        jugadores[9][0] = "Virgil van Dijk";
        jugadores[9][1] = "20";
        jugadores[9][2] = "Defensa";
        jugadores[9][3] = "82";
        jugadores[9][4] = "42";
        jugadores[9][5] = "90";
        jugadores[10][0] = "Karim Benzema";
        jugadores[10][1] = "45";
        jugadores[10][2] = "Delantero";
        jugadores[10][3] = "80";
        jugadores[10][4] = "86";
        jugadores[10][5] = "50";
        jugadores[11][0] = "Sergio Ramos";
        jugadores[11][1] = "15";
        jugadores[11][2] = "Defensa";
        jugadores[11][3] = "73";
        jugadores[11][4] = "43";
        jugadores[11][5] = "85";
        jugadores[12][0] = "xBuyer";
        jugadores[12][1] = "10";
        jugadores[12][2] = "Defensa";
        jugadores[12][3] = "21";
        jugadores[12][4] = "31";
        jugadores[12][5] = "40";
        jugadores[13][0] = "Manuel Neuer";
        jugadores[13][1] = "15";
        jugadores[13][2] = "Portero";
        jugadores[13][3] = "46";
        jugadores[13][4] = "22";
        jugadores[13][5] = "83";
        jugadores[14][0] = "Ter Stegen";
        jugadores[14][1] = "15";
        jugadores[14][2] = "Portero";
        jugadores[14][3] = "47";
        jugadores[14][4] = "21";
        jugadores[14][5] = "84";
        jugadores[15][0] = "DjMario";
        jugadores[15][1] = "30";
        jugadores[15][2] = "Delantero";
        jugadores[15][3] = "75";
        jugadores[15][4] = "80";
        jugadores[15][5] = "33";
        jugadores[16][0] = "Toni Kroos";
        jugadores[16][1] = "30";
        jugadores[16][2] = "Medio";
        jugadores[16][3] = "75";
        jugadores[16][4] = "83";
        jugadores[16][5] = "82";
        jugadores[17][0] = "Kevin De Bruyne";
        jugadores[17][1] = "35";
        jugadores[17][2] = "Medio";
        jugadores[17][3] = "70";
        jugadores[17][4] = "85";
        jugadores[17][5] = "83";
        jugadores[18][0] = "Thiago Silva";
        jugadores[18][1] = "15";
        jugadores[18][2] = "Defensa";
        jugadores[18][3] = "71";
        jugadores[18][4] = "41";
        jugadores[18][5] = "86";
        jugadores[19][0] = "Ruben Dias";
        jugadores[19][1] = "20";
        jugadores[19][2] = "Defensa";
        jugadores[19][3] = "75";
        jugadores[19][4] = "45";
        jugadores[19][5] = "88";
        jugadores[20][0] = "Aymeric Laporte";
        jugadores[20][1] = "20";
        jugadores[20][2] = "Defensa";
        jugadores[20][3] = "74";
        jugadores[20][4] = "50";
        jugadores[20][5] = "87";
        jugadores[21][0] = "Jordi Alba";
        jugadores[21][1] = "15";
        jugadores[21][2] = "Defensa";
        jugadores[21][3] = "87";
        jugadores[21][4] = "60";
        jugadores[21][5] = "75";
        jugadores[22][0] = "Ferland Mendy";
        jugadores[22][1] = "15";
        jugadores[22][2] = "Defensa";
        jugadores[22][3] = "87";
        jugadores[22][4] = "59";
        jugadores[22][5] = "76";
        jugadores[23][0] = "Dani Carvajal";
        jugadores[23][1] = "15";
        jugadores[23][2] = "Defensa";
        jugadores[23][3] = "85";
        jugadores[23][4] = "62";
        jugadores[23][5] = "79";
        jugadores[24][0] = "Paulo Dybala";
        jugadores[24][1] = "40";
        jugadores[24][2] = "Delantero";
        jugadores[24][3] = "84";
        jugadores[24][4] = "87";
        jugadores[24][5] = "40";

        return jugadores;
    }



    /**
     * Tiene que elegir la posicion de los jugadores y seleccionarla, si selecciona una que no es valida, pone el mensaje de error, si no, muestra los jugadores de esa posicion
     * @return Devuelve la verificacion de los jugadores o el mensaje de error hasta que lo ponga correctamente.
     */
    public static int comprarJugadores(){
        Scanner llegir = new Scanner(System.in);

        boolean valorCorrecte = false;

        int posicion = 0;

        do {
            System.out.println("");

            System.out.print("De que posicion quieres elegir al jugador?: \n(1) Portero \n(2) Defensa \n(3) Medio \n(4) Delantero ");
            posicion = llegirInt("");
            System.out.println("");

            if (posicion == 1 || posicion == 2 || posicion == 3 || posicion == 4) {
                valorCorrecte = true;
            } else{
                System.out.println("Por favor ingrese una de las opciones válidas.");
                valorCorrecte = false;
            }
        }while (!valorCorrecte);

        System.out.println("");


        System.out.println("Elige el nombre del jugador que quieres elegir: ");
        int jugadores = llegirInt("");

        return comprarJugadores();
    }


    /**
     * Busca los jugadores en la matriz y va haciendo el contador de los jugadores que llevas y te quedan por escoger
     */
    private static void buscarJugadoresPosicion(){
        Scanner llegir = new Scanner(System.in);

        int eleccion = 0;
        String posicion="";

        do {

        eleccion = llegirInt("De que posicion quieres elegir al jugador?: \n\t(1) Portero \n\t(2) Defensa \n\t(3) Medio \n\t(4) Delantero \n\t(5) Ver mi plantilla");



        switch (eleccion){
            case 1:
                posicion = "Portero";
                break;
            case 2:
                posicion = "Defensa";
                break;
            case 3:
                posicion = "Medio";
                break;
            case 4:
                posicion = "Delantero";
                break;
            case 5:
                verMiPlantilla();
            default:
                System.out.println(RED + "Posición no válida!" + RESET);
                break;
        }


        int idJugador;


            imprimirJugadoresPosicion(posicion);
            idJugador = elegirJugadorPosicion(posicion);
            variable[contadorJugadors] = contadorJugadors;
            contadorJugadors++;
            System.out.println(BLUE + "Llevas " + contadorJugadors + " elegidos" + RESET);
            System.out.println("");
        }while (contadorJugadors < 5);

    }

    /**
     * Metodo para ver la plantilla que el usuario ha escogido mediante los jugadores
     */
    public static void verMiPlantilla() {

        System.out.println("Los jugadores que tienes en tu plantilla son: "
                + "\n"  +guardarJugadores[0]
                + "\n" + guardarJugadores[1]
                + "\n" + guardarJugadores[2]
                + "\n" + guardarJugadores[3]
                + "\n" + guardarJugadores[4]
        );

        System.out.println("");

            buscarJugadoresPosicion();
    }


    /**
     * El usuario tiene que escoger a los jugadores que quiere para su equipo por su id
     * @param posicion Hay 4 posiciones diferentes, y los separa a los jugadores por la posicion
     * @return Devuelve la id del jugador
     */
    public static int elegirJugadorPosicion(String posicion) {
        Scanner llegir = new Scanner(System.in);

        int idJugador;
        int i = 0;


        do {
            idJugador = llegirInt("Elige el id de uno de los jugadores mostrados: ");


            if (idJugador > 0 && idJugador < jugadores.length){
                if (jugadores[idJugador][2].equalsIgnoreCase(posicion)){
                    System.out.println("Muy bien, has elegido " + jugadores[idJugador][0]);
                    System.out.println(YELLOW + "Has elegido a un " + posicion + " --> " + jugadores[idJugador][0] + RESET);

                    guardarJugadores[i] = jugadores[idJugador][0];
                    i++;

                }else{
                    System.out.println("");
                    System.out.println(RED + "ERROR: Has elegido un idJugador que no es " + posicion + RESET);
                    System.out.println("");
                    idJugador = -1;
                }
            }else{
                System.out.println("ERROR: Jugador elegido fuera de rango!");
                idJugador = -1;
                contadorJugadors--;
            }

        }while(false);


        return idJugador;
    }

    /**
     * Imprime la id  de los jugadores por la posicion requerida
     * @param posicion Imprime la id de los jugadores por posicion
     */
    public static void imprimirJugadoresPosicion(String posicion){
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i][2].equalsIgnoreCase(posicion)){
                System.out.println("["+i+"] -> " +  jugadores[i][0]);
            }
        }
    }


    /**
     * Es una lecutra del entero con control de errores
     *
     * @param missatge Es el mensaje que dice la maquina al usuario
     * @return Devuelve el enterro con el control de errores aplicado
     */
    public static int llegirInt(String missatge) {
        Scanner llegir = new Scanner(System.in);

        int x = 0;

        boolean valorCorrecte = false;

        do {
            System.out.println(missatge);
            valorCorrecte = llegir.hasNextInt();

            if (!valorCorrecte) {
                System.out.println(RED + "ERROR: Valor no enter."  + RESET );
                llegir.nextLine();

            } else {
                x = llegir.nextInt();

            }

        } while (!valorCorrecte);

        return x;
    }

}
