import amg.mkaminsk.sfdc.model.Account;
import amg.mkaminsk.sfdc.model.Contact;			
import amg.mkaminsk.sfdc.model.Address;

	
def Contact contact = new Contact();
	if(payload.Name != null){
		contact.setName(payload.Name);
	}
	if(payload.FirstName != null){
		contact.setFirstName(payload.FirstName);
	}
	if(payload.LastName != null){
		contact.setLastName(payload.LastName);
	}
	if(payload.Title != null){
		contact.setTitle(payload.Title);
	}
	if(payload.Phone != null){
		contact.setPhone(payload.Phone);
	}
	if(payload.MobilePhone != null){
		contact.setMobile(payload.MobilePhone);
	}
	if(payload.Fax != null){
		contact.setFax(payload.Fax);
	}
	if(payload.Email != null){
		contact.setEmail(payload.Email);
	}
	
	contact.setReferenceId(payload.Id);

def Address mailingAddress = new Address();

	if(payload.MailingCity != null){
		mailingAddress.setCity(payload.MailingCity);
	}
	if(payload.MailingCountry != null){
		mailingAddress.setCountry(payload.MailingCountry);
	}
	if(payload.MailingStreet != null){
	   mailingAddress.setStreet(payload.MailingStreet);
	}
	if(payload.MailingPostalCode != null){
		mailingAddress.setPostalCode(payload.MailingPostalCode);
	}
	
	contact.setMailingAddress(mailingAddress);
	
	
	
def Address primaryAddress = new Address();

	if(payload.OtherCity != null){
		primaryAddress.setCity(payload.OtherCity);
	}

	if(payload.OtherCountry != null){
		primaryAddress.setCountry(payload.OtherCountry);
	}
	if(payload.OtherState != null){
		primaryAddress.setState(payload.OtherState);
	}
	if(payload.OtherStreet != null){
		primaryAddress.setStreet(payload.OtherStreet);
	}

	if(payload.OtherPostalCode != null){
		primaryAddress.setPostalCode(payload.OtherPostalCode);
	}

contact.setPrimaryAddress(primaryAddress);

def Account account = new Account();
account.setReferenceId(payload.AccountId);
contact.setAccount(account);


return contact;