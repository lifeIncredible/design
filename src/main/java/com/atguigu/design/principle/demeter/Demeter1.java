package com.atguigu.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * 位遵循迪米特法则的版本
 */
public class Demeter1 {

	public static void main(String[] args) {
		//创建了一个SchoolManager 对象
		SchoolManager schoolManager = new SchoolManager();
		//输出学院的员工id 和学校总部的员工信息
		schoolManager.printAllEmployee(new CollegeManager());

	}

}

//学校总部员工类
class Employee {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}

//学院的员工类
class CollegeEmployee {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}

//管理学院员工的管理类
class CollegeManager {

	//返回学院的所有员工
	public List<CollegeEmployee> getAllEmployee() {
		List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
		for (int i = 0; i < 10; i++) {
			CollegeEmployee emp = new CollegeEmployee();
			emp.setId("学院员工id= " + i);
			list.add(emp);
		}
		return list;
	}
}

//学校管理类  分析SchoolManager的直接朋友类有哪些? Employee、CollegeManager
//CollegeEmployee 不是直接朋友,而是一个陌生类，这样就违背了迪米特法则
class SchoolManager {

	//返回学校总部的员工
	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		for (int i = 0; i < 5; i++) {
			Employee emp = new Employee();
			emp.setId("学校总部员工id= " + i);
			list.add(emp);
		}
		return list;
	}

	//该方法完成输出学校总部和学院员工信息的方法
	void printAllEmployee(CollegeManager sub) {

		/**
		 * 分析问题：
		 * 1.CollegeEmployee不是SchoolManager的直接朋友关系
		 * 2.CollegeEmployee是以局部变量形式出现在SchoolManager类中
		 * 3.违背了迪米特法则
		 */

		List<CollegeEmployee> list1 = sub.getAllEmployee();
		System.out.println("------------分公司员工------------");
		for (CollegeEmployee e : list1) {
			System.out.println(e.getId());
		}
		List<Employee> list2 = this.getAllEmployee();
		System.out.println("------------学校总部员工------------");
		for (Employee e : list2) {
			System.out.println(e.getId());
		}

	}


}
