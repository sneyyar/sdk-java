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
 * PopularityItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-09T10:14:35.317+05:30")
public class PopularityItem {
  @SerializedName("text")
  private String text = null;

  @SerializedName("left")
  private BigDecimal left = null;

  @SerializedName("right")
  private BigDecimal right = null;

  @SerializedName("difference")
  private BigDecimal difference = null;

  @SerializedName("thumbs")
  private String thumbs = null;

  @SerializedName("delta_percent")
  private BigDecimal deltaPercent = null;

  @SerializedName("color")
  private String color = null;

  public PopularityItem text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Description for which popularity should be show eg: 2016 ford F-150 Lariat vs All Other Cars
   * @return text
  **/
  @ApiModelProperty(value = "Description for which popularity should be show eg: 2016 ford F-150 Lariat vs All Other Cars")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public PopularityItem left(BigDecimal left) {
    this.left = left;
    return this;
  }

   /**
   * Left side rating for above description (2016 ford F-150 Lariat)
   * @return left
  **/
  @ApiModelProperty(value = "Left side rating for above description (2016 ford F-150 Lariat)")
  public BigDecimal getLeft() {
    return left;
  }

  public void setLeft(BigDecimal left) {
    this.left = left;
  }

  public PopularityItem right(BigDecimal right) {
    this.right = right;
    return this;
  }

   /**
   * Right side rating for above description (All Other Cars)
   * @return right
  **/
  @ApiModelProperty(value = "Right side rating for above description (All Other Cars)")
  public BigDecimal getRight() {
    return right;
  }

  public void setRight(BigDecimal right) {
    this.right = right;
  }

  public PopularityItem difference(BigDecimal difference) {
    this.difference = difference;
    return this;
  }

   /**
   * Difference depending upon left and right analysis
   * @return difference
  **/
  @ApiModelProperty(value = "Difference depending upon left and right analysis")
  public BigDecimal getDifference() {
    return difference;
  }

  public void setDifference(BigDecimal difference) {
    this.difference = difference;
  }

  public PopularityItem thumbs(String thumbs) {
    this.thumbs = thumbs;
    return this;
  }

   /**
   * Thumbs up/down depending upon left and right analysis numbers
   * @return thumbs
  **/
  @ApiModelProperty(value = "Thumbs up/down depending upon left and right analysis numbers")
  public String getThumbs() {
    return thumbs;
  }

  public void setThumbs(String thumbs) {
    this.thumbs = thumbs;
  }

  public PopularityItem deltaPercent(BigDecimal deltaPercent) {
    this.deltaPercent = deltaPercent;
    return this;
  }

   /**
   * Delta percent
   * @return deltaPercent
  **/
  @ApiModelProperty(value = "Delta percent")
  public BigDecimal getDeltaPercent() {
    return deltaPercent;
  }

  public void setDeltaPercent(BigDecimal deltaPercent) {
    this.deltaPercent = deltaPercent;
  }

  public PopularityItem color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Color depending upon left and right analysis numbers
   * @return color
  **/
  @ApiModelProperty(value = "Color depending upon left and right analysis numbers")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PopularityItem popularityItem = (PopularityItem) o;
    return Objects.equals(this.text, popularityItem.text) &&
        Objects.equals(this.left, popularityItem.left) &&
        Objects.equals(this.right, popularityItem.right) &&
        Objects.equals(this.difference, popularityItem.difference) &&
        Objects.equals(this.thumbs, popularityItem.thumbs) &&
        Objects.equals(this.deltaPercent, popularityItem.deltaPercent) &&
        Objects.equals(this.color, popularityItem.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, left, right, difference, thumbs, deltaPercent, color);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PopularityItem {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
    sb.append("    difference: ").append(toIndentedString(difference)).append("\n");
    sb.append("    thumbs: ").append(toIndentedString(thumbs)).append("\n");
    sb.append("    deltaPercent: ").append(toIndentedString(deltaPercent)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

