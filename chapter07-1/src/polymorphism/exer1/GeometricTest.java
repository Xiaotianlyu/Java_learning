package polymorphism.exer1;

/**
 * 定义一个测试类 GeometricTest，
 * 编写 equalsArea方法测试两个对象的面积是否相等（注意方法的参数类型，利用动态绑定技
 * 编写 displayGeometricObject 方法显示对象的面积（注意方法的参数类型，利用动态绑定技术）
 */

public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        Circle c1 = new Circle("red",2,5);
        Circle c2 = new Circle("red",3,5);

        test.displayGeometricObject(c1);
        test.displayGeometricObject(c2);

        boolean isEquals = test.equalsArea(c1,c2);
        if(isEquals){
            System.out.println("面积相等");
        }else{
            System.out.println("面积不相等");
        }

    }
    /**
     * 测试两个对象的面积是否相等
     * @param g1
     * @param g2
     * @return
     */
    public boolean equalsArea(GeomatricObject g1, GeomatricObject g2) {
        return g1.findArea() == g2.findArea();
    }


    /**
     * 显示对象的面积
     * @param g
     */
    public void displayGeometricObject(GeomatricObject g){
        System.out.println(g.findArea());
    }


}
