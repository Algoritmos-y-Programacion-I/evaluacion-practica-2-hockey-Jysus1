package model;

import java.util.Random;
import model.JugadorHockey;
import model.Equipo;
import model.ArbitroPrincipal;

public class Controller {

    private Equipo[] equipos;
    private Arbitro[] arbitros;
    
    

    private final int CANTIDAD_EQUIPOS = 4;
    private final int CANTIDAD_ARBITROS = 4;
    
    

    private int contadorEquipos = 0;

    /**
     * Constructor de la clase Controller para inicializar variables globales.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Controller con un arreglo de personas vacío.
     */
    public Controller() {
        equipos = new Equipo[CANTIDAD_EQUIPOS];
        arbitros = new Arbitro[CANTIDAD_ARBITROS];
        

        preLoadInfo();
    }

    public void preLoadInfo() { 
        
        Arbitro arbitro1 = new ArbitroPrincipal("Juan Fernando", 36);
        Arbitro arbitro2 = new ArbitroPrincipal("Hernan Hernandez", 22);

        JugadorHockey jugador1 = new JugadorHockey("Jesus David", 17, Posicion.ALA);
        JugadorHockey jugador2 = new JugadorHockey("Juan David", 22, Posicion.CENTRO);
        JugadorHockey jugador3 = new JugadorHockey("Hernan Triana", 33, Posicion.PORTERO);
        JugadorHockey jugador4 = new JugadorHockey("Juan Marcos", 22, Posicion.DEFENSA);
        JugadorHockey jugador5 = new JugadorHockey("Alejando Garcia", 19, Posicion.ALA);
        JugadorHockey jugador6 = new JugadorHockey("Juan Felipe", 25, Posicion.CENTRO);

        Equipo equipo1 = new Equipo("Aguilas Doradas");
        Equipo equipo2 = new Equipo("Deportivo Santander");

        
    }   
    


    public String fixture() {
        String fixture = "";
        Random random = new Random();
        int equipo1 = random.nextInt(4);
        int equipo2;
        do {
            equipo2 = random.nextInt(4);
        } while (equipo2 == equipo1);

        fixture += "Partido 1: Equipo " + equipo1 + " vs Equipo " + equipo2;
        fixture += "\n";

        do {
            equipo1 = random.nextInt(4);
            equipo2 = random.nextInt(4);
        } while (equipo2 == equipo1);

        fixture += "Partido 2: Equipo " + equipo1 + " vs Equipo " + equipo2;
        return fixture;
    }

    public class MetodoJugada { 
        

    }


}