@amazon
Feature: To validate amazon search function


@sanity
Scenario: To validate amazon search option with valid input

Given To user launch edge browser
When To user enter valid amazon url 
And To user enter  product name in textbox
# With Header(Map)
# 2 Dimensional Map	
      
      			|mobile|laptop|tv|
      			|iphone 16|dell|samsung 55|
      			|samsung 25|hp|lg 55 inch|
      			

Then To user click search button
