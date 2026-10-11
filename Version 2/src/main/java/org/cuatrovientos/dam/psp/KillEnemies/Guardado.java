package org.cuatrovientos.dam.psp.KillEnemies;

import java.util.ArrayList;

public class Guardado {
	
	public Integer enemigosMatados;
	public Integer amigosDefendidos;
	public Integer amigosMatados;
	public ArrayList<Character> estadoDePartida;
	
	public void guardarNuevosDatos(Integer enemigosMatados, Integer amigosDefendidos, Integer amigosMatados, ArrayList<Character> estadoDePartida) {
		this.enemigosMatados = enemigosMatados;
		this.amigosDefendidos = amigosDefendidos;
		this.enemigosMatados = enemigosMatados;
		this.estadoDePartida = estadoDePartida;
	}
	
	public void cargarGuardado() {
		//Voy a ser sincero, no he llegado a entender como funciona guardar cosas y prefiero aceptarlo que copiar y pegar de ChatGPT sin entender el que estoy haciendo.
		//En plan, he entendido algo sobre tener que guardar la clase en un archivo y demas. Pero por lo menos se me hace muy confuso el como.
		//A si que si no he llegado a acabar esta parte, es por sinceramente rendirme y quedarme sin tiempo antes de la fecha de entrega y querer ver la solucion y aprender de hay o de los demas.
		//Por lo menos he hecho todo lo demas excepto la forma de guardar datos, por lo que espero que eso si que valga algo, y lo siento por hacer esto. Aunque admito que no estoy muy contento con dejarlo no completo al 100%
	}

	public Integer getEnemigosMatados() {
		return enemigosMatados;
	}

	public void setEnemigosMatados(Integer enemigosMatados) {
		this.enemigosMatados = enemigosMatados;
	}

	public Integer getAmigosDefendidos() {
		return amigosDefendidos;
	}

	public void setAmigosDefendidos(Integer amigosDefendidos) {
		this.amigosDefendidos = amigosDefendidos;
	}

	public Integer getAmigosMatados() {
		return amigosMatados;
	}

	public void setAmigosMatados(Integer amigosMatados) {
		this.amigosMatados = amigosMatados;
	}

	public ArrayList<Character> getEstadoDePartida() {
		return estadoDePartida;
	}

	public void setEstadoDePartida(ArrayList<Character> estadoDePartida) {
		this.estadoDePartida = estadoDePartida;
	}
	
	

}
