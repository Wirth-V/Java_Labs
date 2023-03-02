public class test_complex {
	public static void main( String args[]){
		
		System.out.println("\n");
		
		complex z_0 = new complex (); // z = 0 - конструктор по умолчанию
		complex z_1 = new complex (-1, 2); // z_1 = -1 + i * 2
		complex z_2 = new complex (2, 0); // z_2 = 2 + i * 0
		complex z_3 = new complex (0, -2); // z_3 = 0 + i * -2
		complex z_4 = new complex (0, 2-Math.sqrt(3)); // z_4 = 0 + i * (3^0.5)
		complex z_5 = new complex (-35, 13); // z_4 = -35 + i * 13
	 
		System.out.println("z_0 = " + z_0.Re_z + " + i * " + z_0.Im_z );		
		System.out.println("z_1 = " + z_1.Re_z + " + i * " + z_1.Im_z );
		System.out.println("z_2 = " + z_2.Re_z + " + i * " + z_2.Im_z );
		System.out.println("z_3 = " + z_3.Re_z + " + i * " + z_3.Im_z );
		System.out.println("z_4 = " + z_4.Re_z + " + i * " + z_4.Im_z );
		System.out.println("z_5 = " + z_5.Re_z + " + i * " + z_5.Im_z );


		System.out.println("\n");
		
		System.out.print("Argument for z_0: ");
		double control = z_0.Argument(); 
		if (control== 0x00) //Обрабатывает z = 0, у которого неопределимый аргумент
			System.out.println("Argument for thus nam is undefined, becous z = 0.");

		System.out.println("Argument for z_1: " + z_1.Argument() );
		System.out.println("Argument for z_2: " + z_2.Argument());
		System.out.println("Argument for z_3: " + z_3.Argument());
		System.out.println("Argument for z_4: " + z_4.Argument());
		System.out.println("Argument for z_5: " + z_5.Argument());

		System.out.println("\n");
		
		
		System.out.println("z_0 + z_1 = " + z_0.Plus(z_0, z_1).Re_z + " + i * " + z_0.Plus(z_0, z_1).Im_z );
		System.out.println("z_2 + z_3 = " + z_2.Plus(z_2, z_3).Re_z + " + i * " + z_2.Plus(z_2, z_3).Im_z );
		System.out.println("z_4 + z_5 = " + z_4.Plus(z_4, z_5).Re_z + " + i * " + z_4.Plus(z_4, z_5).Im_z );
		
		System.out.println("\n");	
		
		System.out.println("z_0 - z_1 = " + z_0.Minus(z_0, z_1).Re_z + " + i * " + z_0.Minus(z_0, z_1).Im_z );
		System.out.println("z_2 - z_3 = " + z_2.Minus(z_2, z_3).Re_z + " + i * " + z_2.Minus(z_2, z_3).Im_z );
		System.out.println("z_4 - z_5 = " + z_4.Minus(z_4, z_5).Re_z + " + i * " + z_4.Minus(z_4, z_5).Im_z );
		
		System.out.println("\n");	
	}

}