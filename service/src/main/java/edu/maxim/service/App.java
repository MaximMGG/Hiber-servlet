package edu.maxim.service;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import edu.maxim.service.entity.Castomer;
import edu.maxim.service.util.OrderUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/get")
public class App extends HttpServlet{

    public static void main(String[] args) {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/jsp/get.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String packag = req.getParameter("package");
        String date = req.getParameter("date");
        LocalDate localDate = LocalDate.parse(date);
        Date dd = Date.valueOf(localDate);
        DBConnect dbconnect = new DBConnect();

        Castomer castomer = dbconnect.getCastomer(name);

        if (castomer == null) {
            castomer = new Castomer();
            castomer.setName(name);
            castomer.setOrders(OrderUtil.parsOrders(packag, dd, castomer));
            dbconnect.saveCastomer(castomer);
            req.getRequestDispatcher("/WEB-INF/jsp/success.jsp").forward(req, resp);;
        }
    }
}
