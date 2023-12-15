package example.web.presentation.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    String index(Model model) {

        Integer counter = (Integer) session.getAttribute("counter");
        Integer currentCounter = counter == null ? 1 : counter + 1;
        session.setAttribute("counter", currentCounter);

        model.addAttribute("hostName", hostName());
        model.addAttribute("counter", currentCounter);

        return "index";
    }

    private String hostName() {
        String hostName;

        try {
            hostName = InetAddress.getLocalHost().getHostName();

        } catch (UnknownHostException e) {
            hostName = "Unknown";
        }
        return hostName;
    }

    
    private final HttpSession session;

    public HomeController(HttpSession session) {
        this.session = session;
    }
}
