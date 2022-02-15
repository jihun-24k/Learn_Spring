public class Calculator {
    private  ICaculator iCaculator;

    public Calculator (ICaculator iCaculator){
        this.iCaculator = iCaculator;
    }

    public int sum(int x, int y){
        return this.iCaculator.sum(x,y);
    }

    public int minus(int x, int y){
        return this.iCaculator.minus(x, y);
    }
}
