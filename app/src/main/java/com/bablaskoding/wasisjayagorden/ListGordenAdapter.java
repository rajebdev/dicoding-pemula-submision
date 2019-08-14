package com.bablaskoding.wasisjayagorden;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListGordenAdapter extends RecyclerView.Adapter<ListGordenAdapter.ListViewHolder> {
    private ArrayList<Gorden> listGorden;

    public ListGordenAdapter(ArrayList<Gorden> list){
        this.listGorden = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_gorden, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Gorden gorden = listGorden.get(position);

        Glide.with(holder.itemView.getContext())
                .load(gorden.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvType.setText(gorden.getType());
        holder.tvPrice.setText(gorden.getPrice());
        holder.tvRating.setText("Rating : " +gorden.getRating());

        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(holder.itemView.getContext(), listGorden.get(holder.getAdapterPosition()).getType(), Toast.LENGTH_SHORT).show();
                Intent detailIntent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                detailIntent.putExtra(DetailActivity.EXTRA_TYPE, listGorden.get(holder.getAdapterPosition()).getType());
                detailIntent.putExtra(DetailActivity.EXTRA_PRICE, listGorden.get(holder.getAdapterPosition()).getPrice());
                detailIntent.putExtra(DetailActivity.EXTRA_PHOTO, listGorden.get(holder.getAdapterPosition()).getPhoto());
                detailIntent.putExtra(DetailActivity.EXTRA_RATING, listGorden.get(holder.getAdapterPosition()).getRating());
                holder.itemView.getContext().startActivity(detailIntent);
            }
        });

        holder.btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Your " +listGorden.get(holder.getAdapterPosition()).getType() + " Ordered Complete", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listGorden.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvType, tvPrice, tvRating;
        Button btnDetail, btnOrder;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvType = itemView.findViewById(R.id.tv_item_type);
            tvPrice = itemView.findViewById(R.id.tv_item_price);
            tvRating = itemView.findViewById(R.id.tv_item_rating);
            btnDetail = itemView.findViewById(R.id.detail_btn);
            btnOrder = itemView.findViewById(R.id.order_btn);
        }
    }
}
