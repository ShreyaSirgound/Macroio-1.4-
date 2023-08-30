import data.JDBCPostgreSQL;
import views.AccountSetupView;
import views.TitlePage;

public class Main {

    public static void main(String[] args) {
        JDBCPostgreSQL databaseConnect = new JDBCPostgreSQL();
        databaseConnect.connect();
        new TitlePage();
    }
    
}
