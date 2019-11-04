package view;

import java.awt.Color;
import java.awt.Graphics;

import model.Rectangle;

public class RectangleDrawer extends Drawer {
	Rectangle r;
	
	public RectangleDrawer(Rectangle r) {
		this.r=r;
	}
	@Override
	public void draw(Graphics arg0) {
		// TODO Auto-generated method stub
		arg0.fillRect((int) r.getCorner().getX(), (int) r.getCorner().getY(), (int)r.getWidth(),(int) r.getHeight());
	}

}
