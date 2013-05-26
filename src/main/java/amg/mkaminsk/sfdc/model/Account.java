package amg.mkaminsk.sfdc.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account extends Referencable {

	private static String REFERENCE_PREFIX = "/accounts/";

	@Override
	public void setReferenceId(String id) {
		href = REFERENCE_PREFIX + id;
	}
}
