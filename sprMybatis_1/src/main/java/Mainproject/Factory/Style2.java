package Mainproject.Factory;

import Mainproject.Dao.member.implMember;
import Mainproject.Dao.porder.implPorder;
import Mainproject.Model.member;
import Mainproject.Model.porder;

public class Style2 {
	private implMember MD;
	private implPorder PD;
	private member M;
	private porder P;
	public Style2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Style2(implMember mD, implPorder pD, member m, porder p) {
		super();
		MD = mD;
		PD = pD;
		M = m;
		P = p;
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
	public member getM() {
		return M;
	}
	public void setM(member m) {
		M = m;
	}
	public porder getP() {
		return P;
	}
	public void setP(porder p) {
		P = p;
	}
	
	

}
