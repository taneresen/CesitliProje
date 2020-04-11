
package com.bilisimegitim.cesitli;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Calistir {
    
    public static void main(String[] args) {
        
        Date dt = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        System.out.println(sdf.format(dt));
        
        
    }
    
}
