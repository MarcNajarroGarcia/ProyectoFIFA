FIFA Nuestro
Este programa permite a los usuarios comprar jugadores de fútbol para su equipo personalizado. El usuario puede elegir de qué posición desea comprar jugadores, y cada posición tendrá diferentes jugadores para elegir. El programa también permite a los usuarios ver su equipo en cualquier momento.

Cómo funciona el programa
El programa comienza solicitando al usuario que elija la posición de los jugadores que desea comprar. Luego, el programa muestra una lista de los jugadores disponibles para esa posición, junto con su precio y estadísticas de juego, como la velocidad, el chute y la defensa. Después de que el usuario ha elegido a su jugador, el programa deduce el precio de su cuenta de equipo y actualiza el equipo con el nuevo jugador.

El programa también mantiene un registro de los jugadores que el usuario ha comprado y los muestra como una plantilla de equipo. La aplicación es interactiva y se ejecuta en una terminal.

Variables
BLACK, RED, GREEN, YELLOW, BLUE, PURPLE, CYAN, WHITE, RESET
Estas variables son constantes que se utilizan para dar color a la salida del programa en la terminal.

jugadores
Este es un array bidimensional que contiene información sobre los jugadores disponibles para la compra. Cada fila representa a un jugador y cada columna representa una característica del jugador, como el nombre, el precio, la posición, la velocidad, el chute y la defensa.

variable
Este es un array de enteros que se utiliza para contabilizar las veces que el usuario puede elegir jugadores para comprar. Se inicializa con un valor de 5 y se reduce en uno cada vez que el usuario compra un jugador.

contadorJugadors
Este es un contador que se utiliza para realizar un seguimiento del número de jugadores que el usuario ha comprado.

guardarJugadores
Este es un array de cadenas que se utiliza para guardar los nombres de los jugadores que el usuario ha comprado. Se utiliza para mostrar la plantilla del equipo.

Funciones
main()
Esta es la función principal del programa. Se encarga de inicializar el array de jugadores y llamar a la función buscarJugadoresPosicion(), que se encarga de manejar la interacción con el usuario.

initJugadores()
Esta función inicializa el array de jugadores con información sobre cada jugador, como su nombre, precio y estadísticas de juego. La función devuelve el array de jugadores inicializado.

buscarJugadoresPosicion()
Esta función se encarga de interactuar con el usuario y mostrar los jugadores disponibles para la compra. El usuario elige la posición de los jugadores que desea comprar y luego se muestra una lista de los jugadores disponibles para esa posición. El usuario puede elegir comprar un jugador o salir del programa.

colorTexto()
Esta función se utiliza para dar formato a la salida del programa en la terminal. Toma una cadena y un color como argumentos y devuelve la cadena con el formato de color adecuado.

mostrarPlantilla()
Esta función se encarga de mostrar la plantilla del equipo del usuario. Utiliza el array guardarJugadores para mostrar los nombres de los jugadores que el usuario ha comprado
