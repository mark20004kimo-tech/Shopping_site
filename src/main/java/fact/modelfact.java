package fact;

import model.manager;
import model.member;
import model.porder;

public class modelfact {
	private member m;
	private porder p;
	private manager mr;
	
	public member getM() {
		return m;
	}
	public void setM(member m) {
		this.m = m;
	}
	public porder getP() {
		return p;
	}
	public void setP(porder p) {
		this.p = p;
	}
	public manager getMr() {
		return mr;
	}
	public void setMr(manager mr) {
		this.mr = mr;
	}
	
}
