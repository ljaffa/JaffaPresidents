package jaffa.presidents;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by libby on 10/29/2015.
 */
public class PresidentPagerAdapter extends PagerAdapter {

    private PresidentsList presidents;

    public PresidentPagerAdapter(PresidentsList presidents) {

        this.presidents = presidents;
    }

    @Override
    public int getCount() {
        return presidents.size();
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
        TextView name = (TextView) view.findViewById(R.id.name);
        TextView number = (TextView) view.findViewById(R.id.number);
        TextView birthYear = (TextView) view.findViewById(R.id.birthYear);
        TextView deathYear = (TextView) view.findViewById(R.id.deathYear);
        TextView tookOffice = (TextView) view.findViewById(R.id.tookOffice);
        TextView leftOffice = (TextView) view.findViewById(R.id.leftOffice);
        TextView party = (TextView) view.findViewById(R.id.party);

        /*have to call it from the view- the method find...
        is not applicable to viewPager. the info is in the view*/
        President president = presidents.get(position);
        name.setText(president.getPresident());
        number.setText(String.valueOf(president.getNumber()));
        birthYear.setText(String.valueOf(president.getBirthYear()));
        deathYear.setText(String.valueOf(president.getDeathYear()));
        tookOffice.setText(president.getTookOffice());
        leftOffice.setText(president.getLeftOffice());
        party.setText(president.getParty());

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }
}
