import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Testedelete {

    public static void main(String[] args) throws SQLException {

        ConnectionFactory criarconexao = new ConnectionFactory();
        Connection connection= criarconexao.recuperarConexao();

        PreparedStatement Statement = connection.prepareStatement("DELETE FROM PRODUTO WHERE ID=?");

        Statement.setInt(1,2);
        Statement.execute();

        Integer linhasdeletadas = Statement.getUpdateCount();

        System.out.println("Quantidade de linhas deletadas: "+linhasdeletadas);



    }
}
