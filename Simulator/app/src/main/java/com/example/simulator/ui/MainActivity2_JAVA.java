package com.example.simulator.ui;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.example.simulator.R;
import com.example.simulator.data.MatchesApi;
import com.example.simulator.databinding.ActivityMainBinding;
import com.example.simulator.domain.Match;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;
import java.util.logging.ErrorManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

class MainActivity2 extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MatchesApi matchesApi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupHttpClient();
        setupMatchesList();
        setupMatchesRefresh();
        setupFloatingActionButton();
    }


    private void setupHttpClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://digitalinnovationone.github.io/matches-simulator-api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        matchesApi = retrofit.create(MatchesApi.class);
    }

    private void setupMatchesList() {
        //TODO LISTAR AS PARTIDAS, CONSUMINDO API
        matchesApi.getMatches().enqueue(new Callback<List<Match>>() {
            @Override
            public void onResponse(Call<List<Match>> call, Response<List<Match>> response) {
                if (response.isSuccessful()){
                    List<Match> matches = response.body();
                    Log.i("SIMULATOR", "Deu tudo certo! Partidas = "+ matches.size());
                }
                else {
                    showErrorManager();
                }
            }

            @Override
            public void onFailure(Call<List<Match>> call, Throwable t) {
                showErrorManager();
            }
        });

    }


    private void setupMatchesRefresh() {
        //TODO: ATUALIZAR AS PARTIDAS NA AÇÃO DE SWIPE
    }

    private void setupFloatingActionButton() {
        //TODO: CRIAR EVENTO DE CLICK E SIMULÇÃO
    }

    private void showErrorManager() {
        Snackbar.make(binding.fabSimulator, R.string.error_api, Snackbar.LENGTH_LONG).show();
    }
}