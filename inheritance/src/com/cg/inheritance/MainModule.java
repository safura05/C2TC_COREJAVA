package com.cg.inheritance;

public class MainModule {
public static void main(String[] args) {
Mobile mobileobject=new Mobile("windowa","windows","recent",16000.00);
System.out.println(mobileobject.getModel());
System.out.println(mobileobject);
Blackberry blackberryobject=new Blackberry("blackberry","blackberry","keyone",20000.00);
System.out.println(blackberryobject.getModel());
System.out.println(blackberryobject);
}
}
