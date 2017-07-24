package Dao;

import java.util.List;

import publisher.Publisher;

public interface PublisherDao {

	public void adcionar(Publisher publisher);
	public List<Publisher> getLista();
	public Publisher getPublisher(Integer id);
	public void alterar(Publisher publisher);
	public void remover(Publisher publisher);
}
