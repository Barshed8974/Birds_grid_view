package com.example.birdsgridview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements  ItemClickListner{
    private RecyclerView recyclerView;
    private ArrayList<Bird> birdList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        buildStudentList();
        setRecyclerView();
    }

    private void setRecyclerView() {
        Adapter adapter=new Adapter(birdList,this);
        LinearLayoutManager gridLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void buildStudentList() {
        for(int i=1;i<10;i++)
        {
            int x=i%3;
            if (x==0)
            {
                Bird bird=new Bird(R.drawable.sparrow,"Sparrow");
                birdList.add(bird);
            }
            else if(x==1)
            {
                Bird bird=new Bird(R.drawable.peacock,"peacock");
                birdList.add(bird);
            }
            else if(x==2)
            {
                Bird bird=new Bird(R.drawable.duck,"duck");
                birdList.add(bird);
            }
            else if(x==3)
            {
                Bird bird=new Bird(R.drawable.piegon,"piegon");
                birdList.add(bird);
            }
        }
    }

    private void initView() {
        recyclerView=findViewById(R.id.recycler1);
    }

    @Override
    public void onItemClick(Bird bird) {
        Toast.makeText(this,bird.getmName().toString(),Toast.LENGTH_SHORT).show();
    }
}