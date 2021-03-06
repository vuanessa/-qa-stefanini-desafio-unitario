package rpg_game;

import static org.junit.Assert.*;

import org.junit.Test;

public class GuerreiroTest {

	@Test
	public void testGuerreiroForca() {
		Guerreiro guerreiro = new Guerreiro();
		assertEquals(10, guerreiro.getForca());
	}
	
	@Test
	public void testGuerreiroAgilidade() {
		Guerreiro guerreiro = new Guerreiro();
		assertEquals(5, guerreiro.getAgilidade());
	}
	
	@Test
	public void testGuerreiroInteligencia() {
		Guerreiro guerreiro = new Guerreiro();
		assertEquals(2, guerreiro.getInteligencia());
	}

	@Test
	public void testLvlUp() {
		Guerreiro guerreiro = new Guerreiro();
		guerreiro.lvlUp();
		assertEquals(2, guerreiro.getLevel());
	}
	
	@Test
	public void testLvlForša() {
		Guerreiro guerreiro = new Guerreiro();
		guerreiro.lvlUp();
		assertEquals(13, guerreiro.getForca());
	}
	
	@Test
	public void testLvlAgilidade() {
		Guerreiro guerreiro = new Guerreiro();
		guerreiro.lvlUp();
		assertEquals(6, guerreiro.getAgilidade());
	}
	
	@Test
	public void testLvlInteligencia() {
		Guerreiro guerreiro = new Guerreiro();
		guerreiro.lvlUp();
		assertEquals(3, guerreiro.getInteligencia());
	}

}
