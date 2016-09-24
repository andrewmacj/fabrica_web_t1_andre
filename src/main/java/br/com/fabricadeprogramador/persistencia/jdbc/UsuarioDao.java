package br.com.fabricadeprogramador.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;

public class UsuarioDao {
	private Connection con = ConnectionFactory.getConnection();
	public void cadastrar(Usuario usu) {
		// TODO Auto-generated method stub
		String sql = "insert into usuario(nome, login, senha)"
				+ "values(?, ?, ?)";
		try (PreparedStatement prepare = con.prepareStatement(sql)){
			prepare.setString(1, usu.getNome());
			prepare.setString(2, usu.getLogin());
			prepare.setString(3, usu.getSenha());
			
			//executando o command in Sql
			prepare.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void update(Usuario usu){
		String sql = "update usuario set nome=?, login=?, senha=? where id=?";
		try (PreparedStatement prepare = con.prepareStatement(sql)){
			prepare.setString(1, usu.getNome());
			prepare.setString(2, usu.getLogin());
			prepare.setString(3, usu.getSenha());
			prepare.setInt(4, usu.getId());
			//executando o command in Sql
			prepare.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void delete(Usuario usu){
		String sql = "delete from usuario where id=?";
		
		try (PreparedStatement prepare = con.prepareStatement(sql)){
			prepare.setInt(1, usu.getId());
			//executando o command in Sql
			prepare.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
