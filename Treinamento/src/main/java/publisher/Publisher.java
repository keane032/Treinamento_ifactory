package publisher;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import pub.Pub;


@Entity(name = "publisher")
public class Publisher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String nome;
	@Column
	private String website;
	@Column
	private String descrition;
	@OneToMany(mappedBy = "publisher")
	@JsonIgnore
	private Collection<Pub> publications;

	   public Publisher(){

	    }
	    public Publisher(int id, String name, String website, String description){
	        this.setId(id);
	        this.setNome(name);
	        this.setWebsite(website);
	        this.setDescription(description);
	    }
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getWebsite() {
			return website;
		}
		public void setWebsite(String website) {
			this.website = website;
		}
		public String getDescrition() {
			return descrition;
		}
		public void setDescription(String descrition) {
			this.descrition = descrition;
		}
		public Collection<Pub> getPublications() {
			return publications;
		}
		public void setPublications(Collection<Pub> publications) {
			this.publications = publications;
		}

	
	
	
	
}
