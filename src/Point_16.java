public class Point_16 {
    int x;
    int y;

    public Point_16(){
        this.x = 0;
        this.y = 0;
    }

    public Point_16(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public double distance(){
        return Math.sqrt((this.x-0)*(this.x-0)+(this.y-0)*(this.y-0));
    }

    public double distance(int x1, int y1){
        return Math.sqrt((this.x - x1)* (this.x - x1) + (this.y - y1)* (this.y - y1));
    }

    public double distance(Point_16 p){
        return Math.sqrt((this.x - p.x)* (this.x - p.x) + (this.y - p.y)* (this.y - p.y));
    }

    public static void main(String[] args) {
        Point_16 first = new Point_16(6, 5);
        Point_16 second = new Point_16(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point_16 point16 = new Point_16();
        System.out.println("distance()= " + point16.distance());
    }
}
