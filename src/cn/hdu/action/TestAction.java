package cn.hdu.action;

import cn.hdu.shop.service.impl.Demo;

public class TestAction {
	private Demo demo;
	public void setDemo(Demo demo) {
		this.demo = demo;
	}
	
	public String  test(){
		System.out.println(demo);
		return "success";
	}
}
