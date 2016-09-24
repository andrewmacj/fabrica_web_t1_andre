package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDao;

public class TesteUsuarioDao {
	
	public static void testCadastrar(){
		//Criando o usuario
		Usuario usu = new Usuario();
		usu.setNome("Joaozinho");
		usu.setLogin("jjzinho");
		usu.setSenha("123");
		
		//Cadastrando Usuario
		UsuarioDao usuDao = new UsuarioDao();
		usuDao.cadastrar(usu);
		
		System.out.println("Sucess added");
	}
	public static void testarUpdate(){
		//Criando o usuario
		Usuario usu = new Usuario();
		usu.setId(4);
		usu.setNome("Jotizinho");
		usu.setLogin("jojojozinho");
		usu.setSenha("12345");
		
		//Cadastrando Usuario
		UsuarioDao usuDao = new UsuarioDao();
		usuDao.update(usu);
		
		System.out.println("Sucess Update");
	}
	public static void testarDelete(){
		//Criando o usuario
		Usuario usu = new Usuario();
		usu.setId(4);
		
		//Excluindo Usuario
		UsuarioDao usuDao = new UsuarioDao();
		usuDao.delete(usu);
		
		System.out.println("Sucess Deleted");
	}
	public static void main(String[] args) {
			testarDelete();
	}

}
