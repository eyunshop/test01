package main;

import java.io.File;

public class FileDemo02 {
	/**
	 * 
	 * 绝对路径：路径有盘符
	 * 相对路径：路径无盘符
	 * 
	 * */
	public static void main(String[] args) {
		String path = "F:/Workspaces/MyEclipse2017CI/java-io-00/src/IO.png";
		//绝对路径
		File file = new File(path);
		System.out.println(file.getAbsolutePath());
		
		//相对路径
		file = new File("IO.png");
		System.out.println(file.getAbsolutePath());
		//获取用户目录
		System.out.println(System.getProperty("user.dir"));
		
		//构建一个不存在文件
		file = new File("IO/IO.png");
		System.out.println(file.getAbsolutePath());
	}

}
