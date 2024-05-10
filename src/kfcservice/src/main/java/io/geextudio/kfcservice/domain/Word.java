package io.geextudio.kfcservice.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;

@Entity
public class Word {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	public Word(int id, String text, String translation, String partofspeech, String example) {
		super();
		this.id = id;
		this.text = text;
		this.translation = translation;
		this.partofspeech = partofspeech;
		this.example = example;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}

	public String getPartofspeech() {
		return partofspeech;
	}

	public void setPartofspeech(String partofspeech) {
		this.partofspeech = partofspeech;
	}

	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		this.example = example;
	}

	private String text;
	
	private String translation;
	
	private String partofspeech;
	
	@Column(nullable=true, length=512)
	private String example;
	
}
