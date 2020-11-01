package com.atguigu.design.principle.OpenClose;

/**
 * @author 苏晓虎start
 * @create 2020-09-08 23:09
 * @Description: 未遵守开闭原则，要新增一个图形会改动代码多个点位
 */
public class ocp {
    public static void main(String[] args) {
        //试用看看存在的问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawRectangle(new Rectangle());
        graphicEditor.drawCircle(new Circle());
        graphicEditor.drawTriangle(new Triangle());
    }
}

//这是一个用于绘图的类
class GraphicEditor{
    //接收Shape对象，然后根据type，来绘制不同的图形
    public void drawShape(Shape s){
        if (s.m_type==1)
            drawRectangle(s);
        else if(s.m_type==2)
            drawCircle(s);
        else if (s.m_type==3)
            drawTriangle(s);
    }
    //绘制矩形方法
    public void drawRectangle(Shape r){
        System.out.println("绘制矩形");
    }
    //绘制圆形方法
    public void drawCircle(Shape r){
        System.out.println("绘制圆形");
    }
    //绘制三角形方法
    public void drawTriangle(Shape r){
        System.out.println("绘制三角形");
    }
}

//基类
class Shape{
    int m_type;
}

class Rectangle extends  Shape{
    Rectangle(){
        super.m_type=1;
    }
}

class Circle extends Shape{
    Circle(){
        super.m_type=2;
    }
}

//新增三角形
class Triangle extends Shape{
    Triangle(){
        super.m_type=3;
    }
}