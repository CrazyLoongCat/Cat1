package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

@RestController
public class test {

    public static void main(String[] args) {
        String url="jdbc:mysql://176.122.165.184:3306/crazyloongcat?characterEncoding=UTF-8";

        String user="cat";

        String password="cat";

        try {
            Connection con = DriverManager.getConnection(url,user,password);
            PreparedStatement ps = con.prepareStatement("select name from NBATEAM");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
