package com.company;

import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Dudaizhong on 2016/4/14.
 */
public class Function {

    //    查询选修了课程的学生学号
    public static void fun1(Statement statement) throws SQLException, UnsupportedEncodingException {

        String fun = "select distinct Sno from sc";
        ResultSet result = statement.executeQuery(fun);
        System.out.println("-----------------------------------------");
        System.out.println("查询选修了课程的学生学号信息如下:");
        System.out.println("-----------------------------------------");
        System.out.println(" 学号");
        System.out.println("-----------------------------------------");

        while (result.next()) {
            System.out.println(" " + result.getInt("Sno"));        // 输出结果
        }
        result.close();
        System.out.println();

    }

    //      查询通信学院、计算机学院、自动化学院学生的姓名和性别
    public static void fun2(Statement statement) throws SQLException, UnsupportedEncodingException {

        String fun = "SELECT name,sex FROM student WHERE Sinst IN(\"SCIE\",\"CS\",\"AC\")";
        ResultSet result = statement.executeQuery(fun);
        System.out.println("-----------------------------------------");
        System.out.println("通信学院、计算机学院、自动化学院学生的姓名和性别信息如下:");
        System.out.println("-----------------------------------------");
        System.out.println(" 姓名" + "\t" + "性别");
        System.out.println("-----------------------------------------");
        String name = null;
        String sex = null;
        while (result.next()) {
            name = result.getString("name");                            // 选择name这列数据
            sex = result.getString("sex");                            // 选择sex这列数据
            System.out.println(" " + name + "\t" + sex);        // 输出结果
        }
        result.close();
        System.out.println();
    }

    //    查询姓欧阳且全名为三个汉字的学生的姓名
    public static void fun3(Statement statement) throws SQLException, UnsupportedEncodingException {

        String fun = "select name from student where name like 'Ou%' and name like'________'";
        ResultSet result = statement.executeQuery(fun);
        System.out.println("-----------------------------------------");
        System.out.println("查询姓欧阳且全名为三个汉字的学生的姓名信息如下:");
        System.out.println("-----------------------------------------");
        System.out.println(" 姓名");
        System.out.println("-----------------------------------------");
        String name = null;
        while (result.next()) {
            name = result.getString("name");                            // 选择name这列数据
            System.out.println(" " + name);        // 输出结果
        }
        result.close();
        System.out.println();

    }

    //    查询选修了3号课程的学生的学号及其成绩，查询结果按分数降序排列
    public static void fun4(Statement statement) throws SQLException, UnsupportedEncodingException {

        String fun = "SELECT Sno,Grade FROM sc WHERE Cno = \"103\" order by Grade DESC";
        ResultSet result = statement.executeQuery(fun);
        System.out.println("-----------------------------------------");
        System.out.println("查询选修了3号课程的学生的学号及其成绩，查询结果按分数降序排列信息如下:");
        System.out.println("-----------------------------------------");
        System.out.println("学号" + "\t" + "分数");
        System.out.println("-----------------------------------------");

        while (result.next()) {

            System.out.println(" " + result.getInt("Sno") + "\t\t" + result.getInt("Grade"));        // 输出结果
        }
        result.close();
        System.out.println();
    }

    //    查询选修1号课程的学生最高分数
    public static void fun5(Statement statement) throws SQLException, UnsupportedEncodingException {

        String fun = "select MAX(Grade) from sc where Cno = \"101\";";
        ResultSet result = statement.executeQuery(fun);
        System.out.println("-----------------------------------------");
        System.out.println(" 查询选修1号课程的学生最高分数信息如下:");
        System.out.println("-----------------------------------------");
        System.out.println("最高分数");
        System.out.println("-----------------------------------------");

        while (result.next()) {
            System.out.println(" " + result.getInt("MAX(Grade)"));        // 输出结果
        }
        result.close();
        System.out.println();
    }

