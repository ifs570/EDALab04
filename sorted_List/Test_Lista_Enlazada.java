import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import com.panayotis.gnuplot.JavaPlot;
public class Test_Lista_Enlazada {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de listas de peores casos");
		int cantidad = scan.nextInt();
		Sorted_List<Integer> lista = new Sorted_List<>();
		ArrayList<Long>tiempoInsercion=new ArrayList();

		lista.generaListas(cantidad, tiempoInsercion);

		File gnu = null;
		BufferedWriter bw = null;
		gnu = new File("insercionEnlazado.txt");
		gnu.createNewFile();
		bw = new BufferedWriter(new FileWriter(gnu));
		for (int i = 0; i < tiempoInsercion.size(); i++) {
			bw.write(String.valueOf(tiempoInsercion.get(i))+"\n");
		}
		bw.close();
		JavaPlot p = new JavaPlot();
		p.addPlot("\"insercionEnlazado.txt\"with lines");
		p.plot();	
		
	}

}
