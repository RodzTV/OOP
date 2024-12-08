public class Point {
    private int x, y;

    /* Default Constructor */
    public Point(){
        this.x = 0;
        this.y = 0;
    }

    /* Constructor to set x and y */
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    /* setters and getters */
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    
    /* toString method to display the instance */
    public String toString(){
        return "("+ x + "," + y + ")";
    }

    /* setXY method to change both x and y */
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    /* getXY method to get the value of x and y */
    public int[] getXY(){
        int[] res = {x,y};
        return res;
    }

    /* distance method to calculate the distance from the instance to the given point */
    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    /* distance method with no parameter to get the distance from the instance to (0,0) */
    public double distance(){
        return Math.sqrt(this.x * this.x +  this.y * this.y);
    }
}