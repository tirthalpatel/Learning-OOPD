package com.tirthal.learning.oop.design.principles.clazz.solid.lsp.mediaplayer.bad;

/**
 * Example media player super class which has ability to play video and audio
 * 
 * @author tirthalp
 */
public class MediaPlayer {
	
	// Play audio implementation
	public void playAudio() {
		System.out.println("Playing audio...");
	}

	// Play video implementation
	public void playVideo() {
		System.out.println("Playing video...");
	}
}

