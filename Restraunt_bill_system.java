// A Restraunt Mangement System
import java.util.*;
public class Restraunt_Paprika
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int vstr,tvstr=0,nvstr,tnvstr=0,vfd,tvfd=0,nvfd,tnvfd=0;
int fd=0,tfd=0,amt=0,tamt=0,totalamt=0,d,totald=0,damt=0,ch;
double vat=0.0;
String str="",ans,choice="Y";
System.out.println("Welcome to the Restraunt Paprika");
System.out.println();
System.out.println("For Starters     Press 1");
System.out.println("For Main course  Press 2");
System.out.println("For Deserts      Press 3");
System.out.println();
System.out.println("Enter your choice");
ch=in.nextInt();
switch(ch)
{
case 1:
System.out.println("Welcome to Starter Menu!!!:");
System.out.println("Enter 'VS' for Veg Starter and 'NVS' for Non-veg Starter");
str=in.next();
if(str.equalsIgnoreCase("VS"))
{
System.out.println("Starters           Price in Rs.");
System.out.println("1.Paneer Tikka           110");
System.out.println("2.Veg Kababs             110");
System.out.println("3.Hara bhara kababs      110");
System.out.println("4.Shanghai Spring roll   150");
System.out.println("5.American Corn Balt     150");                      
System.out.println("6.Crispy American Cornt  140");                         
System.out.println("7.Crispy Baby Cornt      140");         
System.out.println("8.Crispy Mushroom        120");
System.out.println("9.Crispy Chilly Potato   120");
System.out.println("10.Crispy Chilly Chana   150");
System.out.println();
while(choice.equalsIgnoreCase("Y"))
{
System.out.println("Chosse your Starter from the above list by entering number:");
vstr=in.nextInt();
System.out.println("Enter number of Starters you require");
tvstr=in.nextInt();
if(vstr>=1&&vstr<=3)
{amt=tvstr*110;
}
if(vstr==4||vstr==5)
{
amt=tvstr*150;
}
if(vstr==6||vstr==7)
{
amt=tvstr*140;
}
if(vstr==8||vstr==9)
{amt=tvstr*120;
}
if(vstr==10)
{amt=tvstr*150;
}
tamt=tamt+amt;
System.out.println("Do you want to place more orders? Enter Y/N");
choice=in.next();
}
}
if(str.equalsIgnoreCase("NVS"))
{
System.out.println("Non-Veg Starters:");
System.out.println();
System.out.println("Non-Veg Starters  Price in Rs.");
System.out.println("1.Chicken Tikka         170");
System.out.println("2.Murg Reshmi Kebab     170");
System.out.println("3.Murg Chilli Kebab     160");
System.out.println("4.Chicken Seekh Kebab   180");
System.out.println("5.Tangdi Kebab          180");
System.out.println("6.Murg Tandoori         190");
System.out.println("7.Fish Ajwaini Tikka    190");
System.out.println("8.Chilli Chicken        160");
System.out.println("9.Chicken Lollipop      180");
System.out.println("10.Shanghai Chicken     180");
while(choice.equalsIgnoreCase("Y"))
{
System.out.println("Choose Your Starter from the above list by entering number:");
nvstr=in.nextInt();
System.out.println("Enter Number of Starters you require:");
tnvstr=in.nextInt();
if(nvstr==1||nvstr==2)
{
amt=tnvstr*170;
}
if(nvstr==3)
{amt=tnvstr*160;
}
if(nvstr==4||nvstr==5)
{
amt=tnvstr*180;
}
if(nvstr==6||nvstr==7)
{
amt=tnvstr*190;
}
if(nvstr==8)
{
amt=tnvstr*160;
}
if(nvstr==9||nvstr==10)
{
amt=tnvstr*180;
}
tamt=tamt+amt;
System.out.println("Do you want to place more orders? Enter Y/N");
choice=in.next();
}
}
System.out.println();
System.out.println("*******Paprika*******");
System.out.println("*******Bill**********");
System.out.println("Total cost=Rs."+tamt);
vat=Math.round(14.5/100.0*tamt);
System.out.println("VAT=14.5%");
System.out.println("Total VAT=Rs."+vat);
System.out.println("Amount to be paid=Rs."+(tamt+vat));
System.out.println();
break;

case 2:
System.out.println("Main Course:Indian and Chinese Dishes");
System.out.println("Enter'V'for Veg Dishes");
System.out.println("Enter'NV'for Non-Veg Dishes");
System.out.println("Enter'C'for Chinese Dishes");
str=in.next();
if(str.equalsIgnoreCase("V"))
{
System.out.println("Welcome to Indian Veg Dishes");
System.out.println();
System.out.println("Indian Veg Dishes  Price in Rs");
System.out.println("1.Shahi Panner           180");
System.out.println("2.Navratan Korma         180");
System.out.println("3.Kadhai Panner          150");
System.out.println("4.Malai Kofta            140");
System.out.println("5.Kadhai Vegetable       140");
System.out.println("6.Vegetable Pakeeza      140");
System.out.println("7.Shabnam Curry          150");
System.out.println("8.Makai Corn Palak       150");
System.out.println("9.Veg Pulao              110");
System.out.println("10.Kashmiri Pulao        140");
System.out.println("11.Butter Nan             40");
System.out.println("12.Stuffed Kulcha         60");

while(choice.equalsIgnoreCase("Y"))
{
System.out.println("Choose your Veg Main course from the above list by entering number|");
vfd=in.nextInt();
System.out.println("How many plates do you require");
tvfd=in.nextInt();
if(vfd==1||vfd==2)
{amt=tvfd*180;
}
if(vfd==3||vfd==7||vfd==8)
{amt=tvfd*150;
}
if(vfd==4||vfd==5||vfd==6||vfd==10)
{amt=tvfd*140;
}
if(vfd==9)
{
amt=tvfd*110;
}
if(vfd==11)
{
amt=tvfd*40;
}
if(vfd==12)
{amt=tvfd*60;
}
totalamt=totalamt+amt;
System.out.println("Do you want to place more orders?Enter Y/N");
choice=in.next();
}
}
if(str.equalsIgnoreCase("NV"))
{
System.out.println("Welcome to Indian Non Veg Dishes");
System.out.println();
System.out.println("Indian Non Veg Dishes   Price in Rs");
System.out.println("1.Chicken Tikka Masala        180");
System.out.println("2.Chicken Tikka Labadar       180");
System.out.println("3.Chicken Bharta              150");      
System.out.println("4.Kadhai Chicken              160");
System.out.println("5.Mughlai Chicken             160");
System.out.println("6.Murg Navaratan Korma        160");
System.out.println("7.Chicken Do Pyza             170");
System.out.println("8.Murg Masallam               170");
System.out.println("9.Mutton Rogan Josh           190");
System.out.println("10.Prawn Malai Curry          190");
System.out.println("11.Fish Sarsowala             140");
System.out.println("12.Fish Dhaniawala            160");
System.out.println("13.Butter nan                  60");
System.out.println("14.Chappati                    40");
while(choice.equalsIgnoreCase("Y"))
{
System.out.println("Choose your Non Veg Main Course from the list by entering number");
vfd=in.nextInt();
System.out.println("How many plates Do you Require");
tvfd=in.nextInt();
if(vfd==1||vfd==2)
{amt=tvfd*180;
}
if(vfd==3)
{amt=tvfd*150;
}
if(vfd==4||vfd==5||vfd==6||vfd==12)
{amt=tvfd*160;
}
if(vfd==7||vfd==8)
{amt=tvfd*170;
}
if(vfd==9||vfd==10)
{amt=tvfd*190;
}
if(vfd==11)
{
amt=tvfd*140;}
if(vfd==13)
{amt=tvfd*60;}
if(vfd==14)
{amt=tvfd*40;}
totalamt=totalamt+amt;
System.out.println("Do you wnat to place more orders?Enter Y/N");
choice=in.next();
}
}
if(str.equalsIgnoreCase("C"))
{
System.out.println("Welcome to Chinese Dishes");
System.out.println();
System.out.println("Chinese Dishes     Price in Rs");
System.out.println("1.Schezwan Fried Rice    240");
System.out.println("2.Schezwan Chicken       280");
System.out.println("3.Chilly Chicken         280");
System.out.println("4.Chicken Noodles        210");
System.out.println("5.Veg Hakka Noodle       210");
System.out.println("6.Chicken Manchurian     190");
System.out.println("7.Panner Manchurian      190");
System.out.println("8.Chilli Panner          190");
System.out.println("9.Shanghai Fried Rice    240");
System.out.println("10.Veg.Fried Rice        210");
System.out.println("11.Chicken Fried Rice    210");
System.out.println("12.Kimichi Rice Veg      210");
System.out.println("13.Chappati/Nan Roti      40");
while(choice.equalsIgnoreCase("Y"))
{
System.out.println("Choose your Main Course From the above list by entering the number");
fd=in.nextInt();
System.out.println("Enter number of plates required");
tfd=in.nextInt();
if(fd==1||fd==9)
{amt=tfd*240;
}
if(fd==2||fd==3)
{amt=tfd*280;
}
if(fd==4||fd==5||fd==10||fd==11||fd==12)
{amt=tfd*210;
}
if(fd==6||fd==7||fd==8)
{amt=tfd*190;
}
totalamt=totalamt+amt;
System.out.println("Do you want to place more orders?Y/N");
choice=in.next();
}
}
System.out.println();
System.out.println("*******Paprika*******");
System.out.println("*******Bill**********");
System.out.println("Total cost=Rs."+totalamt);
vat=Math.round(14.5/100.0*totalamt);
System.out.println("VAT=14.5%");
System.out.println("Total VAT=Rs."+vat);
System.out.println("Amount to be paid=Rs."+(totalamt+vat));
System.out.println();
break;
case 3:
System.out.println("Deserts!");
System.out.println();
System.out.println("Deserts               Price in Rs");
System.out.println("1.Softy Pineapple           110");
System.out.println("2.Softy Crunchy Chocolate   110");
System.out.println("3.Chocolate Walnut Brownie   90");
System.out.println("4.Chocolate Donut            90");
System.out.println("5.Marble Cake                70");
System.out.println("6.Mocha Magic                90");
System.out.println("7.Black Forest Gateaux       90");
System.out.println("8.Mango Shake                80");
System.out.println("9.PineApple Shake            80");
System.out.println("10.Tooty Fruity             120");
while(choice.equalsIgnoreCase("Y"))
{
System.out.println("Choose your Desert by entering Number");
d=in.nextInt();
System.out.println("Enter Number of plates required");
totald=in.nextInt();
if(d==1||d==2)
{damt=totald*110;
}
if(d==3||d==4||d==6||d==7)
{damt=totald*90;
}
if(d==5)
{damt=totald*70;}
if(d==8||d==9)
{damt=totald*80;
}
if(d==10)
{damt=totald*120;
}
totalamt=totalamt+damt;
System.out.println("Do you want to place more orders?Enter Y/N");
choice=in.next();
}
System.out.println();
System.out.println("*******Paprika*******");
System.out.println("*******Bill**********");
System.out.println("Total cost=Rs."+totalamt);
vat=Math.round(14.5/100.0*totalamt);
System.out.println("VAT=14.5%");
System.out.println("Total VAT=Rs."+vat);
System.out.println("Amount to be paid=Rs."+(totalamt+vat));
System.out.println();
break;
default:
System.out.println("Wrong Choice");
}

System.out.println("THANK YOU FOR VISTING PAPRIKA");
System.out.println("VIST AGAIN");
}
}



