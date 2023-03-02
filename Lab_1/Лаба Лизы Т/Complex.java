public class Complex {
    double Re;
    double Im;

    public Complex (double x, double y){
        this.Re = x;
        this.Im = y;
    }

    public Complex Sum (double re1, double im1, double re2, double im2){
        double re = re1+re2;
        double im = im1+im2;
        return new Complex(re, im);
    }

    public void Add(double re1, double im1, double re2, double im2){
        System.out.println("Sum c(1) + c(2): " + (re1+re2) + " + (" + (im1+im2) + ")*i" );
    }

    public void Sub(double re1, double im1, double re2, double im2){
        System.out.println("Difference c(1) - c(2): " + (re1-re2) + " + (" + (im1-im2) + ")*i" );
    }

    public double Mod() {
        return Math.sqrt(Math.pow(Re,2)+Math.pow(Im,2));
    }
    public double Arg(){
        return Math.atan(Im/Re);
    }
}
