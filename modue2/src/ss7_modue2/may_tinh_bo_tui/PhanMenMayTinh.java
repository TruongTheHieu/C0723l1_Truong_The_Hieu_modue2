package ss7_modue2.may_tinh_bo_tui;

public class PhanMenMayTinh  implements MayTinhBoTuiInterface,SapXepInterface{
    @Override
    public double cong(double a, double b) {
        return a+b;
    }

    @Override
    public double tru(double a, double b) {
        return a-b;
    }

    @Override
    public double nhan(double a, double b) {
        return a*b;
    }

    @Override
    public double chia(double a, double b) {
        return a/b;
    }

    public void SapXepTang(double[] arr) {
        int n = arr.length;
        double key;
        int i,j;
        for (i = 1; i<n ;i++) {
            key = arr[i];
            j= i-1;
            while (j>= 0 && arr[j] >key){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1]= key;
        }
    }

    @Override
    public void SapXepGiam(double[] arr) {
        int n = arr.length;
        double key;
        int i,j;
        for (i = 1; i<n ;i++) {
            key = arr[i];
            j= i-1;
            while (j>= 0 && arr[j] < key){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1]= key;
        }
    }
}
