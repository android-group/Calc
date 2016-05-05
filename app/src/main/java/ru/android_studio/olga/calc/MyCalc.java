package ru.android_studio.olga.calc;

/**
 * Created by olga on 26.04.2016.
 */
public class MyCalc {

    private double x1;
    private double x2;
    private StringBuilder temp;
    public boolean point;

    private String result;

    public void setX1(double newX1)
    {
        x1 = newX1;
    }

    public void setX2(double newX2)
    {
        x2 = newX2;
    }

    public void setTemp(String temp){
        this.temp = new StringBuilder(temp);}

    public double getX1(){return x1;}

    public double getX2(){return x2;}

    public StringBuilder getTemp(){return temp;}

    public String getResult()
    {
        return result;
    }

    public void operation_sum()
    {
        result = String.valueOf(x1+x2);
    }

    public void operation_minus()
    {
        result = String.valueOf(x1-x2);
    }

    public void operation_multiplication()
    {
        result = String.valueOf(x1*x2);
    }

    public void operation_division()
    {
        if(x2==0)
            result = "Error!";
        else
        {
            result = String.valueOf(x1 / x2);
        }
    }

    public void operation_convert()
    {
        x1=x1*-1;
    }

    public void operation_backcpace(){
        if(temp.length()>0)
        {
            temp.deleteCharAt(temp.length()-1);
        }
    }


}
