package helpers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;

public class Helpers {


    private JSONObject jsonObject;

    public Helpers(String path) throws IOException {

        StringBuilder jsonData = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = reader.readLine()) != null) {
            jsonData.append(line);
        }
        reader.close();
        jsonObject = new JSONObject(jsonData.toString());
    }

    public String getValue(String key) {
        return jsonObject.getString(key);
    }
}
