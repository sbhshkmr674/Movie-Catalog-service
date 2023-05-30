package com.subhash.moviecatalogservice.model;

import java.util.List;

public class MovieSummary {

	private List<Movie> movie;
    private String title;
    private String overview;
	public MovieSummary() {
		super();
	}
	public MovieSummary(List<Movie> movie, String title, String overview) {
		super();
		this.movie = movie;
		this.title = title;
		this.overview = overview;
	}
	public List<Movie> getMovie() {
		return movie;
	}
	public void setMovie(List<Movie> movie) {
		this.movie = movie;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
}
