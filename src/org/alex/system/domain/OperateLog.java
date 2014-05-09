package org.alex.system.domain;

/**
 * User operation log
 * 
 * @author Alex
 * 
 */
public class OperateLog {

	private int id;

	private String intranetID;

	private String fullName;

	private String country;

	private String userIP;

	private String operateDate;

	private String className;

	private String method;

	private String retVal;

	private String comment;

	private String message;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIntranetID() {
		return intranetID;
	}

	public void setIntranetID(String intranetID) {
		this.intranetID = intranetID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getUserIP() {
		return userIP;
	}

	public void setUserIP(String userIP) {
		this.userIP = userIP;
	}

	public String getOperateDate() {
		return operateDate;
	}

	public void setOperateDate(String operateDate) {
		this.operateDate = operateDate;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getRetVal() {
		return retVal;
	}

	public void setRetVal(String retVal) {
		this.retVal = retVal;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "OperateLog [intranetID=" + intranetID + ", fullName="
				+ fullName + ", country=" + country + ", userIP=" + userIP
				+ ", operateDate=" + operateDate + ", className=" + className
				+ ", method=" + method + ", retVal=" + retVal + ", comment="
				+ comment + ", message=" + message + "]";
	}

}
