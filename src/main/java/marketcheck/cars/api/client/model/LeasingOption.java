package marketcheck.cars.api.client.model;

import com.google.gson.annotations.SerializedName;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-09T10:14:35.317+05:30")
public class LeasingOption {
	@SerializedName("estimated_monthly_payment")
	private String estimatedMonthlyPayment;

	@SerializedName("down_payment")
	private String downPayment;

	@SerializedName("lease_term")
	private String leaseTerm;
	
	
	@Override
	 public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class LeasingOption {\n");
	    
	    sb.append("    downPayment: ").append(toIndentedString(downPayment)).append("\n");
	    sb.append("    estimatedMonthlyPayment: ").append(toIndentedString(estimatedMonthlyPayment)).append("\n");
	    sb.append("    leaseTerm: ").append(toIndentedString(leaseTerm)).append("\n");
	    sb.append("}");
	    return sb.toString();
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

	public String getLeaseTerm() {
		return leaseTerm;
	}

	public void setLeaseTerm(String leaseTerm) {
		this.leaseTerm = leaseTerm;
	}
	
	
	
	/**
	   * Convert the given object to string with each line indented by 4 spaces
	   * (except the first line).
	   */
	  private String toIndentedString(java.lang.Object o) {
	    if (o == null) {
	      return "null";
	    }
	    return o.toString().replace("\n", "\n    ");
	  }

}