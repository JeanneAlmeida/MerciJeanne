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
public class ValidarLoginException extends RuntimeException    {
    public ValidarLoginException(){
        super("O login ou senha estão errados!!");
    }
}
