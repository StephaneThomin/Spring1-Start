package com.wildcodeschool.theDoctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class TheDoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheDoctorApplication.class, args);
	}

	@RequestMapping("/doctor/1")
	@ResponseBody
	public String index1() {
		return "William Hartnell";
	}

	@RequestMapping("/doctor/3")
	@ResponseBody
	public String index2() {
		return "Jon Pertwee";
	}

	@RequestMapping("/doctor/11")
	@ResponseBody
	public String index3() {
		return "Matt Smith";
	}

	@RequestMapping("/doctor/13")
	@ResponseBody
	public String index4() {
		return "Jodie Whittaker";
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "<ul><li><a href='http://localhost:8080/doctor/1'>First Doctor</a></li>" +
		"<li><a href='http://localhost:8080/doctor/3'>Third Doctor</a></li>" +
		"<li><a href='http://localhost:8080/doctor/11'>Eleventh Doctor</a></li>" +
		"<li><a href='http://localhost:8080/doctor/13'>Thirteenth Doctor</a></li></ul>";
	}
}
