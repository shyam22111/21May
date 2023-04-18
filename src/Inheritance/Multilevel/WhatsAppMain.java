package Inheritance.Multilevel;

public class WhatsAppMain {
	public static void main(String[] args) {
		 WhatsAppV1 v1= new WhatsAppV1();
		 v1.TextMassage();
		 System.out.println("..........................................");
		 
		 WahtsAppV2 v2= new WahtsAppV2();
		 v2.TextMassage();
		 v2.aideoCalling();
		 System.out.println("..................................");
		 
		 WhatsAppV3 v3 =new WhatsAppV3();
		 v3.TextMassage();
		 v3.aideoCalling();
		 v3.VideoCalling();
		 System.out.println("......................................");
		 
		 WhatsAppV4 v4 = new WhatsAppV4();
		 v4.TextMassage();
		 v4.VideoCalling();
		 v4.aideoCalling();
		 v4.Payment();
		 System.out.println("..............................................");
	}

}
