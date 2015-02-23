
import Objects.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mark
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Permutation myPerm = new Permutation(4);
        
        System.out.println(myPerm.toString());
        
        System.out.println("Number of permutations: " + myPerm.calculatePermutations());
    }
    
}
