package JDBC;

import JDBC.*;

import javax.security.auth.Subject;
import java.sql.ResultSet;
import java.util.ArrayList;

    class Array {

//        public static void main(String[] args) {
//            try {
//                DMLSql dmlSql = new DMLSql();
//                ResultSet rs = dmlSql.selectNews();
//                ArrayList<News> newsList = new ArrayList<>();
//
//                if (rs != null) {
//                    while (rs.next())
//                        News news = new News();
//                        news.setId(rs.getInt("id"));
//                        news.setSubject(rs.getString("subject"));
//                        news.setText(rs.getString("text"));
//                        newsList.add(news);
//                    }
//                } else {
//                    System.out.println("Қателік");
//                }
//
//                for (int i=0;i<newsList.size();i++){
//                    System.out.println(newsList.get(i).getSubject().toUpperCase());
//                }
//
//
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//
//        }
//    }

        public static void main(String[] args) {
            try {
                CRUD_SQL crudSql = new CRUD_SQL();
                ResultSet rs = crudSql.selectSQL();
                ArrayList<News> newsArrayList = new ArrayList<>();

                if (rs != null) {
                    while (rs.next()){
                        News news = new News();
                        news.setId(rs.getInt("Id"));
                        news.setSubject(rs.getString("Subject"));
                        news.setEmail(rs.getString("Email"));
                        news.setText(rs.getString("Text"));
                        news.setTest(rs.getString("Test"));

                        newsArrayList.add(news);

                    }



                } else {
                    System.out.println("katelik");
                }
                for( int i = 0;i<newsArrayList.size();i++){
                System.out.println(newsArrayList.get(i).getSubject().toUpperCase());}
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }