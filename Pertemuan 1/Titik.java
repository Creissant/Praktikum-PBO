class Titik {
	double absis;
	double ordinat;
	static int counterTitik;
	
	//Tugas dalam post test
	Titik(double a, double o){
		counterTitik++;
		absis = a;
		ordinat = o;
	}
	
	Titik() {
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	void setAbsis(double a) {
		absis = a;
	}
	
	void setOrdinat(double o) {
		ordinat = o;
	}
	
	double getAbsis() {
		return absis;
	}
	
	double getOrdinat() {
		return ordinat;
	}
	
	int
	getcounterTitik(){
		return counterTitik;
	}
}