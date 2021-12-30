package xyDemo.jdbcPack;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyClient {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement = null;

        connection=JDBCUtil.getConnection();
        statement=connection.createStatement();
        //需要在自己的数据库当中建立一张user表
        String sql="insert into dog(name,age,color,品种)values('黑蛋',12,'黑','田园犬')";
        statement.executeUpdate(sql);
    }

    private void test1() throws SQLException{
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet;

        connection=JDBCUtil.getConnection();
        String sql = "select * from dog";
        statement = connection.createStatement();
        //resultSet就是一个迭代器,里面的方法跟迭代器几乎一致。
        resultSet=statement.executeQuery(sql);
        while (resultSet.next()){
            String loginName=resultSet.getString("name");
            String userName=resultSet.getString("age");
            String password=resultSet.getString("color");
            int sex=resultSet.getInt("品种");
            System.out.println(loginName+"-"+userName+"-"+password+"-"+sex);
        }
    }
}
