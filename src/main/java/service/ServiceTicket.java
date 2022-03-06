package service;

import model.Ticket;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class ServiceTicket {

    /**
     * Получение списка интервалов времени полетов в секундах из списка объектов Ticket
     *
     * @param listOfTicket - список объектов Ticket
     * @return список интервалов времени полетов в секундах
     */
    public static List<Long> listFlightTime (List<Ticket> listOfTicket, String origin, String destination) {
        List<Long> differentTimeFlight = new ArrayList<>();
        for (Ticket ticket : listOfTicket) {
            if (ticket.getOrigin().equals(origin) && ticket.getDestination().equals(destination)) {
                String startDate = ticket.getDeparture_date();
                String startTime = ticket.getDeparture_time();
                String finishDate = ticket.getArrival_date();
                String finishTime = ticket.getArrival_time();
                differentTimeFlight.add(differentTimeDate(startDate, startTime, finishDate, finishTime));
            }
        }
        return differentTimeFlight;
    }

    /**
     * Расчет среднего значения и вывод в виде строки
     *
     * @param list - список чисел
     * @return строка в формате HH hours mm minutes ss seconds
     */
    public static String calculationAverage (List<Long> list) {
        Long sum = 0L;
        for (Long i : list) {
            sum += i;
        }
        Long timeAverage = sum/list.size();
        return printTime(timeAverage);
    }

    /**
     * Расчет значения, соответствующего процентилю
     *
     * @param list - список чисел
     * @param persentile - процентиль
     * @return строка в формате HH hours mm minutes ss seconds
     */
    public static String calculationPercentile (List<Long> list, int persentile) {
        list.sort(Long::compareTo);
        int index = (((persentile * list.size()) / 100) - 1);
        Long timeFoIndex = list.get(index);
        return printTime(timeFoIndex);
    }

    /**
     * Преобразование количества секунд в вид HH hours mm minutes ss seconds
     *
     * @param time - количество секунд
     * @return строка в формате HH hours mm minutes ss seconds
     */
    public static String printTime (Long time) {
        Long seconds = time % 60;
        Long minutes = (time % 3600) /60;
        Long hours = time / 3600;
        return hours + " hours " + minutes + " minutes " + seconds + " seconds.";
    }

    /**
     * Определение разницы во времени между двумя точками интервала времени
     *
     * @param startDate дата начала интервала времени
     * @param startTime время начала интервала времени
     * @param finishDate дата конца интервала времени
     * @param finishTime время конца интервала времени
     * @return количество секунд
     */
    public static long differentTimeDate(String startDate
            , String startTime
            , String finishDate
            , String finishTime) {
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd.MM.uu");
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("H:mm");
        return ChronoUnit.SECONDS.between(LocalDateTime.of(LocalDate.parse(startDate, formatterDate)
                        , LocalTime.parse(startTime, formatterTime))
                        , LocalDateTime.of(LocalDate.parse(finishDate, formatterDate)
                        , LocalTime.parse(finishTime, formatterTime)));
    }
}
