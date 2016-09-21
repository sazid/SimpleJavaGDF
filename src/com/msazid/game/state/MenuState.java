package com.msazid.game.state;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import com.msazid.game.main.Resources;

public class MenuState extends State {

	@Override
	public void init() {
		System.out.println("Entered MenuState");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Resources.welcomeImage, 0, 0, null);
	}

	@Override
	public void onClick(MouseEvent e) {
		System.out.println("onClick: " + e);
	}

	@Override
	public void onKeyPress(KeyEvent e) {
		System.out.println("onKeyPress: " + e);
	}

	@Override
	public void onKeyRelease(KeyEvent e) {
		System.out.println("onKeyRelease: " + e);
	}

}
