package rpg_game;

import org.junit.Test;

public class BotaTest {

	@Test
	public void testGetForca() {
		Bota bota = new Bota();
		bota.setForca(0);
	}

	@Test
	public void testSetForca() {
		Bota bota = new Bota();
		bota.getForca();
	}

	@Test
	public void testGetAgilidade() {
		Bota bota = new Bota();
		bota.setAgilidade(0);
	}

	@Test
	public void testSetAgilidade() {
		Bota bota = new Bota();
		bota.getAgilidade();;
	}

	@Test
	public void testGetInteligencia() {
		Bota bota = new Bota();
		bota.setInteligencia(0);
	}

	@Test
	public void testSetInteligencia() {
		Bota bota = new Bota();
		bota.getInteligencia();
	}

	@Test
	public void testGetNomeBota() {
		Bota bota = new Bota();
		bota.setNomeBota("Bota");
	}

	@Test
	public void testSetNomeBota() {
		Bota bota = new Bota();
		bota.getNomeBota();;
	}

}
