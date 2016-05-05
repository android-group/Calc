package ru.android_studio.olga.calc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.olga.calc.R;
//import butterknife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private final static String TAG = "MainTAG";
    private TextView result;
    private MyCalc calc = new MyCalc();
    private String sign = "";
    private boolean sum = false;
    private boolean error = false;
    private boolean enter = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_clear).setOnClickListener(this);

        result = (TextView) findViewById(R.id.textView_result);

        findViewById(R.id.button_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!error) {
                    if(enter) {
                        result.setText("");
                        enter = false;
                        sum = false;
                    }
                    Log.i(TAG, "1");
                    result.append("1");
                }
            }
        });

        findViewById(R.id.button_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!error) {
                    if (enter) {
                        result.setText("");
                        enter = false;
                        sum = false;
                    }
                    Log.i(TAG, "2");
                    result.append("2");
                }
            }
        });

        findViewById(R.id.button_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!error) {
                    if (enter) {
                        result.setText("");
                        enter = false;
                        sum = false;
                    }
                    Log.i(TAG, "3");
                    result.append("3");
                }
            }
        });

        findViewById(R.id.button_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!error) {
                    if (enter) {
                        result.setText("");
                        enter = false;
                        sum = false;
                    }
                    Log.i(TAG, "4");
                    result.append("4");
                }
            }
        });

        findViewById(R.id.button_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!error) {
                    if (enter) {
                        result.setText("");
                        enter = false;
                        sum = false;
                    }
                    Log.i(TAG, "5");
                    result.append("5");
                }
            }
        });

        findViewById(R.id.button_6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!error) {
                    if (enter) {
                        result.setText("");
                        enter = false;
                        sum = false;
                    }
                    Log.i(TAG, "6");
                    result.append("6");
                }
            }
        });

        findViewById(R.id.button_7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!error) {
                    if (enter) {
                        result.setText("");
                        enter = false;
                        sum = false;
                    }
                    Log.i(TAG, "7");
                    result.append("7");
                }
            }
        });

        findViewById(R.id.button_8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!error) {
                    if (enter) {
                        result.setText("");
                        enter = false;
                        sum = false;
                    }
                    Log.i(TAG, "8");
                    result.append("8");
                }
            }
        });

        findViewById(R.id.button_9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!error) {
                    if (enter) {
                        result.setText("");
                        enter = false;
                        sum = false;
                    }
                    Log.i(TAG, "9");
                    result.append("9");
                }
            }
        });

        findViewById(R.id.button_0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!error) {
                    if (enter) {
                        result.setText("");
                        enter = false;
                        sum = false;
                    }
                    Log.i(TAG, "0");
                    result.append("0");
                }
            }
        });

        findViewById(R.id.button_comma).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!error) {
                    if (enter) {
                        result.setText("");
                        enter = false;
                        result.append("0");
                    }
                    if(!calc.point) {
                        Log.i(TAG, ".");
                        result.append(".");
                        calc.point=true;
                        sum = false;
                    }
                }
            }
        });

        findViewById(R.id.button_plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!error) {
                    calc.setX1(Double.parseDouble(result.getText().toString()));
                    sign = "+";
                    //result.setText("");
                    enter = true;
                    calc.point = false;
                }
            }
        });

        findViewById(R.id.button_minus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!error) {
                    calc.setX1(Double.parseDouble(result.getText().toString()));
                    sign = "-";
                    //result.setText("");
                    enter = true;
                    calc.point = false;
                }
            }
        });

        findViewById(R.id.button_multiplication).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!error) {
                    calc.setX1(Double.parseDouble(result.getText().toString()));
                    sign = "*";
                    //result.setText("");
                    enter = true;
                    calc.point = false;
                }
            }
        });

        findViewById(R.id.button_division).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!error) {
                    calc.setX1(Double.parseDouble(result.getText().toString()));
                    sign = "/";
                    //result.setText("");
                    enter = true;
                    calc.point = false;
                }
            }
        });

        findViewById(R.id.button_reverse).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(!error) {
                    //calc.setX1(Double.parseDouble(result.getText().toString()));
                    //calc.operation_convert();
                    result.setText(String.valueOf(Double.parseDouble(result.getText().toString())*-1));
                }
            }
        });

        findViewById(R.id.button_result).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.point = false;
                if (sum) {
                    calc.setX1(Double.parseDouble(result.getText().toString()));
                } else {
                    calc.setX2(Double.parseDouble(result.getText().toString()));
                }
                if (sign == "+") {
                    calc.operation_sum();
                    sum = true;
                }
                if (sign == "-") {
                    calc.operation_minus();
                    sum = true;
                }
                if (sign == "*") {
                    calc.operation_multiplication();
                    sum = true;
                }
                if (sign == "/") {
                    calc.operation_division();
                    sum = true;
                }
                enter = true;
                result.setText(calc.getResult());
            }
        });

        findViewById(R.id.button_backspace).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                calc.setTemp(result.getText().toString());
                calc.operation_backcpace();
                result.setText(calc.getTemp());
            }
        });
    }

    @Override
    public void onClick(View v) {
        Log.i(TAG, "clear");
        result.setText("0");
        error = false;
        enter = true;
        calc.point = false;
        calc.setX1(0);
        calc.setX2(0);
    }

}
