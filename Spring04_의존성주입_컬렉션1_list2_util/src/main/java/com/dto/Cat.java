package com.dto;

public class Cat {

		String name;
		int age;
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
			return "Cat [name=" + name + ", age=" + age + "]";
		}
		public Cat(String name, int age) {
			this.name = name;
			this.age = age;
		}
		public Cat() {
			// TODO Auto-generated constructor stub
		}


}
