// default package
// Generated Feb 17, 2015 9:43:47 PM by Hibernate Tools 3.4.0.CR1

/**
 * VendorId generated by hbm2java
 */
public class VendorId implements java.io.Serializable {

	private String vendorId;
	private String vendorName;
	private String contactPtName;
	private String contactPtAdd;
	private String contactPtPhone;

	public VendorId() {
	}

	public VendorId(String vendorId, String vendorName, String contactPtName,
			String contactPtAdd, String contactPtPhone) {
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.contactPtName = contactPtName;
		this.contactPtAdd = contactPtAdd;
		this.contactPtPhone = contactPtPhone;
	}

	public String getVendorId() {
		return this.vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return this.vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getContactPtName() {
		return this.contactPtName;
	}

	public void setContactPtName(String contactPtName) {
		this.contactPtName = contactPtName;
	}

	public String getContactPtAdd() {
		return this.contactPtAdd;
	}

	public void setContactPtAdd(String contactPtAdd) {
		this.contactPtAdd = contactPtAdd;
	}

	public String getContactPtPhone() {
		return this.contactPtPhone;
	}

	public void setContactPtPhone(String contactPtPhone) {
		this.contactPtPhone = contactPtPhone;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VendorId))
			return false;
		VendorId castOther = (VendorId) other;

		return ((this.getVendorId() == castOther.getVendorId()) || (this
				.getVendorId() != null && castOther.getVendorId() != null && this
				.getVendorId().equals(castOther.getVendorId())))
				&& ((this.getVendorName() == castOther.getVendorName()) || (this
						.getVendorName() != null
						&& castOther.getVendorName() != null && this
						.getVendorName().equals(castOther.getVendorName())))
				&& ((this.getContactPtName() == castOther.getContactPtName()) || (this
						.getContactPtName() != null
						&& castOther.getContactPtName() != null && this
						.getContactPtName()
						.equals(castOther.getContactPtName())))
				&& ((this.getContactPtAdd() == castOther.getContactPtAdd()) || (this
						.getContactPtAdd() != null
						&& castOther.getContactPtAdd() != null && this
						.getContactPtAdd().equals(castOther.getContactPtAdd())))
				&& ((this.getContactPtPhone() == castOther.getContactPtPhone()) || (this
						.getContactPtPhone() != null
						&& castOther.getContactPtPhone() != null && this
						.getContactPtPhone().equals(
								castOther.getContactPtPhone())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getVendorId() == null ? 0 : this.getVendorId().hashCode());
		result = 37
				* result
				+ (getVendorName() == null ? 0 : this.getVendorName()
						.hashCode());
		result = 37
				* result
				+ (getContactPtName() == null ? 0 : this.getContactPtName()
						.hashCode());
		result = 37
				* result
				+ (getContactPtAdd() == null ? 0 : this.getContactPtAdd()
						.hashCode());
		result = 37
				* result
				+ (getContactPtPhone() == null ? 0 : this.getContactPtPhone()
						.hashCode());
		return result;
	}

}