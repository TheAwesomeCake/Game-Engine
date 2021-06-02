package com.siltra.world;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.siltra.main.Game;

public class Tile {
	
	public static BufferedImage TILE_FLOOR = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage TILE_WALL = Game.spritesheet.getSprite(16,0,16,16);
	public static BufferedImage TILE_WallDown = Game.spritesheet.getSprite(0,16,16,16);
	public static BufferedImage TILE_WallUp = Game.spritesheet.getSprite(16,16,16,16);
	public static BufferedImage TILE_WallUpPNG = Game.spritesheet.getSprite(16,80,16,16);
	public static BufferedImage TILE_WallUpD = Game.spritesheet.getSprite(16,32,16,16);
	public static BufferedImage TILE_WallUpSide = Game.spritesheet.getSprite(0,48,16,16);
	public static BufferedImage TILE_WallUpSideR = Game.spritesheet.getSprite(0,80,16,16);
	public static BufferedImage TILE_EDGYUPL = Game.spritesheet.getSprite(0,32,16,16);
	public static BufferedImage TILE_EDGYUPR = Game.spritesheet.getSprite(16,48,16,16);
	public static BufferedImage TILE_EDGYDOWNL = Game.spritesheet.getSprite(0,64,16,16);
	public static BufferedImage TILE_EDGYDOWNR = Game.spritesheet.getSprite(16,64,16,16);
	
	
	private BufferedImage sprite;
	private int x,y;
	
	public Tile(int x, int y, BufferedImage sprite) {
		this.x = x;
		this.y = y;
		this.sprite = sprite;
		
	}
	
	public void render(Graphics g) {
		g.drawImage(sprite, x - Camera.x, y - Camera.y, null);
		
	}

}
