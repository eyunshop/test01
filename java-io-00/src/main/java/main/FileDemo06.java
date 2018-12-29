package main;

import java.io.File;
import java.io.IOException;

public class FileDemo06 {
	/**
	 * creatNewFie():创建文件
	 * delete()：删除已经存在的文件
	 * @throws IOException 
	 * 
	 * */
	public static void main(String[] args) throws IOException {
		
		File file = new File("src/IO.txt");
		boolean result = file.createNewFile();//创建文件
		result = file.delete();//删除已经存在的文件
		System.out.println("结果："+result);
		
		file = new File("src/IO");
		result = file.createNewFile();
		result = file.delete();
		System.out.println("结果："+result);
		
		
	}
}
