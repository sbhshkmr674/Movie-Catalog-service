package com.subhash.moviecatalogservice.model;

public class CatalogItem {

	private String movieId;
	private String name;
	private String descreption;
	public CatalogItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CatalogItem(String movieId,String descreption) {
		super();
		this.movieId = movieId;
		this.descreption = descreption;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescreption() {
		return descreption;
	}
	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}
}
