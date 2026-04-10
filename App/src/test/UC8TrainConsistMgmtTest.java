package test;

import main.UC8TrainConsistMgmt;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UC8TrainConsistMgmtTest {

    @Test
    void testFilter() {

        UC8TrainConsistMgmt obj = new UC8TrainConsistMgmt();
        var result = obj.filterBogies();

        // check not empty
        assertFalse(result.isEmpty());

        // check all capacities > 60
        for (var b : result) {
            assertTrue(b.capacity > 60);
        }
    }
}