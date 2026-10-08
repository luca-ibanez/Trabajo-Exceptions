package org.cuatrovientos.dam.psp.KillEnemies;

public class Enemy implements Character {
	public boolean isEnemy() {
		return true;
	}
	
	public void kill() {
		System.out.print("Ahhhggg, me mataste, bastardo!");
	}
}
