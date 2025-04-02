package com.lucio.export_java.services;

import com.lucio.export_java.models.Users;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExportService {

    /**
     * Common CSV
     */
    public void exportToCSV(List<Users> users, HttpServletResponse response) throws Exception {
        response.setContentType("text/csv");
        response.setHeader("Content-Disposition", "attachment; filename=data.csv");

        CSVPrinter csvPrinter = new CSVPrinter(response.getWriter(), CSVFormat.DEFAULT.withHeader("nom", "prenom", "email", "adresse", "mdp", "genre"));
        for (Users user : users) {
            csvPrinter.printRecord(user.getNom(), user.getPrenom(), user.getEmail(), user.getAdresse(), user.getMdp(), user.getGenre().getLibelle());
        }
        csvPrinter.flush();
    }

}
