package com.hpit.demo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

/*
 * 基于Register功能，实现用户登录操作
 */
public class Login {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner input=new Scanner(System.in);
		System.out.print("账号：");
		String userName=input.next();
		System.out.print("密码：");
		String pwd=input.next();
		
		//获取文件中保存的注册的账号信息，与用户输入的信息比较
		Properties prop=new Properties();
		prop.load(new FileInputStream("info.properties"));
		String saveUserName = prop.getProperty("name");//key必须与文件中=前面的单词大小写一模一样
		String saveUserPwd = prop.getProperty("pwd");
		
		if(userName.equals(saveUserName) && pwd.equals(saveUserPwd)){
			System.out.println("登录成功");
		}else{
			System.out.println("账户或密码输入有误，登录失败~~~~~~~");
		}
	}
	
}
