
package DAYDU;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
class Tivi {
    String mativi;
    String loaitivi;
    String kieumanhinh;
    double kichthuocmanhinh;
    double dongia;
    int soluong;

    public Tivi(String maTivi, String loaiTivi, String kieumanhinh1, Double kichthuocmanhinh1, double dongia1, int soluong1) {}

    public Tivi(String mativi, String loaitivi, String kieumanhinh, double kichthuocmanhinh, int soluong) {
        this.mativi = mativi;
        this.loaitivi = loaitivi;
        this.kieumanhinh = kieumanhinh;
        this.kichthuocmanhinh = kichthuocmanhinh;
        this.dongia = dongia;
        this.soluong = soluong;
    }

    public String getMativi() {
        return mativi;
    }

    public void setMativi(String mativi) {
        this.mativi = mativi;
    }

    public String getloaitivi() {
        return loaitivi;
    }
    public void setloaitivi(String loaitivi){
        this.loaitivi=loaitivi;
    }

    public void setTentivi(String loaitivi) {
        this.loaitivi = loaitivi;
    }

    public String getkieumanhinh() {
        return kieumanhinh;
    }

    public void setkieumanhinh(String kieumanhinh) {
        this.kieumanhinh = kieumanhinh;
    }

    public double getkichthuocmanhinh() {
        return kichthuocmanhinh;
    }

    public void setkichthuocmanhinh(double kichthuocmanhinh) {
        this.kichthuocmanhinh = kichthuocmanhinh;
    }

    public double getdongia() {
        return dongia;
    }

    public void setdongia(double dongia) {
        this.dongia = dongia;
    }

    public int getsoluong() {
        return soluong;
    }

    public void setsoluong(int soluong) {
        this.soluong = soluong;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma Tivi:");
        mativi = scanner.nextLine();
        System.out.println("Nhap loai Tivi:");
        loaitivi = scanner.nextLine();
        System.out.println("Nhap kieu man hinh:");
        kieumanhinh = scanner.nextLine();
        System.out.println("Nhap kich thuoc man hinh:");
        kichthuocmanhinh = scanner.nextDouble();
        System.out.println("Nhap don gia:");
        dongia = scanner.nextDouble();
        System.out.println("Nhap so luong:");
        soluong = scanner.nextInt();
    }
       public void xuat(){
        System.out.println("Ma Tivi:"+ mativi);
        System.out.println("Loai Tivi:"+ loaitivi);
        System.out.println("Kieu man hinh:"+ kieumanhinh);
        System.out.println("Kich thuoc man hinh:"+ kichthuocmanhinh);
        System.out.println("don gia:"+ dongia);
        System.out.println("so luong:"+ soluong);
       }
}
class samsung extends Tivi{


public samsung(String mativi, String loaitivi, double kichthuocmanhinh,String kieumanhinh,double dongia, int soluong ) {
super(mativi,loaitivi,kieumanhinh,kichthuocmanhinh,soluong);
}

@Override
public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma Tivi:");
        mativi = scanner.nextLine();
        System.out.println("Nhap loai Tivi:");
        loaitivi = scanner.nextLine();
        System.out.println("Nhap kieu man hinh:");
        kieumanhinh = scanner.nextLine();
        System.out.println("Nhap kich thuoc man hinh:");
        kichthuocmanhinh = scanner.nextDouble();
        System.out.println("Nhap don gia:");
        dongia = scanner.nextDouble();
        System.out.println("Nhap so luong:");
        soluong = scanner.nextInt();
    }
