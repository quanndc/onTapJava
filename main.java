import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws Exception{
        //HangHoa hh = new HangHoa("HH01", "L02", 10, "Hang hoa 1");
        HangHoa hh = new HangTrongNuoc("HH01", "L02", 10, "Hang hoa 1", 10000);
        HangHoa hh2 = new HangNuocNgoai("HQ01", "L01", 20, "Hang quoc te 1", 1000, "Viet Nam");
        HangHoa hh3 = new HangTrongNuoc();
        HangHoa hh4 = new HangNuocNgoai();

        hh3.nhapHangHoa();
        hh4.nhapHangHoa();
        ArrayList<HangHoa> list = new ArrayList<HangHoa>();

        list.add(hh);
        list.add(hh2);
        list.add(hh3);
        list.add(hh4);


        for(HangHoa i : list){
            i.xuatHangHoa();
        }

    }   
}
