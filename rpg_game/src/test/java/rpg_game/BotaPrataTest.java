package rpg_game;

import static org.junit.Assert.*;

import org.junit.Test;

public class BotaPrataTest {

	@Test
	public void testBotaPrataForca() {
		BotaPrata botaPrata = new BotaPrata();
		assertEquals(2, botaPrata.getForca());
	}
	
	@Test
	public void testBotaPrataAgilidade() {
		BotaPrata botaPrata = new BotaPrata();
		assertEquals(1, botaPrata.getAgilidade());
	}
	
	@Test
	public void testBotaPrataInteligencia() {
		BotaPrata botaPrata = new BotaPrata();
		assertEquals(1, botaPrata.getInteligencia());
	}
	
	@Test
	public void testBotaPrataNomeBota() {
		BotaPrata botaPrata = new BotaPrata();
		assertEquals("Bota prata", botaPrata.getNomeBota());
	}

}
