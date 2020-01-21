package com.myapp.login_template.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.myapp.login_template.R;
import com.myapp.login_template.model.model_example;

import java.util.List;

import butterknife.ButterKnife;


public class adapter_example extends RecyclerView.Adapter<adapter_example.HolderData> {

    private List<model_example> items;
    private Context ctx;

    public adapter_example(Context ctx, List<model_example> items) {
        this.ctx = ctx;
        this.items = items;
    }

    @Override
    public HolderData onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_example, parent, false);
        HolderData holder = new HolderData(layout);
        return holder;

    }

    @Override
    public void onBindViewHolder(final HolderData holder, int position) {
        final model_example dm = items.get(position);
        holder.dm = dm;
    }

    @Override
    public int getItemCount() {

        return items.size();
    }

    public class HolderData extends RecyclerView.ViewHolder {

//      @BindView(R.id.tv_textview)
//      TextView textview;

        model_example dm;

        public HolderData(View v) {
            super(v);
            ButterKnife.bind(this, itemView);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

        }


    }
}