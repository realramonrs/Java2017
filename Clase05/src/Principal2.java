
public class Principal2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche coche = new Coche("3456-JTY","Peugeot",30000,100,250,150);
		
		//Matrices de coches:
		Coche garaje[] = new Coche[5];
		
		garaje[0] = new Coche("1234-WER","Ford",40000,100,500,150);
		garaje[1] = new Coche("1114-FPG","Porsche",900000,100,900,320);
		garaje[2] = coche;
		
				
		//Visualizar por consola las marcas de los coches que tengo guardados
		for(int i = 0;i<garaje.length;i++){
			if(garaje[i]!=null)
			System.out.println(garaje[i].getMarca());
			else
				break;
		}
		
		//Probar la funci�n guardarCoche
		Coche miCoche = new Coche("9090-QWE","Ferrari",200000,100,200,900);
		Coche.guardarCoche(miCoche, garaje);
		
		//Visualizar por consola las marcas de los coches que tengo guardados
		System.out.println("Despu�s de guardar el Ferrari");
		for(int i = 0;i<garaje.length;i++){
					if(garaje[i]!=null)
					System.out.println(garaje[i].getMarca());
					else
						break;
				}
		
		
		
	}

}
