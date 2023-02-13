import java.util.Random;
import java.util.Scanner;

public class ProyectoFIFANuestro {

                                             //PROGRAMA FIFA

//De que va el programa:

//Puedes comprar y vender jugadores.

//Al inicio de cada partida el usuario tendrá un límite de puntos para comprar jugadores por ejemplo 100 puntos, cada jugador
//dependiendo del valor del jugador, siendo mejor o peor el jugador valdrá más o menos. Los usuarios tendrán que ir con cuidado
//porque si se les acaban los puntos tendrán que vender a algún jugador que ya hayan comprado o se quedarán con algún jugador
//aleatorio lógicamente peor.

//El usuario podrá elegir completar la plantilla automáticamente con jugadores random si no le apetece comprar jugadores

//Una vez comprado los jugadores el usuario tiene que hacer un equipo con los jugadores comprados.

//El usuario podrá hacer que le puedas cambiar la posicion a algún jugador por ejemplo poner a un delantero de portero, etc.



    final String BLACK = "\033[30m";
    final String RED = "\033[31m";
    final String GREEN = "\033[32m";
    final String YELLOW = "\033[33m";
    final String BLUE = "\033[34m";
    final String PURPLE = "\033[35m";
    final String CYAN = "\033[36m";
    final String WHITE = "\033[37m";
    final String RESET = "\u001B[0m";




    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        int puntosUsuario = 200;

        comprarJugadores();

    }

    public static String[][] jugadores(){
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


    public static String comprarJugadores(){

        Scanner llegir = new Scanner(System.in);
        String[][] jugadores = new String[25][6];
        jugadores = jugadores();

        System.out.println("Ingresa el nombre del jugador que quieres comprar: ");
        for (int i = 0; i < jugadores().length; i++) {
            if ()
            }
        }

    return comprarJugadores();

    }

}
