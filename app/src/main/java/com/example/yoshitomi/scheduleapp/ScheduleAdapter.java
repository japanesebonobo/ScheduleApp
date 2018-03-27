package com.example.yoshitomi.scheduleapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import io.realm.RealmResults;

/**
 * Created by yoshitomi on 3/27/2018.
 */

public class ScheduleAdapter extends RealmBaseAdapter<Schedule> {

    private static class ViewHolder {
        TextView date;
        TextView title;
    }

    public ScheduleAdapter(Context context, RealmResults<Schedule> realmResults, boolean automaticUpdate) {
        super(context, realmResults, automaticUpdate);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = inflater.inflate(

            )
        }
    }
}
