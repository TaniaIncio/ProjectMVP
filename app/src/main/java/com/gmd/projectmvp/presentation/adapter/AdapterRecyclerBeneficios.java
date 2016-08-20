package com.gmd.projectmvp.presentation.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gmd.projectmvp.R;

/**
 * Created by tincio on 22/07/2016.
 */
public class AdapterRecyclerBeneficios extends RecyclerView.Adapter<AdapterRecyclerBeneficios.ViewHolderItem> {

    String[] arrayString;

    public AdapterRecyclerBeneficios(String[] arrayString){
        this.arrayString = arrayString;
    }
    @Override
    public ViewHolderItem onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_recycler_beneficios, parent, false);
        ViewHolderItem viewHolder = new ViewHolderItem(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolderItem holder, int position) {
        holder.txtItemRecycler.setText(arrayString[position]);
    }

    @Override
    public int getItemCount() {
        return arrayString.length;
    }

    public class ViewHolderItem extends RecyclerView.ViewHolder {

        TextView txtItemRecycler;
        public ViewHolderItem(View itemView) {
            super(itemView);
            txtItemRecycler = (TextView)itemView.findViewById(R.id.txt_row_beneficios);
        }
    }

}
