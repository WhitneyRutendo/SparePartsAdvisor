package googleplayservices.samples.android.com.whitney.sparepartsadvisor;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListView extends ArrayAdapter<String> {

    private String [] spareparts;
    private String [] desc;
    private Integer [] imgid;
    private Activity context;
    public CustomListView(Activity context,String [] spareparts, String [] desc, Integer [] imgid  ) {
        super(context, R.layout.spareparts, spareparts);

          this.context = context;
          this.spareparts = spareparts;
          this.desc = desc;
          this.imgid = imgid;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       View r = convertView;
         ViewHolder viewHolder = null;
         if(r==null)
         {

             LayoutInflater layoutInflater = context.getLayoutInflater();
             r = layoutInflater.inflate(R.layout.spareparts, null,true);
             viewHolder = new ViewHolder(r);
             r.setTag(viewHolder);
         }
         else{
             viewHolder = (ViewHolder) r.getTag();
         }
        viewHolder.ivw.setImageResource(imgid [position]);

         viewHolder.tvw1.setText(spareparts [position]);
         viewHolder.tvw2.setText(desc [position]);
        return r;
    }
    class ViewHolder
    {
        TextView tvw1;
        TextView tvw2;
        ImageView ivw;
        ViewHolder(View view)
        {
            tvw1 = (TextView) view.findViewById(R.id.tvspareparts);
            tvw2 = (TextView) view.findViewById(R.id.tvdescription);
            ivw = (ImageView) view.findViewById(R.id.imageView);
        }
    }

}
