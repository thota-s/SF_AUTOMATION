
@SendEmail-feature

Feature: Send Email to Salesforce



Scenario Outline: Validate Send Email To Salesoforce

	Given user is on email box to send the email to advisor
	Then user enter receiver EmailId "<receiveremailid>" receiver Subject "<receiversubject>" and receiver Email Body "<receiveremailbody>"
					
Examples:
|receiveremailid|receiversubject|receiveremailbody|
|subhra.thotaa@gmail.com|Test email Subhra from automation1|Inquiry about the return policy1|
|subhra.thotaa@gmail.com|Test email Subhra from automation2|Inquiry about the return policy2|
|subhra.thotaa@gmail.com|Test email Subhra from automation3|Inquiry about the return policy3|
|subhra.thotaa@gmail.com|Test email Subhra from automation4|Inquiry about the return policy4|
