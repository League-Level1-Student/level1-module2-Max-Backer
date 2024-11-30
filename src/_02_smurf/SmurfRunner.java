package _02_smurf;

public class SmurfRunner {

	public static void main(String[] args) {
		Smurf handy = new Smurf("Handy");
		Smurf papa = new Smurf("Papa");
		Smurf smurfette = new Smurf("Smurfette");
		
		System.out.println(handy.eat());
		System.out.println(handy.getName());
		
		System.out.println(papa.getName());
		System.out.println(papa.getHatColor("papa"));
		System.out.println(papa.isGirlOrBoy("papa"));
		
		System.out.println(smurfette.getName());
		System.out.println(smurfette.getHatColor("smurfette"));
		System.out.println(smurfette.isGirlOrBoy("smurfette"));


	}

}
