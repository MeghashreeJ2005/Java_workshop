package com.pes.movies.repo;
import com.pes.movies.entity.MovieEntity;

import java.sql.*;

public class MovieRepoimpl implements MovieRepo {
        @Override
        public void saveMovie(MovieEntity entity) {

            String url="jdbc:mysql://localhost:3306/movieData";
            String userName="root";
            String password="8867678327";

            String query="insert into movie_info(movie_name, hero_Name, heroine_Name, language, release_date)" +
                    " values(?,?,?,?,?)";


            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection =DriverManager.getConnection(url, userName, password);
                PreparedStatement statement =connection.prepareStatement(query);
                //statement.setInt(1,entity.getMovieId());
                statement.setString(1,entity.getMovieName());
                statement.setString(2,entity.getMovieHero());
                statement.setString(3,entity.getMovieHeroine());
                statement.setString(4,entity.getLanguage());
                statement.setDate(5,Date.valueOf(entity.getReleaseDate()));

                statement.execute();

            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    @Override
    public void readMovies() {
        String url="jdbc:mysql://localhost:3306/movieData";
        String userName="root";
        String password="8867678327";

        String query="select * from movie_info";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection =DriverManager.getConnection(url, userName, password);
            PreparedStatement statement =connection.prepareStatement(query);

            ResultSet set= statement.executeQuery();
            while (set.next()){
                System.out.println(set.getInt("movie_id")+" "
                                 +set.getString("movie_name")+set.getDate("release_date"));
                System.out.println("");

            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

