package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.Adder;
import com.example.demo.models.Whisperer;
import com.example.demo.models.Yeller;

@Controller
@RequestMapping({"/", "/HelloWorld"})
public class HelloWorldController {
	
	private String title;
	
	public HelloWorldController() {
		title = "Hello Java and Spring!";
	}
	
	@GetMapping("")
	public String index() {
		return "helloworld/index";
	}
	
	@GetMapping("message") //URL to which the form submits
	public ModelAndView message(@RequestParam(required=false, defaultValue="«silence»") String submittedMessage) { //User submitted message
		Yeller asdf = new Yeller(submittedMessage); //Waiting for instance of user submitted variable, sets equal to parameter from the user
		String allCaps = asdf.caps(); //resulting loud words from yeller, insider variable is string with all uppercase
		
		ModelAndView mv = new ModelAndView("helloworld/message"); //This is the path src/main/resources/helloworld/message.html
		mv.addObject("title", title);		
		mv.addObject("message", allCaps);
		return mv;
	}
	
	//Create a class named Whisperer that makes Strings lower case
	//Using the method below, create a method named "whisper" for a GetMapping that does essentially the same thing
	//but uses Whisperer. This means that you should map a GET to the path "whisper"
	//This means you should have a method named "whisper" that returns a ModelAndView
	
	@GetMapping("whisper")
	public ModelAndView whisper(@RequestParam(required=false, defaultValue="«shhhhhh»") String whisper) {
		Whisperer asdf = new Whisperer(whisper);
		String alllow = asdf.lower();
		
		ModelAndView mv = new ModelAndView("helloworld/whisper");
		mv.addObject("title", title);
		mv.addObject("message", alllow);
		return mv;
	}
	 
}