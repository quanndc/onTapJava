import java.util.Scanner;

public class HangHoa {
    protected String maHang;
    public String getMaHang() {
        return maHang;
    }
    public void setMaHang(String maHang) throws Exception{
        try{
            if(maHang == ""){
                throw new Exception("Ma hang khong duoc de trong");
            }
            else{
                this.maHang = maHang;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            return;
        }
    }
    protected String tenHang;
    public String getTenHang() {
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
    protected int soLuong;
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong)throws Exception {
        try{
            if(soLuong <= 0){
                throw new Exception();
            }
            else{
                this.soLuong = soLuong;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    protected String maLoai;
    public String getMaLoai() {
        return maLoai;
    }
    public void setMaLoai(String maLoai) throws Exception{
        try{
            if(!maLoai.matches("[L][0][1-2]")){
                throw new Exception("Ma loai khong hop le");
            }
            else{
                this.maLoai = maLoai;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public HangHoa() {
    }


    public HangHoa(String maHang, String maLoai, int soLuong, String tenHang) throws Exception{
        try{
            if(maHang == ""){
                throw new Exception("Ma hang khong duoc de trong");
            }
            else{
                this.maHang = maHang;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            if(!maLoai.matches("[L][0][1-2]")){
                throw new Exception("Ma loai khong hop le");
            }
            else{
                this.maLoai = maLoai;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            if(soLuong <= 0){
                throw new Exception("So luong khong duoc nho hon 0");
            }
            else{
                this.soLuong = soLuong;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        this.tenHang = tenHang;
    }

    public void nhapHangHoa() throws Exception{
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap ma hang: ");
            this.maHang = sc.nextLine();
            try{
                if(maHang == ""){
                    throw new Exception("Ma hang khong duoc de trong");
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }while(this.maHang == "");

        do{
            System.out.println("Nhap ma loai: ");
        this.maLoai = sc.nextLine();
        try{
            if(!maLoai.matches("[L][0][1-2]")){
                throw new Exception("Ma loai khong hop le");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        }while(!this.maLoai.matches("[L][0][1-2]"));

        
        do{
            System.out.println("Nhap so luong: ");
        this.soLuong = sc.nextInt();
        try{
            if(soLuong <= 0){
                throw new Exception("So luong khong duoc nho hon 0");
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        }while(this.soLuong <= 0);

        sc.nextLine();
        System.out.println("Nhap ten hang: ");
        String tenHang = sc.nextLine();
        this.tenHang = tenHang;
    }
    

    public void xuatHangHoa(){
        System.out.print("Ma hang: " + this.maHang);
        System.out.print(", Ma loai: " + this.maLoai);
        System.out.print(", So luong: " + this.soLuong);
        System.out.print(", Ten hang: " + this.tenHang);
        System.out.println();
    }
}
