package com.hpit.demo;

import java.util.ArrayList;

//定义新闻标题类
class Title{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Title() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Title(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return id + ":" + name ;
	}
	
}
public class ListDemo {
	public static void main(String[] args) {
		/*ArrayList<Title> list=new ArrayList<>();
		list.add(new Title(1, "新闻"));
		list.add(new Title(2, "汽车"));
		
		System.out.println("一共几条新闻？"+list.size());
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}*/
		String fileName="Verify.java";
		String email="zhangsan@jadebird";
		//1.要文件必须是.java文件
//		if(fileName.endsWith(".java")){
//			
//		}
		//获取fileName的后缀名
		//1-1 获取最后一个.的下标
		int i1 = fileName.lastIndexOf('.');
		String lastName = fileName.substring(i1);
		if(!lastName.equals(".java")){
			System.out.println("不是java文件");
			System.out.println("作业提交失败");
			return;
		}
		
		//1.包含.
		int index1 = email.lastIndexOf('.');
		
		//2.包含@
		int index2=email.lastIndexOf('@');
		
		//3. @必须在.前面
		int result=index1-index2;
		
		if(index1==-1 || index2==-1 || result<0){
			System.out.println("email不合法");
			System.out.println("作业提交失败");
			return;
		}
		
		System.out.println("作业提交成功的");
		
	}
}
