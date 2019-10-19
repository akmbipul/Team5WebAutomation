package datasource;

import databases.ConnectToSqlDB;
import utility.DataReader;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataSource {


    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

    //  From Class
    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Vehicle Insurance");
        itemsList.add("Property Insurance");
        itemsList.add("Business Insurance");
        itemsList.add("Additional Insurance");
        return itemsList;
    }

    //Database
    public static List<String> getItemsListFromDB() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<String>();
        list = connectToSqlDB.readDataBase("ItemList", "items");
        return list;
    }


    }





