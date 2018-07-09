import java.sql.*;

public class JDBCSample {

    public static void main(String[] args) {
        String driverName = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/postgres";
        try {
            Class.forName(driverName);
            Connection conn = DriverManager.getConnection(url,"postgres","admin");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from book");
            // Ecriture st.execute()
            while(rs.next()) {
                String title = rs.getString("title");
                System.out.println(title);
            }
            conn.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
