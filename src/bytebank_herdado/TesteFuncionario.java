package bytebank_herdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(2000);
		funcionario.setNome("Rafael Caetano");
		funcionario.setCpf("429.474.848-60");
				
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());
	}

}
