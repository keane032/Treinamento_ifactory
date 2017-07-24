package Dao;

import java.util.List;

import pub.Pub;

public interface PubDao {

	public void adcionar(Pub pub);
	public List<Pub> getLista();
	public Pub getPub(Integer id);
	public void alterar(Pub pub);
	public void remover(Pub pub); 
	
}
