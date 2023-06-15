import com.panayotis.gnuplot.JavaPlot;

public class Grafica {

	public static void main(String[] args) {
		JavaPlot p = new JavaPlot();
		p.addPlot("\"insercionEnlazado.txt\"with lines");
		p.addPlot("\"insercionDobleEnlazada.txt\"with lines");
		p.plot();

	}

}
