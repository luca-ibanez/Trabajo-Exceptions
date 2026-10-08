package org.cuatrovientos.dam.psp.KillEnemies;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

    	ArrayList lista = new ArrayList<Character>();
    	Friend amigo = null;
    	Enemy enemigo = null;
    	for (int i = 0; i < 4; i = i + 1) {
    		lista.add(amigo);
    		lista.add(enemigo);
    	}
    	for (int i = 0; i < 10; i = i + 1) {
    		System.out.print("El personaje " + i + " es un ");
    		if (lista.get(i).getClass() == Friend.class) {
    			System.out.println("amigo!");
    		} else {
    			System.out.println("enemigo! ¡Matalo!");
    			lista.get(i);
    		}
    	}
    }
}
