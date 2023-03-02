class complex {
	double Re_z, Im_z; //Поля для хранения мнимой и вещественной части комплексног очисла

	//Конструктор по умолчанию (инициализирует все нулями, то есть x = 0)	
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

		else if (Re_z > 0)
			return  Math.atan(Im_z/Re_z);
		
		else //Обрабатывает z = 0, у которого неопределимый аргумент
			return 00L;
		
	}

	//Метод реализующий сложение (принимает 2 объекта и возвращает новый объект)
	complex Plus (complex x, complex y){
		return new complex ( x.Re_z + y.Re_z,  x.Im_z + y.Im_z);
	}
	
	//Метод реализующий вычетания (принимает 2 объекта и возвращает новый объект)
	complex Minus (complex x, complex y){
		return new complex ( x.Re_z - y.Re_z,  x.Im_z - y.Im_z);		
	}		

	
		
	

}