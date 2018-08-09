package com.hpit.demo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

/*
 * 注册需求：
 * 1、Scanner让用户输入用户名、密码和确认密码
 * 2、密码和确认密码一致，保存xx.properties  集合对象.store()
 */
public class Register {
	public static void main(String[] args) throws IOException {
		Scanner input=new Scanner(System.in);		
		System.out.print("用户名：");
		String userName=input.next();//合法用户名数字、字母、下划线，不允许出现空格
		System.out.print("密码：");
		String password=input.next();
		System.out.print("确认密码：");
		String rePassword=input.next();
		
		//密码和确认密码一致
		if(password.equals(rePassword)){
			//注册成功
			Properties prop=new Properties();
			prop.setProperty("name", userName);
			prop.setProperty("pwd", password);
			//内存集合对象保存硬盘文件上，借助流操作
			prop.store(new FileWriter("info.properties"), null);
			System.out.println("注册成功！");
		}else{
			System.out.println("注册失败");
		}
		
	}
	
}
