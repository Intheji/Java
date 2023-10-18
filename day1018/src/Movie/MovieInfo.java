package Movie;

class Movie {
	private String title;
	
	public Movie(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}

public class MovieInfo {
	private Movie[] movies = {
			new Movie("영화1"),
			new Movie("영화2"),
			new Movie("영화3")
	};
	
	public void showMovies() {
		for (int i=0; i<movies.length; i++) {
			System.out.println((i + 1) + ". " + movies[i].getTitle());
			
		}
		
	}

	public Movie[] getMovies() {
		return movies;
	}

	public void setMovies(Movie[] movies) {
		this.movies = movies;
	}
	
	
}
