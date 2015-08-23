package test.chonlakant.com.parcelertest;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import org.parceler.Parcels;

import java.util.ArrayList;

public class ActivityTest extends AppCompatActivity {
    ArrayList<Model> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_test);

        Intent intent = getIntent();

        list = Parcels.unwrap(intent.getParcelableExtra("Object"));
        Log.e("Check", list.get(0).getName()+"");
        Log.e("Check", list.get(0).getLastName()+"");



    }


}
