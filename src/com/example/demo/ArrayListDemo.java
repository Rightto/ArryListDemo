package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Ajit");
		list.add("Sachin");
		list.add("Pune");

		list.forEach(key -> System.out.println(key));

	}

}
