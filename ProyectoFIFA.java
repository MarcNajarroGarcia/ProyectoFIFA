import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

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


    public class ProyectoFIFA {
        static Scanner sc = new Scanner(System.in);
        static Random random = new Random();

        static class Jugador {
            String nombre;
            int valor;
            int posicion;

            Jugador(String nombre, int valor, int posicion) {
                nombre = nombre;
                valor = valor;
                posicion = posicion;
            }
        }

        static ArrayList<Jugador> plantilla = new ArrayList<>();
        static int puntos = 100;

        public static void limitePuntos(String[] args) {
            while (true) {
                System.out.println("Menú:");
                System.out.println("1. Comprar jugadores");
                System.out.println("2. Completar plantilla automáticamente");
                System.out.println("3. Ver plantilla");
                System.out.println("4. Vender jugador");
                System.out.println("5. Cambiar posición de jugador");
                System.out.println("6. Salir");
                System.out.print("Elija una opción: ");

                int opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        comprarJugadores();
                        break;
                    case 2:
                        completarPlantilla();
                        break;
                    case 3:
                        verPlantilla();
                        break;
                    case 4:
                        venderJugador();
                        break;
                    case 5:
                        cambiarPosicion();
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
            }
        }

        static void comprarJugadores() {
            System.out.print("Ingrese el nombre del jugador: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese el valor del jugador: ");
            int valor = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese la posición del jugador (1. Portero, 2. Defensa, 3. Medio, 4. Delantero): ");
            int posicion = sc.nextInt();
            sc.nextLine();

            if (puntos >= valor) {
                puntos -= valor;
                plantilla.add(new Jugador(nombre, valor, posicion));
                System.out.println("Jugador comprado");
            } else {
                System.out.println("No tienes suficientes puntos para comprar al jugador");
            }
        }

        static void completarPlantilla() {
            int jugadoresFaltantes = 11 - plantilla.size();
            for (int i = 0; i < jugadoresFaltantes; i++) {
                int valor = random.nextInt(puntos + 1);
                int posicion = random.nextInt(4) + 1;
                String nombre = "Jugador " + (i + 1);
                puntos -= valor;
                plantilla.add(new Jugador(nombre, valor, posicion));
            }
            System.out.println("Plantilla completada automáticamente");
        }

        static void verPlantilla() {
            System.out.println("Plantilla:");
            for (Jugador jugador : plantilla) {
                System.out.println(jugador.nombre + " (" + jugador.valor + " puntos, posición " + jugador.posicion + ")");
            }
            System.out.println("Puntos disponibles: " + puntos);
        }

        static void venderJugador() {
            System.out.print("Ingrese el nombre del jugador a vender: ");
            String nombre = sc.nextLine();

            int indice = -1;
            for (int i = 0; i < plantilla.size(); i++) {
                if (plantilla.get(i).nombre.equals(nombre)) {
                    indice = i;
                    break;
                }
            }

            if (indice == -1) {
                System.out.println("No se encontró al jugador");
                return;
            }

            Jugador jugador = plantilla.get(indice);
            puntos += jugador.valor;
            plantilla.remove(indice);
            System.out.println("Jugador vendido");
        }

        static void cambiarPosicion() {
            System.out.print("Ingrese el nombre del jugador a cambiar de posición: ");
            String nombre = sc.nextLine();

            int indice = -1;
            for (int i = 0; i < plantilla.size(); i++) {
                if (plantilla.get(i).nombre.equals(nombre)) {
                    indice = i;
                    break;
                }
            }

            if (indice == -1) {
                System.out.println("No se encontró al jugador");
                return;
            }

            Jugador jugador = plantilla.get(indice);
            System.out.print("Ingrese la nueva posición del jugador (1. Portero, 2. Defensa, 3. Medio, 4. Delantero): ");
            int posicion = sc.nextInt();
            sc.nextLine();

            jugador.posicion = posicion;
            System.out.println("Posición del jugador cambiada");
        }
    }
