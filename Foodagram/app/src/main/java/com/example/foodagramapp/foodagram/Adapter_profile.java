package com.example.foodagramapp.foodagram;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adapter_profile extends ArrayAdapter<Model_profile> {

    List<Model_profile> profileInfo = new ArrayList<>();
    Context context;

    Adapter_profile(Context context, int resource, List<Model_profile> objects){
        super(context, resource, objects);
        this.profileInfo = objects;
        this.context = context;

    }





    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View profileItem = LayoutInflater.from(context).inflate(R.layout.fragment_profile_item,parent,false);
        ImageView menuImage = profileItem.findViewById(R.id.menu_image);
        ImageView profileImage = profileItem.findViewById(R.id.post_user_image);
        TextView menuName = profileItem.findViewById(R.id.menu_name_post);
        TextView profileName  = profileItem.findViewById(R.id.post_profile_name);
        TextView postTime = profileItem.findViewById(R.id.post_timestamp);

        menuName.setText(profileInfo.get(position).getMenuName());

        profileName.setText(profileInfo.get(position).getProfileName());

        postTime.setText(profileInfo.get(position).getPostTime());




        return profileItem;
    }
}