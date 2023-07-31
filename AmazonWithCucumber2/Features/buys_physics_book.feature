 Feature: Buy Mobile Phone
 
 Scenario: A user must be able to buy a physics book on Amazon website
 Given a user is on the landing page of the Amazon page 
 When he enters physics books in the search box and then select 3rd option from the drop-down.
 And he clicks rating 4star and above from left side bar
 And he clicks on the first search result
 And he clicks Add to Cart button
 And he verify the text - Added to Cart is displayed. 
 And he clicks on Proceed to Buy button
 Then he verify user is on the Sign in page
 