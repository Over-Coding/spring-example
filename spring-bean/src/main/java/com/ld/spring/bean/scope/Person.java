package com.ld.spring.bean.scope;
/**
 * @author ld
 * @create 2019年10月31日:下午1:06:52
 * @desc Person bean
 */
public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		System.out.println("Person Constractor===>");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
