package com.atguigu.design.composite;


/**
 * @Program:com.atguigu.design.composite
 * @Author: mcrae.su
 * @Create: 2021-01-27 13:40
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        //创建学校
        OrganizationComponent university = new University("清华大学", "中国顶级大学");

        //创建学院
        College computerCollege = new College("计算机学院", "计算机学院");
        College InformationEngineeringCollege = new College("信息工程学院", "信息工程学院");

        //创建专业
        Department softWareEngineering = new Department("软件工程", "好专业");
        Department computerScienceAndTechnology = new Department("计算机科学与技术", "老牌专业");
        Department communication = new Department("通信专业", "不好学，没意思");

        //为学院添加专业
        computerCollege.add(softWareEngineering);
        computerCollege.add(computerScienceAndTechnology);
        InformationEngineeringCollege.add(communication);

        //为学校添加学院
        university.add(computerCollege);
        university.add(InformationEngineeringCollege);

        university.print();
        //computerCollege.print();
    }
}
