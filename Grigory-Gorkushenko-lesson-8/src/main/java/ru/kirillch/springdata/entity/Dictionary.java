package ru.kirillch.springdata.entity;

import javax.persistence.*;

@Entity
public class Dictionary {

	@Id
	@GeneratedValue
	private Long id;

	private String words;
	private int repetitions;
	private String transcriptions;
	private String translations;

	public Dictionary() {
	}

	public Dictionary(String words, int repetitions, String transcriptions, String translations) {
		super();
		this.words = words;
		this.repetitions = repetitions;
		this.transcriptions = transcriptions;
		this.translations = translations;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public int getRepetitions() {
		return repetitions;
	}

	public void setRepetitions(int repetitions) {
		this.repetitions = repetitions;
	}

	public String getTranscriptions() {
		return transcriptions;
	}

	public void setTranscriptions(String transcriptions) {
		this.transcriptions = transcriptions;
	}

	public String getTranslations() {
		return translations;
	}

	public void setTranslations(String translations) {
		this.translations = translations;
	}

	@Override
	public String toString() {
		return "\nDictionary [id=" + id + ", words=" + words + ", repetitions=" + repetitions + ", transcriptions="
				+ transcriptions + ", translations=" + translations + "]";
	}

}