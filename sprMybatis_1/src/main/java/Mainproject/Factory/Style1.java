package Mainproject.Factory;

import Mainproject.Dao.member.implMember;
import Mainproject.Dao.porder.implPorder;

public class Style1 {
	private implMember MD;
	private implPorder PD;
	public Style1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Style1(implMember mD, implPorder pD) {
		super();
		MD = mD;
		PD = pD;
	}
	public implMember getMD() {
		return MD;
	}
	public void setMD(implMember mD) {
		MD = mD;
	}
	public implPorder getPD() {
		return PD;
	}
	public void setPD(implPorder pD) {
		PD = pD;
	}
	
	

}
