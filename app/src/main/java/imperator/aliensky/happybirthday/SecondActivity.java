package imperator.aliensky.happybirthday;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Imperator on 26.09.2017.
 */

public class SecondActivity extends AppCompatActivity {

    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;


    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;

    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;

    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        mediaPlayer = MediaPlayer.create(this, R.raw.in_the_space);
        mediaPlayer.start();

        //Search TextView
        textView1 = (TextView)findViewById(R.id.textView2_1);
        textView2 = (TextView)findViewById(R.id.textView2_2);
        textView3 = (TextView)findViewById(R.id.textView2_3);
        textView4 = (TextView)findViewById(R.id.textView2_4);

        //Search Button
        button1 = (Button)findViewById(R.id.button2_1);
        button2 = (Button)findViewById(R.id.button2_2);
        button3 = (Button)findViewById(R.id.button2_3);
        button4 = (Button)findViewById(R.id.button2_4);

        //Search EditText
        editText1 = (EditText)findViewById(R.id.editText2_1);
        editText2 = (EditText)findViewById(R.id.editText2_2);
        editText3 = (EditText)findViewById(R.id.editText2_3);
        editText4 = (EditText)findViewById(R.id.editText2_4);

        //Search ImageView
        imageView1 = (ImageView)findViewById(R.id.imageView2_1);
        imageView2 = (ImageView)findViewById(R.id.imageView2_2);
        imageView3 = (ImageView)findViewById(R.id.imageView2_3);
        imageView4 = (ImageView)findViewById(R.id.imageView2_4);


        //Hide
        editText2.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
        editText3.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        button3.setVisibility(View.INVISIBLE);
        editText4.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);
        button4.setVisibility(View.INVISIBLE);
    }

    public void checkCode2_1(View view){
        if (editText1.getText().toString().equals("")){
            final Animation in_anim = AnimationUtils.loadAnimation(SecondActivity.this, R.anim.bounce);
            final Animation out_anim = AnimationUtils.loadAnimation(SecondActivity.this, R.anim.fade_out);
            textView1.setVisibility(View.INVISIBLE);textView1.setAnimation(out_anim);
            editText1.setVisibility(View.INVISIBLE);editText1.setAnimation(out_anim);
            button1.setVisibility(View.INVISIBLE);button1.setAnimation(out_anim);
            Toast.makeText(this, "Код верный. Отличная находка", Toast.LENGTH_SHORT).show();
            textView2.setVisibility(View.VISIBLE);textView2.setAnimation(in_anim);
            editText2.setVisibility(View.VISIBLE);editText2.setAnimation(in_anim);
            button2.setVisibility(View.VISIBLE);button2.setAnimation(in_anim);
            imageView1.setImageResource(R.drawable.image_pic_2_1);imageView1.setAnimation(in_anim);
        }else{
            Toast.makeText(this, "Не верный код", Toast.LENGTH_SHORT).show();
        }
    }

    public void checkCode2_2(View view){
        if (editText2.getText().toString().equals("")){
            final Animation in_anim = AnimationUtils.loadAnimation(SecondActivity.this, R.anim.bounce);
            final Animation out_anim = AnimationUtils.loadAnimation(SecondActivity.this, R.anim.fade_out);
            textView2.setVisibility(View.INVISIBLE);textView2.setAnimation(out_anim);
            editText2.setVisibility(View.INVISIBLE);editText2.setAnimation(out_anim);
            button2.setVisibility(View.INVISIBLE);button2.setAnimation(out_anim);
            Toast.makeText(this, "Код верный. Умничка =*", Toast.LENGTH_SHORT).show();
            textView3.setVisibility(View.VISIBLE);textView3.setAnimation(in_anim);
            editText3.setVisibility(View.VISIBLE);textView3.setAnimation(in_anim);
            button3.setVisibility(View.VISIBLE);textView3.setAnimation(in_anim);
            imageView3.setImageResource(R.drawable.image_pic2_2);
        }else{
            Toast.makeText(this, "Код не верный, давай еще раз", Toast.LENGTH_SHORT).show();
        }
    }

    public void checkCode2_3(View view){
        if (editText3.getText().toString().equals("")){
            final Animation in_anim = AnimationUtils.loadAnimation(SecondActivity.this, R.anim.bounce);
            final Animation out_anim = AnimationUtils.loadAnimation(SecondActivity.this, R.anim.fade_out);
            textView3.setVisibility(View.INVISIBLE);textView3.setAnimation(out_anim);
            editText3.setVisibility(View.INVISIBLE);editText3.setAnimation(out_anim);
            button3.setVisibility(View.INVISIBLE);button3.setAnimation(out_anim);
            Toast.makeText(this, "Код верный", Toast.LENGTH_SHORT).show();
            textView4.setVisibility(View.VISIBLE);textView4.setAnimation(in_anim);
            editText4.setVisibility(View.VISIBLE);editText4.setAnimation(in_anim);
            button4.setVisibility(View.VISIBLE);button4.setAnimation(in_anim);
            imageView4.setImageResource(R.drawable.image_2_4final);
        }else{
            Toast.makeText(this, "Код не верный", Toast.LENGTH_SHORT).show();
        }
    }

    public void checkCode2_4Final(View view){
        if (editText4.getText().toString().equals("")){
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Код не верный не пущу на следующий уровень", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStart() {
        mediaPlayer.start();
        super.onStart();
    }

    @Override
    protected void onStop() {
        mediaPlayer.pause();
        super.onStop();
    }

    @Override
    protected void onResume() {
        mediaPlayer.start();
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        releaseMP();
    }

    public void releaseMP(){
        if (mediaPlayer != null){
            try {
                mediaPlayer.release();
                mediaPlayer = null;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
