package day1017;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws Exception  {
		
		String name = "src/files"; 
		
		File dir = new File(name);
		String[] fileNames = dir.list();
		
		for (String s : fileNames) {
			File f = new File(name + "/" + s);
			System.out.println("-----------------------------------");
			System.out.println("이름 : " + f.getName());
			System.out.println("경로 : " + f.getPath());
			System.out.println("부모 : " + f.getParent());
			System.out.println("절대경로 : " + f.getAbsolutePath());
			System.out.println("이름 : " + f.getCanonicalPath());
			System.out.println("폴더 여부 : " + f.isDirectory());
			System.out.println("이름 : " + f.isFile());
			System.out.println("-----------------------------------");

		}
	}
}
