package Dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pub.Pub;

@Repository
@Primary
public class PubJpaDao implements PubDao{

	@Autowired
	private EntityManager em;
	
	
	@Override
	@Transactional
	public void adcionar(Pub pub) {
		// TODO Auto-generated method stub
		em.persist(pub);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Pub> getLista() {
		// TODO Auto-generated method stub
		List<Pub> result =
				em.createQuery("from publications",
						Pub.class).getResultList();
		return result;
	}

	@Override
	@Transactional(readOnly=true)
	public Pub getPub(Integer id) {
		// TODO Auto-generated method stub
		return em.find(Pub.class, id);
	}

	@Override
	@Transactional
	public void alterar(Pub pub) {
		// TODO Auto-generated method stub
		em.merge(pub);
	}

	@Override
	@Transactional
	public void remover(Pub pub) {
		// TODO Auto-generated method stub
		em.remove(em.merge(pub));
	}

}
