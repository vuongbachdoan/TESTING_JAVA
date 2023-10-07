import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import com.example.CalculatePremium;

public class TestCalculatePremium {
    ArrayList<InsuranceData> datas = new ArrayList<>();

    @Test
    public void testCalculatePremium() {
        readData();
        CalculatePremium calculatePremium = new CalculatePremium();
        int index = 20;
        InsuranceData data = datas.get(index);
        int result = calculatePremium.cal(
            data.getBreakdownCover(),
            data.getWindscreenRepair(),
            data.getNumberOfAccident(),
            data.getRegistrationNumber(),
            data.getTotalMileage(),
            data.getEstimatedValue(),
            data.getParkingLocation(),
            data.getDayStartPolicy()
        );

        // int result = calculatePremium.cal(
        //         "Roadside",
        //         "YES",
        //         0,
        //         "ABC01",
        //         10000,
        //         400,
        //         "Public place",
        //         "2022/02/07");

        int actuallyResult = data.getPremiumValue();
        assertTrue(result == actuallyResult);
    }

    public void readData() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/test/resources/data.csv"))) {
            String line;

            // Read and process each line until the end of the file
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");

                InsuranceData data = new InsuranceData(values);
                datas.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
