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
public class ValidarTamConfirmSenhaException extends RuntimeException{

    public ValidarTamConfirmSenhaException() {
         super("O login deve conter no máximo 8 caracteres!");
    }
    
}
