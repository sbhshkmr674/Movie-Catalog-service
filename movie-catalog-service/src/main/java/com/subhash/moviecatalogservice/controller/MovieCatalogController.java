package com.subhash.moviecatalogservice.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.subhash.moviecatalogservice.model.Movie;
import com.subhash.moviecatalogservice.model.CatalogItem;
import com.subhash.moviecatalogservice.model.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {
	
	@Autowired
	private RestTemplate theRestTemplate;
	
	@GetMapping("/")
	public String displayString() {
		
		return "Hey! Subhash : How are you?";
	}
	
	@GetMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
		
		UserRating ratings=theRestTemplate.getForObject("http://ratings-data-service/ratingsdata/users/"+userId, UserRating.class);
		
		return ratings.getRatingList()
				.stream()
				.map(rating->{
					Movie theMovie=theRestTemplate.getForObject("http://movie-info-service/movies/"+rating.getMovieId(), Movie.class);
				
					return new CatalogItem(theMovie.getMovieId(),theMovie.getOverview());
				})
				.collect(Collectors.toList());
			
	}
}
