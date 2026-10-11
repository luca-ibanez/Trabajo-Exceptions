package org.cuatrovientos.dam.psp.KillEnemies;

public class Friend implements Character {
	public boolean isEnemy() {
		return false;
	}
	public void heal() {
		System.out.print("¡Te he curado!");
	}
}
