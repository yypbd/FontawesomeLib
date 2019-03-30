package com.yypbd.fontawesomelibsample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yypbd.fontawesomelib.FontawesomeLib;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class IconAdapter extends RecyclerView.Adapter<IconAdapter.MyViewHolder> {
    private FontawesomeLib.FontType mFontType;
    private ArrayList<IconItem> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView textViewIcon;
        public TextView textViewName;

        public MyViewHolder(View view) {
            super(view);

            textViewIcon = view.findViewById(R.id.textViewIcon);
            textViewName = view.findViewById(R.id.textViewName);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public IconAdapter(FontawesomeLib.FontType fontType, ArrayList<IconItem> myDataset) {
        mFontType = fontType;
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public IconAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_icon, parent, false);

        MyViewHolder vh = new MyViewHolder(view);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element

        // holder.textViewIcon.setText(mDataset.get(position).icon);
        holder.textViewName.setText(mDataset.get(position).name);
        FontawesomeLib.getInstance().setIcon(mFontType, mDataset.get(position).name, holder.textViewIcon);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
