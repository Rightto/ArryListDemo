package com.example.demo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		List<String> list = new LinkedList<String>();

		list.add("Rahul");
		list.add("Samiksha");
		list.add("Pune");

		list.forEach(x -> System.out.println(x));
	}
}
