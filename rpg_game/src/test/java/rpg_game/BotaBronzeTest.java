package rpg_game;

import static org.junit.Assert.*;

import org.junit.Test;

public class BotaBronzeTest {

	@Test
	public void testBotaBronzeForca() {
		BotaBronze botaBronze = new BotaBronze();
		assertEquals(1, botaBronze.getForca());
	}
	
	@Test
	public void testBotaBronzeNome() {
		BotaBronze botaBronze = new BotaBronze();
		assertEquals("Bota bronze", botaBronze.getNomeBota());
	}

}
