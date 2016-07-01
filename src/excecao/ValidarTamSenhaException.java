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
public class ValidarTamSenhaException extends RuntimeException {
     public ValidarTamSenhaException(){
         super("O tamanho Maximo da senha é de 8 caracteres");
    }
}
