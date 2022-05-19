package ch4_bai10;

public class HocvienLT extends Hocvien 
{


	public void hocphi() 
	{
		if(loaichuongtrinhdangki==2 && loaiuutien==1) 
		{
		 hocphi=sobuoi*dongiadh-1000000;
		 System.out.println("hoc phi la: "+hocphi);
		 }else if(loaichuongtrinhdangki==2 && loaiuutien==2)
		 {  
			 hocphi=sobuoi*dongiadh-800000;
			 System.out.println("hoc phi la: "+hocphi);
		 }
		
	}
  // private float dongia;

//public HocvienLT(String hoten, String diachi, String loaiuutien, String loaichuongtrinhdangki, float dongia) {
	//super(hoten, diachi, loaiuutien, loaichuongtrinhdangki);
	//this.dongia = dongia;
	
}
   

