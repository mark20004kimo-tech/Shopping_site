package fact;

import dao.managerado;
import dao.memberdao;
import dao.porderdao;

public class daofact {
	private memberdao md;
	private porderdao pd;
	private managerado mrd;
	
	public memberdao getMd() {
		return md;
	}
	public void setMd(memberdao md) {
		this.md = md;
	}
	public porderdao getPd() {
		return pd;
	}
	public void setPd(porderdao pd) {
		this.pd = pd;
	}
	public managerado getMrd() {
		return mrd;
	}
	public void setMrd(managerado mrd) {
		this.mrd = mrd;
	}
	
}
