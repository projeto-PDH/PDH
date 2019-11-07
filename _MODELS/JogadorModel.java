package models;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class JogadorModel {

	private String nome;
	private String id;
	private String senha;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void inserirJogador(String id, String nome, String senha) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		JogadorModel a = new JogadorModel();
		a.setId(id);
		a.setNome(nome);		
		a.setSenha(senha);
		session.save(a);
		tx.commit();
	}
	
	public JogadorModel pegarJogador(Serializable Serializable) {
		Configuration con = new Configuration().configure().addAnnotatedClass(JogadorModel.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		JogadorModel a = (JogadorModel) session.get(JogadorModel.class, Serializable);
		
		session.getTransaction().commit();
		return a;
	}
	
	public void editarJogador(JogadorModel da) {
		Configuration con = new Configuration().configure().addAnnotatedClass(JogadorModel.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		session.update(da);
		
		session.getTransaction().commit();
	}
	
	public void deletarJogador(JogadorModel da) {
		Configuration con = new Configuration().configure().addAnnotatedClass(JogadorModel.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		session.delete(da);
		
		session.getTransaction().commit();
	}
}
