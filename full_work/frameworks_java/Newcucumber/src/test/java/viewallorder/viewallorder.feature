Feature: view all orders function				
To view all ordered products details					
Scenario: Display all ordered products details		
Given  Ordered product details				
When user clicks on view all orders				
Then should display all ordered products details				
Scenario: check  all orders				
Given All orders to check 				
When user clicks on check all				
Then should select all  ordered products 				
Scenario: uncheck  all orders				
Given All orders to uncheck			
When user clicks on uncheck all				
Then should uncheck all selected  ordered products 				
Scenario: Delete orders				
Given All orders to delete			
When  user clicks on selected products				
Then  should delete selected  ordered products 				
Scenario: Edit orders				
Given  Ordered product details to edit		
When user clicks on edit button				
Then should navigate to edit order page				
