package ss7_modue2.may_tinh_bo_tui;

public class Test {
    public static void main(String[] args) {
        System.out.println("tets câu a : ");
        MayTinhCasioFx500 mtx500 = new MayTinhCasioFx500();
        MayTinhViNaCal500 mtvnc500 = new MayTinhViNaCal500();
        System.out.println("6*3 = " + mtx500.nhan(6,3));
        System.out.println("test cau b" );
        double[] arr = new double[] {6,23,45,2,6,31,2,4,};
        SapXepChen sxchen = new SapXepChen();
        SapXepChon sxchon = new SapXepChon();
        sxchen.SapXepTang(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.println("test cau c");
        PhanMenMayTinh pmmt = new PhanMenMayTinh();
        System.out.println("6*3 = " + mtx500.nhan(6,3));
        double[] arr2 = new double[] {3,1,4,2,6,1,5,9,0};
        pmmt.SapXepTang(arr2);
        for (int i = 0; i <arr2.length ; i++) {
            System.out.print(arr2[i] + "  ");
        }

    }
}
