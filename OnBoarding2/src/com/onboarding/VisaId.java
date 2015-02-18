// default package
// Generated Feb 17, 2015 9:43:47 PM by Hibernate Tools 3.4.0.CR1

/**
 * VisaId generated by hbm2java
 */
public class VisaId implements java.io.Serializable {

	private String empId;
	private String visaType;
	private String untilMonthYear;

	public VisaId() {
	}

	public VisaId(String empId, String visaType, String untilMonthYear) {
		this.empId = empId;
		this.visaType = visaType;
		this.untilMonthYear = untilMonthYear;
	}

	public String getEmpId() {
		return this.empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getVisaType() {
		return this.visaType;
	}

	public void setVisaType(String visaType) {
		this.visaType = visaType;
	}

	public String getUntilMonthYear() {
		return this.untilMonthYear;
	}

	public void setUntilMonthYear(String untilMonthYear) {
		this.untilMonthYear = untilMonthYear;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VisaId))
			return false;
		VisaId castOther = (VisaId) other;

		return ((this.getEmpId() == castOther.getEmpId()) || (this.getEmpId() != null
				&& castOther.getEmpId() != null && this.getEmpId().equals(
				castOther.getEmpId())))
				&& ((this.getVisaType() == castOther.getVisaType()) || (this
						.getVisaType() != null
						&& castOther.getVisaType() != null && this
						.getVisaType().equals(castOther.getVisaType())))
				&& ((this.getUntilMonthYear() == castOther.getUntilMonthYear()) || (this
						.getUntilMonthYear() != null
						&& castOther.getUntilMonthYear() != null && this
						.getUntilMonthYear().equals(
								castOther.getUntilMonthYear())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEmpId() == null ? 0 : this.getEmpId().hashCode());
		result = 37 * result
				+ (getVisaType() == null ? 0 : this.getVisaType().hashCode());
		result = 37
				* result
				+ (getUntilMonthYear() == null ? 0 : this.getUntilMonthYear()
						.hashCode());
		return result;
	}

}
