
@SendEmail-feature

Feature: Send Email to Salesforce



Scenario Outline: Validate Send Email To Salesoforce

	Given user is on email box to send the email to advisor
	Then user enter from EmailId "<fromemailid>" from Password "<frompasswd>" receiver EmailId "<receiveremailid>" receiver Subject "<receiversubject>" and receiver Email Body "<receiveremailbody>"
					
Examples:
|fromemailid|frompasswd|receiveremailid|receiversubject|receiveremailbody|
|autuatthree@gmail.com|Tester@123|customercare@f-26dotr4wza195tifk7ojlevaif5igcmzdae6lmoi0iwzkdsp8b.9e-dxlhua4.cs88.case.sandbox.salesforce.com|TON UAT 6032_3 BRONZE VIP INQUIRY|TON UAT 6032 BRONZE VIP INQUIRY|
|autuattonfive@gmail.com|Tester@123|customercare@f-26dotr4wza195tifk7ojlevaif5igcmzdae6lmoi0iwzkdsp8b.9e-dxlhua4.cs88.case.sandbox.salesforce.com|TON UAT 6032_3 GOLD VIP INQUIRY|TON UAT 6032 GOLD VIP INQUIRY|
