package org.cuatrovientos.dam.psp.KillEnemies;

public class Hero implements Character {
	
	public Integer enemigosMatados = 0;
	public Integer amigosDefendidos = 0;
	
	public boolean isEnemy() {
		return false;
	}
	
	public void attack(Enemy enemy) {
		System.out.println("¡He atacado a un enemigo!");
		enemigosMatados = enemigosMatados + 1;
		enemy.kill();
	}
	
	public void defend(Friend friend) {
		System.out.println("¡He defendido a un amigo!");
		amigosDefendidos = amigosDefendidos + 1;
		friend.heal();
	}
	
}
