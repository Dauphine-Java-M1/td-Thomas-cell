package view;

import java.awt.Color;
import java.awt.Graphics;
import model.Point;

import model.BrokenLine;

public class BrokenLineDrawer extends Drawer {
	public BrokenLine data;
	
	public BrokenLineDrawer(BrokenLine bl) {
		this.data=bl;
	}
	@Override
	public void draw(Graphics arg0) {
		Point p, p2;
		arg0.setColor(Color.GRAY);
		for(int i=0; i<data.nbPoints()-1; i++) {
			p=data.get(i);
			p2=data.get(i+1);
			arg0.drawLine((int)p.getX(), (int)p.getY(), (int) p2.getX(), (int) p2.getY());
		}

	}

}
