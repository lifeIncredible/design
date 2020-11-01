package com.atguigu.design.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ѭ�����ط���Ľ���
 */
public class Demeter1 {

	public static void main(String[] args) {
		//������һ��SchoolManager ����
		SchoolManager schoolManager = new SchoolManager();
		//���ѧԺ��Ա��id ��ѧУ�ܲ���Ա����Ϣ
		schoolManager.printAllEmployee(new CollegeManager());

	}

}

//ѧУ�ܲ�Ա����
class Employee {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}

//ѧԺ��Ա����
class CollegeEmployee {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}

//����ѧԺԱ���Ĺ�����
class CollegeManager {

	//����ѧԺ������Ա��
	public List<CollegeEmployee> getAllEmployee() {
		List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
		for (int i = 0; i < 10; i++) {
			CollegeEmployee emp = new CollegeEmployee();
			emp.setId("ѧԺԱ��id= " + i);
			list.add(emp);
		}
		return list;
	}

	//���ѧԺԱ��Ա������Ϣ
	public void printEmployee(){
		List<CollegeEmployee> list1 = getAllEmployee();
		System.out.println("------------�ֹ�˾Ա��------------");
		for (CollegeEmployee e : list1) {
			System.out.println(e.getId());
		}
	}
}

//ѧУ������  ����SchoolManager��ֱ������������Щ? Employee��CollegeManager
//CollegeEmployee ����ֱ������,����һ��İ���࣬������Υ���˵����ط���
class SchoolManager {

	//����ѧУ�ܲ���Ա��
	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		for (int i = 0; i < 5; i++) {
			Employee emp = new Employee();
			emp.setId("ѧУ�ܲ�Ա��id= " + i);
			list.add(emp);
		}
		return list;
	}

	//�÷���������ѧУ�ܲ���ѧԺԱ����Ϣ�ķ���
	void printAllEmployee(CollegeManager sub) {

      	//�����ѧԺԱ���ķ�����װ��CollegeManager����
		sub.printEmployee();

		List<Employee> list2 = this.getAllEmployee();
		System.out.println("------------ѧУ�ܲ�Ա��------------");
		for (Employee e : list2) {
			System.out.println(e.getId());
		}
	}


}
