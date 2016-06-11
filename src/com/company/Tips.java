package com.company;

/**
 * Created by Dudaizhong on 2016/4/14.
 */
public class Tips {

    public static void show() {
        System.out.println("----------------------------------------------------------");
        System.out.println("数据库功能表如下：");
        System.out.println("0:显示student,course,sc三张表");
        System.out.println("1:查询选修了课程的学生学号");
        System.out.println("2:查询通信，计算机，自动化学生的姓名和性别");
        System.out.println("3:查询姓 欧阳 且全名为三个汉字的学生的姓名");
        System.out.println("4:查询选修了12233号课程的学生的学号及其成绩，查询结果按分数降序排列");
        System.out.println("5:查询选修12231课程的学生最高分数");
        System.out.println("6:查询选修了课程名为 信号与系统 的学生学号和姓名");
        System.out.println("7:查询选修了课程12232或者12233课程的学生信息");
        System.out.println("8:向每个表插入一条记录");
        System.out.println("9:修改一指定学号和课程号的学生的成绩为80分");
        System.out.println("10:删除一指定学号和课程号的学生的选课信息");
        System.out.println("11:单链表的建立，遍历以及销毁");
        System.out.println("12:退出程序");
        System.out.println("----------------------------------------------------------");
    }
}