@Override
       public void xuat(){
        System.out.println("ma Tivi:"+ mativi);
        System.out.println("Loai Tivi:"+ loaitivi);
        System.out.println("Kieu man hinh:"+ kieumanhinh);
        System.out.println("Kic thuoc man hinh:"+ kichthuocmanhinh);
        System.out.println("don gia:"+ dongia);
        System.out.println("so luong:"+ soluong);
       }
}
class LG extends Tivi{


public LG(String mativi, String loaitivi, double kichthuocmanhinh,String kieumanhinh,double dongia, int soluong ) {
super(mativi,loaitivi,kieumanhinh,kichthuocmanhinh,soluong);
}

@Override
public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma Tivi:");
        mativi = scanner.nextLine();
        System.out.println("Nhap loai Tivi:");
        loaitivi = scanner.nextLine();
        System.out.println("Nhap kieu man hinh:");
        kieumanhinh = scanner.nextLine();
        System.out.println("Nhap kich thuoc man hinh:");
        kichthuocmanhinh = scanner.nextDouble();
        System.out.println("Nhap don gia:");
        dongia = scanner.nextDouble();
        System.out.println("Nhap so luong:");
        soluong = scanner.nextInt();
    }
@Override
       public void xuat(){
           
        System.out.println("ma Tivi:"+ mativi);
        System.out.println("Loai Tivi:"+ loaitivi);
         
        System.out.println("Kieu man hinh:"+ kieumanhinh);
      
        System.out.println("Kic thuoc man hinh:"+ kichthuocmanhinh);
        
        System.out.println("don gia:"+ dongia);
        System.out.println("so luong:"+ soluong);
 
       }
}
class Menuchinh {

    List<Tivi> tvList = new ArrayList<>();
    boolean menu12 = false;
    boolean menu34 = false;
    Scanner sc = new Scanner(System.in);

    public void displayMenu12() {
       
        System.out.println("=== Menu 1 ===");
        System.out.println("1. Tivi SamSung");
        System.out.println("2. Tivi LG");
        System.out.println("0. Thoat");
         System.out.println("Moi ban chon : ");
        
    }

    public void displayMenu34() {
        System.out.println("=== Menu 2 ===");
        System.out.println("1. Them");
        System.out.println("2. Hien thi danh sach ");
        System.out.println("3. Xoa");
        System.out.println("4. Sua");
        System.out.println("5.Sap xep theo gia ");
        System.out.println("6. Thoat");
        System.out.println("7.Quay lai Menu 1");
        System.out.println("Moi ban chon: ");
        

    }

