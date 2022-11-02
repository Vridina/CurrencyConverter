package project.kolesnikova.converter.utils;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class FileUtils {


    public static String getUsersDirectory() {
        String directory = System.getProperty("user.dir");
        return directory + File.separator + "src\\main\\resources" + File.separator;
    }


    public static String addDateToFileName(String fileName) {
        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyy-HHmm(ss)"));
        return String.format("%s-%s.xml", fileName, now);
    }


}
