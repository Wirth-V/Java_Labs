public class test_complex {
	public static void main( String args[]){
		complex z_0 = new complex ();
		complex z_1 = new complex (-1, 2);
		complex z_2 = new complex (2, 0);
		complex z_3 = new complex (0, -2);
		complex z_4 = new complex (0, 2-Math.sqrt(3));
		complex z_5 = new complex (0, 2-Math.sqrt(3));
	
		System.out.println(z_1.Modul());

		double control = z_1.Argument(); 
		if (control== 9999999)
			 System.out.println("Argument for thus nam is undefined ");
		else
			System.out.println(z_1.Argument());
		
		z_1.Plus(z_2);
		System.out.println(z_1.Re_z + "i * " + z_1.Im_z );
		z_1.Minus(z_2);
		System.out.println(z_0.Re_z + "i * " + z_0.Im_z );

		z_0.Plus(z_2);
		System.out.println(z_0.Re_z + "i * " + z_0.Im_z );
		z_0.Minus(z_2);
		System.out.println(z_0.Re_z + "i * " + z_0.Im_z );

		z_4.Plus(z_3);
		System.out.println(z_0.Re_z + "i * " + z_0.Im_z );
		z_4.Minus(z_3);
		System.out.println(z_0.Re_z + "i * " + z_0.Im_z );

	}

}