package googleplayservices.samples.android.com.whitney.sparepartsadvisor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Catalogue extends AppCompatActivity {

    ListView list;
    String [] spareparts = {"Bearings", "Bolts and Nuts","Seals and Gearboxes","Axle"};
    String [] desc = {"For all your bearing needs go to Rockfield Engineering.They offer a wide range of selection of bearings and other spareparts solutions. Visit them at number 12 Bristol Road, Workington or contact them on 0772260937"};
    Integer [] imgid = {R.drawable.bearing, R.drawable.bolts, R.drawable.seals, R.drawable.axle};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogue);

          list = (ListView) findViewById(R.id.list);
          CustomListView customListView = new CustomListView(this,spareparts,desc,imgid);
          list.setAdapter(customListView);
    }

}
