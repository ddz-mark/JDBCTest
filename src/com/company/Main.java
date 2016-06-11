package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String driver = "com.mysql.jdbc.Driver";         // 驱动程序名
        String url = "jdbc:mysql://localhost:3306/sms";     // URL指向要访问的数据库名sms?useUnicode=true&characterEncoding=GBK
        String user = "root";       // MySQL配置时的用户名
        String password = "123456";      // MySQL配置时的密码
        try {
            Class.forName(driver);  // 第一步：加载驱动程序
            Connection conn = DriverManager.getConnection(url, user, password); // 第二步：创建数据库的连接
            if (!conn.isClosed()) {
                System.out.println("Succeeded connecting to the Database!");     //验证是否连接成功
            }
            Statement statement = conn.createStatement(); //第三步： statement用来执行SQL语句

//            处理结果
            Tips.show();
            int result;
            while (true) {
                Scanner in = new Scanner(System.in);
                System.out.println("请输入选择的功能(0-11)：");
                result = in.nextInt();
                if (result == 0) {
                    Tables.student(statement);
                    Tables.course(statement);
                    Tables.sc(statement);
                }

                if (result == 1) {
                    Function.fun1(statement);
                }
                if (result == 2) {
                    Function.fun2(statement);
                }
                if (result == 3) {
                    Function.fun3(statement);
                }
                if (result == 4) {
                    Function.fun4(statement);
                }
                if (result == 5) {
                    Function.fun5(statement);
                }
                if (result == 6) {
                    Function.fun6(statement);
                }
                if (result == 7) {
                    Function.fun7(statement);
                }
                if (result == 8) {
                    Function.fun8(statement);
                }
                if (result == 9) {
                    Function.fun9(statement);
                }
                if (result == 10) {
                    Function.fun10(statement);
                }
                if (result == 11) {
                    Function.fun11(statement);
                }
                if (result == 12) {
                    System.out.println("再见! 再见! 再见!");
                    break;
                }
            }

            statement.close();//关闭声明
            conn.close();//关闭连接对象
        } catch (ClassNotFoundException e) {
            System.out.println("Sorry,can`t find the Driver!");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



