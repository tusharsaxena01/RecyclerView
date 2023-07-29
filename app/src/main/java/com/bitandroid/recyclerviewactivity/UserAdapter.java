package com.bitandroid.recyclerviewactivity;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import com.bitandroid.recyclerviewactivity.databinding.LtImageBinding;
import com.bitandroid.recyclerviewactivity.databinding.LtUserBinding;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    Context context;
    ArrayList<UserData> userList;

    // Step 5. Create constructor
    public UserAdapter(Context context, ArrayList<UserData> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // Step 8. Inflate layout to binding class
        LtUserBinding binding = LtUserBinding.inflate(LayoutInflater.from(context), null, false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        // Step 9. Set data to layout
        UserData data = userList.get(position);

        holder.binding.tvName.setText(data.name);
        holder.binding.tvEmail.setText(data.email);

        holder.binding.ivAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(context, "Item Clicked "+data.name, Toast.LENGTH_SHORT).show();
                showDialog(data);
            }

        });
        
        Glide.with(context)
                .load(data.image)
                .into(holder.binding.ivAvatar);

    }

    private void showDialog(UserData data) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        LtImageBinding ltImageBinding = LtImageBinding.inflate(LayoutInflater.from(context));

        Glide.with(context)
                        .load(data.image)
                                .into(ltImageBinding.ivImage);

        builder.setView(ltImageBinding.getRoot());

        builder.create().show();
    }

    @Override
    public int getItemCount() {
        // Step 10. set data count
        return userList.size();
    }

    // Step 1. Create class by extending RecyclerView.ViewHolder
    static class ViewHolder extends RecyclerView.ViewHolder{
        // Step 6. Declare binding variable
        LtUserBinding binding;

        // Step 2. Create constructor matching super (Change view to Binding class name)
        public ViewHolder(@NonNull LtUserBinding binding) {

            super(binding.getRoot());

            // Step 7. Assign binding variable
            this.binding = binding;
        }
    }

}
