package org.edu;

public class Arts extends Education {
	private void bSc() {
		System.out.println("bsc in maths");
	}
	private void bEd() {
		System.out.println("B.ed in English");
	}
	private void bA() {
		System.out.println("BA in science");

	}
	private void bBA() {
		System.out.println("BBA in Tamil");

	}
	@Override
	public void ug(String dept) {
		System.out.println("ug in "+dept);
	}
	@Override
	public void pg(String dept) {
		System.out.println("pg in "+dept);
	}
	public static void main(String[] args) {
		Arts a = new Arts();
		a.bEd();
		a.bA();
		a.bBA();
		a.bSc();
		a.ug("CSE");
		a.pg("Thermal");
		System.out.println("prakash");
		System.out.println("sivaguru");
		System.out.println("sivaji");
		
		
	}
	
	
	
	

}
