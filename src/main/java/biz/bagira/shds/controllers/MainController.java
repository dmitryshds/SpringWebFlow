package biz.bagira.shds.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Dmitriy on 19.08.2016.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(){
        return "redirect:login";
    }

    @RequestMapping(value = "downloadPDF", method = RequestMethod.GET)
    public ModelAndView downloadPdf(){
        return new ModelAndView("pdfView");
    }
}
