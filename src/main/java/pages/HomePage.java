package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static utils.CustomMethods.*;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
       this.driver = driver;
    }

    // --------------------- filter by type ---------------------

    private  final By typeOfBuildingBtn = By.xpath("//div[1]/div[2]/div[1]//div[2]//div[2]/div/div[3]/div[1]");

    private final By servicedApartment = By.xpath("//div[contains(@class,'tabs_')][1]//div[contains(@class,'rounded-lg')][1]");

    private final By triplexBtn = By.xpath("//div[contains(@class,'tabs_')][1]//div[contains(@class,'rounded-lg')][2]");
    private final By chaletBtn = By.xpath("//div[contains(@class,'tabs_')][1]//div[contains(@class,'rounded-lg')][3]");
    private final By familyHouseBtn = By.xpath("//div[contains(@class,'tabs_')][1]//div[contains(@class,'rounded-lg')][4]");
    private final By quattroBtn = By.xpath("//div[contains(@class,'tabs_')][1]//div[contains(@class,'rounded-lg')][5]");
    private final By loftBtn = By.xpath("//div[contains(@class,'tabs_')][1]//div[contains(@class,'rounded-lg')][6]");
    private final By apartmentBtn = By.xpath("//div[contains(@class,'tabs_')][1]//div[contains(@class,'rounded-lg')][7]");
    private final By cabinBtn = By.xpath("//div[contains(@class,'tabs_')][1]//div[contains(@class,'rounded-lg')][8]");
    private final By studioBtn = By.xpath("//div[contains(@class,'tabs_')][1]//div[contains(@class,'rounded-lg')][9]");
    private final By duplexBtn = By.xpath("//div[contains(@class,'tabs_')][1]//div[contains(@class,'rounded-lg')][10]");
    private final By penthouseBtn = By.xpath("//div[contains(@class,'tabs_')][1]//div[contains(@class,'rounded-lg')][11]");
    private final By townHouseBtn = By.xpath("//div[contains(@class,'tabs_')][1]//div[contains(@class,'rounded-lg')][12]");
    private final By twinHouseBtn = By.xpath("//div[contains(@class,'tabs_')][1]//div[contains(@class,'rounded-lg')][13]");
    private final By standAlonVillaBtn = By.xpath("//div[contains(@class,'tabs_')][1]//div[contains(@class,'rounded-lg')][14]");
    private final By applyTypeBtn = By.xpath("//button[@class=\"px-3 py-2 text-xs font-medium text-white rounded-lg bg-text-green\"]");


    // --------------------- filter by price ---------------------
    private final By priceBtn = By.xpath("//div[1]/div[2]/div[1]//div[2]//div[2]/div/div[4]/div[1]");
    private final By minPriceField = By.xpath("//div[@class=\"relative group flex items-center gap-1 border border-[#DDDDDD] bg-white rounded-md py-2 px-2\"]/input");
    private final By maxPriceField = By.xpath("//div[@class=\"flex relative items-center gap-1 border border-[#DDDDDD] bg-white rounded-md py-2 px-2\"]//input[@type='text']");
    private final By applyPriceBtn = By.xpath("// button[@class=\"px-3 py-2 text-xs font-medium text-white rounded-lg bg-text-green\"]");
    private final By filterByBtn = By.xpath("//div[@class='flex']//div[@class=\"flex justify-center w-full gap-2 px-2 py-2 lg:w-auto lg:py-0\"]\n");

    private final By searchBar = By.xpath("//div[1]//div/div[2]/div/input");
    private final By searchIconBtn = By.xpath("//div[1]/div[2]/div[1]//div[2]//div[2]/div/div[5]/div[2]");
    private final By discoverPageBtn = By.xpath("//a[@href='/discover']");






// --------------------- Type Filtration ---------------------
    //--------------------- new actions in discover page ---------------------

    public DiscoverPage clickDiscoverBtn(){

        findElementPresence(driver, discoverPageBtn).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return new  DiscoverPage(driver);
    }








    // --------------------- old actions in homePage ---------------------
    public HomePage clickTypeOfBuilding(){

findElementPresence(driver, typeOfBuildingBtn).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return  this;
    }
    public HomePage clickServicedApartment(){
        findElementPresence(driver, servicedApartment).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public HomePage clickTriplexBtn(){
        findElementPresence(driver, triplexBtn).click();
        return this;
    }

    public HomePage clickDuplexBtn(){
        findElementPresence(driver, duplexBtn).click();
        return this;
    }

    public HomePage clickApartmentBtn(){
        findElementPresence(driver, apartmentBtn).click();
        return this;
    }

    public HomePage clickStandAlonVillaBtn(){
        findElementPresence(driver, standAlonVillaBtn).click();
        return this;
    }

    public HomePage clickApplyType(){
        findElementPresence(driver, applyTypeBtn).click();
        return this;
    }

// --------------------- price Filtration in homePage ---------------------
    public HomePage clickPriceBtn(){

        findElementPresence(driver, priceBtn).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return  this;
    }

    public HomePage choosingPrice(String minPrice , String maxPrice){
        findElementPresence(driver,minPriceField).sendKeys(minPrice);
        findElementPresence(driver,maxPriceField).sendKeys(maxPrice);

//        Actions action = new Actions(driver);
//        action.click(findElementPresence(driver,maxPriceField)).sendKeys(maxPrice).perform();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        findElementPresence(driver,applyPriceBtn).click();
       return this;
    }

//    public FilterByPage clickFilterByBtn(){
//        findElementPresence(driver, filterByBtn).click();
//        return new FilterByPage(driver);
//    }

    // --------------------- search in homePage ---------------------


    public projectListPage searchForProjectsOrUnits(String projectOrUnit){
        findElementPresence(driver, searchBar).sendKeys(projectOrUnit, Keys.ENTER);
        findElementPresence(driver, searchIconBtn).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new projectListPage(driver);
    }






}
