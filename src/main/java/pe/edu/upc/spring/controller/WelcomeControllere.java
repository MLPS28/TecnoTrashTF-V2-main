package pe.edu.upc.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/welcome")
public class WelcomeControllere {
public String irPaginaBienvenida() {
	return "bienvenido";
}
}
