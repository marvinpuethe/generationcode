/*
 * TheTVDB API v2
 * API v2 targets v1 functionality with a few minor additions. The API is accessible via https://api.thetvdb.com and provides the following REST endpoints in JSON format.   How to use this API documentation ----------------   You may browse the API routes without authentication, but if you wish to send requests to the API and see response data, then you must authenticate. 1. Obtain a JWT token by `POST`ing  to the `/login` route in the `Authentication` section with your API key and credentials. 1. Paste the JWT token from the response into the \"JWT Token\" field at the top of the page and click the 'Add Token' button.   You will now be able to use the remaining routes to send requests to the API and get a response.   Language Selection ----------------   Language selection is done via the `Accept-Language` header. At the moment, you may only pass one language abbreviation in the header at a time. Valid language abbreviations can be found at the `/languages` route..   Authentication ----------------   Authentication to use the API is similar to the How-to section above. Users must `POST` to the `/login` route with their API key and credentials in the following format in order to obtain a JWT token.  `{\"apikey\":\"APIKEY\",\"username\":\"USERNAME\",\"userkey\":\"USERKEY\"}`  Note that the username and key are ONLY required for the `/user` routes. The user's key is labled `Account Identifier` in the account section of the main site. The token is then used in all subsequent requests by providing it in the `Authorization` header. The header will look like: `Authorization: Bearer <yourJWTtoken>`. Currently, the token expires after 24 hours. You can `GET` the `/refresh_token` route to extend that expiration date.   Versioning ----------------   You may request a different version of the API by including an `Accept` header in your request with the following format: `Accept:application/vnd.thetvdb.v$VERSION`. This documentation automatically uses the version seen at the top and bottom of the page.
 *
 * OpenAPI spec version: 2.2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.thetvdb.model;

import java.util.Objects;
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

/**
 * Series
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-27T12:49:47.532Z")
public class Series {
  @SerializedName("added")
  private String added = null;

  @SerializedName("airsDayOfWeek")
  private String airsDayOfWeek = null;

  @SerializedName("airsTime")
  private String airsTime = null;

  @SerializedName("aliases")
  private List<String> aliases = null;

  @SerializedName("banner")
  private String banner = null;

  @SerializedName("firstAired")
  private String firstAired = null;

  @SerializedName("genre")
  private List<String> genre = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("imdbId")
  private String imdbId = null;

  @SerializedName("lastUpdated")
  private Integer lastUpdated = null;

  @SerializedName("network")
  private String network = null;

  @SerializedName("networkId")
  private String networkId = null;

  @SerializedName("overview")
  private String overview = null;

  @SerializedName("rating")
  private String rating = null;

  @SerializedName("runtime")
  private String runtime = null;

  @SerializedName("seriesId")
  private String seriesId = null;

  @SerializedName("seriesName")
  private String seriesName = null;

  @SerializedName("siteRating")
  private BigDecimal siteRating = null;

  @SerializedName("siteRatingCount")
  private Integer siteRatingCount = null;

  @SerializedName("slug")
  private String slug = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("zap2itId")
  private String zap2itId = null;

  public Series added(String added) {
    this.added = added;
    return this;
  }

   /**
   * Get added
   * @return added
  **/
  @ApiModelProperty(value = "")
  public String getAdded() {
    return added;
  }

  public void setAdded(String added) {
    this.added = added;
  }

  public Series airsDayOfWeek(String airsDayOfWeek) {
    this.airsDayOfWeek = airsDayOfWeek;
    return this;
  }

   /**
   * Get airsDayOfWeek
   * @return airsDayOfWeek
  **/
  @ApiModelProperty(value = "")
  public String getAirsDayOfWeek() {
    return airsDayOfWeek;
  }

  public void setAirsDayOfWeek(String airsDayOfWeek) {
    this.airsDayOfWeek = airsDayOfWeek;
  }

  public Series airsTime(String airsTime) {
    this.airsTime = airsTime;
    return this;
  }

   /**
   * Get airsTime
   * @return airsTime
  **/
  @ApiModelProperty(value = "")
  public String getAirsTime() {
    return airsTime;
  }

  public void setAirsTime(String airsTime) {
    this.airsTime = airsTime;
  }

  public Series aliases(List<String> aliases) {
    this.aliases = aliases;
    return this;
  }

  public Series addAliasesItem(String aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<String>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

   /**
   * Get aliases
   * @return aliases
  **/
  @ApiModelProperty(value = "")
  public List<String> getAliases() {
    return aliases;
  }

  public void setAliases(List<String> aliases) {
    this.aliases = aliases;
  }

  public Series banner(String banner) {
    this.banner = banner;
    return this;
  }

   /**
   * Get banner
   * @return banner
  **/
  @ApiModelProperty(value = "")
  public String getBanner() {
    return banner;
  }

  public void setBanner(String banner) {
    this.banner = banner;
  }

  public Series firstAired(String firstAired) {
    this.firstAired = firstAired;
    return this;
  }

   /**
   * Get firstAired
   * @return firstAired
  **/
  @ApiModelProperty(value = "")
  public String getFirstAired() {
    return firstAired;
  }

  public void setFirstAired(String firstAired) {
    this.firstAired = firstAired;
  }

  public Series genre(List<String> genre) {
    this.genre = genre;
    return this;
  }

  public Series addGenreItem(String genreItem) {
    if (this.genre == null) {
      this.genre = new ArrayList<String>();
    }
    this.genre.add(genreItem);
    return this;
  }

   /**
   * Get genre
   * @return genre
  **/
  @ApiModelProperty(value = "")
  public List<String> getGenre() {
    return genre;
  }

  public void setGenre(List<String> genre) {
    this.genre = genre;
  }

  public Series id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Series imdbId(String imdbId) {
    this.imdbId = imdbId;
    return this;
  }

   /**
   * Get imdbId
   * @return imdbId
  **/
  @ApiModelProperty(value = "")
  public String getImdbId() {
    return imdbId;
  }

  public void setImdbId(String imdbId) {
    this.imdbId = imdbId;
  }

  public Series lastUpdated(Integer lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "")
  public Integer getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(Integer lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public Series network(String network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @ApiModelProperty(value = "")
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public Series networkId(String networkId) {
    this.networkId = networkId;
    return this;
  }

   /**
   * Get networkId
   * @return networkId
  **/
  @ApiModelProperty(value = "")
  public String getNetworkId() {
    return networkId;
  }

  public void setNetworkId(String networkId) {
    this.networkId = networkId;
  }

  public Series overview(String overview) {
    this.overview = overview;
    return this;
  }

   /**
   * Get overview
   * @return overview
  **/
  @ApiModelProperty(value = "")
  public String getOverview() {
    return overview;
  }

  public void setOverview(String overview) {
    this.overview = overview;
  }

  public Series rating(String rating) {
    this.rating = rating;
    return this;
  }

   /**
   * Get rating
   * @return rating
  **/
  @ApiModelProperty(value = "")
  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public Series runtime(String runtime) {
    this.runtime = runtime;
    return this;
  }

   /**
   * Get runtime
   * @return runtime
  **/
  @ApiModelProperty(value = "")
  public String getRuntime() {
    return runtime;
  }

  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }

  public Series seriesId(String seriesId) {
    this.seriesId = seriesId;
    return this;
  }

   /**
   * Get seriesId
   * @return seriesId
  **/
  @ApiModelProperty(value = "")
  public String getSeriesId() {
    return seriesId;
  }

  public void setSeriesId(String seriesId) {
    this.seriesId = seriesId;
  }

  public Series seriesName(String seriesName) {
    this.seriesName = seriesName;
    return this;
  }

   /**
   * Get seriesName
   * @return seriesName
  **/
  @ApiModelProperty(value = "")
  public String getSeriesName() {
    return seriesName;
  }

  public void setSeriesName(String seriesName) {
    this.seriesName = seriesName;
  }

  public Series siteRating(BigDecimal siteRating) {
    this.siteRating = siteRating;
    return this;
  }

   /**
   * Get siteRating
   * @return siteRating
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getSiteRating() {
    return siteRating;
  }

  public void setSiteRating(BigDecimal siteRating) {
    this.siteRating = siteRating;
  }

  public Series siteRatingCount(Integer siteRatingCount) {
    this.siteRatingCount = siteRatingCount;
    return this;
  }

   /**
   * Get siteRatingCount
   * @return siteRatingCount
  **/
  @ApiModelProperty(value = "")
  public Integer getSiteRatingCount() {
    return siteRatingCount;
  }

  public void setSiteRatingCount(Integer siteRatingCount) {
    this.siteRatingCount = siteRatingCount;
  }

  public Series slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @ApiModelProperty(value = "")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public Series status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Series zap2itId(String zap2itId) {
    this.zap2itId = zap2itId;
    return this;
  }

   /**
   * Get zap2itId
   * @return zap2itId
  **/
  @ApiModelProperty(value = "")
  public String getZap2itId() {
    return zap2itId;
  }

  public void setZap2itId(String zap2itId) {
    this.zap2itId = zap2itId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Series series = (Series) o;
    return Objects.equals(this.added, series.added) &&
        Objects.equals(this.airsDayOfWeek, series.airsDayOfWeek) &&
        Objects.equals(this.airsTime, series.airsTime) &&
        Objects.equals(this.aliases, series.aliases) &&
        Objects.equals(this.banner, series.banner) &&
        Objects.equals(this.firstAired, series.firstAired) &&
        Objects.equals(this.genre, series.genre) &&
        Objects.equals(this.id, series.id) &&
        Objects.equals(this.imdbId, series.imdbId) &&
        Objects.equals(this.lastUpdated, series.lastUpdated) &&
        Objects.equals(this.network, series.network) &&
        Objects.equals(this.networkId, series.networkId) &&
        Objects.equals(this.overview, series.overview) &&
        Objects.equals(this.rating, series.rating) &&
        Objects.equals(this.runtime, series.runtime) &&
        Objects.equals(this.seriesId, series.seriesId) &&
        Objects.equals(this.seriesName, series.seriesName) &&
        Objects.equals(this.siteRating, series.siteRating) &&
        Objects.equals(this.siteRatingCount, series.siteRatingCount) &&
        Objects.equals(this.slug, series.slug) &&
        Objects.equals(this.status, series.status) &&
        Objects.equals(this.zap2itId, series.zap2itId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(added, airsDayOfWeek, airsTime, aliases, banner, firstAired, genre, id, imdbId, lastUpdated, network, networkId, overview, rating, runtime, seriesId, seriesName, siteRating, siteRatingCount, slug, status, zap2itId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Series {\n");
    
    sb.append("    added: ").append(toIndentedString(added)).append("\n");
    sb.append("    airsDayOfWeek: ").append(toIndentedString(airsDayOfWeek)).append("\n");
    sb.append("    airsTime: ").append(toIndentedString(airsTime)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    banner: ").append(toIndentedString(banner)).append("\n");
    sb.append("    firstAired: ").append(toIndentedString(firstAired)).append("\n");
    sb.append("    genre: ").append(toIndentedString(genre)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imdbId: ").append(toIndentedString(imdbId)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    seriesId: ").append(toIndentedString(seriesId)).append("\n");
    sb.append("    seriesName: ").append(toIndentedString(seriesName)).append("\n");
    sb.append("    siteRating: ").append(toIndentedString(siteRating)).append("\n");
    sb.append("    siteRatingCount: ").append(toIndentedString(siteRatingCount)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    zap2itId: ").append(toIndentedString(zap2itId)).append("\n");
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

