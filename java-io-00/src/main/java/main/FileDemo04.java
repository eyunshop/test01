package main;

import java.io.File;

public class FileDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "F:/Workspaces/MyEclipse2017CI/java-io-00/src/IO.png";
		//绝对路径
		File file = new File(path);

		System.out.println("是否存在："+file.exists());
		System.out.println("是否文件："+file.isFile());
		System.out.println("是否文件夹："+file.isDirectory());
		
		if (null == file || !file.exists()) {
			System.out.println("文件不存在！");
			
		} else {
			if (file.isFile()) {
				System.out.println("文件操作！");
			}else {
				System.out.println("文件夹操作！");
			}
		}
	}

}
