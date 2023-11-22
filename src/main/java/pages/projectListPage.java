package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class projectListPage {
    private WebDriver driver;
    public projectListPage(WebDriver driver){
        this.driver = driver;
    }


    private  final By typeOfBuildingText = By.xpath("//p[contains(@class, 'text-primary-green')]");

    private  final By priceOfBuildingText = By.xpath("//h2[contains(@class, 'line-clamp-1 space-x-1 text-lg font-bold')]");



    public boolean checkSearchResults(By elementName , String firstInput , String secondInput) {
        boolean buildingText = false;
        List<WebElement> reterndList = driver.findElements(elementName);
        for (int i = 0; i < reterndList.size(); i++) {
            String webElementType = reterndList.get(i).getText();
            if (webElementType.equalsIgnoreCase(firstInput)
                    || webElementType.equalsIgnoreCase(secondInput)) {

                buildingText = true;
            } else {
                buildingText = false;
                break;
            }

        }
        System.out.println("No. of returned unites : " + reterndList.size() );
        return buildingText;
    }



    public boolean checkSearchResultsInt(By elementName , int firstInput , int secondInput) {
        boolean buildingText = false;
        List<WebElement> reterndList = driver.findElements(elementName);
        for (int i = 0; i < reterndList.size(); i++) {
            int webElementType = Integer.parseInt(reterndList.get(i).getText());
            if (webElementType >= firstInput && webElementType <= secondInput) {
                buildingText = true;
            } else {
                buildingText = false;
                break;
            }

        }
        return buildingText;
    }

    public boolean checkBuildingType(String buildingType1, String buildingType2){

        return checkSearchResults(typeOfBuildingText, buildingType1, buildingType2);
    }

    public boolean checkPriceOfBuilding(String fromPrice , String toPrice){
      return checkSearchResultsInt(priceOfBuildingText, Integer.parseInt(fromPrice)  ,Integer.parseInt(toPrice));
    }




}
