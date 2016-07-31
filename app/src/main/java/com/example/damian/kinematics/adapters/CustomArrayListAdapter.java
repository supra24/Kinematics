package com.example.damian.kinematics.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.damian.kinematics.R;

public class CustomArrayListAdapter extends ArrayAdapter<String> {

    String[] members;
    int[] images;
    final Context c;
    LayoutInflater inflater;

    public CustomArrayListAdapter(Context context, String[] members, int[] images) {
        super(context,R.layout.custom_list_view, members);

        this.c = context;
        this.members = members;
        this.images = images;
    }

    public class ListViewExample{
        ImageView img;
        TextView name;
    }

    public View getView(int position, View convertView, ViewGroup viewGroup) {

        if (convertView == null) {

            inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.custom_list_view, null);
        }

        // our ListViewExample object
        final ListViewExample listViewExample = new ListViewExample();

        // initialize our views
        listViewExample.img = (ImageView) convertView.findViewById(R.id.imgCustomView);
        listViewExample.name = (TextView) convertView.findViewById(R.id.txtCustomView);

        //assign data
        listViewExample.img.setImageResource(images[position]);
        listViewExample.name.setText(members[position]);

        return convertView;
    }
}
