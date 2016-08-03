package radiobuttons.alan.com.radiobuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioChoiceButton;

    private TextView showOptionChoice;
    private Button showButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showOptionChoice = (TextView) findViewById(R.id.showChoice);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup_id);

        showButton = (Button) findViewById(R.id.choiceBtn);
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedOption = radioGroup.getCheckedRadioButtonId();

                radioChoiceButton = (RadioButton)findViewById(selectedOption);

                showOptionChoice.setText(radioChoiceButton.getText());
            }
        });
    }
}
