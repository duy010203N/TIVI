package DAYDU;
import java.util.ArrayList; // lưu trữ danh 
import java.util.Collections;   //sắp xếp danh sách các số nguyên theo thứ tự tăng dần.
import java.util.Comparator;    //sắp xếp danh sách các số nguyên theo thứ tự giảm dần.
import java.util.Scanner;
import java.util.Iterator;      //lặp lại các phần tử của một collection( phương thức : hasnext,next,
import java.util.List;          //Các phương thức này được triển khai bởi lớp ArrayList dựa trên interface List.(phương thức : thêm, xóa, sắp xếp, truy cập phần tử trong danh sách,)

public class Tivi {
    
        this.mativi = mativi;                     //gán các giá trị đầu vào cho các thuộc tính tương ứng
      
    }

}
2.Class TiVi OLED
class tivioled extends Tivi{

public tivioled() {
}
public tivioled(String mativi, String kieumanhinh, double kichthuoctivi, String hangsanxuat, double dongia, int soluong ) {
super(mativi, kieumanhinh,kichthuoctivi,hangsanxuat ,dongia,soluong);
}
// có thể super.xuat();// ghđèđè
       }
}
3.Class TiVi 4K
class TV4k extends Tivi{

public TV4k() {
}

} 
4.Class Menu chính
class Menuchinh {

    List<Tivi> tvList = new ArrayList<>();      // khai báo một danh sách các đối tượng Tivi với kiểu dữ liệu là List<Tivi>. Đối tượng ArrayList này được khởi tạo và lưu trữ trong biến tvList
    boolean menu12 = false; //để xác định menu đang được chọn, có giá trị là true nếu menu 1 hoặc 2 được chọn, và false nếu menu 3 hoặc 4 được chọn.
    boolean menu34 = false;
    Scanner sc = new Scanner(System.in);
    }

   
                case 1:
    System.out.print("Nhập số lượng cần thêm: ");
    int n = sc.nextInt(); // yêu cầu nhập vào giá trị nguyên và lưu biến đó vào n
    for (int i = 0; i < n; i++) {
        System.out.println("lần nhập thứ " + (i + 1) + ": ");
        Scanner input = new Scanner(System.in); // tạo đối tượng Scanner mới
        // Thêm Tivi
      

       Tivi tivi = new Tivi(maTivi, loaiTivi, kieumanhinh, kichthuoctivi, donGia, soLuong);// tạo ra các đối tượng tivi mới
        tvList.add(tivi); // thêm đối tượng vào danh sách(list)
    
    }
           
    menu34 = true;// chỉ ra rằng mã bên trong switch khối hiện tại đã thực thi thành công và chương trình sẽ chuyển sang khối mã tiếp theo. 
    break; // dùng để thoát khỏi khối chuyển đổi sau khi thựuc hiện các câu lệnh trong một case, còn nếu bỏ đi thì khi thực hiện xong case mình chọn thì nó sẽ tự động chuyển case tiếp 
                
 
case 2:
    // Hiển thị danh sách tivi
    if (tvList.isEmpty()) {// tvList là biến lưu trữ danh sách các đối tượng
                            // isEmpty()thức được gọi trong danh sách này để xác định xem nó có rỗng hay không.
        System.out.println("Danh sách trống.");
    } else {
        System.out.println("Danh sách Tivi:");
        for (Tivi tivi : tvList) {  // truy cập trực tiếp vào phần tử hiện tại của tvListviệc sử dụng biến tivi
                                    // Vòng lặp lặp lại tvListdanh sách, có lẽ chứa các đối tượng của Tivilớp và gán từng phần tử trong danh sách cho tivimột biến tại một thời điểm.
            tivi.xuat();
        }
         menu34 = true;
    }
    break;
case 3:
   
        boolean timThay = false;
        for (Iterator<Tivi> iterator = tvList.iterator(); iterator.hasNext();) {
            //Khởi tạo một biến iterator kiểu Iterator<Tivi> và gán cho nó giá trị bằng cách sử dụng phương thức iterator() của danh sách tvList.
Khởi tạo điều kiện để lặp lại vòng lặp: nếu phương thức hasNext() của iterator trả về true, vòng lặp sẽ tiếp tục. Nếu phương thức này trả về false, vòng lặp sẽ kết thúc.
            Tivi tivi = iterator.next();
            if (tivi.getMativi() == maTiviXoa) {
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
    System.out.println("Danh sách trống.");
} else {
       Scanner sc = new Scanner(System.in);
    System.out.println("Nhập mã Tivi cần sửa:");
    String maTiviSua = sc.nextLine();
    boolean timThay = true;
    for (Iterator<Tivi> iterator = tvList.iterator(); iterator.hasNext();) {
        Tivi tivi = iterator.next();
        if (tivi.getMativi().equalsIgnoreCase(maTiviSua)) {
          
            

            // Cập nhật thông tin Tivi   
            tivi.setMativi(mativi);
            tivi.sethangsanxuat (hangsanxuat);                
            tivi.setkieumahinh(kieumanhinh);
            tivi.setkichthuoctivi(kichthuoctivi);
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
    System.out.println("Danh sách trống.");
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
        System.out.println("Ma tivi: " + tivi.getMativi() + ", Loai tivi: " + tivi.getloaitivi() + ", Kieu man hinh: " + tivi.getkieumanhinh() + ", Kich thuoc man hinh: " + tivi.getkichthuoctivi() + ", Don gia: " + tivi.getdongia() + ", So luong: " + tivi.getsoluong());
    }
}
menu34 = true;
break;

 case 6:
                    menu12 = false;
                    menu34 = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
                    break;
                
            }
        }while (!menu34);
        } 
    } while (true);
    
}
   }
5.Class Main
class main {
    public static void main(String[] args) {  
               Menuchinh mn = new Menuchinh();
               mn.selectMenu();
    }   
    }
