package rpg_game;

import static org.junit.Assert.*;

import org.junit.Test;

public class MagoTest {

	@Test
	public void testMagoForca() {
		Mago mago = new Mago();
		assertEquals(2, mago.getForca());
	}
	
	@Test
	public void testMagoAgilidade() {
		Mago mago = new Mago();
		assertEquals(5, mago.getAgilidade());
	}
	
	@Test
	public void testMagoIneligencia() {
		Mago mago = new Mago();
		assertEquals(10, mago.getInteligencia());
	}

	@Test
	public void testLvlUp() {
		Mago mago = new Mago();
		mago.lvlUp();
		assertEquals(2, mago.getLevel());
	}
	
	@Test
	public void testLvlForca() {
		Mago mago = new Mago();
		mago.lvlUp();
		assertEquals(3, mago.getForca());
	}
	
	@Test
	public void testLvlAgilidade() {
		Mago mago = new Mago();
		mago.lvlUp();
		assertEquals(6, mago.getAgilidade());
	}
	
	@Test
	public void testLvlInteligencia() {
		Mago mago = new Mago();
		mago.lvlUp();
		assertEquals(13, mago.getInteligencia());
	}
	
	

}
