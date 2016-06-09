package com.springmvc;

public class Film {
	
	private String film_id;
	private String film_title;
	private String description;
	private String release_date;
	private String rental_rate;
	
	public Film(){
		
	}
	
	public Film(String film_id, String film_title, String description, String release_date, String rental_rate) {
		super();
		this.film_id = film_id;
		this.film_title = film_title;
		this.description = description;
		this.release_date = release_date;
		this.rental_rate = rental_rate;
	}
		
	public String getFilm_id() {
		return film_id;
	}
	public void setFilm_id(String film_id) {
		this.film_id = film_id;
	}
	public String getFilm_title() {
		return film_title;
	}
	public void setFilm_title(String film_title) {
		this.film_title = film_title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	public String getRental_rate() {
		return rental_rate;
	}
	public void setRental_rate(String rental_rate) {
		this.rental_rate = rental_rate;
	}
	
	
	
}
