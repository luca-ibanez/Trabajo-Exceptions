package org.cuatrovientos.dam.psp.KillEnemies;

public class Hero implements Character {
	
	public Integer enemigosMatados;
	public Integer amigosDefendidos;
	
	public boolean isEnemy() {
		return false;
	}
	
	public void attack(Enemy enemy) {
		System.out.println("¡He atacado a un enemigo!");
		enemy.kill();
	}
	
	public void defend(Friend friend) {
		System.out.println("¡He defendido a un amigo!");
	}
}
