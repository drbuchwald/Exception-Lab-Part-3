/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Dan
 */
public class CustomException extends Exception {

    public String exc = "My Custom Exception(Test)";

    public CustomException(String exc) {
        super(exc);
        this.exc = exc;
    }

}
