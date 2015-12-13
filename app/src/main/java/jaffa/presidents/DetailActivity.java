package jaffa.presidents;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * Created by libby on 10/29/2015.
 */
public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_detail);

        PresidentDetailFragment  fragment = (PresidentDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detailFragment);

        President[] presidents = (President[]) getIntent().getSerializableExtra("PRESIDENTS");
        int position = getIntent().getIntExtra("POSITION", 0);

        fragment.showPresidentDetail(presidents, position);
    }


}
