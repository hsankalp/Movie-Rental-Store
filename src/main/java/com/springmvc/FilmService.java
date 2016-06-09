package com.springmvc;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FilmService {

	private FilmDao filmDao;

	public FilmDao getFilmDao() {
		return filmDao;
	}

	public void setFilmDao(FilmDao filmDao) {
		this.filmDao = filmDao;
	}

	public List<Film> fetchAllFilms() {
		return getFilmDao().selectAll();
	}
}