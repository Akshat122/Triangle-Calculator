/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Akshat
 */
@Named(value = "triangle")
@RequestScoped
public class Triangle {

    /**
     * Creates a new instance of CalculatorJSFBean
     */
    public Triangle() {
    }

    private boolean btn1 = false;
    private Double number1 = 0.0, number2 = 0.0, number3 = 0.0, angle1 = 0.0, angle2 = 0.0, angle3 = 0.0, area = 0.0, perimeter = 0.0;
    private String result = "";

    public boolean getBtn1() {
        if (btn1) {
            return true;
        } else {
            return false;
        }
    }

    public Double getNumber1() {
        return number1;
    }

    public void setNumber1(Double number1) {
        this.number1 = number1;
    }

    public Double getNumber2() {
        return number2;
    }

    public void setNumber2(Double number2) {
        this.number2 = number2;
    }

    public Double getNumber3() {
        return number3;
    }

    public void setNumber3(Double number3) {
        this.number3 = number3;
    }

    public Double getAngle1() {
        return angle1;
    }

    public void setAngle1(Double angle1) {
        this.angle1 = angle1;
    }

    public Double getAngle2() {
        return angle2;
    }

    public void setAngle2(Double angle2) {
        this.angle2 = angle2;
    }

    public Double getAngle3() {
        return angle3;
    }

    public void setAngle3(Double angle3) {
        this.angle3 = angle3;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void add() {
        if (isTriangle(number1, number2, number3)) {
            btn1 = true;
            calcarea();
            calperimeter();
            A();
            B();
            C();
        } else {
            btn1 = false;
        }
    }

    public void calcarea() {
        double p = (number1 + number2 + number3) / 2;
        area = Math.sqrt(p * (p - number1) * (p - number2) * (p - number3));
    }

    public void calperimeter() {
        perimeter = number1 + number2 + number3;
    }

    public void A() {
        double a = (Math.pow(number1, 2) + Math.pow(number3, 2) - Math.pow(number2, 2)) / (2 * number1 * number3);
        double temp = Math.acos(a);
        angle1 = temp * (180 / Math.PI);
    }

    public void B() {
        double a = (Math.pow(number2, 2) + Math.pow(number1, 2) - Math.pow(number3, 2)) / (2 * number2 * number1);
        double temp = Math.acos(a);
        angle2 = temp * (180 / Math.PI);
    }

    public void C() {
        double a = (Math.pow(number3, 2) + Math.pow(number2, 2) - Math.pow(number1, 2)) / (2 * number3 * number2);
        double temp = Math.acos(a);
        angle3 = temp * (180 / Math.PI);
    }

    public Boolean isTriangle(Double a, Double b, Double c) {
        if ((a + b > c)) {
            if ((b + c > a)) {
                if ((c + a > b)) {
                    result = "Is a valid Triangle";
                    return true;
                } else {
                    result = "Not a Triangle";
                    return false;
                }
            } else {
                result = "Not a Triangle";
                return false;
            }
        } else {
            result = "Not a Triangle";
            return false;
        }
    }

}
