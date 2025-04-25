
package com.pes.movies.servlet;

import com.pes.movies.entity.MovieEntity;
import com.pes.movies.repo.MovieRepo;
import com.pes.movies.repo.MovieRepoimpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet(urlPatterns="/save")

    public class MobileSaveServlet extends HttpServlet {
        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            MovieEntity entity=new MovieEntity();
            entity.setMovieName(req.getParameter("movieName"));
            entity.setMovieHero(req.getParameter("heroName"));
            entity.setLanguage(req.getParameter("heroinName"));
            entity.setMovieHeroine(req.getParameter("language"));
            entity.setReleaseDate(LocalDate.parse(req.getParameter("releaseDate")));

            MovieRepo repo=new MovieRepoimpl();
            repo.saveMovie(entity);

            PrintWriter respwriter =resp.getWriter();
            respwriter.print(entity.getMovieName()+": Movie saved..!");

            super.doPost(req, resp);
        }
    }
