package com.tomtom.work.workbus.route;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;
import com.tomtom.work.workbus.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class RouteStepViewHolder extends ChildViewHolder {

    @Bind(R.id.child_list_item_step_title)
    TextView routeStepTitle;

    @Bind(R.id.child_list_item_step_descr)
    TextView routeStepDescr;

    @Bind(R.id.child_list_item_step_time)
    TextView routeStepTime;

    public RouteStepViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
