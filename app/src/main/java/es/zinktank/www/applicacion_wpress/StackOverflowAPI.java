package es.zinktank.www.applicacion_wpress;

/**
 * Created by pablo on 22/09/2016.
 */

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface StackOverflowAPI {
    @GET("/wp-json/wp/v2/posts")
    Call<List<Post>> loadQuestions();
}
