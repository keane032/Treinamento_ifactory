package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import author.Author;


@Repository
@Primary
public class AuthorJpaDao implements AuthorDao{

	@Autowired
	private EntityManager em;
	
	@Override
	@Transactional
	public void adcionar(Author author) {
		// TODO Auto-generated method stub
		em.persist(author);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Author> getLista() {
		List<Author> result = 
				em.createQuery("from author", 
				Author.class).getResultList();
		return result;
	}

	@Override
	@Transactional(readOnly=true)
	public Author getAuthor(Integer id) {
		// TODO Auto-generated method stub
		return em.find(Author.class, id);
	}

	@Override
	@Transactional
	public void alterar(Author author) {
		// TODO Auto-generated method stub
		em.merge(author);
	}

	@Override
	@Transactional
	public void remover(Author author) {
		// TODO Auto-generated method stub
		em.remove(em.merge(author));
	}

}
