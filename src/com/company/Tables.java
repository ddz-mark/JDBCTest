package com.company;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Dudaizhong on 2016/4/14.
 */
public class Tables {

    //            显示student表
    public static void student(Statement statement) throws SQLException, UnsupportedEncodingException {
        String student = "SELECT * FROM student";
        ResultSet rs0 = statement.executeQuery(student);

        System.out.println("-----------------------------------------");
        System.out.println("Student表下的信息如下:");
        System.out.println("-----------------------------------------");
        System.out.println(" 学号" + "\t\t\t" + "姓名" + "\t" + " 性别" + "\t\t" + "年龄" + "\t\t" + "系别");
        System.out.println("-----------------------------------------");

        String name = null;
        String sex = null;
        String Sinst = null;
        while (rs0.next()) {
            name = rs0.getString("name");                            // 选择name这列数据
            sex = rs0.getString("sex");                            // 选择sex这列数据
            Sinst = rs0.getString("Sinst");                            // 选择Sinst这列数据
            System.out.println(" " + rs0.getInt("Sno") + "\t" + name + "\t  " + sex + "\t" + rs0.getInt("age") + "\t\t" + Sinst);        // 输出结果
        }
        System.out.println();
        rs0.close();//关闭记录集
    }

    //          显示course表
    public static void course(Statement statement) throws SQLException, UnsupportedEncodingException {

        String course = "SELECT * FROM course";
        ResultSet rs1 = statement.executeQuery(course);
        System.out.println("-----------------------------------------");
        System.out.println("courset表下的信息如下:");
        System.out.println("-----------------------------------------");
        System.out.println(" 课程号" + "\t" + "课程名" + "\t" + " 先修课程" + "\t" + "学分");
        System.out.println("-----------------------------------------");
        String cname = null;
        String cpno = null;
        while (rs1.next()) {
            cname = rs1.getString("name");                            // 选择name这列数据
            cpno = rs1.getString("pno");                            // 选择name这列数据
            System.out.println(" " + rs1.getInt("Cno") + "\t" + cname + "\t  " + cpno + "\t" + rs1.getInt("credit"));        // 输出结果
        }
        rs1.close();
        System.out.println();
    }

    //            显示sc表
    public static void sc(Statement statement) throws SQLException {

        String sc = "SELECT * FROM sc";
        ResultSet rs2 = statement.executeQuery(sc);
        System.out.println("-----------------------------------------");
        System.out.println("sc表下的信息如下:");
        System.out.println("-----------------------------------------");
        System.out.println(" 学号" + "\t" + "课程号" + "\t" + "分数");
        System.out.println("-----------------------------------------");

        while (rs2.next()) {
            System.out.println(" " + rs2.getInt("Sno") + "\t" + rs2.getInt("Cno") + "\t" + rs2.getInt("Grade"));        // 输出结果
        }
        rs2.close();
        System.out.println();

    }
}
