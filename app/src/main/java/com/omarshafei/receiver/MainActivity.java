package com.omarshafei.receiver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "omar", Toast.LENGTH_SHORT).show();
        try{
            ServerSocket ss=new ServerSocket(6666);
            Socket s=ss.accept();//establishes connection
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String str = dis.readUTF();
            Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "omar", Toast.LENGTH_SHORT).show();
            ss.close();
        } catch(Exception e){System.out.println(e.toString());}

    }
}