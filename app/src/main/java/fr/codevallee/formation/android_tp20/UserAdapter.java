package fr.codevallee.formation.android_tp20;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tgoudouneix on 18/10/2017.
 */

public class UserAdapter extends ArrayAdapter<User> {
    public UserAdapter(Context context, List<User> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_user, parent, false);
        }

        UserViewHolder viewHolder = (UserViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new UserViewHolder();
            viewHolder.name = (TextView) convertView.findViewById(R.id.name);
            viewHolder.company = (TextView) convertView.findViewById(R.id.company);
            viewHolder.age = (TextView) convertView.findViewById(R.id.age);
            viewHolder.active = (TextView) convertView.findViewById(R.id.active);
            viewHolder.picture = (ImageView) convertView.findViewById(R.id.picture);
            convertView.setTag(viewHolder);
        }

        User user = getItem(position);

        viewHolder.name.setText(user.getName());
        viewHolder.company.setText("(" + user.getCompany() + ")");
        viewHolder.age.setText(getContext().getString(R.string.age_pres) + " " + user.getAge().toString() + " " + getContext().getString(R.string.years));
        Boolean active = user.getActive();
        if (active) {
            viewHolder.active.setText(R.string.active);
            viewHolder.active.setTextColor(Color.GREEN);
        } else {
            viewHolder.active.setText(R.string.inactive);
            viewHolder.active.setTextColor(Color.RED);
        }
        viewHolder.picture.setImageDrawable(new ColorDrawable(Color.BLUE));

        return convertView;
    }

    private class UserViewHolder {
        public ImageView picture;
        public TextView name;
        public TextView company;
        public TextView age;
        public TextView active;
    }
}
