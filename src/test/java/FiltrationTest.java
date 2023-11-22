import org.testng.Assert;
import org.testng.annotations.Test;

public class FiltrationTest extends TestBase{


@Test
    public  void testOfTypeFilter(){

    var filterByType =  homePage.clickDiscoverBtn()
            .clickTypeExpend()
            .pickServicedApartment()
            .pickTriplex()
            .clickApplyTypeButton();

    Assert.assertTrue(filterByType.checkBuildingType("Serviced Apartment", "Triplex"));

}



@Test
    public  void testOfPriceFilter(){

        var filterByPrice =  homePage.clickDiscoverBtn()
                .clickPriceExpend()
                .enterMinAndMaxPrice("5000000","20000000")
                .clickApplyPriceButton();


      //  Assert.assertTrue(filterByPrice.checkPriceOfBuilding("500,0000","20,000,000"));

    }



    @Test
    public  void testOfAreaFilter(){

        var filterByPrice =  homePage.clickDiscoverBtn()
                .clickAreaExpend()
                .fillMinAreaField("200")
                .fillMaxAreaField("500")
                .clickApplyAreaButton();


      //  Assert.assertTrue(filterByPrice.checkPriceOfBuilding("500,0000","20,000,000"));

    }




}
