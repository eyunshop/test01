package main;

import java.io.File;

public class FileDemo03 {

	public static void main(String[] args) {
		String path = "F:/Workspaces/MyEclipse2017CI/java-io-00/src/IO.png";
		//绝对路径
		File file = new File(path);
		//返回绝对路径

		System.out.println(file.getAbsolutePath());
		//获取文件名称
		System.out.println(file.getName());
		//获取文件路径
		System.out.println(file.getPath());
		//获取文件父路径
		System.out.println(file.getParent());
	}

}
