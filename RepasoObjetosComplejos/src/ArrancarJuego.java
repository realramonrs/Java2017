
public class ArrancarJuego {
	public static Soldado compararSoldado(Soldado s1,Soldado s2){
		if (s1.getEnergia()>s2.getEnergia()){
			return s1;
		}
		else
			return s2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soldado soldado1 = new Soldado(100,"Mateo",100);
		Fusil f = new Fusil(40,"Colt56",50);
		//Armar al soldado:Instanciaci�n an�nima
		soldado1.setFusil(new Fusil(49,"Colt56",40));
		
		soldado1.dispararFusil(2);
		System.out.println("Despu�s de disparar 2 balas");
		System.out.println(soldado1);
		
		Soldado soldado2 = new Soldado(100,"Oscar",100);
		soldado2.setFusil(new Fusil(30,"HHHHHH",40));
		//Fusil.setModelo("qqqqqq");
		System.out.println("Despu�s de cambiar el modelo de fusil");
		System.out.println(soldado1);
		System.out.println("Despu�s de cambiar el modelo de fusil");
		System.out.println(soldado1);
		
		//Crear un ej�rcito de 5 soldados
		
		Ejercito aleman = new Ejercito(5);
		//Alistar soldados en el ej�rcito
		aleman.setSoldado(new Soldado(100,"Victor",100));
		aleman.setSoldado(new Soldado(100,"David",100));
		aleman.setSoldado(new Soldado(100,"Felix",100));
		aleman.setSoldado(new Soldado(100,"Alejandro",100));
		aleman.setSoldado(new Soldado(100,"Pablo",100));
		aleman.getSoldado(3).setEnergia(0);
		
		
		System.out.println(compararSoldado(aleman.getSoldado(0),aleman.getSoldado(1)));
		
	}

}
