Feature: All Form Submission

  @ValidationTest
  Scenario: Verify All the required message
    Given Launch the browser
    When Open URL for RAQ Form "https://8x8-preview.netlify.app/"
    And Click on Request a Demo button
    And Verify next button status of first steper
    And Verify Required messages for email
    And Verify error message when enter plain text and click on next button
    And Verify that next button status when user enter Business email
    And Verify that next button status when user enter valid Personal email
    And Verify email field with single space and multiple space only
    And Verify email field with Blocked Domains like -@foxmail.com
    And Verify email field with Blocked Domains like -@qq.com
    And Navigate To Second Step for Navigation
    And Verify next button status of second steper for First Name Last Name and Phone Number
    And Verify Required messages for First Name Last Name and Phone Number
    And Verify single space and multiple space for First Name Last Name and Phone fields
    And Verify First Name Last Name Phone fields with Special Characters
    And Verify First Name Last Name phone fields with Numeric Characters
    And Verify First Name Last Name Phone fields with emojis
    And Verify First Name Last Name with emojis and valid phone number
    And Verify First Name Last Name with emojis and Special Characters and valid phone number
    And Navigate to third Steper
    And Verify submit button status of Third steper With All empty Fields
    And Verify single space and multiple space for Company and No: of Employees fields
    And Verify Required messages for Company and No: of Employees
    And Verify Compnay and NOE with Special Characters
    And Verify Compnay and NOE with Numeric Characters
    And Verify Company and NOE fields with emojis
    And Verify Company and NOE with emojis and Special Characters
    
    And Verify Company with Special Characters and Other Form With Valid Data
    
    And Verify submit button status of Third steper For Country and Primary Interest with valid Data in Text Fields
    And Verify Selection of State Dropdown when Selcet Country as United Stated
    And Verify the Count of Country
    And Verify the Count of State
    And Verify the Count of Primary Interest
    And Submit the RAQ Form