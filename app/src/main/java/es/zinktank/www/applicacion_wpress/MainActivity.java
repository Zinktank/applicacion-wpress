package es.zinktank.www.applicacion_wpress;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends ListActivity implements Callback<StackOverflowQuestions> {


    private RecyclerView recyclerView;
    private ArrayList<AndroidVersion> data;
    private DataAdapter adapter;

    // Primero se inicializan las vistas
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        requestWindowFeature(Window.FEATURE_PROGRESS);
        ArrayAdapter<Question> arrayAdapter =
                new ArrayAdapter<Question>(this,
                        android.R.layout.simple_list_item_1,
                        android.R.id.text1,
                        new ArrayList<Question>());

        setListAdapter(arrayAdapter);
        setProgressBarIndeterminateVisibility(true);
        setProgressBarVisibility(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
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
                    .baseUrl("https://api.stackexchange.com")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            //Carga la informacion JSON
            StackOverflowAPI request = retrofit.create(StackOverflowAPI.class);
            StackOverflowAPI StackOverflowAPI = retrofit.create(StackOverflowAPI.class);

            Call<StackOverflowQuestions> call = StackOverflowAPI.loadQuestions("android");
            //asynchronous call

            call.enqueue(new Callback<StackOverflowQuestions>() {
                @Override
                public void onResponse(Call<StackOverflowQuestions> call, Response<StackOverflowQuestions> response) {
                    setProgressBarIndeterminateVisibility(false);
                    ArrayAdapter<Question> adapter = (ArrayAdapter<Question>) getListAdapter();
                    adapter.clear();
                    adapter.addAll(response.body().items);
                }

                @Override
                public void onFailure(Call<StackOverflowQuestions> call, Throwable t) {
                    Toast.makeText(MainActivity.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        return true;
    }

    @Override
    public void onResponse(Call<StackOverflowQuestions> call, Response<StackOverflowQuestions> response) {

    }

    @Override
    public void onFailure(Call<StackOverflowQuestions> call, Throwable t) {

    }
}
