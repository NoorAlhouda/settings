package com.example.settingsapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class SettingAdapter extends RecyclerView.Adapter<SettingAdapter.MyViewHolder> {
    ArrayList<SettingsModel> mList;
    Context mContext;
        OnCatClick onCatClick;
    SettingsFragment fragment;





    public SettingAdapter(ArrayList<SettingsModel> mList, OnCatClick onCatClick) {
        this.mList = mList;
        this.mContext = mContext;
        this.onCatClick=onCatClick;
        this.fragment = fragment;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.settings_item, parent, false);
        SettingAdapter.MyViewHolder myViewHolder = new SettingAdapter.MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.mSettText.setText(mList.get(position).getSettText());
//        Glide.with(mContext).load(mList.get(position).SettImage).into(holder.mSettImage);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0)
                    onCatClick.onItemClick("0");
//                mContext.startActivity(new Intent(mContext, editProfileActivity.class)
//                        .putExtra("itemName", mList.get(position).getSettText()));
       else    if (position == 1)
                    onCatClick.onItemClick("1");
//                mContext.startActivity(new Intent(mContext, LnguageFragment.class)
//                        .putExtra("itemName", mList.get(position).getSettText()));
                else    if (position == 2)
                    onCatClick.onItemClick("2");
            }
        });
    }
    @Override
    public int getItemCount() {
        return mList.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mSettText;
        ImageView mSettImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mSettText = itemView.findViewById(R.id.settings_text);
            mSettImage = itemView.findViewById(R.id.settings_image);
        }
    }
    public interface OnCatClick {
        void onItemClick(String catNum);

    }
}