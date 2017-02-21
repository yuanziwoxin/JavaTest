package com.yuan.test;

/**
 * 
 * 用于验证一些Java基础知识
 */

public class Test {
     public static void main(String[] args){
    	 String str=null;
    	 /*
    	  * 如果是一个‘&’，将会报空指针异常，因为执行完‘&’前面的“str!=null”条件，
    	  * 会继续执行后面的条件，而str=null,所以报空指针异常；
    	  */
    	/*
    	 *  
    	 */
//    	 if(str!=null & !str.equals(""))
//    	 {
//    		 System.out.println("Ture");
//    	 }
    	 //正常执行，不会报异常
    	 if(str!=null && !str.equals(""))
    	 {
    		 System.out.println("Ture");
    	 }
    	 String str_1;
    	 String str_2=null;
    	 String str_3="a";
    	 //System.out.println(str_1);//报异常（str_1并未初始化）
    	 System.out.println(str_2);//输出null
    	 System.out.println(str_3);//输出null
    	 
     }
}
