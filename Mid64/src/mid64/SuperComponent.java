/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid64;

/**
 *
 * @author Yoga
 */
public class SuperComponent {
    private static SuperComponent Obj = null;
    private SuperComponent() {}
    public static SuperComponent getSuperComponent(){
        if (Obj == null) {
           Obj = new SuperComponent();
        }
        return Obj;
    }
 public void execute (int a){
        if (a >= 0){
            Foo F = new Foo();
            F.func();
        }
        else {
            Bar B = new Bar();
            B.func();
        }  
    }
    
}
