/*
 * Marketcheck Cars API
 * <b>Access the New, Used and Certified cars inventories for all Car Dealers in US.</b> <br/>The data is sourced from online listings by over 44,000 Car dealers in US. At any time, there are about 6.2M searchable listings (about 1.9M unique VINs) for Used & Certified cars and about 6.6M (about 3.9M unique VINs) New Car listings from all over US. We use this API at the back for our website <a href='https://www.marketcheck.com' target='_blank'>www.marketcheck.com</a> and our Android and iOS mobile apps too.<br/><h5> Few useful links : </h5><ul><li>A quick view of the API and the use cases is depicated <a href='https://portals.marketcheck.com/mcapi/' target='_blank'>here</a></li><li>The Postman collection with various usages of the API is shared here https://www.getpostman.com/collections/2752684ff636cdd7bac2</li></ul>
 *
 * OpenAPI spec version: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package marketcheck.cars.api.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CompetitorsCarDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-09T10:14:35.317+05:30")
public class CompetitorsCarDetails {
  @SerializedName("name")
  private String name = null;

  @SerializedName("price")
  private String price = null;

  @SerializedName("miles")
  private String miles = null;

  @SerializedName("avg_market_value")
  private String avgMarketValue = null;

  public CompetitorsCarDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Current car name
   * @return name
  **/
  @ApiModelProperty(value = "Current car name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CompetitorsCarDetails price(String price) {
    this.price = price;
    return this;
  }

   /**
   * price of car
   * @return price
  **/
  @ApiModelProperty(value = "price of car")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public CompetitorsCarDetails miles(String miles) {
    this.miles = miles;
    return this;
  }

   /**
   * mileage of car
   * @return miles
  **/
  @ApiModelProperty(value = "mileage of car")
  public String getMiles() {
    return miles;
  }

  public void setMiles(String miles) {
    this.miles = miles;
  }

  public CompetitorsCarDetails avgMarketValue(String avgMarketValue) {
    this.avgMarketValue = avgMarketValue;
    return this;
  }

   /**
   * Estimated market value
   * @return avgMarketValue
  **/
  @ApiModelProperty(value = "Estimated market value")
  public String getAvgMarketValue() {
    return avgMarketValue;
  }

  public void setAvgMarketValue(String avgMarketValue) {
    this.avgMarketValue = avgMarketValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompetitorsCarDetails competitorsCarDetails = (CompetitorsCarDetails) o;
    return Objects.equals(this.name, competitorsCarDetails.name) &&
        Objects.equals(this.price, competitorsCarDetails.price) &&
        Objects.equals(this.miles, competitorsCarDetails.miles) &&
        Objects.equals(this.avgMarketValue, competitorsCarDetails.avgMarketValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, price, miles, avgMarketValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompetitorsCarDetails {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    miles: ").append(toIndentedString(miles)).append("\n");
    sb.append("    avgMarketValue: ").append(toIndentedString(avgMarketValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

