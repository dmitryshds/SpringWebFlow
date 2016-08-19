package biz.bagira.shds.pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by Dmitriy on 19.08.2016.
 */
public class PdfBuilder extends AbstractPdfView {
    protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer, HttpServletRequest request, HttpServletResponse response) throws Exception {
     //   User user = (User) request.getAttribute("user");
        System.out.println("USER = ");
//        document.add(new Paragraph(user.getUsername()));
        document.add(new Paragraph("Hi"));
    }
}
