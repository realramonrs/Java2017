
public class Motor {
	private int nivelAceite;
	private int cilindrada;
	private int potencia;
	
	//Constructores
	public Motor(){
		
	}
	public Motor(int nivelAceite,int cilindrada,int potencia){
		this.nivelAceite = nivelAceite;
		
		//this.cilindrada = cilindrada;
		setCilindrada(cilindrada);
		this.potencia = potencia;
	}

	public int getNivelAceite() {
		return nivelAceite;
	}

	public void setNivelAceite(int nivelAceite) {
		this.nivelAceite = nivelAceite;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		if(cilindrada <500 && cilindrada > 0){
			this.cilindrada = cilindrada;
		}
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Motor [nivelAceite=" + nivelAceite + ", cilindrada=" + cilindrada + ", potencia=" + potencia + "]";
	}
	
	
	
	
}
