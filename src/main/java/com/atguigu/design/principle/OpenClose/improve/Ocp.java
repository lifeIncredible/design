package com.atguigu.design.principle.OpenClose.improve;

/**
 * @author 苏晓虎start
 * @create 2020-09-08 23:25
 * @Description:遵循开闭原则，新增一个其他图形改动点特别少，只需要加个类就可以了
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
    }
}


//这是一个用于绘图的类
class GraphicEditor{
    //接收Shape对象，然后根据type，来绘制不同的图形
    public void drawShape(Shape s){
        s.draw();
    }
}

//基类
abstract class Shape{
    int m_type;
    public abstract void draw();
}

class Rectangle extends Shape {
    Rectangle(){
        super.m_type=1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {
    Circle(){
        super.m_type=2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

//三角形
class Triangle extends Shape {
    Triangle(){
        super.m_type=3;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}

//新增一个图形
class OtherGraphic extends Shape{
    OtherGraphic(){
        super.m_type=4;
    }

    @Override
    public void draw() {
        System.out.println("绘制其他图形");
    }
}