/**
 * 
 */
package org.alex.web.controller;

import org.alex.service.impl.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Alex
 * 
 */
@Controller
public class CommonController {

	@Autowired
	private CommonService commonService;

	@RequestMapping("/prompt")
	@ResponseBody
	public AjaxResponse prompt(String word) {

		AjaxResponse response = new AjaxResponse();
		response.setResult(true);
		response.setMsg(this.commonService.query(word));
		return response;
	}

}
