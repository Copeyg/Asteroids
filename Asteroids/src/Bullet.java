import java.awt.Color;
import java.awt.Graphics;

public class Bullet extends Circle {
	public static final int RADIUS = 10;
	private double rotation = 0;

	public Bullet(Point center, double rotation) {
		super(center, RADIUS); // define RADIUS in Bullet class
		this.rotation = rotation;
		}


	@Override
	public void paint(Graphics brush, Color color) {
		brush.setColor(color);
		brush.fillOval((int) center.x, (int) center.y, radius, radius);

	}

	@Override
	public void move() {
		center.x += 2 * Math.cos(Math.toRadians(rotation));
		center.y += 2 * Math.sin(Math.toRadians(rotation));
		}

	public boolean outOfBounds(boolean oob) {
		if(center.x > Asteroids.SCREEN_WIDTH) {
            oob = true;
        } else if(center.x < 0) {
        	oob = true;
        }
        if(center.y > Asteroids.SCREEN_HEIGHT) {
            oob = true;
        } else if(center.y < 0) {
           oob = true;
        }
        return oob;
	}
	public Point getCenter() {
		return center;
	}

}
