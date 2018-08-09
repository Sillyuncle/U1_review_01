package com.hpit.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ShanPinDemo {
	public static void main(String[] args) {
		fun3();
	}

	private static void fun3() {
		List<String> list=new ArrayList<String>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("二丫");
		list.add("钱六");
		list.add("孙七");
		for(int i=0;i<list.size();i++){
		      if(list.get(i).equals("二丫")){
		             list.set(i,"王小丫");
		       }
		}
		System.out.println(list);
	}

	private static void fun2() {
		List<ShanPin> list=new ArrayList<>();
		list.add(new ShanPin("铅笔"));
		list.add(new ShanPin("本子"));
		list.add(new ShanPin("橡皮擦"));
		list.add(new ShanPin("铅笔"));
		list.add(new ShanPin("铅笔"));
		list.add(new ShanPin("本子"));
		list.add(new ShanPin("本子"));
		list.add(new ShanPin("本子"));
		
		Map<ShanPin, Integer> map=new HashMap<>();
		for (ShanPin shanPin : list) {
			//判断商品在map是否存在
			//containsxx默认判断存在不存在依据：对象的equals
			/*
			 * 判断是否存在思路：获取map所有的key，key.getName().equals(shanPin.getName())
			 */
			if(map.containsKey(shanPin)){
				Integer num = map.get(shanPin);
				map.put(shanPin, num+1);
			}else{
				map.put(shanPin, 1);
			}
		}
		//打印商品信息
		System.out.println("名称\t数量");
		Set<ShanPin> keys = map.keySet();
		for (ShanPin kString : keys) {
			System.out.println(kString+"\t"+map.get(kString));
		}
	}

	private static void fun1() {
		List<String> list=new ArrayList<>();
		list.add("铅笔");
		list.add("本子");
		list.add("橡皮擦");
		list.add("铅笔");
		list.add("铅笔");
		list.add("本子");
		list.add("本子");
		list.add("本子");
		//重复商品过滤掉，然后保存商品对应数量
		//Set：无序的商品名称保存，对应的数量
		//商品==数量  Map双列集合：key集==》Set value集==》Collection
		Map<String, Integer> map=new HashMap<>();
		//list一件一件保存map集合
		for (String name : list) {
			/*
			 * 商品第一次存，所对应数量1
			 * 存发现map已经存在该商品，所对应的数量：原来的数量基础+1
			 */
			if(map.containsKey(name)){//包含
				Integer num=map.get(name);//获取当前已经保存的数量
				map.put(name, num+1);
			}else{
				map.put(name, 1);
			}
		}
		//打印商品信息
		System.out.println("名称\t数量");
		Set<String> keys = map.keySet();
		for (String kString : keys) {
			System.out.println(kString+"\t"+map.get(kString));
		}
	}
}
