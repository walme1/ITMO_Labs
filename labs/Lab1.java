public class Lab1 {
    public static void main(String[] args) {
        long[] e = {23, 21, 19, 17, 15, 13, 11, 9, 7, 5, 3}; // 11
        double[] x = new double[14];
        double[][] h = new double[11][14];
        
        for (int i = 0; i < x.length; i++) {
            x[i] = Math.random() * 17.0 - 3.0; // -3.0 to 14.0
        }
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < x.length; j++) {
                h[i][j] = calculations(e[i], x[j]);
            }
        }
        result(h);
    }
    public static double calculations(long e, double x) {
        switch ((int) e) {
            case 17:
                return Math.exp(Math.exp(Math.log(Math.abs(x))));
            case 3, 5, 9, 11, 19:
                return Math.pow(Math.PI / (1 - Math.sin(Math.exp(x))), Math.atan((x + 5.5) / 17));
            default:
                return Math.cbrt(Math.pow(Math.log(Math.abs(x)) / 2, Math.atan(0.2 * (x + 5.5) / 17)));
        }
    }
    public static void result(double[][] h) {
        for (int i = 0; i < h.length; i++) {
            for (int j = 0; j < h[i].length; j++) {
                System.out.printf("%10.4f ", h[i][j]);
            }
            System.out.println();
        }
    }
}
