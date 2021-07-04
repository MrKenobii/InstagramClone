package com.anilduyguc.instagramclone.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.anilduyguc.instagramclone.databinding.RecyclerRowBinding;
import com.anilduyguc.instagramclone.model.Post;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostHolder> {

    private final ArrayList<Post> postArrayList;

    public PostAdapter(ArrayList<Post> postArrayList){
        this.postArrayList=postArrayList;
    }

    @NonNull
    @Override
    public PostHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new PostHolder(recyclerRowBinding);



    }

    @Override
    public void onBindViewHolder(@NonNull PostAdapter.PostHolder holder, int position) {
        holder.recyclerRowBinding.recyclerViewUserEmailText.setText(postArrayList.get(position).geteMail());
        holder.recyclerRowBinding.recyclerViewCommentText.setText(postArrayList.get(position).getComment());
        Picasso.get().load(postArrayList.get(position).getDownloadUrl()).into(holder.recyclerRowBinding.recyclerViewImageView);
    }

    @Override
    public int getItemCount() {
        return postArrayList.size();
    }

    class PostHolder extends RecyclerView.ViewHolder{
        RecyclerRowBinding recyclerRowBinding;

        public PostHolder(RecyclerRowBinding recyclerRowBinding) {
            super(recyclerRowBinding.getRoot());
            this.recyclerRowBinding=recyclerRowBinding;
        }
    }
}
