/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.romanonumb.Romano;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vinic
 */
public class RomanoTeste {
    
    public RomanoTeste() {
    }
    
     @Test
     public void testConvertEhRomano() {
     
     
     Romano test = new Romano();
     
         assertTrue( test.convertRomano("XLV")==45);
         assertTrue(test.convertRomano("X")==10);
         assertTrue(test.convertRomano("I")==1);
         assertTrue(test.convertRomano("C")==100);
         assertTrue(test.convertRomano("D")==500);
         assertTrue(test.convertRomano("X")==10);
         assertTrue( test.convertRomano("CDXLV")==445);

     }
          @Test
     public void testConvertEhRomanoFalse() {
     
     
     Romano test = new Romano();
     
         assertFalse( test.convertRomano("XLVV")==45);
         assertFalse(test.convertRomano("XI")==10);
         assertFalse(test.convertRomano("CD")==1);
         assertFalse(test.convertRomano("Y")==100);
         assertFalse(test.convertRomano("DC")==500);
         assertFalse(test.convertRomano("XI")==10);
         assertFalse( test.convertRomano("CCDXLV")==445);

     }
}