    public void selectMenu() {
    int choice; 
    do {
        if (!menu12) {
            displayMenu12();
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                    menu12 = true;
                        break;
                    case 2:
                        menu12 =true;
                        break;
                   
                   case 0:
                       System.out.println("Dang Thoat...!");
                    return;
                default:
                    
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
                    break;
                }
        } else if (!menu34) {
            boolean menu34 = false;
           
        do{
            displayMenu34();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
    System.out.print("Nhap so luong can them: ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
        System.out.println("Lan nhap thu " + (i + 1) + ": ");
       
        Scanner sc = new Scanner(System.in); // tạo đối tượng Scanner mới
        // Thêm Tivi
        System.out.println("Nhap ma Tivi:");
        String maTivi = sc.nextLine();

        System.out.println("Nhap loai Tivi:");
        String loaiTivi = sc.next();

        System.out.println("Nhap kieu man hinh:");
        String kieumanhinh = sc.next();
        
        System.out.println("Nhap kich thuoc man hinh:");
        Double kichthuocmanhinh = sc.nextDouble();
          
        System.out.println("Nhap don gia:");
        double dongia = sc.nextDouble();

        System.out.println("Nhap so luong:");
        int soluong = sc.nextInt();
     

       Tivi tivi = new Tivi(maTivi,loaiTivi,kieumanhinh,kichthuocmanhinh,dongia,soluong);
       tivi.setMativi(maTivi);
       tivi.setloaitivi(loaiTivi);
       tivi.setkieumanhinh(kieumanhinh);
            tivi.setkichthuocmanhinh(kichthuocmanhinh);
            tivi.setdongia(dongia);
            tivi.setsoluong(soluong);
      
        tvList.add(tivi);
       
        System.out.println("Them Tivi thanh cong!");
    }
    menu34 = true;
    break;
                
 
case 2:
   // Hiển thị danh sách tivi
    if (tvList.isEmpty()) {
        System.out.println("Danh sách trống.");
    } else {
        
        System.out.println("Danh sách Tivi:");
        for (Tivi tivi : tvList) {
            System.out.println("----------------------------");
            tivi.xuat();
        }
         menu34 = true;
    }
    break;
case 3:
    if (tvList.isEmpty()) {
        System.out.println("Danh sách trống.");
    } else {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã Tivi cần xóa:");
        String maTiviXoa = sc.nextLine();
        boolean timThay = false;
        for (Iterator<Tivi> iterator = tvList.iterator(); iterator.hasNext();) {
            Tivi tivi = iterator.next();
            if (tivi.getMativi().equals(maTiviXoa)) {
                iterator.remove();
                System.out.println("Xóa Tivi thành công.");
                timThay = true;
                break;
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy Tivi cần xóa.");
        }
    }
    menu34 = true;
    break;

case 4:
   if (tvList.isEmpty()) {
    System.out.println("Danh sach trong.");
} else {
       Scanner sc = new Scanner(System.in);
    System.out.println("Nhap ma tivi can sua:");
    String maTiviSua = sc.nextLine();
    boolean timThay = true;
    for (Iterator<Tivi> iterator = tvList.iterator(); iterator.hasNext();) {
        Tivi tivi = iterator.next();
        if (tivi.getMativi().equalsIgnoreCase(maTiviSua)) {
            System.out.println("Nhap thong tin Tivi moi:");
            
            System.out.println("Nhap ma tivi: ");
            String mativi = sc.nextLine();            
            System.out.println("Nhap loai tivi:");
            String loaitivi = sc.nextLine();           
            System.out.println("Nhap kieu man hinh:");
            String kieumanhinh = sc.nextLine();
            System.out.println("Nhap kich thuoc ma hinh:");
            Double kichthuocmanhinh = sc.nextDouble();

             System.out.println("Nhap don gia :");
            Double dongia = sc.nextDouble();
            
             System.out.println("Nhap so luong :");
            int soluong = sc.nextInt();
            

            // Cập nhật thông tin Tivi
            tivi.setMativi(mativi);
            tivi.setloaitivi(loaitivi);
            tivi.setkieumanhinh(kieumanhinh);
            tivi.setkichthuocmanhinh(kichthuocmanhinh);
            tivi.setdongia(dongia);
            tivi.setsoluong(soluong);
            
            System.out.println("Cập nhật thông tin Tivi thành công.");
            timThay = true;
            break;
        }
    }
    if (!timThay) {
        System.out.println("Không tìm thấy Tivi cần sửa.");
    }
}
menu34 = true;
break;
case 5:
    if (tvList.isEmpty()) {
    System.out.println("Danh sach trong.");
} else {
    // Sắp xếp danh sách Tivi theo đơn giá
    Collections.sort(tvList, new Comparator<Tivi>() {
        @Override
        public int compare(Tivi t1, Tivi t2) {
            return Double.compare(t1.getdongia(), t2.getdongia());
        }
    });

    // Hiển thị danh sách Tivi đã sắp xếp
    System.out.println("Danh sach Tivi da sap xep theo don gia:");
    for (Tivi tivi : tvList) {
        System.out.println("Ma tivi: " + tivi.getMativi() + ", Loai tivi: " + tivi.getloaitivi() + ", Kieu man hinh: " + tivi.getkieumanhinh() + ", Kich thuoc man hinh: " + tivi.getkichthuocmanhinh() + ", Don gia: " + tivi.getdongia() + ", So luong: " + tivi.getsoluong());
    }
}
menu34 = true;
break;
case 6:
    // Thoát chương trình
    System.out.println("Cảm ơn bạn đã sử dụng chương trình.");
    System.exit(0);
 case 7:
                    menu12 = false;
                    menu34 = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
                    break;
            }
        } while (!menu34);
        } 
    } while (true);

}
}
class main {
    public static void main(String[] args) {  
        Menuchinh mn = new Menuchinh();
        mn.selectMenu();                         
    }
}
