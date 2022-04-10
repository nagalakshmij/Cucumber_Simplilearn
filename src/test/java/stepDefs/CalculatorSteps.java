package stepDefs;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps 
{
	int result =0;
	@Given("I have a calculator")
	public void i_have_a_calculator() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside calculator");
	}

	@When("I add {int} and {int}")
	public void i_add_and(int num1, int num2) {
		// Write code here that turns the phrase above into concrete actions
		result=num1+num2;
	}

	@Then("the result should be on the screen as {int}")
	public void the_result_should_be_on_the_screen_as(int res) {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(res,result);
		
	}
	


	@When("I sub {int} and {int}")
	public void i_sub_and(int num1, int num2) {
	    // Write code here that turns the phrase above into concrete actions
	    result=num1-num2;
	}

	@When("I add below numbers")
	public void i_add_below_numbers(io.cucumber.datatable.DataTable dataTable) 
	{
	   int rows=dataTable.height();
	   for(int i=0;i<rows;i++ )
	   {
		   result=result+Integer.parseInt(dataTable.cell(i, 0));
	   }
	}
	
	@When("I add below numbers from the list")
	public void i_add_below_numbers_from_the_list(List <Integer> numbers)
	{
		for( Integer num: numbers)
		{
			result=result+num;
		}
	    
	}

	@When("I order below items")
	public void i_order_below_items(Map< String, Integer> Pricelist)
	{

		for( String key:Pricelist.keySet())
		{
			result=result+Pricelist.get(key);
		}
		

}
	
	@When("I order below items and Quantity")
	public void i_order_below_items_and_quantity(io.cucumber.datatable.DataTable dataTable)
	{
		int price;
		int Quantity;
		int rows=dataTable.height();
		   for(int i=0;i<rows;i++ )
		   {
			   price=Integer.parseInt(dataTable.cell(i, 1));
			   System.out.println(price);
			   Quantity=Integer.parseInt(dataTable.cell(i,2));
			   result=result+price*Quantity;
		   }
	}
}
