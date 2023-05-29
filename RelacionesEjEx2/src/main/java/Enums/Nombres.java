/*
 Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
8 A X | 8 B X | 8 C X | 8 D | 8 E X | 8 F X
7 A X | 7 B X | 7 C X | 7 D X | 7 E | 7 F X
6 A X | 6 B X | 6 C | 6 D X | 6 E X | 6 F
5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X
4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X
3 A X | 3 B X | 3 C X | 3 D | 3 E X | 3 F X
2 A X | 2 B | 2 C X | 2 D X | 2 E X | 2 F
1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.
 */
package Enums;

/**
 *
 * @author Elio
 */
public enum Nombres {

        Angel, Bagrat, Juan, Eric, Anish, Ignacio, Bencomo, Iyad, Axel, Arian, Neizan, Hector, Grober, Amrane, Misael, Irai, Asier, Omar, Eleazar, Imran, Joel, Jonas, Ayun, Gentil, Eros, Joao, Guim, Ajaz, Gaston, Jorge, Marduk, Lucian, Felipe, Hermes, Herodes, Joaquin, Isaias, Gianluca, Ciro, Efrain, Nil, Isaac, Mael, Otto, Pau, Dipa, Dareck, Darin, Caleb, Pep, Giorgio, Mario, Homero, Aram, Elias, Francisco, Drago, Eliel, Neftali, Oliver, Aldo, Jehoram, Inge, Noe, Amaro, Abimael, Mohamed, Danilo, Luis, Jiram, Neil, Lionel, Engracio, Alpidio, Abel, Jon, Nain, Daniel, Eli, Alberto, Matias, Julio, Liam, Moises, Jacob, Ander, Policarpo, Arnau, Lemuel, Najim, Aleix, Eufemio, Nicolas, Benjamin, Damaso, Alonso, Acab, Alex, Aaron, Jan, Rafael, Bertino, Eñaut, Fabian, Erik, Bartolome, Max, Anas, Jesus, Laban, Gael, Cirino, Dario, Miguel, Julen, Ian, Alvaro, Adrian, Adam, Cesc, Moad, Josue, Eliseo, Foudil, Eneas, Javier, Felix, Marco, Amets, Adonis, Baltasar, Enzo, Joanix, Fabio, Jair_de_Galaad, Khaled, Emeric, Cain, Noah, Luca, Pedro, Feiyang, Cruz, Damen, Luka, Alejandro, Domenico, Lisandro, Guido, Carlos, Jaime, Pol, Democrito, Levi, Martin, Iraitz, German, Candi, Nilo, Galo, Ashur, Iyan, Jeremias, Gianni, Radu, Iker, Elvis, Dariel, Lucas, Biel, Abraham, Diego, Guillermo, Giulio, Gautam, Adel, Akos, Edgar, Aquiles, Israel, Ismael, Crisologo, Neo, Elyan, Lier, Munir, Algimantas, Abdiel, Bruno, Ensa, Gadiel, Agustin, Gourav, Leo, Aitor, Fernando, Jared, Gaspar, Ahzià, Azariel, Andres, Jairo, Gabriel, Alan, Jose, Adan, Nael, Manuel, Beltran, Izan, Mateo, Amir, Marcos, Leonidas, Antonio, Hugo, Edivaldo, Dylan, David, Marti, Delmiro, Pablo, Esteban, Marc, Jun, Dilan, Ivan, Nikita, Fiorenzo, Guifre, Gonzalo, Ezequiel, Ramses, Raul, Rayan, Renato, Rodrigo, Romulo, Roy, Ruben, Salomon, Samuel, Santiago, Saul, Sergio, Set, Severo, Sidi, Simeon, Simon, Taha, Tao, Teo, Thiago, Tobias, Unai, Uzias, Vadim, Victor, Vincenzo, Youssef, Zacarias, Zaid, Zigor, Zouhair;
   
}
