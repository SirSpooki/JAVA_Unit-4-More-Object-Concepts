class Circle {
    private double radius;
    private double area;
    private double diameter;
    Circle() 
    {
        radius = 1;
        computeArea(1);
        computeDiameter(1);
    }
    public void setRadius(double r) 
    {
        radius = r;
        computeDiameter(r);
        computeArea(r);
    }
    public double getRadius() 
    {
        return radius;
    }
    private void computeDiameter(double r) 
    {
        diameter = r*2;
    }
    private void computeArea(double a) 
    {
        area = Math.PI * (a * a);
    }
    public double getDiameter() 
    {
        return diameter;
    }
    public double getArea() 
    {
        return area;
    }
}
