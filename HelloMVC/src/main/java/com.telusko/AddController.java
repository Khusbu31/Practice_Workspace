
package com.telusko;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/add")
public class AddController {

	@RequestMapping(method = RequestMethod.GET)
	public String add()
	{
		return "Display.jsp";
	}
}
