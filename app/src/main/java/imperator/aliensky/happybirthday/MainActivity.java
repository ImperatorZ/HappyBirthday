package imperator.aliensky.happybirthday;


import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;

    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    private TextView textView1;
    private TextView textView2;
    private TextView textView3;

    private TextView textView4;
    private TextView textView5;
    private TextView textView6;
    private TextView textView7;

    private TextView textView8;
    private TextView textView9;
    private TextView textView10;


    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.girl_with_smoke);
        mediaPlayer.start();

        final Animation in_anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
        //final Animation out_anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_out);

        //Поиск кнопки
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);


        //Поиск текста
        textView1 = (TextView)findViewById(R.id.textView1);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView3 = (TextView)findViewById(R.id.textView3);
        textView4 = (TextView)findViewById(R.id.textView4);
        textView5 = (TextView)findViewById(R.id.textView5);
        textView6 = (TextView)findViewById(R.id.textView6);
        textView7 = (TextView)findViewById(R.id.textView7);
        textView8 = (TextView)findViewById(R.id.textView8);
        textView9 = (TextView)findViewById(R.id.textView9);
        textView10 = (TextView)findViewById(R.id.textView10);

        //Скрываем текст
        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);
        textView5.setVisibility(View.INVISIBLE);
        textView6.setVisibility(View.INVISIBLE);
        textView7.setVisibility(View.INVISIBLE);
        textView8.setVisibility(View.INVISIBLE);
        textView9.setVisibility(View.INVISIBLE);
        textView10.setVisibility(View.INVISIBLE);



        textView1.setVisibility(View.VISIBLE); textView1.setAnimation(in_anim);
        textView2.setVisibility(View.VISIBLE); textView2.setAnimation(in_anim);
        textView3.setVisibility(View.VISIBLE); textView3.setAnimation(in_anim);





        //Поиск EditText
        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);
        editText3 = (EditText)findViewById(R.id.editText3);
        editText4 = (EditText)findViewById(R.id.editText4);

        //Поиск изображений
        imageView1 = (ImageView)findViewById(R.id.imageView1);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
        imageView3 = (ImageView)findViewById(R.id.imageView3);
        imageView4 = (ImageView)findViewById(R.id.imageView4Final);



        //Скрываем кнопку
        button2.setVisibility(View.INVISIBLE);
        button3.setVisibility(View.INVISIBLE);
        button4.setVisibility(View.INVISIBLE);


        //Скрываем EditText
        editText2.setVisibility(View.INVISIBLE);
        editText3.setVisibility(View.INVISIBLE);
        editText4.setVisibility(View.INVISIBLE);




    }

    public void checkCode1(View view){
        if (editText1.getText().toString().equals("")){
            final Animation in_anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
            final Animation out_anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_out);
            textView1.setVisibility(View.INVISIBLE); textView1.setAnimation(out_anim);
            textView2.setVisibility(View.INVISIBLE); textView2.setAnimation(out_anim);
            textView3.setVisibility(View.INVISIBLE); textView3.setAnimation(out_anim);
            button1.setVisibility(View.INVISIBLE); button1.setAnimation(out_anim);
            Toast.makeText(this, "Отлично. Код верный", Toast.LENGTH_SHORT).show();
            textView4.setVisibility(View.VISIBLE);textView4.setAnimation(in_anim);
            textView5.setVisibility(View.VISIBLE);textView5.setAnimation(in_anim);
            button2.setVisibility(View.VISIBLE); button2.setAnimation(in_anim);
            editText2.setVisibility(View.VISIBLE); editText2.setAnimation(in_anim);

            imageView1.setImageResource(R.drawable.image_pic);

        }else{
            Toast.makeText(this, "Опа. Ошибочка. Попробуй еще раз", Toast.LENGTH_SHORT).show();
        }
    }

    public void checkCode2(View view){
        if (editText2.getText().toString().equals("")){
            final Animation in_anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
            final Animation out_anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_out);
            textView4.setVisibility(View.INVISIBLE);textView4.setAnimation(out_anim);
            textView5.setVisibility(View.INVISIBLE);textView5.setAnimation(out_anim);
            button2.setVisibility(View.INVISIBLE);button2.setAnimation(out_anim);
            editText2.setVisibility(View.INVISIBLE);editText2.setAnimation(out_anim);
            Toast.makeText(this, "Умничка. Ты знаешь, что нам нравится", Toast.LENGTH_SHORT).show();
            textView6.setVisibility(View.VISIBLE);textView6.setAnimation(in_anim);
            textView7.setVisibility(View.VISIBLE); textView7.setAnimation(in_anim);
            textView8.setVisibility(View.VISIBLE);textView8.setAnimation(in_anim);
            button3.setVisibility(View.VISIBLE); button3.setAnimation(in_anim);
            editText3.setVisibility(View.VISIBLE);editText3.setAnimation(in_anim);
            imageView2.setImageResource(R.drawable.image_pic2);

        }else{
            Toast.makeText(this, "Нет, ты эти два числа прекрасно знаешь", Toast.LENGTH_SHORT).show();

        }
    }
    public void checkCode3(View view) {
        if (editText3.getText().toString().equals("")){
        final Animation in_anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
        final Animation out_anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_out);
        textView6.setVisibility(View.INVISIBLE); textView6.setAnimation(out_anim);
        textView7.setVisibility(View.INVISIBLE);textView7.setAnimation(out_anim);
        textView8.setVisibility(View.INVISIBLE);textView8.setAnimation(out_anim);
        button3.setVisibility(View.INVISIBLE);button3.setAnimation(out_anim);
        editText3.setVisibility(View.INVISIBLE);editText3.setAnimation(out_anim);
            Toast.makeText(this, "Отлично. Не забыла. Приятно =*", Toast.LENGTH_SHORT).show();
            textView9.setVisibility(View.VISIBLE);textView9.setAnimation(in_anim);
            textView10.setVisibility(View.VISIBLE);textView10.setAnimation(in_anim);
            button4.setVisibility(View.VISIBLE);button4.setAnimation(in_anim);
            editText4.setVisibility(View.VISIBLE);editText4.setAnimation(in_anim);
            imageView3.setImageResource(R.drawable.image_pic3);
            imageView4.setImageResource(R.drawable.final1);
    }else{
        Toast.makeText(this, "Код не верен. Возможно ты забыла дату, либо вводишь не в том формате", Toast.LENGTH_SHORT).show();
    }
    }

    public void checkCode4(View view){
        if (editText4.getText().toString().equals("")){
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
            mediaPlayer.stop();
        }else{
            Toast.makeText(this, "Код не правильный", Toast.LENGTH_SHORT).show();
        }
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

    @Override
    protected void onStart() {
        mediaPlayer.start();
        super.onStart();
    }

    public void releaseMP(){
        if (mediaPlayer !=null){
            try{
                mediaPlayer.release();
                mediaPlayer = null;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
