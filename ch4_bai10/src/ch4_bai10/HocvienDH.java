package ch4_bai10;

public class HocvienDH extends Hocvien 
{
    // private float dongia;
     //private int sobuoi;

	//public HocvienDH(String hoten, String diachi, int loaiuutien, int loaichuongtrinhdangki, float dongia, int sobuoi) {
		//super(hoten, diachi, loaiuutien, loaichuongtrinhdangki);
		//this.dongia = dongia;
	//}


	public void hocphi()
	{
		if(loaichuongtrinhdangki==1 && loaiuutien==1) 
		{
		 hocphi=sobuoi*dongiadh-1000000;
		 System.out.println("hoc phi la: "+hocphi);
		 }else if(loaichuongtrinhdangki==1 && loaiuutien==2)
		 {  hocphi=sobuoi*dongiadh-500000;
			 System.out.println("hoc phi la: "+hocphi);
		 }
		
	}
   
}
