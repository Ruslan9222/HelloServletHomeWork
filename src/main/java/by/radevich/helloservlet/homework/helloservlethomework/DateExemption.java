package by.radevich.helloservlet.homework.helloservlethomework;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateExemption extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LocalDate date = LocalDate.now();
        PrintWriter writer = resp.getWriter();
        writer.println(date);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date1 = LocalDate.parse(scanner.nextLine(), formatter);
        DayOfWeek dayOfWeek = date1.getDayOfWeek();
        writer.println(dayOfWeek);
        writer.println(date.getDayOfYear());

    }
}
