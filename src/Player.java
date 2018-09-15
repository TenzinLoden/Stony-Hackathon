
import javafx.geometry.Point2D;
import javafx.scene.image.ImageView;

public class Player {

	ImageView iv;
	int offsetX = 0;
	int offsetY = 0;
	int width = 0;
	int height = 0;
	Point2D velocity;

	int x; //Character xPos
	int y; //Character yPos

	int health = 5;
	boolean alive = true;

	public Player(int posX, int posY) {
		this.x = posX;
		this.y = posY;
	}

	public void moveClockwise(boolean dir) {
		if (dir) {
			iv.setRotate(iv.getRotate() + 5);
			setVelocity(new Point2D(Math.cos(Math.toRadians(getRotate())), Math.sin(Math.toRadians(getRotate()))));
		} else {
			iv.setRotate(iv.getRotate() - 5);
			setVelocity(new Point2D(Math.cos(Math.toRadians(getRotate())), Math.sin(Math.toRadians(getRotate()))));
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getRotate() {
		return iv.getRotate();
	}

	public void setVelocity(Point2D velocity) {
		this.velocity = velocity;
	}

}
