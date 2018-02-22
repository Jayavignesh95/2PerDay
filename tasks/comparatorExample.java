package tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie {
	String name;
	double rating;
	int year;

	public Movie(String name, double rating, int year) {
		this.name = name;
		this.rating = rating;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static Comparator<Movie> ratingCompare = new Comparator<Movie>() {
		public int compare(Movie m1, Movie m2) {
			return (int) (m1.getRating() - m2.getRating());
		}
	};

	public static Comparator<Movie> yearCompare = new Comparator<Movie>() {
		public int compare(Movie m1, Movie m2) {
			return -(m1.getYear() - m2.getYear());

		}
	};
}

public class comparatorExample {
	public static void main(String[] args) {
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		movieList.add(new Movie("Spider-Man ", 10.0, 2018));
		movieList.add(new Movie("Batman", 7.0, 2010));
		movieList.add(new Movie("Dunkrik", 8.0, 2016));

		Collections.sort(movieList, Movie.ratingCompare);
		System.out.println("Movies based on rating :\n");
		for (Movie m : movieList) {
			System.out.println(m.getName() + " : " + m.getYear() + " : " + m.getRating());
		}

		Collections.sort(movieList, Movie.yearCompare);
		System.out.println("\nMovie Based on Years :\n");
		for (Movie m : movieList) {
			System.out.println(m.getName() + " : " + m.getRating() + " : " + m.getYear());
		}
	}
}
