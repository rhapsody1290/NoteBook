package com.sina.test;

import com.sina.util.HibernateUtil;
import com.sina.util.MyTools;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HibernateUtil.openSession();
		
		//123456 密码到md5应该.
		System.out.println(MyTools.MD5("1"));
	}

}
