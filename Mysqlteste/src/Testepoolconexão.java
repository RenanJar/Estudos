import java.sql.SQLException;

public class Testepoolconexão {

    public static void main(String[] args) throws SQLException {

        ConnectionFactory connectionFactory=new ConnectionFactory();


        for (int L=0;L <20;L++){
            connectionFactory.recuperarConexao();
            System.out.println("Conexão executada n= "+L);

        }
    }
}
