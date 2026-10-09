package org.cuatrovientos.dam.psp.KillEnemies;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

    	ArrayList<Character> lista = new ArrayList<Character>();
    	Friend amigo = new Friend();
    	Enemy enemigo = new Enemy();
    	for (int i = 0; i < 5; i = i + 1) {
    		lista.add(amigo);
    		lista.add(enemigo);
    	}
    	for (int i = 0; i < 10; i = i + 1) {
    		System.out.print("El personaje " + i + " es un ");
    		if (lista.get(i).getClass() == Friend.class) {
    			System.out.println("amigo!");
    		} else if (lista.get(i) instanceof Enemy enemigoEncontrado){
    			System.out.println("enemigo! ¡Matalo!");
    			enemigoEncontrado.kill();
    		}
    	}
    }
}
