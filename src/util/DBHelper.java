package util;

import java.sql.*;

public class DBHelper {
    static{
        //加载JDBC驱动程序         
        try{
            String diverName="com.mysql.cj.jdbc.Driver";
            Class.forName(diverName);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/red6?serverTimezone=GMT%2B8&useSSL=false","root","");

        }catch (Exception e){ e.printStackTrace(); }
        return con;
    } public static void close(ResultSet rs, Statement statement,Connection con){
        try{
            if(rs !=null)
                rs.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }try  {
            if (statement !=null)
                statement.close(); }
        catch(Exception ex){
            ex.printStackTrace();
        }try{
            if(con!=null)
                con.close();
        }catch(Exception ex){ex.printStackTrace();
        } }
}




