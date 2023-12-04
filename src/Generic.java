/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimildiran
 */
public class Generic <T> {
    
    
     T object;

    public Generic(T title) {
        object = title;

    }

    public T getData() {
        return object;
    }
    
}
