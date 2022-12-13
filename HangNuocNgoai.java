import java.util.Scanner;

public class HangNuocNgoai extends HangHoa{
    private float giaDo;
    public float getGiaDo() {
        return giaDo;
    }
    public void setGiaDo(float giaDo) {
        this.giaDo = giaDo;
    }
    private String nuoc;
    public String getNuoc() {
        return nuoc;
    }
    public void setNuoc(String nuoc) {
        this.nuoc = nuoc;
    }

    public HangNuocNgoai() {
    }


    public HangNuocNgoai(String maHang, String maLoai, int soLuong, String tenHang, float giaDo, String nuoc) throws Exception{
        super(maHang, maLoai, soLuong, tenHang);
        this.giaDo = giaDo;
        this.nuoc = nuoc;
    }

    @Override
    public void nhapHangHoa() throws Exception {
        super.nhapHangHoa();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia do: ");
        float giaDo = Float.parseFloat(sc.nextLine());
        this.giaDo = giaDo;
        System.out.println("Nhap nuoc: ");
        String nuoc = sc.nextLine();
        this.nuoc = nuoc;
    }


    @Override
    public void xuatHangHoa() {
        System.out.print("Ma hang: " + this.maHang);
        System.out.print(", Ma loai: " + this.maLoai);
        System.out.print(", So luong: " + this.soLuong);
        System.out.print(", Ten hang: " + this.tenHang);
        System.out.print(", Gia do: " + this.giaDo);
        System.out.print(", Nuoc: " + this.nuoc);
        System.out.println();
    }
}
