package Rhythm;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter {

	@Override
	public void keyPressed(KeyEvent e) {
		if (LemonBeat.game == null) {
			return;
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			LemonBeat.game.pressA();
		}
		else if (e.getKeyCode() == KeyEvent.VK_S) {
			LemonBeat.game.pressS();
		}
		else if (e.getKeyCode() == KeyEvent.VK_D) {
			LemonBeat.game.pressD();
		}
		else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			LemonBeat.game.pressSpace();
		}
		else if (e.getKeyCode() == KeyEvent.VK_J) {
			LemonBeat.game.pressJ();
		}
		else if (e.getKeyCode() == KeyEvent.VK_K) {
			LemonBeat.game.pressK();
		}
		else if (e.getKeyCode() == KeyEvent.VK_L) {
			LemonBeat.game.pressL();
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		if (LemonBeat.game == null) {
			return;
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			LemonBeat.game.releaseA();
		}
		else if (e.getKeyCode() == KeyEvent.VK_S) {
			LemonBeat.game.releaseS();
		}
		else if (e.getKeyCode() == KeyEvent.VK_D) {
			LemonBeat.game.releaseD();
		}
		else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			LemonBeat.game.releaseSpace();
		}
		else if (e.getKeyCode() == KeyEvent.VK_J) {
			LemonBeat.game.releaseJ();
		}
		else if (e.getKeyCode() == KeyEvent.VK_K) {
			LemonBeat.game.releaseK();
		}
		else if (e.getKeyCode() == KeyEvent.VK_L) {
			LemonBeat.game.releaseL();
		}
	}
	
}
