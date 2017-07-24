package pub;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import author.Author;
import publisher.Publisher;

@Entity(name = "publications")
public class Pub{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String name;
	@Column 
	private Tipo tipo;
	@Column(columnDefinition = "DATA DEFAULT CURRENT_DATE")
	private Date data;
	@ManyToOne
	private Author author;
	@ManyToOne
	private Publisher publisher;
	
	 public  Pub(){};

	    public Pub(int id, String name, Tipo tipo, Author author, Publisher publisher){
	        this.setId(id);
	        this.setName(name);
	        this.setTipo(tipo);
	        this.setAuthor(author);
	        this.setPublisher(publisher);
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Tipo getTipo() {
			return tipo;
		}

		public void setTipo(Tipo tipo) {
			this.tipo = tipo;
		}

		public Date getData() {
			return data;
		}

		public void setData(Date data) {
			this.data = data;
		}

		public Author getAuthor() {
			return author;
		}

		public void setAuthor(Author author) {
			this.author = author;
		}

		public Publisher getPublisher() {
			return publisher;
		}

		public void setPublisher(Publisher publisher) {
			this.publisher = publisher;
		}

	
	
	
	
	
	
	
	
	
	
	
}
