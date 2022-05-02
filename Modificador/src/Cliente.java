import java.util.Objects;

public class Cliente {

		private String nome;
		private int cpf;
		private int numConta;
		
		public Cliente() {
			
			
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getCpf() {
			return cpf;
		}

		public void setCpf(int cpf) {
			this.cpf = cpf;
		}

		

		public int getNumConta() {
			return numConta;
		}

		public void setNumConta(int numConta) {
			this.numConta = numConta;
		}
		@Override //sobrescreve as informa��es do m�todo padr�o para o retorno do m�todo querido;.
		public String toString() {
			return "**********************" +"\nCliente: \nNome = " + nome + "\nCPF = " + cpf + "\nN�mero da Conta = " + numConta  + "\n**********************";
		}

		@Override
		public int hashCode() {
			return Objects.hash(cpf, nome, numConta);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Cliente other = (Cliente) obj;
			return cpf == other.cpf && Objects.equals(nome, other.nome) && numConta == other.numConta;
		}
		
		
}
