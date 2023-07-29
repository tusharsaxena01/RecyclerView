package com.bitandroid.recyclerviewactivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.bitandroid.recyclerviewactivity.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // 1. Create Data
        ArrayList<UserData> userData = new ArrayList<>();
        UserData user1 = new UserData("1",
                "Abhi Saxena",
                "saxena.abhi7007@gmail.com",
                "7007459349",
                "12345678",
                "https://lh3.googleusercontent.com/a/AAcHTtdTC63X7-JvUxhgGEMLOulgHZDFJaqin4uItJyVK14QGw=s288-c-no"
        );
        UserData user2 = new UserData("1",
                "Deepak Kumar",
                "rdeep@gmail.com",
                "8447516023",
                "12345678",
                "https://lh3.googleusercontent.com/a/AAcHTtdNaibgV-hrEFgXa6bdVW23bquo2PsFwGmXftcdghkzfIVH=s192-c-mo"
        );
        UserData user3 = new UserData("1",
                "Tushar Saxena",
                "tusharsaxena786786@gmail.com",
                "8447516023",
                "12345678",
                "https://lh3.googleusercontent.com/a/AAcHTtcz1AzKLiyCcC3qnVsqgTYTzpoumFsW_QaGsCaU1aJe-iI=s288-c-no"
        );

        userData.add(user1);
        userData.add(user1);
        userData.add(user2);
        userData.add(user3);


        // 2. Create Layout File


        // create adapter
        UserAdapter adapter = new UserAdapter(this, userData);

        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

//         GridLayoutManager manager = new GridLayoutManager(this, 2);

//         StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);

        binding.rvUsers.setLayoutManager(manager);

        binding.rvUsers.setAdapter(adapter);


    }

}
