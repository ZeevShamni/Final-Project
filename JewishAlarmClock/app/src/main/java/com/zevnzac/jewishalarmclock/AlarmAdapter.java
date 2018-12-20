package com.zevnzac.jewishalarmclock;


//import android.support.annotation.NonNull;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AlarmAdapter extends RecyclerView.Adapter<AlarmAdapter.AlarmViewHolder> {

    private ArrayList<AlarmCardView> mAlarmList;

    public static class AlarmViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView mTimeview, mSecondaryView;

        public AlarmViewHolder(/*@NonNull*/ View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.alarmIconView);
            mTimeview = itemView.findViewById(R.id.alarmTimeView);
            mSecondaryView = itemView.findViewById(R.id.alarmSecondaryView);
        }
    }

    public AlarmAdapter(ArrayList<AlarmCardView> alarmList) {
        mAlarmList = alarmList;
    }

    //    @NonNull
    @Override
    public AlarmViewHolder onCreateViewHolder(/*@NonNull*/ ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.alarm_card_view, viewGroup, false);
        AlarmViewHolder avl = new AlarmViewHolder(v);
        return avl;
    }

    @Override
    public void onBindViewHolder(/*@NonNull*/ AlarmViewHolder alarmViewHolder, int i) {
        AlarmCardView currentAlarm = mAlarmList.get(i);
        alarmViewHolder.mImageView.setImageResource(currentAlarm.getImageResource());
        alarmViewHolder.mTimeview.setText(currentAlarm.getTime());
        alarmViewHolder.mSecondaryView.setText(currentAlarm.getSecondary());
    }

    @Override
    public int getItemCount() {
        return mAlarmList.size();
    }
}
