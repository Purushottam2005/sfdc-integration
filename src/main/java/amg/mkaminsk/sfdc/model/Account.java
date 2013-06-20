package amg.mkaminsk.sfdc.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account extends Referencable {

	private static String REFERENCE_PREFIX = "/accounts/";

	private String website;

	private String phone;

	private String name;

	private String fax;

	private String accountPriority;

	private Address billingAddress;

	private Double AnnualRevenue;

	private Boolean isActive;

	private String accountNumber;

	@Override
	public void setReferenceId(String id) {
		href = REFERENCE_PREFIX + id;
	}
}
