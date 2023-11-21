package Exemplo;

public class Carro_Facade {
	Carro_Modelo modelo;
	Carro_Motor motor;
	Carro_Marca marca;
	Carro_Cor cor;

	public Carro_Facade() {
		modelo = new Carro_Modelo();
		motor = new Carro_Motor();
		marca = new Carro_Marca();
		cor = new Carro_Cor();
	}
	
	public void construirCarroCompleto(String modelo, String marca, String motor, String cor){
		System.out.println("******** Criando o carro **********\n");
		this.modelo.SetModelo(modelo);
		this.motor.SetMotor(motor);
		this.marca.SetMarca(marca);
		this.cor.SetCor(cor);

	}
}