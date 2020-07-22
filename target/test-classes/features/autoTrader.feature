#Feature:

#  Scenario: Testing autotrader.com

#    ilk olrak verilen sayfada olmamiz gerekli, Given bunu sagliyor

#    Given User is in landing page

#    metod da "" bu ifade string anlamina geliyor, buradaki ifadeyi verify yapacagimiz icin aynisi olmasi gerekli
#    Bu ucu icin otomatik bir metod olusturacak
#    bu sekilde string ile vermemizin sebebi reusable olmasini saglamak icin
#    mesela ilk basta kullanilacagini dusunerek iki parametreyi "" alsak ancak daha sonra kullnmiyacaksak onu metodunun icerisnde yazmiyoruz
#    When genelde action icin oldugu icin kullanilmadi, aslinda bunlarin When, Then And den cok onemi yok bunlari
  #    hikayedeki siralamada kolaylik olmasi icin
#    Verilen dokumandaki description i once biizm manuel olarak tek tek yapmamzi gerekiyor automationdan once

#    Then Verify that "Browser By Make" is present
#    Then verify that "Browser By Style" is present
#    Then verify that "Advanced Search" is present
#    And verify that search button is present
#    Then verify that "Any Make" and "Any Model" is visible
#
#  Scenario: Entering advanced search link
#    Given User click Advance Search link on the home page
#    Then User enter "30004" in the zip code text box
#    Then User select "Certified" check box under "Condition"
#    Then User select "Convertible" check box under "Style"
#    Then User update Year "2017" to "2020"
#    Then User select "BMW" car from Make, Model and Trim
#    Then User click Search Button
#    Then User verify that he is in result page
#    Then User verify that he sees only "BMW" car in listing
#    Then Display in console, the number of cars listed in result page




@smoke_test
Feature:

  Background: chrome testing
    Given user test with "chrome" browser

  @unit_test
  @regression_test
  Scenario: User goes to Autotrader Website
    Given User is in landing page
    Then Verify that "Browse by Make" are present
    Then Verify that "Browse by Style" are present
    Then Verify that "Advanced Search" are present
    And verify that search button is present.
    Then verify that "Any Make" and "Any Model" is visible


#  @integration_test
#  Scenario: User checks the Advance search link
#    Given User click Advance Search link on the home page
#    Then User enter "30004" in the zip code text box
#    Then User select "Certified" check box under "Condition"
#    Then User select "Convertible" check box under "Style"
#    Then user update Year "2017" to "2020"
#    Then user select "BMW" car from Make,Model and Trim section
#    Then User clicks Search button
#    Then User verifies that he is in result page
#    Then User verifies that he sees only "BMW" cars in listing
#    Then Display in console, the number of cars listed in result page

#  Scenario Outline: testin the multiple entry
#    Given choose make as "<model>"
#    Examples:
#      | model    |
#      | BMW      |
#      | Auidi    |
#      | Mercedes |
#      | Toyota   |
#      | Acura    |
#      | BMW      |
#      | Auidi    |
#      | Mercedes |
#      | Toyota   |
#      | Acura    |