import map.MapJsonToJavaObject;
import model.Ticket;
import service.ServiceTicket;

import java.util.List;


public class Main {

    //адрес и название файла
    private static final String PATH_FILE = "d:/tickets.json";
    // процентиль
    private static final int PERSENTILE = 90;

    public static void main(String[] args) {
        //получаем список обектов Ticket из json файла
        List<Ticket> ticketList = MapJsonToJavaObject.readJson(PATH_FILE);
        //Получаем список временных отрезков полетов
        List<Long> timeFlight = ServiceTicket.listFlightTime(ticketList);
        //Получаем среднее время полета
        String averageTime = ServiceTicket.calculationAverage(timeFlight);
        System.out.println("Среднее время полета: " + averageTime);
        //Получаем время полета, соответствующее процентилю
        String persentileTime = ServiceTicket.calculationPercentile(timeFlight, PERSENTILE);
        System.out.println("90-й процентиль времени полета: " + persentileTime);
    }
}
