package com.SkyBlue.hr.circumstance.dao;

import java.util.List;

import com.SkyBlue.hr.circumstance.to.DeductionTaxBean;
import com.SkyBlue.hr.circumstance.to.IncomeTaxBean;

public interface DeductionInsurDAO {
	public List<DeductionTaxBean> selectDeductionTaxList();
	public List<IncomeTaxBean> selectIncomeTaxList();
	
	
	public void deleteDeductionTax(DeductionTaxBean deductionTaxBean);
	public void deleteIncomeTax(IncomeTaxBean incomeTaxBean);
	

	public void insertDeductionTax(DeductionTaxBean deductionTaxBean);
	public void insertIncomeTax(IncomeTaxBean incomeTaxBean);

	
}
