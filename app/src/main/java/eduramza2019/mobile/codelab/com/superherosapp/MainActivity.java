package eduramza2019.mobile.codelab.com.superherosapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import eduramza2019.mobile.codelab.com.superherosapp.commons.Constants;
import eduramza2019.mobile.codelab.com.superherosapp.model.Hero;
import eduramza2019.mobile.codelab.com.superherosapp.rest.ApiClient;
import eduramza2019.mobile.codelab.com.superherosapp.rest.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Calling API
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<Hero> call = apiService.getHeroById( Constants.API_KEY, 644);
        call.enqueue(new Callback<Hero>() {
            @Override
            public void onResponse(Call<Hero> call, Response<Hero> response) {
                String hero = response.body().getName();
                Log.d(TAG, "Hero: " + hero);
            }

            @Override
            public void onFailure(Call<Hero> call, Throwable t) {
                Log.e(TAG, "Hero: " + t.toString());
            }
        });
    }
}
