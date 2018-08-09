# U1_review_01

考核知识点：
集合、io基本读写、高级类（String常用方法、日期格式化、日期字符串解析）
OOP：接口、父类、方法重写、构造方法、 创建对象、封装属性
方法与方法调用：对象名.方法名()  类名.方法名()

逻辑题：对称字符串  斐波拉契数列  公约数  素数

逆序复习：
## 1、日期操作

    需求：OOP对象思想实现日期格式化和日期字符串解析
    实现过程：
    1-1 创建类 util.java
      public static xxxxxxxxxxxxxxxx
      实现：用户指定字符串和格式，将字符串以特定格式转换java.util.Date类型


      public static xxxxxxxxxxxxxxxx
      实现：使用用户指定日期格式将Date转换为String的阅读格式较好的日期字符串

      借助：Date对象创建  Date now=new Date();
      SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
      String==>Date sdf.parse(String)
      Date==>String sdf.format(Date)

 参考API帮助文档

## 2、IO结合String实现文件复制和内容字符串统计

    a.已知在当前工程的根目录下有一个1.txt,2.txt中的内容为:(可以在1.txt中手动输入以下内容)
      "abc"
      "def"
      "aaabaaa"
      "aba"
      "pop"
    b.利用 字符数组,FileReader,FileWriter将1.txt拷贝到当前工程下的2.txt中,异常不需要处理,抛出即可(throws)
    c.利用 BufferedReader和BufferedWriter将1.txt拷贝到当前工程下的3.txt中,并处理异常
    d.打印出字符串中包含"a"字符串的原始字符串
    分析：   1.txtèList<String>
        2.循环集合，每一个字符串，使用contains(‘a’)，统计字符串个数；输出当前字符串
         e.统计出包含"a"的字符串的个数

## 3、集合：
   泛型集合保存自定义类型，使用循环打印结果。
   集合的存、取（取一个，遍历）
   
      已知用户购买的商品名称如下:
      铅笔  
      本子  
      橡皮擦    
      铅笔
      铅笔
      本子
      本子
      本子   
      分析：

      a.	请使用一个集合(使用泛型)存储用户购买的上述商品名称
      a)	List<商品类>
      b)	商品类：商品名称 全参构造方法 equals()
       b.利用迭代器方式遍历出上述集合
       c.利用HashMap统计出每件商品对应的购买数量
        Map<商品,Integer>
        d.利用增强for循环遍历上述的HashMap
        商品名称     数量
        铅笔          3
        本子          4
        橡皮擦        1
