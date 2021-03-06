// default package
// Generated Feb 17, 2015 9:43:47 PM by Hibernate Tools 3.4.0.CR1

/**
 * ClientId generated by hbm2java
 */
public class ClientId implements java.io.Serializable {

	private String clientId;
	private String clientName;
	private String clientAddress;
	private String clientContact;
	private String clientEmail;
	private String clientPhone;

	public ClientId() {
	}

	public ClientId(String clientId, String clientName, String clientAddress,
			String clientContact, String clientEmail, String clientPhone) {
		this.clientId = clientId;
		this.clientName = clientName;
		this.clientAddress = clientAddress;
		this.clientContact = clientContact;
		this.clientEmail = clientEmail;
		this.clientPhone = clientPhone;
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientAddress() {
		return this.clientAddress;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	public String getClientContact() {
		return this.clientContact;
	}

	public void setClientContact(String clientContact) {
		this.clientContact = clientContact;
	}

	public String getClientEmail() {
		return this.clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public String getClientPhone() {
		return this.clientPhone;
	}

	public void setClientPhone(String clientPhone) {
		this.clientPhone = clientPhone;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ClientId))
			return false;
		ClientId castOther = (ClientId) other;

		return ((this.getClientId() == castOther.getClientId()) || (this
				.getClientId() != null && castOther.getClientId() != null && this
				.getClientId().equals(castOther.getClientId())))
				&& ((this.getClientName() == castOther.getClientName()) || (this
						.getClientName() != null
						&& castOther.getClientName() != null && this
						.getClientName().equals(castOther.getClientName())))
				&& ((this.getClientAddress() == castOther.getClientAddress()) || (this
						.getClientAddress() != null
						&& castOther.getClientAddress() != null && this
						.getClientAddress()
						.equals(castOther.getClientAddress())))
				&& ((this.getClientContact() == castOther.getClientContact()) || (this
						.getClientContact() != null
						&& castOther.getClientContact() != null && this
						.getClientContact()
						.equals(castOther.getClientContact())))
				&& ((this.getClientEmail() == castOther.getClientEmail()) || (this
						.getClientEmail() != null
						&& castOther.getClientEmail() != null && this
						.getClientEmail().equals(castOther.getClientEmail())))
				&& ((this.getClientPhone() == castOther.getClientPhone()) || (this
						.getClientPhone() != null
						&& castOther.getClientPhone() != null && this
						.getClientPhone().equals(castOther.getClientPhone())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getClientId() == null ? 0 : this.getClientId().hashCode());
		result = 37
				* result
				+ (getClientName() == null ? 0 : this.getClientName()
						.hashCode());
		result = 37
				* result
				+ (getClientAddress() == null ? 0 : this.getClientAddress()
						.hashCode());
		result = 37
				* result
				+ (getClientContact() == null ? 0 : this.getClientContact()
						.hashCode());
		result = 37
				* result
				+ (getClientEmail() == null ? 0 : this.getClientEmail()
						.hashCode());
		result = 37
				* result
				+ (getClientPhone() == null ? 0 : this.getClientPhone()
						.hashCode());
		return result;
	}

}
