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
 * Describes the VDP (Vehicle Details Page) HTML object
 */
@ApiModel(description = "Describes the VDP (Vehicle Details Page) HTML object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-09T10:14:35.317+05:30")
public class ListingVDP {
  @SerializedName("html")
  private String html = null;

  @SerializedName("crawled_at")
  private BigDecimal crawledAt = null;

  @SerializedName("vdp_url")
  private String vdpUrl = null;

  public ListingVDP html(String html) {
    this.html = html;
    return this;
  }

   /**
   * The HTML string for the listing web page
   * @return html
  **/
  @ApiModelProperty(value = "The HTML string for the listing web page")
  public String getHtml() {
    return html;
  }

  public void setHtml(String html) {
    this.html = html;
  }

  public ListingVDP crawledAt(BigDecimal crawledAt) {
    this.crawledAt = crawledAt;
    return this;
  }

   /**
   * The timestamp indicating the time when the VDP was cached
   * @return crawledAt
  **/
  @ApiModelProperty(value = "The timestamp indicating the time when the VDP was cached")
  public BigDecimal getCrawledAt() {
    return crawledAt;
  }

  public void setCrawledAt(BigDecimal crawledAt) {
    this.crawledAt = crawledAt;
  }

  public ListingVDP vdpUrl(String vdpUrl) {
    this.vdpUrl = vdpUrl;
    return this;
  }

   /**
   * The URL of the VDP
   * @return vdpUrl
  **/
  @ApiModelProperty(value = "The URL of the VDP")
  public String getVdpUrl() {
    return vdpUrl;
  }

  public void setVdpUrl(String vdpUrl) {
    this.vdpUrl = vdpUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingVDP listingVDP = (ListingVDP) o;
    return Objects.equals(this.html, listingVDP.html) &&
        Objects.equals(this.crawledAt, listingVDP.crawledAt) &&
        Objects.equals(this.vdpUrl, listingVDP.vdpUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(html, crawledAt, vdpUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListingVDP {\n");
    
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    crawledAt: ").append(toIndentedString(crawledAt)).append("\n");
    sb.append("    vdpUrl: ").append(toIndentedString(vdpUrl)).append("\n");
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

