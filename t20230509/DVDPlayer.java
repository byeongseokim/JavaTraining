package t20230509;

import java.security.PublicKey;

public class DVDPlayer implements ExPlayer {
	public void play() {
		System.out.println("DVD 재생 시작!");
	}

	public void stop() {
		System.out.println("DVD 재생 종료!");
	}

	public void slow() {
		System.out.println("DVD 느린 재생 시작!");
	}

}
