package bytebank_herdado;
//Gerente herda da classe Funcionario
public class Gerente extends Funcionario {

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false;
	}
	
	public double getBonificacao() {
		//double total = this.salario * 0.1;
		//this.salario += total;
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getBonificacao() + super.getSalario();
	}
	
	
}
