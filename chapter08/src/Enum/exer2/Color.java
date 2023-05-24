package Enum.exer2;

enum Color {

    RED(255, 0, 0, "红色"),
    ORANGE(255, 120, 0, "橙色"),
    YELLOW(12, 11, 22, "黄色"),
    GREEN(11, 333, 222, "绿色"),
    CYAN(122, 233, 223, "灰色"),
    BLUE(112, 222, 222, "蓝色"),
    PURPLE(55, 232, 333, "紫色");


    private final int red;
    private final int green;
    private final int blue;

    private final String description;

    Color(int red, int green, int blue, String description) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.description = description;
    }

    @Override
    public String toString() {
        return name() + "(" + red +","+ blue +","+ green + ")"+"->" + description;
    }
}
