package com.tomtom.work.workbus.route;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;
import com.tomtom.work.workbus.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class RouteViewHolder extends ParentViewHolder {


    @Bind(R.id.parent_route_title)
    TextView parentTitleTextView;

    @Bind(R.id.parent_list_item_expand_arrow)
    ImageButton dropDownArrow;
    /**
     * Default constructor.
     *
     * @param itemView
     *         The {@link View} being hosted in this ViewHolder
     */
    public RouteViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
