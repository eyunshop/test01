package main;

import java.io.File;

public class TestIo {
/**
 * \/ 名称分割符 separator
 * 
 * 
 * */
	public static void main(String[] args) {
		//建议使用
		//1.名称分割符 ：/
		String path = "F:\\Workspaces\\MyEclipse2017CI\\java-io-00\\src\\IO.png";
		System.out.println(path);
		//2.常量拼接：File.separator
		path =   "F:"+File.separator+"Workspaces"+File.separator+"MyEclipse2017CI"+File.separator+"java-io-00"+File.separator+"src"+File.separator+"IO.png";
		System.out.println(path);
	}

}
