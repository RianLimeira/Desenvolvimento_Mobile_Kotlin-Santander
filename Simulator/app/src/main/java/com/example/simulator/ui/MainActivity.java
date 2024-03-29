package com.example.simulator.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.simulator.R;
import com.example.simulator.data.MatchesApi;
import com.example.simulator.databinding.ActivityMainBinding;
import com.example.simulator.domain.Match;
import com.example.simulator.ui.adapter.MatchAdapterJAVA;
import com.google.android.material.snackbar.Snackbar;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MatchesApi matchesApi;
    private MatchAdapterJAVA matchesAdapter = new MatchAdapterJAVA(Collections.EMPTY_LIST);

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
                .baseUrl("https://rianlimeira.github.io/matches-simulator-api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        matchesApi = retrofit.create(MatchesApi.class);
    }

    private void setupMatchesList() {
        /* TODO LISTAR AS PARTIDAS, CONSUMINDO API */
        binding.rvMatches.setHasFixedSize(true);
        binding.rvMatches.setLayoutManager(new LinearLayoutManager(this));

        binding.rvMatches.setAdapter(matchesAdapter);
        findMatchesFromApi();

    }

    private void setupMatchesRefresh() {
        /* TODO: ATUALIZAR AS PARTIDAS NA A&Ccedil;&Atilde;O DE SWIPE */
        binding.srlMatches.setOnRefreshListener(this::findMatchesFromApi);
    }

    private void setupFloatingActionButton() {
        /* TODO: CRIAR EVENTO DE CLICK E SIMULÇÃO */
        binding.fabSimulator.setOnClickListener(view -> {
            view.animate().rotationBy(360).setDuration(500).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationCancel(Animator animation) {
                    /* TODO Implementar o algoritimo de simulação de partidas */
                    Random random = new Random();
                    for (int i = 0; i< matchesAdapter.getItemCount(); i++){
                        Match match = matchesAdapter.getMatches().get(i);
                        match.getHomeTeam().setScore(random.nextInt(match.getHomeTeam().getStars() +1));
                        match.getAwayTeam().setScore(random.nextInt(match.getAwayTeam().getStars() +1));
                        matchesAdapter.notifyItemChanged(i);
                    }
                }
            });
            //Teste para crashlystics, forçando parada
            //throw new RuntimeException("Teste Crash");
        });
    }

    private void showErrorManager() {
        Snackbar.make(binding.fabSimulator, R.string.error_api, Snackbar.LENGTH_LONG).show();
    }

    private void findMatchesFromApi() {
        binding.srlMatches.setRefreshing(true);
        matchesApi.getMatches().enqueue(new Callback<List<Match>>() {
            @Override
            public void onResponse(@NonNull Call<List<Match>> call, @NonNull Response<List<Match>> response) {
                if (response.isSuccessful()){
                    List<Match> matches = response.body();
                    matchesAdapter = new MatchAdapterJAVA(matches);
                    binding.rvMatches.setAdapter(matchesAdapter);
                }
                else {
                    showErrorManager();
                }
                binding.srlMatches.setRefreshing(false);
            }

            @Override
            public void onFailure(@NonNull Call<List<Match>> call, @NonNull Throwable t) {
                showErrorManager();
                binding.srlMatches.setRefreshing(false);
            }
        });
    }
}
