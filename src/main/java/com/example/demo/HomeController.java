package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    DirectorRepository directorRepository;

    @RequestMapping("/")
    public String index(Model model){
        Director director = new Director();

        director.setName("Stephen Bullock");
        director.setGenre("Sci Fi");

        Movie movie = new Movie();
        movie.setTitle("DeathStar Eworks");
        movie.setYear(2011);
        movie.setDescription("About Eworks on the DeathStar...");
        movies.add(movie);
        director.setMovies(movies);
    }
}
