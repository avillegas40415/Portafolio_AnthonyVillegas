
package Tienda.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controllers {
    @GetMapping("/")
    public String home() {
        return "index"; // Asegúrate de que index.html esté en templates
    }

    @GetMapping("/aboutus")
    public String aboutUs() {
        return "aboutus"; // Asegúrate de que aboutus.html esté en templates
    }
}
