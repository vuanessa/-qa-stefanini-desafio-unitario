package rpg_game;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArqueiroTest2 {

	@Test
	public void testArqueiroForca() {
		Arqueiro arqueiro = new Arqueiro();
		assertEquals(5, arqueiro.getForca());
	}
	
	@Test
	public void testArqueiroAgilidade() {
		Arqueiro arqueiro = new Arqueiro();
		assertEquals(10, arqueiro.getAgilidade());
	}
	
	@Test
	public void testArqueiroInteligencia() {
		Arqueiro arqueiro = new Arqueiro();
		assertEquals(2, arqueiro.getInteligencia());
	}

	@Test
	public void testLvlUp() {
		Arqueiro arqueiro = new Arqueiro();
		arqueiro.lvlUp();
		assertEquals(2, arqueiro.getLevel());
	}
	
	@Test
	public void testForca() {
		Arqueiro arqueiro = new Arqueiro();
		arqueiro.lvlUp();
		assertEquals(6, arqueiro.getForca());
	}
	
	@Test
	public void testAgilidade() {
		Arqueiro arqueiro = new Arqueiro();
		arqueiro.lvlUp();
		assertEquals(13, arqueiro.getAgilidade());
	}
	
	@Test
	public void testInteligencia() {
		Arqueiro arqueiro = new Arqueiro();
		arqueiro.lvlUp();
		assertEquals(3, arqueiro.getInteligencia());
	}	
}
