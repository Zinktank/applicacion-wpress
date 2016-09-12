package es.zinktank.www.applicacion_wpress;

/**
 * Created by pablo on 12/09/2016.
 */
import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

    @GET("android/jsonandroid")
    Call<JSONResponse> getJSON();
}