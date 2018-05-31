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
import java.math.BigDecimal;

/**
 * ListingDebugAttributes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-09T10:14:35.317+05:30")
public class ListingDebugAttributes {
  @SerializedName("robot_id")
  private BigDecimal robotId = null;

  @SerializedName("cycle_id")
  private BigDecimal cycleId = null;

  @SerializedName("scraped_at")
  private String scrapedAt = null;

  @SerializedName("template_id")
  private BigDecimal templateId = null;

  @SerializedName("user_id")
  private BigDecimal userId = null;

  @SerializedName("taxonomy_vin")
  private String taxonomyVin = null;

  public ListingDebugAttributes robotId(BigDecimal robotId) {
    this.robotId = robotId;
    return this;
  }

   /**
   * Robot id
   * @return robotId
  **/
  @ApiModelProperty(value = "Robot id")
  public BigDecimal getRobotId() {
    return robotId;
  }

  public void setRobotId(BigDecimal robotId) {
    this.robotId = robotId;
  }

  public ListingDebugAttributes cycleId(BigDecimal cycleId) {
    this.cycleId = cycleId;
    return this;
  }

   /**
   * Cycle id
   * @return cycleId
  **/
  @ApiModelProperty(value = "Cycle id")
  public BigDecimal getCycleId() {
    return cycleId;
  }

  public void setCycleId(BigDecimal cycleId) {
    this.cycleId = cycleId;
  }

  public ListingDebugAttributes scrapedAt(String scrapedAt) {
    this.scrapedAt = scrapedAt;
    return this;
  }

   /**
   * Scraped date and time
   * @return scrapedAt
  **/
  @ApiModelProperty(value = "Scraped date and time")
  public String getScrapedAt() {
    return scrapedAt;
  }

  public void setScrapedAt(String scrapedAt) {
    this.scrapedAt = scrapedAt;
  }

  public ListingDebugAttributes templateId(BigDecimal templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Template id
   * @return templateId
  **/
  @ApiModelProperty(value = "Template id")
  public BigDecimal getTemplateId() {
    return templateId;
  }

  public void setTemplateId(BigDecimal templateId) {
    this.templateId = templateId;
  }

  public ListingDebugAttributes userId(BigDecimal userId) {
    this.userId = userId;
    return this;
  }

   /**
   * User id
   * @return userId
  **/
  @ApiModelProperty(value = "User id")
  public BigDecimal getUserId() {
    return userId;
  }

  public void setUserId(BigDecimal userId) {
    this.userId = userId;
  }

  public ListingDebugAttributes taxonomyVin(String taxonomyVin) {
    this.taxonomyVin = taxonomyVin;
    return this;
  }

   /**
   * Taxonomy vin
   * @return taxonomyVin
  **/
  @ApiModelProperty(value = "Taxonomy vin")
  public String getTaxonomyVin() {
    return taxonomyVin;
  }

  public void setTaxonomyVin(String taxonomyVin) {
    this.taxonomyVin = taxonomyVin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingDebugAttributes listingDebugAttributes = (ListingDebugAttributes) o;
    return Objects.equals(this.robotId, listingDebugAttributes.robotId) &&
        Objects.equals(this.cycleId, listingDebugAttributes.cycleId) &&
        Objects.equals(this.scrapedAt, listingDebugAttributes.scrapedAt) &&
        Objects.equals(this.templateId, listingDebugAttributes.templateId) &&
        Objects.equals(this.userId, listingDebugAttributes.userId) &&
        Objects.equals(this.taxonomyVin, listingDebugAttributes.taxonomyVin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(robotId, cycleId, scrapedAt, templateId, userId, taxonomyVin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListingDebugAttributes {\n");
    
    sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
    sb.append("    cycleId: ").append(toIndentedString(cycleId)).append("\n");
    sb.append("    scrapedAt: ").append(toIndentedString(scrapedAt)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    taxonomyVin: ").append(toIndentedString(taxonomyVin)).append("\n");
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

