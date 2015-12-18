package jaffa.presidents;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by libby on 10/22/2015.
 */
public class PresidentRecycleViewAdapter extends RecyclerView.Adapter<PresidentViewHolder>{

    private final OnPresidentSelectedListener listener;
    private final President[] presidents;

    public PresidentRecycleViewAdapter(President[] presidents, OnPresidentSelectedListener onClickListener){
        this.presidents = presidents;
        this.listener = onClickListener;
    }

    @Override
    public PresidentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.president_list_item, parent, false);

        return new PresidentViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final PresidentViewHolder holder, final int position) {
        holder.bind(presidents[position]);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onSelect(presidents, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return presidents.length;
    }
}
