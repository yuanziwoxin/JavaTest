package com.yuan.test;

/**
 * 
 * ������֤һЩJava����֪ʶ
 */

public class Test {
     public static void main(String[] args){
    	 String str=null;
    	 /*
    	  * �����һ����&�������ᱨ��ָ���쳣����Ϊִ���ꡮ&��ǰ��ġ�str!=null��������
    	  * �����ִ�к������������str=null,���Ա���ָ���쳣��
    	  */
    	/*
    	 *  
    	 */
//    	 if(str!=null & !str.equals(""))
//    	 {
//    		 System.out.println("Ture");
//    	 }
    	 //����ִ�У����ᱨ�쳣
    	 if(str!=null && !str.equals(""))
    	 {
    		 System.out.println("Ture");
    	 }
    	 String str_1;
    	 String str_2=null;
    	 String str_3="a";
    	 //System.out.println(str_1);//���쳣��str_1��δ��ʼ����
    	 System.out.println(str_2);//���null
    	 System.out.println(str_3);//���null
    	 
     }
}
