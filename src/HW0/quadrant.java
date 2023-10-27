package HW0;

public class quadrant {

    static int quadrant(double a, double b) {
        int ret;
        if (a < 0 && b > 0) {
            ret = 2;
        } else if (a > 0 && b > 0) {
            ret = 1;
        } else if (a > 0 && b < 0) {
            ret = 4;
        } else if (a < 0 && b < 0) {
            ret = 3;
        }else  ret =0;
        return ret;
    }
}
