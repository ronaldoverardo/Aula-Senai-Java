package controle;

import java.io.IOException;

import interfaces.FileTestUser;
import modelos.User;

public class Main {

	public static void main(String[] args) throws IOException {
        //criando um objeto User
        User user = new User();
        user.setId("Usuario:");
        //Colocar nome do usuario
        user.setNome("Nome: " + "Julia Cristina Presalino");
        // Se � carro ou moto
        user.setObservacao("Veiculo: " + "Carro");
       //colocar a placa do carro ou da moto 
        user.setPlaca("Placa: " + "PQP1234");

        //Chamando o m�todo escrever e passando user como par�metro
        FileTestUser.escrever(user);

    

	}

}
