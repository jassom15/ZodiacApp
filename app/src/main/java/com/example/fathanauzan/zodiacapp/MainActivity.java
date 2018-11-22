package com.example.fathanauzan.zodiacapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener{

    EditText nama,tanggal,bulan;




    Button tomboltampil;

    TextView outputnama, outputzodiak;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getBaseContext(), "Masukkan angka pada form tanggal dan bulan", Toast.LENGTH_LONG).show();
        nama= (EditText)findViewById(R.id.editText1);
        bulan = (EditText)findViewById(R.id.editText3);
        tanggal = (EditText)findViewById(R.id.editText2);
        tomboltampil = (Button)findViewById(R.id.button1);

        outputnama =(TextView)findViewById(R.id.textView5);
        outputzodiak =(TextView)findViewById(R.id.textView6);


        tomboltampil.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main,menu);
        return true;
    }

    @Override
    public void onClick(View klik) {
        // TODO Auto-generated method stub

        double bln = Double.parseDouble(bulan.getText().toString());

        double tgl = Double.parseDouble(tanggal.getText().toString());
        String bln1= "---------------CAPRICORN--------" +
                "Nasehat Umum,manfaatkan IT yang tersedia." +
                "Keungan kamu lagi pas-pasan. " +
                "Kondisi Asmaramu,Jangan lupakan kewajiban belajar nak.";

        String bln2= "---------------AQUARIUS--------" +
                "jangan bertindak yang tak lazim." +
                "atur keungan kamu. " +
                "Kondisi Asmaramu KACAU.";

        String bln3= "---------------PIECES----------" +
                "Nasehat Umum,maafkan orang lain." +
                "Keungan beres. " +
                "Kondisi Asmaramu,entahlah.";


        String bln4= "---------------ARIES----------" +
                "Nasehat Umum,balajar giat." +
                "Keungan kamu lagi boros. " +
                "Kondisi Asmaramu,rajin ngaji ya nak.";


        String bln5= "---------------TAURUS----------" +
                "Nasehat Umum,hormati orang tua." +
                "Keungan kamu lebih baik dagang. " +
                "Kondisi Asmaramumu kacau.";


        String bln6= "---------------GEMINI---------" +
                "Nasehat Umum,siap2 ujian." +
                "Keungan kamu jagan suka beli cireng. " +
                "Kondisi Asmaramu,galauuu.";


        String bln7= "---------------CANCER----------" +
                "Nasehat Umum,banyak bersyukur nak." +
                "Keungan kamu lagi tinggi. " +
                "Kondisi Asmaramu,lelah.";



        String bln8= "---------------LEO------------" +
                "Nasehat Umum,lebih giat lagi." +
                "Keungan kamu nambah terus. " +
                "Kondisi Asmaramu,tak ternilai lagi dimatanya dia sangat mencintaimu.";


        String bln9= "---------------VIRGO----------" +
                "Nasehat Umum,puasa." +
                "Keungan kamu,lebih baik puasa karena g ada pemasukan. "+
                "Kondisi Asmaramu,kerjar terus.";


        String bln10= "--------------LIBRA----------" +
                "Nasehat Umum,siap siap ujian banyak belajar ya nak." +
                "Keungan kamu lagi nambah banyak. " +
                "Kondisi Asmaramu,pahami perbedaan tulus dan modus ?.";


        String bln11= "--------------SCORPION---------" +
                "Nasehat Umum,makan gorengan dulu." +
                "Keungan kamu lagi naik. " +
                "Kondisi Asmaramu,Cinta Allah banget.";



        String bln12= "--------------SAGITARIUS---------" +
                "Nasehat Umum,maafkan bila hati." +
                "Keungan kamu lagi nipi. " +
                "Kondisi Asmaramu,tak sempurna.";
        if (bln==1)
        {

            if (tgl<=18)
            {

                outputzodiak.setText((bln1));

            }
            else if (tgl<=31)
                outputzodiak.setText((bln2));
            else

            {


                Toast.makeText(getBaseContext(), "Bulan januari tanggal 1-31 ", Toast.LENGTH_LONG).show();

            } }

        if (bln==2)
        {

            if (tgl<=18)
            {

                outputzodiak.setText((bln1));

            }
            else if (tgl<=29)

                outputzodiak.setText((bln3));
            else
            {


                Toast.makeText(getBaseContext(), "Bulan februari tanggal 1-29 ", Toast.LENGTH_LONG).show();

            } }

        if (bln==3)
        {

            if (tgl<=20)
            {

                outputzodiak.setText((bln3));

            }
            else if (tgl<=31)
                outputzodiak.setText((bln4));
            else
            {

                Toast.makeText(getBaseContext(), "Bulan maret tanggal 1-31 ", Toast.LENGTH_LONG).show();


            } }

        if (bln==4)
        {

            if (tgl<=19)
            {

                outputzodiak.setText((bln4));

            }
            else if (tgl<=30)
                outputzodiak.setText((bln5));
            else
            {


                Toast.makeText(getBaseContext(), "Bulan april tanggal 1-30 ", Toast.LENGTH_LONG).show();

            } }



        if (bln==5)
        {

            if (tgl<=20)
            {

                outputzodiak.setText((bln5));

            }
            else if (tgl<=31)

                outputzodiak.setText((bln6));
            else
            {
                Toast.makeText(getBaseContext(), "Bulan mei tanggal 1-31 ", Toast.LENGTH_LONG).show();

            } }

        if (bln==6)
        {

            if (tgl<=21)
            {

                outputzodiak.setText((bln6));

            }
            else if (tgl<=30)
                outputzodiak.setText((bln7));
            else
            {
                Toast.makeText(getBaseContext(), "Bulan juni tanggal 1-30 ", Toast.LENGTH_LONG).show();


            } }


        if (bln==7)
        {

            if (tgl<=22)
            {

                outputzodiak.setText((bln7));

            }
            else if (tgl<=31)
                outputzodiak.setText((bln8));
            else
            {
                Toast.makeText(getBaseContext(), "Bulan april juli 1-31 ", Toast.LENGTH_LONG).show();


            } }
        if (bln==8)
        {

            if (tgl<=22)
            {

                outputzodiak.setText((bln8));

            }
            else if (tgl<=31)
                outputzodiak.setText((bln9));
            else
            {
                Toast.makeText(getBaseContext(), "Bulan agustus tanggal 1-31 ", Toast.LENGTH_LONG).show();


            } }

        if (bln==9)
        {

            if (tgl<=22)
            {

                outputzodiak.setText((bln9));

            }
            else if (tgl<=30)
                outputzodiak.setText((bln10));
            else
            {
                Toast.makeText(getBaseContext(), "Bulan september tanggal 1-30 ", Toast.LENGTH_LONG).show();

            } }


        if (bln==10)
        {

            if (tgl<=23)
            {

                outputzodiak.setText((bln10));

            }
            else if (tgl<=31)
                outputzodiak.setText((bln11));
            {

                Toast.makeText(getBaseContext(), "Bulan oktober tanggal 1-31 ", Toast.LENGTH_LONG).show();

            } }

        if (bln==11)
        {

            if (tgl<=21)
            {

                outputzodiak.setText((bln11));

            }
            else if (tgl<=30)
                outputzodiak.setText((bln12));
            else
            {
                Toast.makeText(getBaseContext(), "Bulan nopember tanggal 1-30 ", Toast.LENGTH_LONG).show();


            } }
        if (bln==12)
        {

            if (tgl<=21)
            {

                outputzodiak.setText((bln12));

            }
            else if (tgl<=31)
                outputzodiak.setText((bln11));
            else
            {
                Toast.makeText(getBaseContext(), "Bulan desember tanggal 1-31 ", Toast.LENGTH_LONG).show();



            }



        }



    }


}
