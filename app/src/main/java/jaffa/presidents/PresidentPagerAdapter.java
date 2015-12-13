package jaffa.presidents;

import android.graphics.drawable.Drawable;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by libby on 10/29/2015.
 */
public class PresidentPagerAdapter extends PagerAdapter {

    private President[] presidents;

    public PresidentPagerAdapter(President[] presidents){
        this.presidents = presidents;
    }

    @Override
    public int getCount(){
        return presidents.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        /*will create a    given a container and a position*/

        LayoutInflater inflater = LayoutInflater.from(container.getContext());
        View view = inflater.inflate(R.layout.president_pager_item, null);

        int[] pictures = new int[] {
                (R.drawable.georgewashington),
                (R.drawable.johnadams),
                (R.drawable.thomasjefferson),
                (R.drawable.jamesmadison),
                (R.drawable.jamesmonroe),
                (R.drawable.johnquincyadams),
                (R.drawable.andrewjackson),
                (R.drawable.martinvanburen),
                (R.drawable.williamhenryharrison),
                (R.drawable.johntyler),
                (R.drawable.jameskpolk),
                (R.drawable.zacharytaylor),
                (R.drawable.millardfillmore),
                (R.drawable.franklinpierce),
                (R.drawable.jamesbuchanan),
                (R.drawable.abrahamlincoln),
                (R.drawable.andrewjohnson),
                (R.drawable.ulyssessgrant),
                (R.drawable.rutherfordbhayes),
                (R.drawable.jamesagarfield),
                (R.drawable.chesteraarthur),
                (R.drawable.grovercleveland),
                (R.drawable.benjaminharrison),
                (R.drawable.grovercleveland),
                (R.drawable.williammckinley),
                (R.drawable.theodoreroosevelt),
                (R.drawable.williamhowardtaft),
                (R.drawable.woodrowwilson),
                (R.drawable.warrengharding),
                (R.drawable.calvincoolidge),
                (R.drawable.herberthoover),
                (R.drawable.franklindroosevelt),
                (R.drawable.harrystruman),
                (R.drawable.dwightdeisenhower),
                (R.drawable.johnfkennedy),
                (R.drawable.lyndonbjohnson),
                (R.drawable.richardmnixon),
                (R.drawable.geraldrford),
                (R.drawable.jimmycarter),
                (R.drawable.ronaldreagan),
                (R.drawable.georgebush),
                (R.drawable.billclinton),
                (R.drawable.georgewbush),
                (R.drawable.barackobama)
        };

        TextView name = (TextView) view.findViewById(R.id.name);
        TextView number = (TextView) view.findViewById(R.id.number);
        TextView birthDeath = (TextView) view.findViewById(R.id.birthDeath);
        TextView tookLeft = (TextView) view.findViewById(R.id.tookLeftOffice);
        TextView party = (TextView) view.findViewById(R.id.party);
        ImageView image = (ImageView) view.findViewById(R.id.image);


        /*have to call it from the view- the method find...
        is not applicable to viewPager. the info is in the view*/
        President president = presidents[position];
        name.setText("Name: " + president.getPresident());
        number.setText("President #" + String.valueOf(president.getNumber()));
        if ((String.valueOf(president.getDeathYear())) == (null)){
            birthDeath.setText(String.valueOf(president.getBirthYear() + " - " + " still alive"));
        }
        else {
            birthDeath.setText(String.valueOf(president.getBirthYear() + " - " + (String.valueOf(president.getDeathYear()))));
        }
        if ((president.getLeftOffice()) == (null)){
            tookLeft.setText("Term: " + president.getTookOffice() + " - " + " present");
        }
        else {
            tookLeft.setText("Term: " + president.getTookOffice() + " - " + (president.getLeftOffice()));
        }
        party.setText("Party: " + president.getParty());
        image.setImageResource(pictures[position]);
        image.setScaleType(ImageView.ScaleType.FIT_XY);
        image.setAdjustViewBounds(true);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }
}
