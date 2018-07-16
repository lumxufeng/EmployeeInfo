package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16043921 on 16/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{
    Context parent_context;
    int layout_id;
    ArrayList<EmployItem> employList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<EmployItem> objects) {

        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        employList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout_id, parent, false);
        }


        TextView tvName = convertView.findViewById(R.id.textViewName);
        TextView tvTitle = convertView.findViewById(R.id.textViewTitle);
        TextView tvSalary = convertView.findViewById(R.id.textViewSalary);

        EmployItem currentItem = employList.get(position);
        String title = currentItem.getTitle();
        String name = currentItem.getName();
        Float salary = currentItem.getSalary();

        tvName.setText(name);
        tvTitle.setText(title);
        tvSalary.setText(salary+"");


        return convertView;
    }
}
