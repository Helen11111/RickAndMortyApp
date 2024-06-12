package com.example.rickandmortyapp;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.recyclerview.widget.LinearLayoutManager;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.rickandmortyapp.controller.APIController;
import com.example.rickandmortyapp.databinding.ActivityMainBinding;
import com.example.rickandmortyapp.model.CharactarData;
import com.example.rickandmortyapp.view.MyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    Handler handler;

    ArrayList<CharactarData> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.recycler.setLayoutManager(new LinearLayoutManager(this));

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                APIController controller = new APIController();
                data = controller.getAllCharacters();
                handler.sendEmptyMessage(0);
            }
        });

        handler = new Handler(new Handler.Callback() {
            @Override
            public boolean handleMessage(@NonNull Message msg) {
                binding.recycler.setAdapter(new MyAdapter(data));
                return false;
            }
        });
        thread.start();
    }
}