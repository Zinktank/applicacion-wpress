package es.zinktank.www.applicacion_wpress;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private ArrayList<AndroidVersion> data;
    private DataAdapter adapter;

    // Primero se inicializan las vistas
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        loadJSON();
    }
    public boolean loadJSON() {
    /*private void initViews(){
        recyclerView = (RecyclerView)findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        loadJSON();
    }*/

        //Aqui carga las informaciones JSON

            Retrofit retrofit = new Retrofit.Builder()
                    //Esta es la web
                    .baseUrl("https://demo.wp-api.org")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            //Carga la informacion JSON
            StackOverflowAPI request = retrofit.create(StackOverflowAPI.class);
            StackOverflowAPI StackOverflowAPI = retrofit.create(StackOverflowAPI.class);

            Call<List<Post>> call = StackOverflowAPI.loadQuestions();
            /*Call<Posts> call = new Call<Posts>;
            call = RequestInterface.getJSON();*/
                //asynchronous call

            call.enqueue(new Callback<List<Post>>() {
                @Override
                public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                    final TextView textView = (TextView) findViewById(R.id.textView);
                    //adapter.addAll(response.body().items);
                    textView.setText(response.body().get(1).toString());
                }

                @Override
                public void onFailure(Call<List<Post>> call, Throwable t) {
                    final TextView textView = (TextView) findViewById(R.id.textView);
                    textView.setText("Something went wrong: " + t.getMessage());
                }
            });
        return true;
    }

}
