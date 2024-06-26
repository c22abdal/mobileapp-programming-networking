package com.example.networking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>  {
    private ArrayList<Mountain> mountainList;
    private LayoutInflater layoutInflater;
    private onClickListener onClickListener;

    RecyclerViewAdapter(Context context, ArrayList<Mountain> items, onClickListener onClickListener) {
        this.layoutInflater = LayoutInflater.from(context);
        this.mountainList = items;
        this.onClickListener = onClickListener;
    }

    @Override
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(layoutInflater.inflate(R.layout.mountain, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nameTxt.setText(mountainList.get(position).getName());
        holder.locationTxt.setText(mountainList.get(position).getLocation());
        holder.heightTxt.setText(String.valueOf(mountainList.get(position).getHeight()));

    }

    @Override
    public int getItemCount() {
        return mountainList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView nameTxt;
        TextView locationTxt;
        TextView heightTxt;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTxt = itemView.findViewById(R.id.nameTxt);
            heightTxt = itemView.findViewById(R.id.heightTxt);
            locationTxt = itemView.findViewById(R.id.locationTxt);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onClickListener.onClick(mountainList.get(getAbsoluteAdapterPosition()));
        }
    }

    public interface onClickListener{
        void onClick(Mountain mountain);
    }
}
