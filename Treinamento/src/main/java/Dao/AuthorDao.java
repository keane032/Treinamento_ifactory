package Dao;

import java.util.List;

import author.Author;

public interface AuthorDao {

	public void adcionar(Author author);
	public List<Author> getLista();
	public Author getAuthor(Integer id);
	public void alterar(Author author);
	public void remover(Author author);

}
