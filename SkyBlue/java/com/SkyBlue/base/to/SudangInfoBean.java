package com.SkyBlue.base.to;

import java.util.List;

import com.SkyBlue.common.to.BaseBean;

public class SudangInfoBean extends BaseBean{

	private List<OvertimeSalBean> overtimeSalList;
	private List<EtcSalBean> etcSalList;

	public List<OvertimeSalBean> getOvertimeSalList() {
		return overtimeSalList;
	}
	public void setOverTimeSalList(List<OvertimeSalBean> overtimeSalList) {
		this.overtimeSalList = overtimeSalList;
	}
	public List<EtcSalBean> getEtcSalList() {
		return etcSalList;
	}
	public void setEtcSalList(List<EtcSalBean> etcSalList) {
		this.etcSalList = etcSalList;
	}

}
