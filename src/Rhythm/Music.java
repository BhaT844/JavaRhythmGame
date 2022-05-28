package Rhythm;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class Music extends Thread{

	private Player player;
	private boolean isLoop;
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	public Music(String name, boolean isLoop) {
		try {
			this.isLoop = isLoop;
			file = new File(Main.class.getResource("../music/" + name).toURI());
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
	/*현재 실행되고있는 음악이 어떤 위치에 실행되고 있는지 알려주는 메소드*/
	public int getTime() {
		if (player == null) {
			return 0;
		}
		return player.getPosition();
	}
	
	/*음악을 종료하는 메소드*/
	public void close() {
		isLoop = false;
		player.close();
		this.interrupt();
	}
	
	/*Thread를 상속받으면 무조건 생성해야하는 메소드*/
	@Override
	public void run() { 
		try {
			do {
				player.play(); /*곡 실행*/
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				player = new Player(bis);
			} while (isLoop);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}













