package Interface.exer2;

public class ComparableCircle extends Circle implements CompareObject {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    //根据半径的大小比较对象大小
    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }

        if (o instanceof ComparableCircle) {
            ComparableCircle c = (ComparableCircle) o;
            //正确写法1
//            if (this.getRadius() > c.getRadius()) {
//                return 1;
//            } else if (this.getRadius()<c.getRadius()){
//                return -1;
//            }else {
//                return 0;
//            }
//            }
            //正确写法2
            return Double.compare(this.getRadius(),c.getRadius());

        }else {
            throw new RuntimeException("输入的类型有误");
        }

    }
}
