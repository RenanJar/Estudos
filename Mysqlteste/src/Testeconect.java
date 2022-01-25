import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Testeconect {

    public static void main(String[] args) throws SQLException {


    ConnectionFactory criarconexao = new ConnectionFactory();
    Connection connection= criarconexao.recuperarConexao();


        connection.close();

        System.out.println("Fim da conexão ! ! !");
    }
}
