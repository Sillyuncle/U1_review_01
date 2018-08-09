package Test2.work2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo2 {
	public static void main (String[] args) throws IOException {
		write();
		read();
		
	}
	
	public static void write() throws IOException {
		List<String> list=new ArrayList<>();
		list.add("张柏芝");
		list.add("刘德华");
		list.add("张亮");
		list.add("张靓颖");
		list.add("杨颖");
		list.add("黄晓明");
		FileWriter fw=new FileWriter("superStar.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		for (String superStar : list) {
			if (superStar.contains("张")&&superStar.indexOf("张")==0) {
				bw.write(superStar);
				bw.newLine();
				bw.flush();
			}
		}
		bw.close();
		
	}
	
	public static void read() throws IOException {
		FileReader fr=new FileReader("superStar.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String str=null;
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		br.close();
	}
