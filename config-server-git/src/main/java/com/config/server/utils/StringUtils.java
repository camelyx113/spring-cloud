package com.config.server.utils;

public class StringUtils {
	  //字符串转换unicode
    public static String stringToUnicode(String string) {
        StringBuffer unicode = new StringBuffer();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);  // 取出每一个字符
            unicode.append("\\u00" +Integer.toHexString(c));// 转换为unicode
        }
        return unicode.toString();
    }

    //unicode 转字符串
    public static String unicodeToString(String unicode) {
        StringBuffer string = new StringBuffer();
        String[] hex = unicode.split("\\\\u");
        for (int i = 1; i < hex.length; i++) {
            int data = Integer.parseInt(hex[i], 16);// 转换出每一个代码点
            string.append((char) data);// 追加成string
        }
        return string.toString();
    }
    
    public static void main(String[] args) {
    	System.out.println(StringUtils.stringToUnicode("\\"));
    	String s = "123\\123\\123";
    	String[] ss = s.split("\\u005c");
    	System.out.println(ss.length);
	}
}
