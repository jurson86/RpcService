package com.tsing;
import java.io.Serializable;


public class RpcResponse implements Serializable 
{
	private Throwable error;
	private Object result;
	
	public Throwable getError() {
		return error;
	}
	public void setError(Throwable error) {
		this.error = error;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	
	public String toString()
	{
		String result = "Throwable: " + error == null ? "error" : "ok";
		result += "result: " + result;
		
		return result;
	}
}
