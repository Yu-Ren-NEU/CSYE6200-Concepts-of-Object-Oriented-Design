package edu.neu.csye6200;

public class Movie {
	private int MovieId;
	private String MovieName;
	private String MovieClass;
	private String MovieActors;
	private String MovieDescription;
	private String MoviePicture;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(String movieName, String movieClass, String movieActors, String movieDescription,
			String moviePicture) {
		super();
		MovieName = movieName;
		MovieClass = movieClass;
		MovieActors = movieActors;
		MovieDescription = movieDescription;
		MoviePicture = moviePicture;
	}
	public Movie(int movieId, String movieName, String movieClass, String movieActors, String movieDescription,
			String moviePicture) {
		super();
		MovieId = movieId;
		MovieName = movieName;
		MovieClass = movieClass;
		MovieActors = movieActors;
		MovieDescription = movieDescription;
		MoviePicture = moviePicture;
	}
	public Movie(String csvdata) {
		super();
		String[] fields = csvdata.split("/");
		int movieId = new Integer(fields[0]);
		String movieName = fields[1];
		String movieClass = fields[2];
		String movieActors = fields[3];
		String movieDescription = fields[4];
		String moviePicture = fields[5];
		MovieId = movieId;
		MovieName = movieName;
		MovieClass = movieClass;
		MovieActors = movieActors;
		MovieDescription = movieDescription;
		MoviePicture = moviePicture;
	}
	public int getMovieId() {
		return MovieId;
	}
	public void setMovieId(int movieId) {
		MovieId = movieId;
	}
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
	public String getMovieClass() {
		return MovieClass;
	}
	public void setMovieClass(String movieClass) {
		MovieClass = movieClass;
	}
	public String getMovieActors() {
		return MovieActors;
	}
	public void setMovieActors(String movieActors) {
		MovieActors = movieActors;
	}
	public String getMovieDescription() {
		return MovieDescription;
	}
	public void setMovieDescription(String movieDescription) {
		MovieDescription = movieDescription;
	}
	public String getMoviePicture() {
		return MoviePicture;
	}
	public void setMoviePicture(String moviePicture) {
		MoviePicture = moviePicture;
	}
	@Override
	public String toString() {
		return "Movie [#" + MovieId + "  " + MovieName + "  " + MovieClass + "]" + "\n" + MovieActors + "\n" + MovieDescription + "\n" + MoviePicture;
	}
	
}
