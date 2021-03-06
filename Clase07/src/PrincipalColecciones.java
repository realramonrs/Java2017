import java.util.*;
public class PrincipalColecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Matriz din�mica de productos
		
		ArrayList misProductos = new ArrayList();
		
		//A�adir productos --> M�todo Add
		misProductos.add(new Ordenador("WE34","MAC",2000,4));
		misProductos.add(new Lavadora("WQ12","Electrolux",600,800));
		
		for(int i = 0;i<10;i++){
			misProductos.add(new Ordenador());
		}
		
		//Mostrar por pantalla los productos
		for(Object p: misProductos){
			System.out.println(p);
		}
		
		//Acceder a una posicion concreta
		//Cambiar el precio del primer producto
		Producto p = (Producto)misProductos.get(0);
		p.setPrecio(3000);
		
		//Eliminar objetos
		misProductos.remove(0);
		
		
		//Mostrar por pantalla los productos
		System.out.println("Me cargo el primer objeto");
				for(Object po: misProductos){
					System.out.println(po);
				}
		
			//Obtener primer producto
			Lavadora l = (Lavadora)(misProductos.get(0));
			System.out.println(l);
			
			//Problema de las colecciones cl�sicas
			misProductos.add("Un String cualquiera");
			
			//No tiene porque ser un problema
			for(Object po: misProductos){
				System.out.println(po);
			}
			
			//Calcular el descuento de todos los productos
			//Da error de conversion en tiempo de ejecuci�n porque hay un String
			for(Object o : misProductos){
				Producto pro = (Producto)o;
				pro.calcularDescuento();
			}
			
			
			//Para resolver estos errores se crearon las colecciones gen�ricas
			ArrayList<Producto> productos = new ArrayList<Producto>();
		//	productos.add("Un string cualquiera");
			//Calcular el descuento de todos los productos
			for(Producto pro : productos){
				pro.calcularDescuento();
			}
			
			ArrayList<String> lista = new ArrayList<String>();					
		}	

}
