FIFA:

Este programa permite a los usuarios comprar jugadores de fútbol para crear su equipo personalizado de 5 jugadores. El usuario puede elegir de qué posición desea comprar jugadores, y cada posición tendrá diferentes jugadores para elegir. El programa también permite a los usuarios ver su equipo en cualquier momento.


COMO FUNCIONA:

El programa comienza preguntando al usuario que elija la posición de los jugadores que quiere comprar. Luego, el programa muestra una lista de los jugadores disponibles para esa posición. Después de que el usuario ha elegido a su jugador, el programa actualiza el equipo con el nuevo jugador.

El programa también mantiene un registro de los jugadores que el usuario ha comprado y los muestra como una plantilla de equipo.




VARIABLES:

BLACK, RED, GREEN, YELLOW, BLUE, PURPLE, CYAN, WHITE, RESET
Estas variables son constantes que se utilizan para dar color y dar mejor visibilidad al programa.


jugadores
Este es un array que contiene información sobre los jugadores disponibles para la compra. Cada fila representa a un jugador y cada columna representa una característica del jugador, como el nombre, el precio, la posición, la velocidad, el chute y la defensa.


variable
Este es un array de enteros que se utiliza para contabilizar las veces que el usuario puede elegir jugadores para comprar. Se inicializa con un valor de 5 y se reduce en uno cada vez que el usuario compra un jugador hasta llegar a 0 que es que ya no puede comprar mas y tiene el equipo completo.


contadorJugadors
Este es un contador que se utiliza para realizar un seguimiento del número de jugadores que el usuario ha comprado.


guardarJugadores
Este es un arrayque se utiliza para guardar los nombres de los jugadores que el usuario ha comprado. Se utiliza para mostrar la plantilla del equipo.


Funciones
main()
Es el metodo ejecutable.


initJugadores()
Esta función inicializa el array de jugadores con información sobre cada jugador, como su nombre, precio y estadísticas de juego. La función devuelve el array de jugadores inicializado.


buscarJugadoresPosicion()
Esta función se encarga de interactuar con el usuario y mostrar los jugadores disponibles para la compra. El usuario elige la posición de los jugadores que quiere comprar y luego se muestra una lista de los jugadores disponibles para esa posición.


colorTexto()
Esta funcion sirve para dar color al programa.


mostrarPlantilla()
Esta función se encarga de mostrar la plantilla del equipo del usuario. Utiliza el array guardarJugadores para mostrar los nombres de los jugadores que el usuario ha comprado.
