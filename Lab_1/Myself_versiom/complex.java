class complex {
	double Re_z, Im_z; //Поля для хранения мнимой и вещественной части комплексног очисла

	//Конструктор по умолчанию инициализирует все нулями	
	complex() {
		Re_z = 0;
		Im_z = 0;
	}
	
	//Конструктор с 2 параметрами
	complex (double x, double y) {
		Re_z = x;
		Im_z = y;
	}

	//Вычисление модуля числа
	double Modul() {
		return  Math.sqrt( Math.pow(Re_z, 2) + Math.pow(Im_z, 2));
	}

	//Вычисление аргумента числа
	double Argument() {
		
		if ( (Re_z == 0) && (Im_z < 0) )
			return -Math.PI/2;

		else if ( (Re_z == 0) && (Im_z > 0) )
			return Math.PI/2;
		
		else if ( (Re_z < 0) && (Im_z >= 0) )
			return Math.PI + Math.atan(Im_z/Re_z);

		else if ( (Re_z < 0) && (Im_z < 0) )
			return -Math.PI + Math.atan(Im_z/Re_z);			 

		else if(Re_z > 0)
			return  Math.atan(Im_z/Re_z);

		else{
			System.out.println("Argument for z=0 - undefined value");
			return 9999999;		
		} 
	}

	public void Plus (complex n) {
		Re_z += n.Re_z;
		Im_z += n.Im_z;	 
		
			
	}

	public void Minus (complex m) {
		Re_z -= m.Re_z;
		Im_z -= m.Im_z;	
		
	}
			

	
		
	

}