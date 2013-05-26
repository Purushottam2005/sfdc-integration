import amg.mkaminsk.sfdc.model.Account;
import amg.mkaminsk.sfdc.model.Contact;			
import amg.mkaminsk.sfdc.model.Address;

def Contact contact = payload;

Map sfdcContact =  [FirstName : contact.firstName,
LastName: contact.lastName,
Title: contact.title,
Phone: contact.phone,
MobilePhone: contact.mobile,
Fax : contact.fax,
Email: contact.email
];

if(contact.href != null){
	sfdcContact.Id = contact.href.split("///")[1];
}
	

if(contact.mailingAddress != null){	
	sfdcContact.MailingCity = contact.mailingAddress.city;
	sfdcContact.MailingCountry = contact.mailingAddress.country;
	sfdcContact.MailingStreet = contact.mailingAddress.street;
	sfdcContact.MailingPostalCode = contact.mailingAddress.postalCode;
	sfdcContact.MailingState = contact.mailingAddress.state;
}

if(contact.primaryAddress != null){	
	sfdcContact.OtherCity = contact.primaryAddress.city;
	sfdcContact.OtherCountry = contact.primaryAddress.country;
	sfdcContact.OtherStreet = contact.primaryAddress.street;
	sfdcContact.OtherPostalCode = contact.primaryAddress.postalCode;
	sfdcContact.OtherState = contact.primaryAddress.state
}

return sfdcContact;