package com.hpit.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 实现文件复制和内容字符串的统计
 */
public class CopyFile {
	public static void main(String[] args) throws Exception {
		//统计字符串
		BufferedReader br=new BufferedReader(
				new FileReader("1.txt")
				);
		String s;//保存每次读到一行字符串
		List<String> list=new ArrayList<>();
		while((s=br.readLine())!=null){
			list.add(s);
		}
		br.close();
		//统计包含a符号的字符串
		int i=0;
		for (String str : list) {
			if(str.contains("a")){
				System.out.println(str);
				i++;
			}
		}
		System.out.println("含有'a'字符串的个数是："+i);
	}
	private static void fun2() throws FileNotFoundException, IOException {
		BufferedReader br=new BufferedReader(
				new FileReader("1.txt")
				);
		BufferedWriter bw=new BufferedWriter(
				new FileWriter("3.txt")
				);
		String s;//保存每次读到一行字符串
		while((s=br.readLine())!=null){
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
	}
	//封装方法快捷键 alt+shift+m
	private static void fun1() throws FileNotFoundException, IOException {
		FileReader fr=new FileReader("1.txt");
		FileWriter fw=new FileWriter("2.txt");
		
		//边读边写
		char[] cs=new char[1024];
		int len;//实际读到字符个数
		while((len=fr.read(cs))!=-1){
			//char[]====>String
//			String s=new String(cs, 0, len);
//			fw.write(s);
			fw.write(cs, 0, len);
			fw.flush();
		}
		//释放资源：先开后关
		fw.close();
		fr.close();
	}
}
