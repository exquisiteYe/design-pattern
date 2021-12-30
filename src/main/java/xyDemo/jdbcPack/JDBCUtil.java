package xyDemo.jdbcPack;

import ch.qos.logback.core.db.dialect.DBUtil;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
    //Driver类全名
    public static String DRIVER = "com.mysql.jdbc.Driver";
    //jdbc协议:子协议://ip:端口号/数据库名
    public static String URL = "jdbc:mysql://localhost:3306/atest";
    //数据库用户名
    public static String USERNAME = "root";
    //数据库密码
    public static String PASSWORD = "root123666";

    private static Connection connection = null;

    /**
     * 获取JDBC连接
     * @return
     */
    public static Connection getConnection() {
        try {
            //加载驱动程序：它通过反射创建一个driver对象。
            Class.forName(DRIVER);

            //获得数据连接对象。
            // 在返回connection对象之前，DriverManager它内部会先校验驱动对象driver信息对不对,我们只要知道内部过程即可。
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 通过读取文件连接
     *
     * @param fileName
     * @return
     * @throws SQLException
     */
    public Connection getConnectionByLoadSettingFile(String fileName) throws SQLException {
        /*
            文件里面的内容：跟上面的常量一模一样
            jdbc.driver=com.mysql.jdbc.Driver
            jdbc.url=jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8
            jdbc.username=root
            jdbc.password=root
        */
        Properties props = new Properties();
        try {
            //我的properties文件是放在src根目录下的
            InputStream in = DBUtil.class.getResourceAsStream("src/main/resources/application.properties");
            if (null == in)
                System.out.println("找不到文件:" + fileName);
            props.load(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String driver = props.getProperty("jdbc.driver");
        if (null != driver)
            System.setProperty("jdbc.drivers", driver);
        String url = props.getProperty("jdbc.url");
        String username = props.getProperty("jdbc.username");
        String password = props.getProperty("jdbc.password");
        connection = DriverManager.getConnection(url, username, password);
        return connection;
    }
}
