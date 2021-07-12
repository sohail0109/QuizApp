package com.example.quizapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class quizactivity extends AppCompatActivity {
    Button answer1, answer2, answer3, answer4;
    TextView score, question;
    private questions mQuestions = new questions();
    private String mAnswer;
    private  int mScore = 0;
    private int mQuestionsLength = mQuestions.mQuestion.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        r = new Random();
        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);
        score = (TextView) findViewById(R.id.score);
        question = findViewById(R.id.question);

        score.setText("Score: " +mScore);

        updateQuestion(r.nextInt(mQuestionsLength));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer1.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score: "+mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    wronganswer();
                }

            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer2.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score: "+mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    wronganswer();
                }


            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer3.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score: "+mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    wronganswer();
                }


            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (answer4.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score: "+mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    wronganswer();
                }

            }
        });

    }
    private void updateQuestion(int num) {
        question.setText(mQuestions.getQuestions(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getCorrectAnswer(num);
    }
    private void wronganswer(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(quizactivity.this);
        alertDialogBuilder
                .setMessage("wrong answer")
                .setCancelable(false)
                .setPositiveButton("Next question",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(),quizactivity.class));

                            }
                        })
                .setNegativeButton("Exit",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();

                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

}
