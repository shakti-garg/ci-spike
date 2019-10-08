
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestSpikeJenkins {

    @Test
    public void testIsAlive() {
        SpikeJenkins spikeJenkins = new SpikeJenkins();
        assertEquals(true, spikeJenkins.isAlive());
    }
}

