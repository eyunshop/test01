package main;

import java.io.File;

public class FileDemo01 {
	public static void main(String[] args) {
		String path = "F:/Workspaces/MyEclipse2017CI/java-io-00/src/IO.png";
		//1.构造File对象
		File srcFile = new File(path);
		System.out.println(srcFile.length());
		//2.父路径+文件名称构造File对象
		srcFile = new File("F:/Workspaces/MyEclipse2017CI/java-io-00/src","IO.png");
		srcFile = new File("F:/Workspaces/MyEclipse2017CI/java-io-00","/src/IO.png");
		System.out.println(srcFile.length());
		//3.父对象+文件名称构造File对象
		srcFile = new File(new File("F:/Workspaces/MyEclipse2017CI/java-io-00/src"),"IO.png");
		System.out.println(srcFile.length());
	}
}
