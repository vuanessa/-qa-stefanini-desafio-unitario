package rpg_game;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonagemTest {

	@Test
	public void testGetAgilidade() {
		Personagem personagem = new Personagem();
		personagem.setAgilidade(0);
	}

	@Test
	public void testSetAgilidade() {
		Personagem personagem = new Personagem();
		personagem.getAgilidade();
	}

	@Test
	public void testGetForca() {
		Personagem personagem = new Personagem();
		personagem.setForca(0);
	}

	@Test
	public void testSetForca() {
		Personagem personagem = new Personagem();
		personagem.getForca();
	}

	@Test
	public void testGetInteligencia() {
		Personagem personagem = new Personagem();
		personagem.setInteligencia(0);
	}

	@Test
	public void testSetInteligencia() {
		Personagem personagem = new Personagem();
		personagem.getInteligencia();
	}

	@Test
	public void testGetHp() {
		Personagem personagem = new Personagem();
		personagem.setHp(0);
	}

	@Test
	public void testSetHp() {
		Personagem personagem = new Personagem();
		personagem.getHp();
	}

	@Test
	public void testGetMana() {
		Personagem personagem = new Personagem();
		personagem.setMana(0);
	}

	@Test
	public void testSetMana() {
		Personagem personagem = new Personagem();
		personagem.getMana();
	}

	@Test
	public void testSetLevel() {
		Personagem personagem = new Personagem();
		personagem.getLevel();
	}

	@Test
	public void testGetLevel() {
		Personagem personagem = new Personagem();
		personagem.setLevel(0);
	}

	@Test
	public void testEquiparBota() {
		Personagem personagem = new Personagem();
		personagem.EquiparBota(null);
	}

	@Test
	public void testExibirDadosInicialJogador() {
		fail("Not yet implemented");
	}

	@Test
	public void testExibirNovosDadosJogador() {
		fail("Not yet implemented");
	}

}
