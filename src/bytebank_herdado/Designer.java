package bytebank_herdado;
//Gerente herda da classe Funcionario
public class Designer extends Funcionario {

	public double getBonificacao() {
		//double total = this.salario * 0.1;
		//this.salario += total;
		System.out.println("Chamando o método de bonificacao do Desginer");
		return 200;
	}
	
	
}
