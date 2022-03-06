package map;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.ObjectJson;
import model.Ticket;

import java.io.File;
import java.util.List;

/**
 * Парсер JSON файла
 */
public class MapJsonToJavaObject {

    /**
     * Считывает данные из JSON файла и выдает список объектов Ticket
     * @param pathFile - путь к файлу JSON
     * @return - список объектов Ticket
     */
    public static List<Ticket> readJson(String pathFile) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            ObjectJson objectJson = (mapper.readValue(new File(pathFile), ObjectJson.class));
            return objectJson.getTickets();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
