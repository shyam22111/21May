package Inheritance;

public class LoanMain {

	public static void main(String[] args) {
		PersonalLoan PL =new PersonalLoan();
		PL.AddharCard();
		PL.PanCard();
		PL.mobNo();
		PL.PLROI();
		PL.PLTennure();
		
		System.out.println(".....................................................................");
		
		HomeLoan HL= new HomeLoan();
		HL.AddharCard();
		HL.PanCard();
		HL.mobNo();
		HL.HLRateOfInterest();
		HL.HLTennure();
		
			
		System.out.println("...................................................................");
		
		VeichleLoan VL = new VeichleLoan();
		VL.AddharCard();
		VL.PanCard();
		VL.mobNo();
		VL.VeichleLoanROI();
		VL.NoOfVeichle();
	}
	
}
