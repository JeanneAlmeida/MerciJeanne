/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecao;

/**
 *
 * @author Jeanne
 */
public class LoginNaoEfetuadoException extends RuntimeException {

    public LoginNaoEfetuadoException() {
        super("Login não efetuado");
    }
    
}
