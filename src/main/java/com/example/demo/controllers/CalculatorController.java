package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Calculator;

@Controller
@RequestMapping("/calculate")
public class CalculatorController {
	@PostMapping("calculator")
	public String TwoNumberCalculator(@RequestParam(name = "left") double first,
			@RequestParam(name = "right") double second, Model model, String mathChoice) {
		if (mathChoice.equals("add")) {
			Calculator ADD = new Calculator(first, second);
			double qwe = ADD.doTheAdd();
			model.addAttribute("output", qwe);
		} else if (mathChoice.equals("subtract")) {
			Calculator SUBTRACT = new Calculator(first, second);
			double ert = SUBTRACT.doTheSubtract();
			model.addAttribute("output", ert);
		} else if (mathChoice.equals("multiply")) {
			Calculator MULTIPLY = new Calculator(first, second);
			double tyu = MULTIPLY.doTheMultiply();
			model.addAttribute("output", tyu);
		} else if (mathChoice.equals("divide")) {
			Calculator DIVIDE = new Calculator(first, second);
			double iop = DIVIDE.doTheDivision();
			model.addAttribute("output", iop);
		} else if (mathChoice.equals("modulo")) {
			Calculator MODULO = new Calculator(first, second);
			double asd = MODULO.doTheModulo();
			model.addAttribute("output", asd);
		} else {
			Calculator EXPONENT = new Calculator(first, second);
			double vbn = EXPONENT.doTheExponent();
			model.addAttribute("output", vbn);
		}
		return "math/calculate-again";
	}

	@GetMapping({"", "/calculator"})
	public String index(Model model) {
		model.addAttribute("output", "Please Enter Some Numbers");
		return "math/calculate-again";

	}

}