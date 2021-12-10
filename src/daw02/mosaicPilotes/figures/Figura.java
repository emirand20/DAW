import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author Juanma Sanchez
 */
public abstract class Figura implements FiguraInterface {

	public final static Color COLOR_PER_DEFECTE = Color.RED;
	public final static Point POINT_PER_DEFECTE = new Point();

	private Color color;
	private Point point;

	/**
	 * Crea una figura (Circle, Rectangle, Triangle, ...) de color color a la
	 * posició Point (x, y).
	 * 
	 * @param color
	 * @param point
	 */
	public Figura(Color color, Point point) {
		this.color = color;
		this.point = point;
	}

	/**
	 * Crea una figura (Circle, Rectangle, Triangle, ...) de color COLOR_PER_DEFECTE
	 * a la posició POINT:PER_DEFECTE
	 */
	public Figura() {
		this(COLOR_PER_DEFECTE, POINT_PER_DEFECTE);
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

}