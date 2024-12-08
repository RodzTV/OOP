package ball;

class Ball {
	private double x, y, xStep, yStep;
    public Ball(double x, double xStep, double y, double yStep){
        this.x = x;
        this.y = y;
        this.xStep = xStep;
        this.yStep = yStep;
    }

    public void setX(double x){
        this.x = x;
    }
    public double getX(){
        return this.x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getY(){
        return this.y;
    }
    public void setXStep(double xStep){
        this.xStep = xStep;
    }
    public double getXStep(){
        return this.xStep;
    }
    public void setYStep(double yStep){
        this.yStep = yStep;
    }
    public double getYStep(){
        return this.yStep;
    }
    
    public String toString(){
        return "Ball@(" + x + "," + y + "),speed=("+xStep+","+yStep+")";
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double[] getXY(){
        double[] temp = {this.x, this.y};
        return temp;
    }

    public void setXYStep(double xStep, double yStep){
        this.xStep = xStep;
        this.yStep = yStep;
    }
    public double[] getXYStep(){
        double[] temp = {this.xStep,this.yStep}; 
        return temp;
    }

    public Ball move(){
        x += xStep;
        y += yStep;
        return this;
    }

}
