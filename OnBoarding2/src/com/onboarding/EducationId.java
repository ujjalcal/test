// default package
// Generated Feb 17, 2015 9:43:47 PM by Hibernate Tools 3.4.0.CR1

/**
 * EducationId generated by hbm2java
 */
public class EducationId implements java.io.Serializable {

	private String empId;
	private String degree;
	private String school;
	private String year;
	private String noOfYears;

	public EducationId() {
	}

	public EducationId(String empId, String degree, String school, String year,
			String noOfYears) {
		this.empId = empId;
		this.degree = degree;
		this.school = school;
		this.year = year;
		this.noOfYears = noOfYears;
	}

	public String getEmpId() {
		return this.empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getNoOfYears() {
		return this.noOfYears;
	}

	public void setNoOfYears(String noOfYears) {
		this.noOfYears = noOfYears;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EducationId))
			return false;
		EducationId castOther = (EducationId) other;

		return ((this.getEmpId() == castOther.getEmpId()) || (this.getEmpId() != null
				&& castOther.getEmpId() != null && this.getEmpId().equals(
				castOther.getEmpId())))
				&& ((this.getDegree() == castOther.getDegree()) || (this
						.getDegree() != null && castOther.getDegree() != null && this
						.getDegree().equals(castOther.getDegree())))
				&& ((this.getSchool() == castOther.getSchool()) || (this
						.getSchool() != null && castOther.getSchool() != null && this
						.getSchool().equals(castOther.getSchool())))
				&& ((this.getYear() == castOther.getYear()) || (this.getYear() != null
						&& castOther.getYear() != null && this.getYear()
						.equals(castOther.getYear())))
				&& ((this.getNoOfYears() == castOther.getNoOfYears()) || (this
						.getNoOfYears() != null
						&& castOther.getNoOfYears() != null && this
						.getNoOfYears().equals(castOther.getNoOfYears())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEmpId() == null ? 0 : this.getEmpId().hashCode());
		result = 37 * result
				+ (getDegree() == null ? 0 : this.getDegree().hashCode());
		result = 37 * result
				+ (getSchool() == null ? 0 : this.getSchool().hashCode());
		result = 37 * result
				+ (getYear() == null ? 0 : this.getYear().hashCode());
		result = 37 * result
				+ (getNoOfYears() == null ? 0 : this.getNoOfYears().hashCode());
		return result;
	}

}