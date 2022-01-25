import DAO.Produto;
import DAO.ProdutoDAO;

import java.sql.*;
import java.util.List;

public class TesteinsertProduto {

    public static void main(String[] args) throws SQLException {

        Produto Cadeira = new Produto("Cadeira gamer","Cadeira gamer Logitech");

        try (Connection connection = new ConnectionFactory().recuperarConexao()){
            ProdutoDAO produtoDAO = new ProdutoDAO(connection);
            produtoDAO.cadastrar(Cadeira);
            //lista os produtos
            List<Produto> listadeprodutos = produtoDAO.listar();
            listadeprodutos.stream().forEach(lp-> System.out.println(lp));
        }
    }

}
