import donnees.Magasin;
import org.junit.jupiter.api.Test;

import XML.ChargeurMagasin ;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class Test_ChargeurMagasin {

    @Test
    public void test_ChargerMagasin_classic() throws Exception{
        ChargeurMagasin chM = new ChargeurMagasin("src/magasinCD_donnees/musicbrainzSimple");
        Magasin mag = new Magasin() ;
        try {
            mag = chM.chargerMagasin() ;
        } catch (FileNotFoundException e){
            fail();
        }
        assertEquals(mag.getNombreCds(),12);
    }

    @Test
    public void test_ChargerMagasin_Echec() throws Exception {
        ChargeurMagasin chM = new ChargeurMagasin("src/magasinCD_donnees/NonMusicbrainzSimple");
        IOException FileNotFoundException = assertThrows(
                java.io.FileNotFoundException.class,
                ()-> {
                    chM.chargerMagasin();
                }
        ) ;
    }
}
