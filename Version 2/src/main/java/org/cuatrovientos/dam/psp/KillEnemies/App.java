package org.cuatrovientos.dam.psp.KillEnemies;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    	
    	Scanner leer = new Scanner(System.in);
    	Guardado partida = new Guardado();
    	
    	Integer cantidadDeAmigosMatados = 0;

    	ArrayList<Character> lista = new ArrayList<Character>();
    	Friend amigo = new Friend();
    	Enemy enemigo = new Enemy();
    	Hero hero = new Hero();
    	for (int i = 0; i < 5; i = i + 1) {
    		lista.add(amigo);
    		lista.add(enemigo);
    	}
    	
    	Integer queHacer;
    	Integer aQuienAfectar;
    	
    	do {
    		partida.guardarNuevosDatos(hero.enemigosMatados, hero.amigosDefendidos, cantidadDeAmigosMatados, lista);
    		showCharacters(lista);
    		System.out.println("¿Que quieres hacer?");
    		System.out.println("1. Matar a alguien.");
    		System.out.println("2. Defender a alguien.");
    		do {
    			try {
    				queHacer = Integer.parseInt(leer.nextLine());
    			} catch (NumberFormatException e) {
    				queHacer = -1;
    			}
    		} while (queHacer != 1 && queHacer != 2);
    		if (queHacer == 1) {
    			System.out.println("¿A quien quieres matar?");
    			do {
    				try {
    					aQuienAfectar = Integer.parseInt(leer.nextLine());
    				} catch (NumberFormatException e) {
    					aQuienAfectar = -1;
    				}
    			} while (aQuienAfectar >= lista.size() || aQuienAfectar < 0);
    			if (lista.get(aQuienAfectar) instanceof Enemy enemigoAMatar) {
    				hero.attack(enemigoAMatar);
        		} else {
        			cantidadDeAmigosMatados = cantidadDeAmigosMatados + 1;
        		}
    			lista.remove(lista.get(aQuienAfectar));
    		} else {
    			System.out.println("¿A quien quieres defender?");
    			do {
    				try {
    					aQuienAfectar = Integer.parseInt(leer.nextLine());
    				} catch (NumberFormatException e) {
    					aQuienAfectar = -1;
    				}
    			} while (aQuienAfectar >= lista.size() || aQuienAfectar < 0);
    			if (lista.get(aQuienAfectar) instanceof Friend amigoADefender) {
    				hero.defend(amigoADefender);
        		} else {
        			lista.add(enemigo);
        		}
    		}
    	} while (lista.size() != 0 && cantidadDeAmigosMatados < 5 && hayQueSeguirJugando(lista) == true);
    	if (cantidadDeAmigosMatados == 5) {
    		System.out.println("Todo el mundo te odia por matar a gente inocente. Te condenaron a muerte.");
    		System.out.println("GAME OVER");
    	} else {
    		System.out.println("¡Has salvado a todo el mundo de los enemigos!");
    	}
    	
    }
    public static void showCharacters(ArrayList<Character> arrayDePersonajes) {
    	Integer contadorDeAmigos = 0;
    	Integer contadorDeEnemigos = 0;
    	for (int i = 0; i < arrayDePersonajes.size(); i = i + 1) {
    		System.out.print("El personaje " + i + " es un ");
    		if (arrayDePersonajes.get(i).getClass() == Friend.class) {
    			System.out.println("amigo!");
    			contadorDeAmigos = contadorDeAmigos + 1;
    		} else if (arrayDePersonajes.get(i) instanceof Enemy){
    			System.out.println("enemigo!");
    			contadorDeEnemigos = contadorDeEnemigos + 1;
    		}
    	}
    	System.out.println("Hay " + contadorDeAmigos + " amigos y hay " + contadorDeEnemigos + " enemigos.");
    }
    public static Boolean hayQueSeguirJugando(ArrayList<Character> arrayDePersonajes) {
    	Boolean hayEnemigos = false;
    	for (int i = 0; i < arrayDePersonajes.size(); i = i + 1) {
    		if (arrayDePersonajes.get(i).getClass() == Enemy.class) {
    			hayEnemigos = true;
    		}
    	}
    	if (hayEnemigos == true) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    
    
}
