package com.hpit.demo;

import java.util.Date;
import static com.hpit.demo.Util.*;
public class Main {
	public static void main(String[] args) {
		//静态方法调用和传值		
		/*Date date=new Date();
		String pattern="yyyy-MM-dd HH:mm:ss E";
		String s=convertDateToString(date, pattern);
		System.out.println(s);*/
		
		String dataStr="2009年12月31日";
		String pattern="yyyy年MM月dd日";
		Date d=convertStringToDate(dataStr, pattern);
		System.out.println(d);
	}
}
