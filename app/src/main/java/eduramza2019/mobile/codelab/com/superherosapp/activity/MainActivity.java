package eduramza2019.mobile.codelab.com.superherosapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import eduramza2019.mobile.codelab.com.superherosapp.R;
import eduramza2019.mobile.codelab.com.superherosapp.adapter.HeroesAdapter;
import eduramza2019.mobile.codelab.com.superherosapp.commons.Constants;
import eduramza2019.mobile.codelab.com.superherosapp.model.Hero;
import eduramza2019.mobile.codelab.com.superherosapp.rest.ApiClient;
import eduramza2019.mobile.codelab.com.superherosapp.rest.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    public List<Hero> heroList;
    public HeroesAdapter mAdapter;
    public ApiInterface apiService;
    public RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing recyclerView and Adapter
        init();
        callingAPI();
    }

    public void init(){
        heroList = new ArrayList<>();
        apiService = ApiClient.getClient().create(ApiInterface.class);
        mRecyclerView = findViewById(R.id.recycler_heroes);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //Config adapter
        mAdapter = new HeroesAdapter(heroList, R.layout.list_item_heroes, getApplicationContext());
        mRecyclerView.setAdapter(mAdapter);


    }

    public void callingAPI(){

        for (int i = 1; i < Constants.TAM_MAX; i++){
            Call<Hero> call = apiService.getHeroById( Constants.API_KEY, i);
            call.enqueue(new Callback<Hero>() {
                @Override
                public void onResponse(Call<Hero> call, Response<Hero> response) {
                    if (response.code() == 200 && response.body().getId() != null){
                        heroList.add(response.body());
                    } else {
                        return;
                    }
                    mAdapter.notifyDataSetChanged();

                    //Log.d(TAG, "Hero: " + heroes);
                }

                @Override
                public void onFailure(Call<Hero> call, Throwable t) {
                    Log.e(TAG, "HeroError: " + t.toString());
                }
            });
        }
    }
}
