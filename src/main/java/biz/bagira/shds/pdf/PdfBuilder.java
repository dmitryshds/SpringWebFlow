package biz.bagira.shds.pdf;

import biz.bagira.shds.objects.User;
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
        User lastUser = (User) model.get("lastUser");

        document.add(new Paragraph("Hi!!!  Last registered user is:"));
        if (lastUser != null)
        {
             document.add(new Paragraph("User : "+lastUser.getUsername()));
        }
    }
}
