package view;

import java.awt.Color;
import java.awt.Graphics;

import model.Point;
import model.Ring;

public class RingDrawer extends Drawer {
	private Ring data;
	
	public RingDrawer(Ring rg) {
		data=rg;
	}
	@Override
	public void draw(Graphics arg0) {
		Point p=data.getExtern().getCenter();
		int extern=(int)data.getExtern().getRadius();
		int intern=(int)data.getInterRadius();
		int x=(int) p.getX();
		int y=(int) p.getY();

		arg0.fillOval(x-extern, y-extern, extern*2, extern*2);
		arg0.setColor(Color.WHITE);
		arg0.fillOval(x-intern, y-intern, intern*2, intern*2);

	}

}
