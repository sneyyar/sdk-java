package marketcheck.cars.api.client.model;

import com.google.gson.annotations.SerializedName;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-09T10:14:35.317+05:30")
public class FinancingOption {
	@SerializedName("loan_term")
	private String loanTerm;

	@SerializedName("loan_apr")
	private String loanApr;

	@SerializedName("estimated_monthly_payment")
	private String estimatedMonthlyPayment;

	@SerializedName("down_payment")
	private String downPayment;

	public String getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(String loanTerm) {
		this.loanTerm = loanTerm;
	}

	public String getLoanApr() {
		return loanApr;
	}

	public void setLoanApr(String loanApr) {
		this.loanApr = loanApr;
	}

	public String getEstimatedMonthlyPayment() {
		return estimatedMonthlyPayment;
	}

	public void setEstimatedMonthlyPayment(String estimatedMonthlyPayment) {
		this.estimatedMonthlyPayment = estimatedMonthlyPayment;
	}

	public String getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(String downPayment) {
		this.downPayment = downPayment;
	}

	@Override
	public String toString() {
		return "ClassPojo [loan_term = " + loanTerm + ", loan_apr = " + loanApr + ", estimated_monthly_payment = "
				+ estimatedMonthlyPayment + ", down_payment = " + downPayment + "]";
	}
}