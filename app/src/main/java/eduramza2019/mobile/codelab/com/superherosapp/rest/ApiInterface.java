package eduramza2019.mobile.codelab.com.superherosapp.rest;

import eduramza2019.mobile.codelab.com.superherosapp.model.Hero;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    //get hero
    @GET("{api_key}/{id}")
    Call<Hero> getHeroById(@Path("api_key") String api_key, @Path("id") int id);

    //get powerstats
    @GET("{id}/powerstats")
    Call<Hero> getHeroPowerstats(@Query("api_key") String api_key, @Path("id") int id );
}
