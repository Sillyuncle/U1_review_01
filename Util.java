package com.hpit.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
	/**
	 * 解析日期字符串
	 * @return
	 */
	public static  Date  convertStringToDate(String dataStr,String pattern){
		//1.确定要转换的日期字符串具体内容
//		String dataStr="2009-9-9";
		//2.定义转换的格式化字符串,必须与指定日期字符串格式一模一样
//		String pattern="yyyy-MM-dd";
		//3.实现转换
		try {
			SimpleDateFormat sdf=new SimpleDateFormat(pattern);
			Date date = sdf.parse(dataStr);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
			//返回null
			return null;
		}
	}
	
	
	public static String convertDateToString(Date date,String pattern){
		//1.准备一个日期
//		Date date=new Date();
		//2.按照什么样的格式显示日期，设定日期格式化字符串
//		String pattern="yyyy-MM-dd  HH:mm:ss";
		//3.找个对象，调用方法
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		String str = sdf.format(date);
		return str;
	}
	
	
	
	
}
