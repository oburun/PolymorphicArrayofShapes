package shapes;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class shapes {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<Shape> shapes = new ArrayList<Shape>(100);
		//Shape[] shapes = new Shape[100];
		
		File f = new File("shapes.txt");
		FileReader fReader = new FileReader(f);
		BufferedReader br = new BufferedReader(fReader);
		String line;
		String[] datas = new String[5];
		String delimiters = " (,)"; // dosyayý okurken bölme kriterleri
		int n=0,s=0;
		while((line = br.readLine()) != null) {
			StringTokenizer lineSplit = new StringTokenizer(line, delimiters);
			while(lineSplit.hasMoreTokens()) {
				datas[n] = lineSplit.nextToken(); // kriterlere göre ayrýlmýþ bir satýrýn elemanlarý
				n++;
			}
			String name = datas[0]; // ilk elemanýn classý belirleyecek
			double[] parameters =  new double[4];
			for (int i = 1; i < datas.length; i++) {
				parameters[i-1] = Double.parseDouble(datas[i]); // kalan dört parametre elemanýnýn double a çevirilip dizilenmesi
			}
			if (name.equals("Rectangle")) {
				shapes.add(new Rectangle(parameters[0],parameters[1],parameters[2],parameters[3]));
			}
			else if (name.equals("Circle")) {
				shapes.add(new Circle(parameters[0],parameters[1],parameters[2]));
			}
			else {
				shapes.add(new Square(parameters[0],parameters[1],parameters[2]));
			}
			n=0;
			s++;
		}
		//MyList<Shape> myListIter = new MyList<Shape>(shapes);
		ShapeIterator<Shape> myListIter = new ShapeIterator<Shape>(shapes);

		Shape j;
		while (myListIter.hasNext()) {
            System.out.println(myListIter.next());
        }

	}

}
