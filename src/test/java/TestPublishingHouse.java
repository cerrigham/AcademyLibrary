import it.proactivity.model.Address;
import it.proactivity.model.Client;
import it.proactivity.model.PublishingHouse;
import it.proactivity.utility.AddressUtility;
import it.proactivity.utility.ClientUtility;
import it.proactivity.utility.ParsingUtility;
import it.proactivity.utility.PublishingHouseUtility;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPublishingHouse {

    @Test
    public void createPublishingHouseTest() {

        PublishingHouse baldiniCastoldi = PublishingHouseUtility.createPublishingHouse("1", "Baldini e Castoldi", "Italia",
                "Milano", "12345.56", "Ettore Baldini", "68");

        assertNotNull(baldiniCastoldi);
        assertEquals("Baldini e Castoldi", baldiniCastoldi.getName());
    }

    @Test
    public void createPublishingHouseNullParameterTest() {

        PublishingHouse baldiniCastoldi = PublishingHouseUtility.createPublishingHouse("1", "Baldini e Castoldi", null,
                "Milano", "12345.56", "Ettore Baldini", "68");

        assertNull(baldiniCastoldi);
    }

    @Test
    public void createPublishingHouseWrongParameterTest() {

        PublishingHouse baldiniCastoldi = PublishingHouseUtility.createPublishingHouse("1", "Baldini e Castoldi", null,
                "Milano", "notAnumber", "Ettore Baldini", "68");

        assertNull(baldiniCastoldi);
    }
}
