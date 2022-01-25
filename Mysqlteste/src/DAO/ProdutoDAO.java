package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private Connection connection;

    public ProdutoDAO(Connection connection){
        this.connection = connection;
    }

    public void cadastrar(Produto produto) throws SQLException {
        String sql = "INSERT INTO PRODUTO(NOME,DESCRIÇÃO)VALUES(?,?)";

        try(PreparedStatement preparedStatement=connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){

            preparedStatement.setString(1,produto.getNome());
            preparedStatement.setString(2, produto.getDescrição());

            preparedStatement.execute();

            try(ResultSet resultSet= preparedStatement.getGeneratedKeys()){
                while(resultSet.next()){
                    produto.setId(resultSet.getInt(1));
                }
            }
        }
        System.out.println(produto.toString());

    }
    public List<Produto> listar() throws SQLException {
        List<Produto> produtos = new ArrayList<Produto>();

        String sql = "SELECT ID,NOME,DESCRIÇÃO FROM PRODUTO";

        try(PreparedStatement preparedStatement= connection.prepareStatement(sql)){
            preparedStatement.execute();

            ResultSet resultSet=preparedStatement.getResultSet();
            while(resultSet.next()){
                Produto produto = new Produto(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));

                produtos.add(produto);
            }
        }
        return produtos;
    }
}
