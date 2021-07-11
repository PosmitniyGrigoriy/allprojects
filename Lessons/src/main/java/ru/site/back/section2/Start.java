package ru.site.back.section2;

import java.util.*;

public class Start {
	
	public static void main(String[] args) {
		
		List<String> listName = new ArrayList<>();
		listName.add("�������");
		listName.add("�����");
		listName.add("����������");
		listName.add("����");
		listName.add("�������");
		
		Collections.sort(listName);
		System.out.println(listName);
		
		// *****************************************
		
		List<Integer> listDate = new ArrayList<>();
		listDate.add(11);
		listDate.add(29);
		listDate.add(3);
		listDate.add(7);
		listDate.add(1);
		
		Collections.sort(listDate);
		System.out.println(listDate);
		
		// *****************************************
		
		Employee emp1 = new Employee(1, "����", "������", 1000);
		Employee emp2 = new Employee(29, "�����", "��������", 850);
		Employee emp3 = new Employee(15, "��������", "������", 1200);
		Employee emp4 = new Employee(10, "��������", "�������", 600);
		Employee emp5 = new Employee(13, "�����", "���������", 900);
		
		List<Employee> emp = new ArrayList<>();
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		emp.add(emp5);
		
		// ���� �������� ������ ����, �� ����� ������. ����� �� ������, ��� ����� ���������� ������, ��� ��� ������ ����� ����� 1 ����. �� ���� ����� ���� ����� ����������.
		
//		Collections.sort(emp); // ������ ����� �� ����� sort (���� �� ����� ������������ ��������� Comparable � �������� ����� � ������ Employee)
		Collections.sort(emp); // ��� Comparable
//		Collections.sort(emp, new IdComparator()); // ��� Comparator (���������� ���� id)
//		Collections.sort(emp, new NameComparator()); // ��� Comparator (���������� ���� name)
		Collections.sort(emp, new SalaryComparator()); // ��� Comparator (���������� ���� salary)
		System.out.println(emp);
		
		// ����������� ����� ������. �������� ������ ����� ����������. ����� ���������� ������� �� ������ ����: id, name, surname, salary ��� ��������� ���� ��� ������ ����������.
		
		// ����� ������� ���������� � �������, � �������� ����� 1 ����, ����� ������������ ��������� comparable.
		
	}

}
