package com.example.chandrakumar_pc.flames;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText boy_et,girl_et;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boy_et=(EditText)findViewById(R.id.editText);
        girl_et=(EditText)findViewById(R.id.editText2);
        result=(TextView)findViewById(R.id.textView);
    }
    public void calculate(View view){
        String boy=boy_et.getText().toString();
        String girl=girl_et.getText().toString();
        String c1=new String(),d1=new String();
        char []c=new char[100],d= new char[100];
        int i,j,k=0,u=0,r=0;
        for(i=0;i<boy.length();i++)
        {
            for(j=0;j<girl.length();j++)
            {
                if((boy.charAt(i)==girl.charAt(j))&&(boy.charAt(i)!='*'))
                {
                    boy.toCharArray()[i]='*';
                    girl.toCharArray()[j]='*';
                }
            }
        }
        for(i=0;i<boy.length();i++)
        {
            if(boy.charAt(i)!='*'){
                c[k]=boy.charAt(i);
                if('a'<=  c[k]&&(c[k]<='z'))
                {
                    u++;
                }
                k++;
            }
        }
        for(i=0;i<girl.length();i++)
        {
            if(girl.charAt(i)!='*')
            {
                d[r]= girl.charAt(i);
                if ('a'<=d[k] && d[k]<='z'){
                    u++;
                }
                r++;
            }
        }
        int x;
        x=boy.length();
        x=k+r;
        if(x==3 || x==5 || x==14 || x==16 || x==18)
            result.setText("Friends");
        else if(x==10 || x==19)
            result.setText("Love");
        else if(x==8 || x==12 || x==13 || x==17)
            result.setText("AFFECTION");
        else if(x==6 || x==11 || x==15)
            result.setText("MARRIAGE");
        else if(x==2 || x==4 || x==7 || x==9 || x==20)
            result.setText("ENEMY");
    }
}
