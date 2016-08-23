package com.sina.service.inter;

public interface BaseInterface {
//��һЩͨ�õķ������������û����ӿ�
	//ͨ��id�ţ�����ȡһ������ʵ�� 
	public Object findById(Class clazz, java.io.Serializable id);
	//findById(Users.class,12);//��Ϊ�������еİ�װ�඼ʵ���˸ýӿ�
}
