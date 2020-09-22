package logica;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Joaquin-Parrilla
 */

public class ControladorSorteo {
    
    public static ControladorSorteo instancia;

    private Random aleatorio = new Random();
    public ArrayList<String> bombo1 = new ArrayList<>();
    public ArrayList<String> bombo2 = new ArrayList<>();
    public ArrayList<String> bombo3 = new ArrayList<>();
    public ArrayList<String> bombo4 = new ArrayList<>();

    public String[] grupo1 = new String[4];
    public String[] grupo2 = new String[4];
    public String[] grupo3 = new String[4];
    public String[] grupo4 = new String[4];
    public String[] grupo5 = new String[4];
    public String[] grupo6 = new String[4];
    public String[] grupo7 = new String[4];
    public String[] grupo8 = new String[4];
    
    public int tamanio = 8;
    public boolean sorteoRealizado = false; // bandera para determinar si sorteo se hizo o no
    
    public static ControladorSorteo getInstancia() {
        if (instancia == null)
            instancia = new ControladorSorteo();
        return instancia;
    }
    
    public void iniciar() {
        // método que inicia el sorteo.
        inicializarArrays();
        
        sorteo(grupo1);
        sorteo(grupo2);
        sorteo(grupo3);
        sorteo(grupo4);
        sorteo(grupo5);
        sorteo(grupo6);
        sorteo(grupo7);
        sorteo(grupo8);
        imprimir();
        sorteoRealizado = true;
    }

    private void inicializarArrays() {
        bombo1.add(0,"PEÑAROL");
        bombo1.add(1,"NACIONAL");
        bombo1.add(2,"DEFENSOR SPORTING");
        bombo1.add(3,"FENIX");
        bombo1.add(4,"CERRO");
        bombo1.add(5,"TORQUE");
        bombo1.add(6,"RIVER PLATE");
        bombo1.add(7,"DEP. MALDONADO");
        
        bombo2.add(0,"CA VILLA DOLORES");
        bombo2.add(1,"MALVÍN");
        bombo2.add(2,"BOCA JR");
        bombo2.add(3,"DEP. BUCEO");
        bombo2.add(4,"RAMPLA JR.");
        bombo2.add(5,"BARCELONA");
        bombo2.add(6,"REAL MADRID");
        bombo2.add(7,"DEP. TUCUMÁN");
        
        bombo3.add(0,"DANUBIO");
        bombo3.add(1,"SANTOS FC");
        bombo3.add(2,"AGUADA");
        bombo3.add(3,"SUDAMERICANO LC");
        bombo3.add(4,"DEPORT. SAN JOSÉ");
        bombo3.add(5,"MIRAMAR");
        bombo3.add(6,"SAN JACINTO");
        bombo3.add(7,"LEZICA FC");
        
        bombo4.add(0,"DEP. RIVERA");
        bombo4.add(1,"DEP. TACUAREMBÓ");
        bombo4.add(2,"DEP. ROCHA");
        bombo4.add(3,"DEP. SALTO");
        bombo4.add(4,"DEP. COLONIA");
        bombo4.add(5,"SANTA FÉ FC");
        bombo4.add(6,"URUGUAYANA");
        bombo4.add(7,"BELLA VISTA");
    }

    private void sorteo(String[] grupo) {
        int x;  //elemento aleatorio
        x = aleatorio.nextInt(tamanio);
        grupo[0] = bombo1.get(x);
        bombo1.remove(x);
        x = aleatorio.nextInt(tamanio);
        grupo[1] = bombo2.get(x);
        bombo2.remove(x);
        x = aleatorio.nextInt(tamanio);
        grupo[2] = bombo3.get(x);
        bombo3.remove(x);
        x = aleatorio.nextInt(tamanio);
        grupo[3] = bombo4.get(x);
        bombo4.remove(x);
        tamanio--;
    }

    private void imprimir() {
        System.out.println("Equipos del GRUPO 1:");
        for (int i = 0; i < grupo1.length; i++) 
            System.out.println(grupo1[i]);

        System.out.println("Equipos del GRUPO 2:");
        for (int i = 0; i < grupo2.length; i++) 
            System.out.println(grupo2[i]);
        
        System.out.println("Equipos del GRUPO 3:");
        for (int i = 0; i < grupo3.length; i++) 
            System.out.println(grupo3[i]);
        
        System.out.println("Equipos del GRUPO 4:");
        for (int i = 0; i < grupo4.length; i++) 
            System.out.println(grupo4[i]);
        
        System.out.println("Equipos del GRUPO 5:");
        for (int i = 0; i < grupo5.length; i++) 
            System.out.println(grupo5[i]);
        
        System.out.println("Equipos del GRUPO 6:");
        for (int i = 0; i < grupo6.length; i++) 
            System.out.println(grupo6[i]);
        
        System.out.println("Equipos del GRUPO 7:");
        for (int i = 0; i < grupo7.length; i++) 
            System.out.println(grupo7[i]);
        
        System.out.println("Equipos del GRUPO 8:");
        for (int i = 0; i < grupo8.length; i++) 
            System.out.println(grupo8[i]);
        
    } 
} 

