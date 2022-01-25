import DAO.CategoriaDAO;
import Modelo.Categoria;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Testecategorias {


    public static void main(String[] args) throws SQLException {

        try(Connection connection=new ConnectionFactory().recuperarConexao()){
            CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
            List<Categoria> listacategoria = categoriaDAO.listar();
            listacategoria.stream().forEach(ct-> System.out.println(ct.getNome()));

        }






    }
}
