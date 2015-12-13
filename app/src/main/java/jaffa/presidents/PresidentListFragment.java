package jaffa.presidents;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by libby on 12/10/2015.
 */

    public class PresidentListFragment extends Fragment {
        //A Fragment is like an activity..has onCreate, onResume, OnPause
        private RecyclerView recyclerView;

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater,
                                 ViewGroup container,
                                 Bundle savedInstanceState){

            return inflater.inflate(R.layout.fragment_president_list, container, false);

        }

        @Override
        public void onViewCreated(View view, Bundle savedInstanceState) {
            recyclerView = (RecyclerView) view.findViewById(R.id.list);

            LinearLayoutManager layoutManager = new LinearLayoutManager(this.getActivity());
            layoutManager.setOrientation((LinearLayoutManager.VERTICAL));
            recyclerView.setLayoutManager(layoutManager);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                    .create();

            InputStream in = getResources().openRawResource(R.raw.presidents);

            President[] presidents =
                    gson.fromJson(new InputStreamReader(in), President[].class);
            int[] presidentImages = new int[] { R.drawable.georgewashington, R.drawable.johnadams, R.drawable.thomasjefferson,
                    R.drawable.jamesmadison, R.drawable.jamesmonroe, R.drawable.johnquincyadams, R.drawable.andrewjackson,
                    R.drawable.martinvanburen, R.drawable. williamhenryharrison, R.drawable.johntyler, R.drawable.jameskpolk,
                    R.drawable.zacharytaylor, R.drawable.millardfillmore, R.drawable.franklinpierce, R.drawable.jamesbuchanan,
                    R.drawable.abrahamlincoln, R.drawable.andrewjohnson, R.drawable.ulyssessgrant, R.drawable.rutherfordbhayes,
                    R.drawable.jamesagarfield, R.drawable.chesteraarthur, R.drawable.grovercleveland, R.drawable.benjaminharrison,
                    R.drawable.williammckinley, R.drawable.theodoreroosevelt, R.drawable.williamhowardtaft, R.drawable.woodrowwilson,
                    R.drawable.warrengharding, R.drawable.calvincoolidge, R.drawable.herberthoover, R.drawable.franklindroosevelt,
                    R.drawable.harrystruman, R.drawable.dwightdeisenhower,R.drawable.johnfkennedy, R.drawable.lyndonbjohnson,
                    R.drawable.richardmnixon, R.drawable.geraldrford, R.drawable.jimmycarter, R.drawable.ronaldreagan,
                    R.drawable.georgebush, R.drawable.billclinton, R.drawable.georgewbush, R.drawable.barackobama};
            PresidentRecycleViewAdapter adapter = new PresidentRecycleViewAdapter(presidents);
            recyclerView.setAdapter(adapter);
        }
    }