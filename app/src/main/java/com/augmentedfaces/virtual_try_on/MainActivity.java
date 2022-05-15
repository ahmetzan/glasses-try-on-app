package com.augmentedfaces.virtual_try_on;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    myadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Recycler and Card View Demo");

        rcv = (RecyclerView) findViewById(R.id.recview);
        //  rcv.setLayoutManager(new LinearLayoutManager(this));

        adapter = new myadapter(dataqueue(),getApplicationContext());
        rcv.setAdapter(adapter);

        //LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        //rcv.setLayoutManager(layoutManager);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        rcv.setLayoutManager(gridLayoutManager);
    }

    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder=new ArrayList<>();

        Model ob1=new Model();
        ob1.setHeader("Beyaz Gözlük");
        ob1.setDesc("Polarize");
        ob1.setImgname(R.drawable.gl21png);
        holder.add(ob1);

        Model ob2=new Model();
        ob2.setHeader("Siyah Gözlük");
        ob2.setDesc("Kare Çerçeve");
        ob2.setImgname(R.drawable.fdf1);
        holder.add(ob2);

        Model ob3=new Model();
        ob3.setHeader("Yeşil Gözlük");
        ob3.setDesc("Kare Çerçeve");
        ob3.setImgname(R.drawable.gr1);
        holder.add(ob3);

        Model ob4=new Model();
        ob4.setHeader("Sarı Gözlük");
        ob4.setDesc("Camsız");
        ob4.setImgname(R.drawable.am_body1);
        holder.add(ob4);


        return holder;
    }


}