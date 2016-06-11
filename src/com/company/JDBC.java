package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Dudaizhong on 2016/4/14.
 */
public class JDBC {

    public static void connection() {

        String driver = "com.mysql.jdbc.Driver";         // 驱动程序名
        String url = "jdbc:mysql://localhost:3306/sms";     // URL指向要访问的数据库名sms?useUnicode=true&characterEncoding=gb2312
        String user = "root";       // MySQL配置时的用户名
        String password = "123456";      // MySQL配置时的密码
        try {
            // 第一步：加载驱动程序
            Class.forName(driver);
            // 第二步：创建数据库的连接
            Connection conn = DriverManager.getConnection(url, user, password);
            if (!conn.isClosed()) {
                System.out.println("Succeeded connecting to the Database!");     //验证是否连接成功
            }
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
