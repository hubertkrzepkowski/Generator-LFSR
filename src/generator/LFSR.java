/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author HK
 */

    class LFSR
    {
        private List<Integer> rejestr;
        private List<Integer> odczep; 
       
        

      
        public LFSR(String stanp,String odczepyp)
        {
           String[] stan =stanp.split("");
           String[] odczepy =odczepyp.split(",");
           rejestr = new ArrayList<>();
           for(String s:stan){
           
              
                rejestr.add(Integer.parseInt(s));
                              }
            
           odczep = new ArrayList<>();
            for(String s:odczepy)
            {
                if(odczep.contains(s)!=true)
                odczep.add(Integer.parseInt(s));
            }
        }
        
        
        public int shift()
        { 
            int wynik;
            int xor;
            int suma=0;
            for(Integer i :odczep){
            suma=suma+rejestr.get(i);
            }
            if(suma==0){
                xor=0;
            }else{
            if(suma%2==0){xor=0;}else{xor=1;}
            }
            wynik=rejestr.get(rejestr.size()-1);
            rejestr.remove(rejestr.size()-1);
            rejestr.add(0,xor);
            
            return wynik;
        }
       
    }