    //    查询选修课程名为"信号与系统"的学生学号和姓名
    public static void fun6(Statement statement) throws SQLException, UnsupportedEncodingException {

        String fun = "select student.Sno,student.name from student,course,sc where student.Sno=sc.Sno and sc.Cno=course.Cno and course.name=\"Signals and Systems\"";

        ResultSet result = statement.executeQuery(fun);
        System.out.println("-----------------------------------------");
        System.out.println(" 查询选修课程名为\"信号与系统\"的学生学号和姓名信息如下:");
        System.out.println("-----------------------------------------");
        System.out.println("学号" + "\t" + "姓名");
        System.out.println("-----------------------------------------");
        String name = null;
        while (result.next()) {
            name = result.getString("name");                            // 选择name这列数据
            System.out.println(" " + result.getInt("Sno") + "\t" + name);        // 输出结果
        }
        result.close();
        System.out.println();
    }

    //    查询选修了课程2或者课程3的学生信息
    public static void fun7(Statement statement) throws SQLException, UnsupportedEncodingException {
        String fun = "select student.Sno,student.name,student.age,student.sex,student.Sinst from student,sc,course where student.Sno=sc.Sno and sc.Cno in(102,103) group by student.Sno";
        ResultSet result = statement.executeQuery(fun);
        System.out.println("-----------------------------------------");
        System.out.println(" 查询选修了课程2或者课程3的学生信息如下:");
        System.out.println("-----------------------------------------");
        System.out.println("学号" + "\t" + "姓名" + "\t" + "年龄" + "\t" + "性别" + "\t" + "学院");
        System.out.println("-----------------------------------------");
        String name = null;
        String sex = null;
        String Sinst = null;
        while (result.next()) {
            name = result.getString("name");                            // 选择name这列数据
            sex = result.getString("sex");                            // 选择sex这列数据
            Sinst = result.getString("Sinst");                            // 选择Sinst这列数据

            System.out.println(" " + result.getInt("Sno") + "\t" + name + "\t  " + sex + "\t" + result.getInt("age") + "\t\t" + Sinst);

        }
        result.close();
        System.out.println();
    }

    //    向表中插入一条记录
    public static void fun8(Statement statement) throws SQLException, UnsupportedEncodingException {

        String student = "insert into student values(18,\"Yuping\",\"girl\",10,\"SC\")";
        String course = " insert into course values(118,\"JAVA\",\"C\",3)";
        String sc = "insert into sc values(8,102,67)";
        statement.executeUpdate(student);
        statement.executeUpdate(course);
        statement.executeUpdate(sc);

        System.out.println("数据插入成功");
        Tables.student(statement);
        Tables.course(statement);
        Tables.sc(statement);
    }

    //    修改一指定学号和课程号的学生的成绩为80分
    public static void fun9(Statement statement) throws SQLException, UnsupportedEncodingException {

        String fun = "update sc set Grade=80 where Sno=1 and Cno =103";
        statement.executeUpdate(fun);

        System.out.println("数据更新成功");
        Tables.sc(statement);
    }

    //    删除一指定学号和课程号的学生的选课信息
    public static void fun10(Statement statement) throws SQLException, UnsupportedEncodingException {
        String fun = "delete from sc where Sno = 1 and Cno = 104";
        statement.executeUpdate(fun);

        System.out.println("数据删除成功");
        Tables.sc(statement);
    }

    public static void fun11(Statement statement) throws SQLException {
        String student = "SELECT * FROM student";
        ResultSet rs0 = statement.executeQuery(student);
        StudentChain stduentChain = null;
        StudentChainNode studentNode = null;

        String name = null;
        String sex = null;
        String Sinst = null;
        while (rs0.next()) {
            name = rs0.getString("name");                            // 选择name这列数据
            sex = rs0.getString("sex");                            // 选择sex这列数据
            Sinst = rs0.getString("Sinst");                            // 选择Sinst这列数据
            Student sd = new Student(rs0.getInt("Sno"), name, sex, rs0.getInt("age"), Sinst);
            stduentChain.addNode(sd);
        }
        System.out.println("链表建立，插入成功！！！");
        System.out.println("---------------------------");

        stduentChain.searchNode(stduentChain);
        System.out.println("链表遍历成功！！！");
        System.out.println("---------------------------");

        stduentChain.delete(studentNode, stduentChain);
        System.out.println("链表销毁成功！！！");
        System.out.println("---------------------------");

        rs0.close();//关闭记录集
    }
}
