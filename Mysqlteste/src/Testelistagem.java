import java.sql.*;

public class Testelistagem {
    public static void main(String[] args) throws SQLException {

        ConnectionFactory criarconexao = new ConnectionFactory();
        Connection connection = criarconexao.recuperarConexao();

        PreparedStatement sql= connection.prepareStatement("SELECT ID,nome,descrição from DAO.Produto");//query
        sql.execute();
        ResultSet consulta=sql.getResultSet();

        while(consulta.next()){
            Integer id=consulta.getInt("ID");
            System.out.println(id);
            String nome=consulta.getString("nome");
            System.out.println(nome);
            String descrição=consulta.getString("descrição");
            System.out.println(descrição);
        }


        connection.close();

        System.out.println("Fim da conexão ! ! !");
    }

}
