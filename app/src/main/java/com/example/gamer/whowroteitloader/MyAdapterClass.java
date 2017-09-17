package com.example.gamer.whowroteitloader;

/**
 * Created by Gamer on 9/17/2017.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by pc on 9/10/2017.
 */

public class MyAdapterClass extends RecyclerView.Adapter <MyAdapterClass.MyOwnHolder>
{

    //    String [] mys1, mys2;
    Context cntxt;
    List<myBook> bookList;

    public MyAdapterClass(Context c1, List<myBook> bookList){
        this.bookList = bookList;
        cntxt = c1;
    }

    @Override
    public MyOwnHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater myInflater = LayoutInflater.from(cntxt);
        View myView= myInflater.inflate(R.layout.my_row, parent,false);
        return new MyOwnHolder(myView);
    }

    @Override
    public void onBindViewHolder(MyOwnHolder holder, int pos) {
        myBook bookInfo = bookList.get(pos);
        holder.txt1.setText(bookInfo.getTitle());
        holder.txt2.setText(bookInfo.getAuthor());
    }

    @Override
    public int getItemCount() { return bookList.size();
    }

    public class MyOwnHolder extends RecyclerView.ViewHolder {
        TextView txt1, txt2;
        public MyOwnHolder(View itemView) {
            super(itemView);
            txt1 = (TextView) itemView.findViewById(R.id.titleText);
            txt2 =(TextView) itemView.findViewById(R.id.authorText);
        }
    }
}