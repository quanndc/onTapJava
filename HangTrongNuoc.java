import java.util.Scanner;

public class HangTrongNuoc extends HangHoa{
    private float gia;

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }
    
    public HangTrongNuoc(String maHang, String maLoai, int soLuong, String tenHang, float gia) throws Exception{
        super(maHang, maLoai, soLuong, tenHang);
        this.gia = gia;
    }

    public HangTrongNuoc() {
    }

    @Override
    public void nhapHangHoa()throws Exception{
        Scanner sc = new Scanner(System.in);
        super.nhapHangHoa();
        System.out.println("Nhap gia: ");
        float gia = Float.parseFloat(sc.nextLine());
        this.gia = gia;
    }


    @Override
    public void xuatHangHoa() {
        System.out.print("Ma hang: " + this.maHang);
        System.out.print(", Ma loai: " + this.maLoai);
        System.out.print(", So luong: " + this.soLuong);
        System.out.print(", Ten hang: " + this.tenHang);
        System.out.print(", Gia: " + this.gia);
        System.out.println();
    }
}
