public class Wall {
    public Double width;
    public Double height;

    public Wall(Double width,Double height) {
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    };
    public Double getHeight() {
        return height;
    }
    public Double setWidth(double index) {
        if (index>0) {
            return width =index;
        }
        return width=0.0;
    }
    public Double setHeight(double index) {
        if (index>0) {
            return height = index;
        }
        return height = 0.0;
    }

    public Double getArea() {
        return width*height;
    }
}
