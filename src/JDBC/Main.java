package JDBC;

import JDBC.CRUD_SQL;

public class Main {
    public static void main(String[] args) {
//        InsertSQL isertSQL=new InsertSQL();
//        UpdateSQL updateSQL=new UpdateSQL();
//        DeleteSQL deleteSQL=new DeleteSQL();
//        SelectSQL selectSQL=new SelectSQL();
//        isertSQL.insertSQL("nurs","Madi",87,"87","M");
//        updateSQL.updateSQL("nurs","Gani",78,"85","M",80);
//        deleteSQL.deleteSQL("nurs","nurs_kod",78);

        CRUD_SQL crud_sql=new CRUD_SQL();
        crud_sql.insertSQL("subject", "text","email","test");
           }

}