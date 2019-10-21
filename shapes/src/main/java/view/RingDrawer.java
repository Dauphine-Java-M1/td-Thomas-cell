package view;

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
		arg0.drawOval(x, y, extern, extern);
		arg0.drawOval(x, y, intern, intern);

	}

}
