package com.example.sdc.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    int[] imgId;
    String[] strNames;
    Context cnt;

    public MyAdapter(MainActivity mainActivity, int[] imagesId, String[] stringNames) {
        imgId = imagesId;
        strNames = stringNames;
        cnt = mainActivity;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(cnt).inflate(R.layout.list_tabs, parent, false);
        return new MyViewHolder(v);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(strNames[position]);
        holder.img.setImageResource(imgId[position]);
    }

    @Override
    public int getItemCount() {
        return strNames.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.list_title);
            img = (ImageView) itemView.findViewById(R.id.list_img);
            
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(cnt, textView.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            });
            
        }
    }
}
