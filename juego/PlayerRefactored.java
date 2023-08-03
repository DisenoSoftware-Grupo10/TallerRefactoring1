import java.util.Random;

public class PlayerRefactored {
    int wins;
    int draws; //Porque un jugador debe saber cuandos empates lleva, yo diria

    public Opcion playerChoice(){
        final Opcion[] opciones= {new Roca(), new Papel(), new Tijeras()};

        int indexAleatorio= new Random().nextInt(opciones.length);
        return (Opcion)opciones[indexAleatorio];
    }

    public void setWins(){
        this.wins= wins++;
    }
    public int getWins(){
        return this.wins;
    }
}
