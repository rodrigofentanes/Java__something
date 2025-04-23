package br.com.fentanes.nomeDoProjeto.pacoteGeralDeTestes;

import java.util.ArrayList;
import com.google.gson.Gson;
// import com.fasterxml.jackson.core.JsonProcessingException;
// import com.fasterxml.jackson.databind.ObjectMapper;

public class ResponseSearchMovieTO {
  public class Result{
    public boolean adult;
    public String backdrop_path;
    public ArrayList<Integer> genre_ids;
    public int id;
    public String original_language;
    public String original_title;
    public String overview;
    public double popularity;
    public String poster_path;
    public String release_date;
    public String title;
    public boolean video;
    public double vote_average;
    public int vote_count;
  }

  public class Root{
    public int page;
    public ArrayList<Result> results;
    public int total_pages;
    public int total_results;
  }

  public ResponseSearchMovieTO parse(String json) {
    // ObjectMapper objectMapper = new ObjectMapper();
    // ResponseSearchMovieTO data = objectMapper.readValue(json, ResponseSearchMovieTO.class);
    // return (ResponseSearchMovieTO) data;

    // // OU

    // ResponseSearchMovieTO data = new ObjectMapper().readValue(json, ResponseSearchMovieTO.class);
    // return (ResponseSearchMovieTO) data;

    // // OU

    // Gson gson = new Gson(); // Or use new GsonBuilder().create();
    // ResponseSearchMovieTO data = gson.fromJson(json, ResponseSearchMovieTO.class); // deserializes json into "data"
    
    // // OU

    ResponseSearchMovieTO data = new Gson().fromJson(json, ResponseSearchMovieTO.class);
    return (ResponseSearchMovieTO) data;
  }
}
