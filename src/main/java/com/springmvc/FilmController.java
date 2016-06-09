package com.springmvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class FilmController {

	private FilmService filmService;

	public FilmService getFilmService() {
		return filmService;
	}

	@Autowired
	public void setFilmService(FilmService filmService) {
		this.filmService = filmService;
	}

	@RequestMapping("/")
	public String showFilmListPage(Map<String, Object> model) {
		model.put("films", getFilmService().fetchAllFilms());
		return "film_list";
	}

}
