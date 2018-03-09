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


package marketcheck.cars.api..client.model;

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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import marketcheck.cars.api..client.model.RatingComponents;

/**
 * DealerRating
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-09T10:14:35.317+05:30")
public class DealerRating {
  @SerializedName("name")
  private String name = null;

  @SerializedName("street")
  private String street = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("zip")
  private String zip = null;

  @SerializedName("latitude")
  private String latitude = null;

  @SerializedName("longitude")
  private String longitude = null;

  @SerializedName("overall_rating")
  private BigDecimal overallRating = null;

  @SerializedName("rating_components")
  private List<RatingComponents> ratingComponents = null;

  public DealerRating name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the dealer
   * @return name
  **/
  @ApiModelProperty(value = "Name of the dealer")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DealerRating street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Street of the dealer
   * @return street
  **/
  @ApiModelProperty(value = "Street of the dealer")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public DealerRating city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City of the dealer
   * @return city
  **/
  @ApiModelProperty(value = "City of the dealer")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public DealerRating state(String state) {
    this.state = state;
    return this;
  }

   /**
   * State of the dealer
   * @return state
  **/
  @ApiModelProperty(value = "State of the dealer")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public DealerRating zip(String zip) {
    this.zip = zip;
    return this;
  }

   /**
   * Zip of the dealer
   * @return zip
  **/
  @ApiModelProperty(value = "Zip of the dealer")
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public DealerRating latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Latutide for the dealer location
   * @return latitude
  **/
  @ApiModelProperty(value = "Latutide for the dealer location")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public DealerRating longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Longitude for the dealer location
   * @return longitude
  **/
  @ApiModelProperty(value = "Longitude for the dealer location")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public DealerRating overallRating(BigDecimal overallRating) {
    this.overallRating = overallRating;
    return this;
  }

   /**
   * Overall rating of the dealership on scale 1-5
   * @return overallRating
  **/
  @ApiModelProperty(value = "Overall rating of the dealership on scale 1-5")
  public BigDecimal getOverallRating() {
    return overallRating;
  }

  public void setOverallRating(BigDecimal overallRating) {
    this.overallRating = overallRating;
  }

  public DealerRating ratingComponents(List<RatingComponents> ratingComponents) {
    this.ratingComponents = ratingComponents;
    return this;
  }

  public DealerRating addRatingComponentsItem(RatingComponents ratingComponentsItem) {
    if (this.ratingComponents == null) {
      this.ratingComponents = new ArrayList<RatingComponents>();
    }
    this.ratingComponents.add(ratingComponentsItem);
    return this;
  }

   /**
   * Get ratingComponents
   * @return ratingComponents
  **/
  @ApiModelProperty(value = "")
  public List<RatingComponents> getRatingComponents() {
    return ratingComponents;
  }

  public void setRatingComponents(List<RatingComponents> ratingComponents) {
    this.ratingComponents = ratingComponents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealerRating dealerRating = (DealerRating) o;
    return Objects.equals(this.name, dealerRating.name) &&
        Objects.equals(this.street, dealerRating.street) &&
        Objects.equals(this.city, dealerRating.city) &&
        Objects.equals(this.state, dealerRating.state) &&
        Objects.equals(this.zip, dealerRating.zip) &&
        Objects.equals(this.latitude, dealerRating.latitude) &&
        Objects.equals(this.longitude, dealerRating.longitude) &&
        Objects.equals(this.overallRating, dealerRating.overallRating) &&
        Objects.equals(this.ratingComponents, dealerRating.ratingComponents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, street, city, state, zip, latitude, longitude, overallRating, ratingComponents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealerRating {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    overallRating: ").append(toIndentedString(overallRating)).append("\n");
    sb.append("    ratingComponents: ").append(toIndentedString(ratingComponents)).append("\n");
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
