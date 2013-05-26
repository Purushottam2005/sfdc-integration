package amg.mkaminsk.sfdc.model;

public abstract class Referencable {

	String href;

	public String getHref() {
		return href;
	}

	public abstract void setReferenceId(String id);

}
