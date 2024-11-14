public abstract class Shape {
    protected double a;
    protected double b;
    ShapeType type;
    public Shape() { this(0.0, 0.0); }
    public Shape(double a, double b) {
        setter(a, b);
    }

    /** calcArea
     * 计算形状的面积
     * @return 面积
     */
    abstract public double calcArea();

    /* 其他必要的方法，比如 getter 和 setter */
    public void setter(double a, double b) {
        if(a < 0 || b < 0) {
            this.a = 0;
            this.b = 0;
            throw new IllegalArgumentException("长度不能为负数");
        }
        else {
            this.a = a;
            this.b = b;
        }
    }
}