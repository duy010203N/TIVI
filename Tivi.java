
package DAYDU;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
class Tivi {
    int mativi;
    String loaitivi;
    String kieumanhinh;
    double kichthuocmanhinh;
    double dongia;
    int soluong;

    public Tivi() {}

    public Tivi(int mativi, String loaitivi, String kieumanhinh, double kichthuocmanhinh, int soluong) {
        this.mativi = mativi;
        this.loaitivi = loaitivi;
        this.kieumanhinh = kieumanhinh;
        this.kichthuocmanhinh = kichthuocmanhinh;
        this.dongia = dongia;
        this.soluong = soluong;
    }

    public int getMativi() {
        return mativi;
    }

    public void setMativi(int mativi) {
        this.mativi = mativi;
    }

    public String getloaitivi() {
        return loaitivi;
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
        mativi = scanner.nextInt();
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
        System.out.println("ma Tivi:"+ mativi);
        System.out.println("Ten Tivi:"+ loaitivi);
        System.out.println("Kieu man hinh:"+ kieumanhinh);
        System.out.println("Kic thuoc man hinh:"+ kichthuocmanhinh);
        System.out.println("don gia:"+ dongia);
        System.out.println("so luong:"+ soluong);
       }
}
class samsung extends Tivi{

public samsung() {
}
public samsung(int mativi, String loaitivi, double kichthuocmanhinh,String kieumanhinh,double dongia, int soluong ) {
super(mativi,loaitivi,kieumanhinh,kichthuocmanhinh,soluong);
}

@Override
public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma Tivi:");
        mativi = scanner.nextInt();
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
        System.out.println("Ten Tivi:"+ loaitivi);
        System.out.println("Kieu man hinh:"+ kieumanhinh);
        System.out.println("Kic thuoc man hinh:"+ kichthuocmanhinh);
        System.out.println("don gia:"+ dongia);
        System.out.println("so luong:"+ soluong);
       }
}
class LG extends Tivi{

public LG() {
}
public LG(int mativi, String loaitivi, double kichthuocmanhinh,String kieumanhinh,double dongia, int soluong ) {
super(mativi,loaitivi,kieumanhinh,kichthuocmanhinh,soluong);
}

@Override
public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma Tivi:");
        mativi = scanner.nextInt();
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
        System.out.println("Ten Tivi:"+ loaitivi);
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
        System.out.println("Moi ban chon : ");
        System.out.println("=== Menu 1 ===");
        System.out.println("1. Tivi SamSung");
        System.out.println("2. Tivi LG");
        System.out.println("0. Thoat");
        
    }

    public void displayMenu34() {
        System.out.println("=== Menu 2 ===");
        System.out.println("1. Them");
        System.out.println("2. Hienthids");
        System.out.println("3. Sua");
        System.out.println("4. Hien thi danh sach");
        System.out.println("5.Sap xep theo gia ");
        System.out.println("6. Thoat");
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
                  
                }
        } else if (!menu34) {
            displayMenu34();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
    System.out.print("Nhap so luong can them: ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
        System.out.println("Lan nhap thu " + (i + 1) + ": ");
        Scanner input = new Scanner(System.in); // tạo đối tượng Scanner mới
        // Thêm Tivi
        System.out.println("Nhap ma Tivi:");
        int maTivi = input.nextInt();

        System.out.println("Nhap loai Tivi:");
        String loaiTivi = input.next();

        System.out.println("Nhap hang san xuat:");
        String hangSanXuat = input.next();

        System.out.println("Nhap don gia:");
        double donGia = input.nextDouble();

        System.out.println("Nhap so luong:");
        int soLuong = input.nextInt();
Tivi tivi = new Tivi(maTivi, loaiTivi, hangSanXuat, donGia, soLuong);
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
            tivi.xuat();
        }
         menu34 = true;
    }
    break;
case 3:
    // Sắp xếp tivi theo đơn giá
    if (tvList.isEmpty()) {
        System.out.println("Danh sách trống.");
    } else {
        Collections.sort(tvList, (Tivi tivi1, Tivi tivi2) -> Double.compare(tivi1.getdongia(), tivi2.getdongia()));
        System.out.println("Danh sách Tivi sau khi sắp xếp theo đơn giá:");
        for (Tivi tivi : tvList) {
            tivi.xuat();
        }
    }
     menu34 = true;
    break;
case 4:
    // Thoát chương trình
    System.out.println("thanks.");
    System.exit(0);
default:
    System.out.println("Lựa chọn không hợp lệ.");
     menu34 = true;
    break;
            }
        }
        do{
            displayMenu34();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
    System.out.print("Nhap so luong can them: ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
        System.out.println("Lan nhap thu " + (i + 1) + ": ");
        Scanner input = new Scanner(System.in); // tạo đối tượng Scanner mới
        // Thêm Tivi
        System.out.println("Nhap ma Tivi:");
        int maTivi = input.nextInt();

        System.out.println("Nhap loai Tivi:");
        String loaiTivi = input.next();

        System.out.println("Nhap hang san xuat:");
        String hangSanXuat = input.next();

        System.out.println("Nhap don gia:");
        double donGia = input.nextDouble();

        System.out.println("Nhap so luong:");
        int soLuong = input.nextInt();

       Tivi tivi = new Tivi(maTivi, loaiTivi, hangSanXuat, donGia, soLuong);
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
            tivi.xuat();
        }
         menu34 = true;
    }
    break;
case 3:
    // Sắp xếp tivi theo đơn giá
    if (tvList.isEmpty()) {
        System.out.println("Danh sách trống.");
    } else {
        Collections.sort(tvList, (Tivi tivi1, Tivi tivi2) -> Double.compare(tivi1.getdongia(), tivi2.getdongia()));
        System.out.println("Danh sách Tivi sau khi sắp xếp theo đơn giá:");
        for (Tivi tivi : tvList) {
            tivi.xuat();
        }
    }
     menu34 = true;
    break;
case 4:
    // Thoát chương trình
    System.out.println("Cảm ơn bạn đã sử dụng chương trình.");
    System.exit(0);
default:
    System.out.println("Lựa chọn không hợp lệ.");
     menu34 = true;
    break;
            }
        }while (choice != 4);
        
    } while (true);
}
}
class main {
    public static void main(String[] args) {  
        Menuchinh mn = new Menuchinh();
        mn.selectMenu();                         
    }
}
