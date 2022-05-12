package com.example.app.Fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.app.R;
import com.example.app.adapter.DashboardAdapter;
import com.example.app.adapter.StoryAdapter;
import com.example.app.model.DasboardModel;
import com.example.app.model.StoryModel;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    RecyclerView storyRv, dashboardRv;
    ArrayList<StoryModel> list;
    ArrayList<DasboardModel> dashboardList;



    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home, container, false);


        storyRv = view.findViewById(R.id.storiesRV);

        list = new ArrayList<>();
        list.add(new StoryModel(R.drawable.aaronpaul,R.drawable.live, R.drawable.aaronprofile, "Aaron Paul"));
        list.add(new StoryModel(R.drawable.bryanstory, R.drawable.img_3, R.drawable.bryan, "Bryan Cranston"));
        list.add(new StoryModel(R.drawable.chesterstory, R.drawable.img_4, R.drawable.chester, "Chester Bennington"));
        list.add(new StoryModel(R.drawable.mikestory, R.drawable.live, R.drawable.mike, "Mike Shinoda"));

        StoryAdapter adapter = new StoryAdapter(list, getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,false);
        storyRv.setLayoutManager(linearLayoutManager);
        storyRv.setNestedScrollingEnabled(false);
        storyRv.setAdapter(adapter);


        dashboardRv = view.findViewById(R.id.dashboardRv);
        dashboardList = new ArrayList<>();
        dashboardList.add(new DasboardModel(R.drawable.dwightpp, R.drawable.dwight,R.drawable.savedd,"Dwight Schrute","False","234K","100K", "100K"));
        dashboardList.add(new DasboardModel(R.drawable.rhett, R.drawable.rhettpost,R.drawable.savedd,"Rhett McLaughlin","YouTuber","23K","100", "100"));
        dashboardList.add(new DasboardModel(R.drawable.nigahiga, R.drawable.nigshigs,R.drawable.savee,"Ryan Higa","YouTuber","2.2M","300K", "400K"));

        DashboardAdapter dashboardAdapter = new DashboardAdapter(dashboardList, getContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL, false);
        dashboardRv.setLayoutManager(layoutManager);
        dashboardRv.setNestedScrollingEnabled(false);
        dashboardRv.setAdapter(dashboardAdapter);

        return view;
    }
}