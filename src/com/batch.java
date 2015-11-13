/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author dell
 */

    import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DEV
 */
public class batch {
    public static void main(String[] args) {
        try {
       Runtime.getRuntime().exec(" cmd /c start cd coolZip java Eve pause;");
		
          
        } catch (Exception ex) {
            System.out.println(ex+"gggggggggggggg");
        }
    }
}

