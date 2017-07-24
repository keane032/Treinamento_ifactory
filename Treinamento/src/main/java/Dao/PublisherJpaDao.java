package Dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import publisher.Publisher;

@Repository
@Primary
public class PublisherJpaDao implements PublisherDao{

	@Autowired
	private EntityManager em;
	
	@Override
	@Transactional
	public void adcionar(Publisher publisher) {
		// TODO Auto-generated method stub
		em.persist(publisher);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Publisher> getLista() {
		// TODO Auto-generated method stub
		List<Publisher> result =
				em.createQuery("from publisher", 
						Publisher.class).getResultList();
		return result;
	}

	@Override
	@Transactional(readOnly=true)
	public Publisher getPublisher(Integer id) {
		// TODO Auto-generated method stub
		return em.find(Publisher.class, id);
	}

	@Override
	@Transactional
	public void alterar(Publisher publisher) {
		// TODO Auto-generated method stub
		em.merge(publisher);
	}

	@Override
	@Transactional
	public void remover(Publisher publisher) {
		// TODO Auto-generated method stub
		em.remove(publisher);
	}

}
