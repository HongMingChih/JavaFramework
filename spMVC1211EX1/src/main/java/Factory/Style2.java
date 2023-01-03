package Factory;

import Dao.member.implMember;
import Dao.porder.implPorder;
import Model.member;
import Model.porder;

public class Style2 {
	private implMember MD;
	private implPorder PD;
	private member M;
	private porder P;

	public Style2() {
		super();
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
