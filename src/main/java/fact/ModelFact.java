package fact;

import model.Manager;
import model.Member;
import model.Porder;

public class ModelFact {
	private Member m;
	private Porder p;
	private Manager mr;
	
	public Member getM() {
		return m;
	}
	public void setM(Member m) {
		this.m = m;
	}
	public Porder getP() {
		return p;
	}
	public void setP(Porder p) {
		this.p = p;
	}
	public Manager getMr() {
		return mr;
	}
	public void setMr(Manager mr) {
		this.mr = mr;
	}
	
}

