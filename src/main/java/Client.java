import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        final String sensorName=  "Sensor1337";

        registerSensor(sensorName);
        Random random = new Random();
        double minTemperature = 0.0;
        double maxTemperature = 100.0;
        for (int i = 0; i < 500; i++) {
            System.out.println(i);
            sendMeasurement(minTemperature + (random.nextDouble() * (maxTemperature - minTemperature)),
                    random.nextBoolean(),sensorName);
        }
        
    }

    private static void registerSensor(String sensorName) {
        final String url ="http://localhost:8080/measurements/add";
        Map<String,Object> jsonData = new HashMap<>();
        jsonData.put("name",sensorName);
        makePostRequestWithJSONData(url,jsonData);

    }

    private static void sendMeasurement(double v, boolean nextBoolean, String sensorName) {

    }

    private static void makePostRequestWithJSONData(String url, Map<String, Object> jsonData) {
    }


}
