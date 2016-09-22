package es.zinktank.www.applicacion_wpress;

/**
 * Created by pablo on 12/09/2016.
 */
import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

    //Esta es la direccion donde esta la info JSON en la web
    @GET("wp-json/wp/v2/posts")
    Call<Posts> getJSON();
}