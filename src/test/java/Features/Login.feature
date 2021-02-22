Feature: Login into Application

  Scenario Outline:Submit the postive flow
    Given Initialize the browser
      And Navigate to URL "https://rahulshettyacademy.com/angularpractice/"
     When User Enter valid user details<name>,<email>,<pwd>,<gender> and <DOB>
     Then Validate the successful message is displayed
      And Close browsers
  
    Examples: 
  
      | name    | email                   | pwd     | gender | dob      | 
      | Soundar | rsoundrapandi@gmail.com | 1234567 | Female | 20022020 | 
