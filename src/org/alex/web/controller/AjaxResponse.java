package org.alex.web.controller;

/**
 * Ajax Http response message Object
 * 
 * @author Alex
 * 
 */
public class AjaxResponse {

	private boolean result;

	private Object msg;

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public Object getMsg() {
		return msg;
	}

	public void setMsg(Object msg) {
		this.msg = msg;
	}

}
