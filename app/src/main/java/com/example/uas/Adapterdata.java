package com.example.uas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapterdata extends RecyclerView.Adapter<Adapterdata.HolderData>{
    List<String> listdata;
    LayoutInflater inflater;

    public Adapterdata(Context context,List<String> listdata) {
        this.listdata = listdata;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.desain_recyclerview,parent,false);
        return new HolderData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderData holder, int position) {
        holder.txtData.setText(listdata.get(position));
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class HolderData extends RecyclerView.ViewHolder{
        TextView txtData;
        public HolderData(@NonNull View itemView) {
            super(itemView);

            txtData = itemView.findViewById(R.id.dataText);
        }
    }

}
