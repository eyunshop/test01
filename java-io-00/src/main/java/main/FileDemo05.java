package main;

import java.io.File;

public class FileDemo05 {
	/**
	 * 	如果是文件
	 *  length():文件的字节数
	 * 
	 * */
	public static void main(String[] args) {

		File file = new File("src/IO.png");
		
		//文件长度
		System.out.println("长度："+file.length());
		//文件夹长度：0
		file = new File("MyEclipse2017CI/java-io-00/");
		System.out.println("文件夹长度："+file.length());
		
	}

}
