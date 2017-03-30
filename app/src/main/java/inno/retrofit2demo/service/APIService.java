package inno.retrofit2demo.service;

import inno.retrofit2demo.model.DataAPI;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by nam on 24/03/2017.
 */

public interface APIService {
    @GET("getNodeAll")
    Call<DataAPI> loadData();
}
