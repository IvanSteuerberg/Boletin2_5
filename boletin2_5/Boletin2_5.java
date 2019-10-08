
package boletin2_5;
//author irodriguezsteuerberg

import java.util.Scanner;

public class Boletin2_5 {

    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Introduce o soldo fixo");
float soldo_fixo = sc.nextFloat();
System.out.println("Introduce a comisión deste mes");
float comision = sc.nextFloat();
System.out.println("Introduce a kilometraxe deste mes");
float km = sc.nextFloat();
//km é a kilometraxe
System.out.println("Introduce as dietas deste mes");
float dietas = sc.nextFloat();
km = km*2;    
dietas = dietas*30;    
float soldo_bruto =soldo_fixo+comision+km+dietas ;    
float soldo_liquido = (soldo_bruto*0.82f)-36;    
System.out.println("O soldo bruto é de "+soldo_bruto+
        " euros e o soldo liquido é de "+soldo_liquido+" euros");    
    
    }
    
}
