import java.sql.*;

public class Testeinsert {

    public static void main(String[] args) throws SQLException {

        ConnectionFactory criarconexao = new ConnectionFactory();
        try(Connection connection = criarconexao.recuperarConexao()){ //este try existe para fechar a conexão que foi aberta.


            try (
                    PreparedStatement Insert = connection.prepareStatement("INSERT INTO produto(nome,descrição)VALUES(?,?)"
                            , Statement.RETURN_GENERATED_KEYS);
            ) {
                connection.setAutoCommit(false);


                Adicionarproduto("Microfone", "Microfone multilaser", Insert);
                Adicionarproduto("Celular", "Celular Xiomi", Insert);

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("ROLLBACK EXECUTADO");
                connection.rollback();
            }
        }
    }
    private static void Adicionarproduto(String nome, String descrição, PreparedStatement Insert) throws SQLException {
        Insert.setString(1, nome);
        Insert.setString(2, descrição);
        Insert.execute();

        /*
        if(nome.equals("Celular")){
            throw new RuntimeException("Não foi possivel adicionar o produto");
        */

        ResultSet insertresult = Insert.getGeneratedKeys();

        while (insertresult.next()) {
            Integer id = insertresult.getInt(1);
            System.out.println("o ID criado foi: " + id);
        }
    }

}

