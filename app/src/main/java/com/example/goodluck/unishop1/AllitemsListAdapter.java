package com.example.goodluck.unishop1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AllitemsListAdapter extends RecyclerView.Adapter <RecyclerView.ViewHolder>{
    private Context context;
    private ArrayList<AbstractModel> modelList;
    private AdapterView.OnItemClickListener mitemclickListenser;

    public  AllitemsListAdapter(Context context, ArrayList<AbstractModel> modelList){
        this.context = context;
        this.modelList = modelList;
    }

    public void updateList(ArrayList<AbstractModel> modelList){
        this.modelList = modelList;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_all_items,viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //Here you can fill your row view
        if (holder instanceof ViewHolder){
            final AbstractModel model = getItem(position);
            ViewHolder genericViewHolder = (ViewHolder) holder;

            genericViewHolder.mDescription.setText(model.getDescription());
            genericViewHolder.mPrice.setText(model.getPrice());
            genericViewHolder.imageSrc.setImageResource(model.getImageResourceId());
        }

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    private AbstractModel getItem(int position) {
        return modelList.get(position);
    }

    /**
     * this class helps to find the right view to display
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageSrc;
        TextView mDescription;
        TextView mPrice;

        public ViewHolder(View itemView) {
            super(itemView);

//            Find views to display in single list item
            this.imageSrc = itemView.findViewById(R.id.image_view);
            this.mDescription = itemView.findViewById(R.id.item_description);
            this.mPrice = itemView.findViewById(R.id.item_price);
        }
    }
}
