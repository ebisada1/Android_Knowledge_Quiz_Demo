package com.example.android.knowledgeiq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int answer1;

    Boolean answer2a = false;
    Boolean answer2b = false;
    Boolean answer2c = false;
    Boolean answer2d = false;
    int answer2 = 0;

    Boolean answer3a = false;
    Boolean answer3b = false;
    Boolean answer3c = false;
    Boolean answer3d = false;
    int answer3 = 0;

    int answer4 = 0;

    Boolean answer5a = false;
    Boolean answer5b = false;
    Boolean answer5c = false;
    Boolean answer5d = false;
    int answer5 = 0;

    int score = 0;
    String scoreMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    public void answer2aClicked(View view) {
        Boolean checked = ((CheckBox) view).isChecked();
        if (checked) {
            answer2a = true;
        }
        if (!checked) {
            answer2a = false;
        }
    }

    public void answer2bClicked(View view) {
        Boolean checked = ((CheckBox) view).isChecked();
        if (checked) {
            answer2b = true;
        }
        if (!checked) {
            answer2b = false;
        }
    }

    public void answer2cClicked(View view) {
        Boolean checked = ((CheckBox) view).isChecked();
        if (checked) {
            answer2c = true;
        }
        if (!checked) {
            answer2c = false;
        }
    }

    public void answer2dClicked(View view) {
        Boolean checked = ((CheckBox) view).isChecked();
        if (checked) {
            answer2d = true;
        }
        if (!checked) {
            answer2d = false;
        }
    }

    public void answer3aClicked(View view) {
        Boolean checked = ((RadioButton) view).isChecked();
        if (checked) {
            answer3a = true;
            answer3b = false;
            answer3c = false;
            answer3d = false;

            RadioButton radioButton1 = (RadioButton) findViewById(R.id.answer3b);
            radioButton1.setChecked(false);
            RadioButton radioButton2 = (RadioButton) findViewById(R.id.answer3c);
            radioButton2.setChecked(false);
            RadioButton radioButton3 = (RadioButton) findViewById(R.id.answer3d);
            radioButton3.setChecked(false);
        }
    }

    public void answer3bClicked(View view) {
        Boolean checked = ((RadioButton) view).isChecked();
        if (checked) {
            answer3a = false;
            answer3b = true;
            answer3c = false;
            answer3d = false;

            RadioButton RadioButton1 = (RadioButton) findViewById(R.id.answer3a);
            RadioButton1.setChecked(false);
            RadioButton RadioButton2 = (RadioButton) findViewById(R.id.answer3c);
            RadioButton2.setChecked(false);
            RadioButton RadioButton3 = (RadioButton) findViewById(R.id.answer3d);
            RadioButton3.setChecked(false);
        }
    }

    public void answer3cClicked(View view) {
        Boolean checked = ((RadioButton) view).isChecked();
        if (checked) {
            answer3a = false;
            answer3b = false;
            answer3c = true;
            answer3d = false;

            RadioButton RadioButton1 = (RadioButton) findViewById(R.id.answer3a);
            RadioButton1.setChecked(false);
            RadioButton RadioButton2 = (RadioButton) findViewById(R.id.answer3b);
            RadioButton2.setChecked(false);
            RadioButton RadioButton3 = (RadioButton) findViewById(R.id.answer3d);
            RadioButton3.setChecked(false);
        }
    }

    public void answer3dClicked(View view) {
        Boolean checked = ((RadioButton) view).isChecked();
        if (checked) {
            answer3a = false;
            answer3b = false;
            answer3c = false;
            answer3d = true;

            RadioButton RadioButton1 = (RadioButton) findViewById(R.id.answer3a);
            RadioButton1.setChecked(false);
            RadioButton RadioButton2 = (RadioButton) findViewById(R.id.answer3b);
            RadioButton2.setChecked(false);
            RadioButton RadioButton3 = (RadioButton) findViewById(R.id.answer3c);
            RadioButton3.setChecked(false);
        }
    }

    public void answer5aClicked(View view) {
        Boolean checked = ((CheckBox) view).isChecked();
        if (checked) {
            answer5a = true;
        }
        if (!checked) {
            answer5a = false;
        }

    }

    public void answer5bClicked(View view) {
        Boolean checked = ((CheckBox) view).isChecked();
        if (checked) {
            answer5b = true;
        }
        if (!checked) {
            answer5b = false;
        }
    }

    public void answer5cClicked(View view) {
        Boolean checked = ((CheckBox) view).isChecked();
        if (checked) {
            answer5c = true;
        }
        if (!checked) {
            answer5c = false;
        }
    }

    public void answer5dClicked(View view) {
        Boolean checked = ((CheckBox) view).isChecked();
        if (checked) {
            answer5d = true;
        }
        if (!checked) {
            answer5d = false;
        }
    }

    public void calculateMyScore(View view) {
        score = 0;

        String answer1Input = "";
        EditText text1 = (EditText) findViewById(R.id.answer1);
        answer1Input = text1.getText().toString();
        String refAnswer1 = "georgewashington";
        if (answer1Input.replaceAll("\\s+", "").equalsIgnoreCase(refAnswer1)) {
            answer1 = 1;
            Log.d("answer1Input", answer1Input);

        } else {
            answer1 = 0;
            Log.d("answer1Input", answer1Input);
        }

            if (answer2a) {
                if (!answer2b) {
                    if (answer2c) {
                        if (!answer2d) {
                            answer2 = 1;
                        }
                    }
                }
            } else {
                answer2 = 0;
            }

        if (answer3b) {
            answer3 = 1;
        } else {
            answer3 = 0;
        }

        String answer4Input = "";
        EditText text4 = (EditText) findViewById(R.id.answer4);
        answer4Input = text4.getText().toString();
        String refAnswer4 = "1776";
        if (answer4Input.replaceAll("\\s+", "").equalsIgnoreCase(refAnswer4)) {
            answer4 = 1;
            Log.d("answer4Input", answer4Input);

        } else {
            answer4 = 0;
            Log.d("answer4Input", answer4Input);
        }

        if (answer5a) {
            if (!answer5b) {
                if (answer5c) {
                    if (!answer5d) {
                        answer5 = 1;
                    }
                }
            }
        } else {
            answer5 = 0;
        }

        Log.d("answer1_in score", "value: " + answer1);
        if (answer1==1) score += 1;
        if (answer2==1) score += 1;
        if (answer3==1) score += 1;
        if (answer4==1) score += 1;
        if (answer5==1) score += 1;

        TextView scoreTextView = (TextView) findViewById(R.id.score_text_view);
        scoreTextView.setText("" + score);

        Toast.makeText(getApplicationContext(), "Your Score is: " + score,Toast.LENGTH_LONG).show();
    }
}
