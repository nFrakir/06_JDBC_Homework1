package com.gmail.silverleaf.annn;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "FlatServlet", urlPatterns = "/report")
public class FlatServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String address = req.getParameter("address");
        int rooms = Integer.parseInt(req.getParameter("rooms"));
        Double price = Double.parseDouble(req.getParameter("price"));

        FlatController fc = new FlatController();
        try {
            FlatCollection flats = fc.requestFlatCollection(address, rooms, price);
            req.setAttribute("flatList", flats.getFlats());
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/flat_report.jsp");
            rd.forward(req, resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
