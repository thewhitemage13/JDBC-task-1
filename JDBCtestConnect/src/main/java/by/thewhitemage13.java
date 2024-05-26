package by;
import by.unils.ConnectionManager;
import java.sql.SQLException;
import java.util.List;

public class thewhitemage13 {

    public static void main(String[] args) throws SQLException {

        String sql = """
                SELECT * FROM jdbcfirstproject
                """;

        try(var connection = ConnectionManager.open();var statement = connection.createStatement()){
            var result = statement.executeQuery(sql);
            while (result.next()) {
                System.out.print(result.getString("first_name"));
                System.out.print(" ");
                System.out.print(result.getString("surname"));
                System.out.print(" ");
                System.out.println(result.getString("data"));
                System.out.println("==================================");
            }
        }
    }
}
