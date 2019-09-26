package lauditha.ananda.myintentapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnMoveActivity;
    Button btnMoveData;
    Button btnDial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveData= findViewById(R.id.btn_move_data);
        btnMoveData.setOnClickListener(this);

        btnDial = findViewById(R.id.btnDial);
        btnDial.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
      switch (view.getId()){
          case R.id.btn_move_activity:
              Intent MoveActivity = new Intent(MainActivity.this, MoveActivity.class);
              startActivity(MoveActivity);
              break;
          case R.id.btn_move_data:
              Intent moveDataActivity = new Intent( MainActivity.this,MoveActivityWithData.class);
              moveDataActivity.putExtra(MoveActivityWithData.EXTRA_NAME, "Lauditha Ananda");
              moveDataActivity.putExtra(MoveActivityWithData.EXTRA_AGE, 18);
              startActivity(moveDataActivity);
              break;
           case R.id.btnDial:
               String phoneNumber = "081901148693";
               Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel"+phoneNumber));
               startActivity(dialPhone);
               break;

      }
    }
}
