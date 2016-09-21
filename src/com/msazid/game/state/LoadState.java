package com.msazid.game.state;

import com.msazid.game.main.Resources;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class LoadState extends State {

	@Override
	public void init() {
		Resources.load();
		System.out.println("Loaded successfully!");
	}

	@Override
	public void update() {
		setCurrentState(new MenuState());
	}

	@Override
	public void render(Graphics g) {
		
	}

	@Override
	public void onClick(MouseEvent e) {
		
	}

	@Override
	public void onKeyPress(KeyEvent e) {
		
	}

	@Override
	public void onKeyRelease(KeyEvent e) {
		
	}

}
