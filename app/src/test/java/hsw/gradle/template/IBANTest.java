package hsw.gradle.template;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IBANTest {

    @Test void IBANDECheck(){
        String myIBAN = "DE68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertEquals(classUnderTest.checkDE(myIBAN), true);
    }

    @Test void IBANDEWrong(){
        String myIBAN = "ZZ68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertEquals(classUnderTest.check(myIBAN), false);
    }
    @Test void IBANDE() {
        String myIBAN = "DE68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertEquals(classUnderTest.check(myIBAN), true);
    }

    @Test void IBANWrong() {
        String myIBAN = "ZZ68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertEquals(classUnderTest.check(myIBAN), false);
    }

    @Test void IBANVolksbankMuensterWrong(){
        String myIBAN = "DE68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertEquals(classUnderTest.isVBMS(myIBAN), false);
    }

    @Test void IBANVolksbankMuenster(){
        String myIBAN = "DE68403619060012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertEquals(classUnderTest.isVBMS(myIBAN), true);
    }

    @Test void testgetBlz(){
        String myIBAN = "DE68403619060012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertEquals(classUnderTest.getBLZ(myIBAN), "40361906");
    }

    @Test void testgetKontoNr(){
        String myIBAN = "DE68403619060012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertEquals(classUnderTest.getKontoNr(myIBAN), "0012345678");
    }
}
