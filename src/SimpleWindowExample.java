import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.square.Square;
import java.awt.color.*;
public class SimpleWindowExample {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(1000, 1000, "Drawing Window");
		w.moveTo(100, 100);
		w.lineTo(300, 150);
		w.setLineWidth(100);
		//w.setLineColor(null);
		Square sq1 = new Square(400,400,300);
		sq1.draw(w);
		// w.setLineColor(java.awt.color red);
	}

}
