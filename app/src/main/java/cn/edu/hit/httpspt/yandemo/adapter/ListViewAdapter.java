package cn.edu.hit.httpspt.yandemo.adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import cn.edu.hit.httpspt.yandemo.R;

/**
 * Created by zqamar on 1/25/17.
 */


public class ListViewAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;

    public ListViewAdapter(Context context) {
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return 100;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        TextView view = new TextView(context);
//        view.setText(String.valueOf(position));
//        return view;

        View rowView = inflater.inflate(R.layout.list_item, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.list_view_tv);
        textView.setText(String.valueOf(position));
        return textView;
    }
}
