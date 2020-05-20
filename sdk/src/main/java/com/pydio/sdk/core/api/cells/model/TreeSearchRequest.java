/*
 * Pydio Cells Rest API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.pydio.sdk.core.api.cells.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * TreeSearchRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-30T14:51:15.861Z")
public class TreeSearchRequest {
  @SerializedName("Query")
  private TreeQuery query = null;

  @SerializedName("Size")
  private Integer size = null;

  @SerializedName("From")
  private Integer from = null;

  @SerializedName("Details")
  private Boolean details = null;

  @SerializedName("Facet")
  private String facet = null;

  public TreeSearchRequest query(TreeQuery query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @ApiModelProperty(value = "")
  public TreeQuery getQuery() {
    return query;
  }

  public void setQuery(TreeQuery query) {
    this.query = query;
  }

  public TreeSearchRequest size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public TreeSearchRequest from(Integer from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(value = "")
  public Integer getFrom() {
    return from;
  }

  public void setFrom(Integer from) {
    this.from = from;
  }

  public TreeSearchRequest details(Boolean details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public Boolean isDetails() {
    return details;
  }

  public void setDetails(Boolean details) {
    this.details = details;
  }

  public TreeSearchRequest facet(String facet) {
    this.facet = facet;
    return this;
  }

   /**
   * Get facet
   * @return facet
  **/
  @ApiModelProperty(value = "")
  public String getFacet() {
    return facet;
  }

  public void setFacet(String facet) {
    this.facet = facet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TreeSearchRequest treeSearchRequest = (TreeSearchRequest) o;
    return Objects.equals(this.query, treeSearchRequest.query) &&
        Objects.equals(this.size, treeSearchRequest.size) &&
        Objects.equals(this.from, treeSearchRequest.from) &&
        Objects.equals(this.details, treeSearchRequest.details) &&
        Objects.equals(this.facet, treeSearchRequest.facet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, size, from, details, facet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TreeSearchRequest {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    facet: ").append(toIndentedString(facet)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
