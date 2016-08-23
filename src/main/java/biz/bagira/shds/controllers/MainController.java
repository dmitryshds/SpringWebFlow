package biz.bagira.shds.controllers;

import biz.bagira.shds.objects.User;
import biz.bagira.shds.objects.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by Dmitriy on 19.08.2016.
 */
@Controller
public class MainController {

    private final ApplicationContext context;
    @Autowired
    public MainController(ApplicationContext context) {
        this.context = context;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(){
        return "redirect:login";
    }

    @RequestMapping(value = "downloadPDF", method = RequestMethod.GET)
    public ModelAndView downloadPdf(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response){
        UserService userservice = context.getBean(UserService.class);
        User lastAdded = userservice.getLastAdded();
        model.put("lastUser",lastAdded);
        return new ModelAndView("pdfView","lastUser",lastAdded);
    }
}
