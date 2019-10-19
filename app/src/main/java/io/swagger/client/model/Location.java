/*
 * Сервис приема сообщений о проблемах
 * Здесь описаны методы сервиса приема сообщений о проблемах
 *
 * OpenAPI spec version: 0.0.1-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * Location
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-06-22T08:36:37.564Z[GMT]")public class Location {

  @SerializedName("id")
  private Long id = null;

  @SerializedName("longitude")
  private Long longitude = null;

  @SerializedName("latitude")
  private Long latitude = null;

  @SerializedName("adminAreaId")
  private Long adminAreaId = null;

  @SerializedName("adminAreaName")
  private String adminAreaName = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("district")
  private String district = null;

  @SerializedName("streetName")
  private String streetName = null;

  @SerializedName("streetNumber")
  private Integer streetNumber = null;

  @SerializedName("flatNumber")
  private Integer flatNumber = null;
  public Location id(Long id) {
    this.id = id;
    return this;
  }

  

  /**
  * Get id
  * minimum: 0
  * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public Location longitude(Long longitude) {
    this.longitude = longitude;
    return this;
  }

  

  /**
  * Get longitude
  * @return longitude
  **/
  @Schema(description = "")
  public Long getLongitude() {
    return longitude;
  }
  public void setLongitude(Long longitude) {
    this.longitude = longitude;
  }
  public Location latitude(Long latitude) {
    this.latitude = latitude;
    return this;
  }

  

  /**
  * Get latitude
  * @return latitude
  **/
  @Schema(description = "")
  public Long getLatitude() {
    return latitude;
  }
  public void setLatitude(Long latitude) {
    this.latitude = latitude;
  }
  public Location adminAreaId(Long adminAreaId) {
    this.adminAreaId = adminAreaId;
    return this;
  }

  

  /**
  * Get adminAreaId
  * @return adminAreaId
  **/
  @Schema(description = "")
  public Long getAdminAreaId() {
    return adminAreaId;
  }
  public void setAdminAreaId(Long adminAreaId) {
    this.adminAreaId = adminAreaId;
  }
  public Location adminAreaName(String adminAreaName) {
    this.adminAreaName = adminAreaName;
    return this;
  }

  

  /**
  * Get adminAreaName
  * @return adminAreaName
  **/
  @Schema(description = "")
  public String getAdminAreaName() {
    return adminAreaName;
  }
  public void setAdminAreaName(String adminAreaName) {
    this.adminAreaName = adminAreaName;
  }
  public Location city(String city) {
    this.city = city;
    return this;
  }

  

  /**
  * Get city
  * @return city
  **/
  @Schema(description = "")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }
  public Location district(String district) {
    this.district = district;
    return this;
  }

  

  /**
  * Get district
  * @return district
  **/
  @Schema(description = "")
  public String getDistrict() {
    return district;
  }
  public void setDistrict(String district) {
    this.district = district;
  }
  public Location streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  

  /**
  * Get streetName
  * @return streetName
  **/
  @Schema(description = "")
  public String getStreetName() {
    return streetName;
  }
  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }
  public Location streetNumber(Integer streetNumber) {
    this.streetNumber = streetNumber;
    return this;
  }

  

  /**
  * Get streetNumber
  * @return streetNumber
  **/
  @Schema(description = "")
  public Integer getStreetNumber() {
    return streetNumber;
  }
  public void setStreetNumber(Integer streetNumber) {
    this.streetNumber = streetNumber;
  }
  public Location flatNumber(Integer flatNumber) {
    this.flatNumber = flatNumber;
    return this;
  }

  

  /**
  * Get flatNumber
  * @return flatNumber
  **/
  @Schema(description = "")
  public Integer getFlatNumber() {
    return flatNumber;
  }
  public void setFlatNumber(Integer flatNumber) {
    this.flatNumber = flatNumber;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.id, location.id) &&
        Objects.equals(this.longitude, location.longitude) &&
        Objects.equals(this.latitude, location.latitude) &&
        Objects.equals(this.adminAreaId, location.adminAreaId) &&
        Objects.equals(this.adminAreaName, location.adminAreaName) &&
        Objects.equals(this.city, location.city) &&
        Objects.equals(this.district, location.district) &&
        Objects.equals(this.streetName, location.streetName) &&
        Objects.equals(this.streetNumber, location.streetNumber) &&
        Objects.equals(this.flatNumber, location.flatNumber);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, longitude, latitude, adminAreaId, adminAreaName, city, district, streetName, streetNumber, flatNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    adminAreaId: ").append(toIndentedString(adminAreaId)).append("\n");
    sb.append("    adminAreaName: ").append(toIndentedString(adminAreaName)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    flatNumber: ").append(toIndentedString(flatNumber)).append("\n");
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
