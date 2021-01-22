package java9;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWithResourcesEnhancement {
    public static void main(String[] args) {
        Connection con = null; // from Java 9 onwards, you can declare the resources outside try block.
        Statement stmt = null;
        try(con;stmt) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
