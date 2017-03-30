package inno.retrofit2demo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import inno.retrofit2demo.R;
import inno.retrofit2demo.model.DataAPI;
import inno.retrofit2demo.service.APIService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tvResult)
    TextView tvWeather;

    APIService apiService;
    public static final String BASE_URL = "http://hqls.innogroup.vn/api/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    void initUI(){
        ButterKnife.bind(this);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        apiService = retrofit.create(APIService.class);
        loadData();
    }

    void loadData(){
        Call<DataAPI> call = apiService.loadData();
        call.enqueue(new Callback<DataAPI>() {
            @Override
            public void onResponse(Call<DataAPI> call, Response<DataAPI> response) {
                DataAPI dataAPI = response.body();
                displayWeather(dataAPI);
            }

            @Override
            public void onFailure(Call<DataAPI> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Can't connect", Toast.LENGTH_LONG).show();
            }
        });
    }

    void displayWeather(DataAPI dataAPI){
        if (dataAPI != null){
            tvWeather.setText(dataAPI.getListTinh().get(0).getTinh().getTen());
        }
    }

}
