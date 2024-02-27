package JDBC;

import java.sql.*;


public class CRUD_SQL {


    public ResultSet selectSQL() {
        try {
            Proper proper = new Proper();
            Connection connection = DriverManager.getConnection(proper.proper("db.url"), proper.proper("db.login"), proper.proper("db.password"));
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from news");

//            int result = preparedStatement.executeUpdate();
//            if (result > 0) {
//                System.out.println("true good Select");
//                return result;
//            }
            return resultSet;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    public int updateSQL( String subject, String text , String email,String test) {
        try {
            Proper proper = new Proper();
            Connection connection = DriverManager.getConnection(proper.proper("db.url"), proper.proper("db.login"), proper.proper("db.password"));
            PreparedStatement preparedStatement = connection.prepareStatement("update news set subject=?,text=?,email=?, where id=?;");

            preparedStatement.setString(1, subject);
            preparedStatement.setString(2, text);
            preparedStatement.setString(3, email);
            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                System.out.println("true good Select");
            }
            if (result > 0) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
            return 0;
        }
    }





    public int deleteSQL(String subject , String text , String email , String test){
        try{
            Proper proper=new Proper();
            Connection connection= DriverManager.getConnection(proper.proper("db.url"),proper.proper("db.login"),proper.proper("db.password"));
            PreparedStatement preparedStatement=connection.prepareStatement("delete from news where name=? and id=?");
            preparedStatement.setString(1,subject);
            preparedStatement.setString(2,text);


            int result=preparedStatement.executeUpdate();
            if(result>0){
                System.out.println("true good Select");
            }
            return result;
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
            return 0;
        }
    }







    public int insertSQL( String subject, String text , String email,String test){
        try {
            Proper proper = new Proper();
            System.out.println(proper.proper("db.url"));
            Connection connection = DriverManager.getConnection(proper.proper("db.url"), proper.proper("db.login"), proper.proper("db.password"));
            System.out.println("is connect :" +connection.isValid(1));

            PreparedStatement preparedStatement = connection.prepareStatement("insert into news(subject , text , email , test) values(?,?,?,?)");
            preparedStatement.setString(1, subject );
            preparedStatement.setString(2, text);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, test);
            int result=preparedStatement.executeUpdate();
            if(result>0){
                System.out.println("true good Select");
            }
            if(result>0){
                return 1;
            }else {
                return  0;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
    }

//    public int createSQL(){
//        try{
//            Proper proper = new Proper();
//            Connection connection = DriverManager.getConnection(proper.proper("db.url"),proper.proper("db.login"),proper.proper("db.passowrd"));
//            Statement statement = connection.createStatement();
//
//        }catch (Exception e) {
//            System.out.println(e.fillInStackTrace());
//        }return 0 ;
//    }
}
