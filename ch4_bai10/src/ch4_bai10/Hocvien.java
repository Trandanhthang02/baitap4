package ch4_bai10;

import java.util.Scanner;

abstract class Hocvien 
{
  protected String hoten, diachi; 
  protected int loaiuutien, loaichuongtrinhdangki, hocphi,sobuoi,dongiadh,dongialt;
  //Hocvien(String hoten,String diachi, int loaiuutien, int loaichuongtrinhdangki )
  //{
	  //this.hoten=hoten;
	 // this.diachi=diachi;
	  //this.loaiuutien=loaiuutien;
	 // this.loaichuongtrinhdangki=loaichuongtrinhdangki;
  //}
  public  void nhapthongtin() 
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("nhap ho ten: ");
	  hoten=sc.nextLine();
	  System.out.println("nhap dia chi: ");
	  diachi=sc.nextLine();
	  do 
	  {
		  System.out.println("loai uu tien: ");
	      loaiuutien=sc.nextInt();
	  
		  
	  }while(loaiuutien>2 && loaiuutien<1);
	  do 
	  {
		  System.out.println("loai chuong trinh: ");
		  loaichuongtrinhdangki=sc.nextInt();
		  if(loaichuongtrinhdangki==1)
		  { System.out.println("hoc loai do hoa");}
		  else if(loaichuongtrinhdangki==2)
		  {System.out.println("hoc loai lap trinh");}
		   
	  }while (loaichuongtrinhdangki>2 && loaichuongtrinhdangki<1);
	  System.out.println("nhap so buoi hoc: ");
	  sobuoi=sc.nextInt();
	  System.out.println("don gia do hoa: ");
	  dongiadh=sc.nextInt();
	  System.out.println("don gia lap trinh: ");
	  dongialt=sc.nextInt();
	  
	  
  }
  
  public abstract void hocphi(); 
  public void inthongtin() 
  {
	  System.out.println("ho va ten: "+hoten+"\ndia chi "+diachi+"\n loai uu tien la: "+loaiuutien+"\n loai chuong trinh "+loaichuongtrinhdangki);
  }
  
  
}
