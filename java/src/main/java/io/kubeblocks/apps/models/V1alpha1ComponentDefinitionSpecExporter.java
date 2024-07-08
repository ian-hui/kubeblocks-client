/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.27.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubeblocks.apps.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * Defines the built-in metrics exporter container.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T07:33:32.812607Z[Etc/UTC]")
public class V1alpha1ComponentDefinitionSpecExporter {
  public static final String SERIALIZED_NAME_CONTAINER_NAME = "containerName";
  @SerializedName(SERIALIZED_NAME_CONTAINER_NAME)
  private String containerName;

  public static final String SERIALIZED_NAME_SCRAPE_PATH = "scrapePath";
  @SerializedName(SERIALIZED_NAME_SCRAPE_PATH)
  private String scrapePath;

  public static final String SERIALIZED_NAME_SCRAPE_PORT = "scrapePort";
  @SerializedName(SERIALIZED_NAME_SCRAPE_PORT)
  private String scrapePort;

  /**
   * Specifies the schema to use for scraping. &#x60;http&#x60; and &#x60;https&#x60; are the expected values unless you rewrite the &#x60;__scheme__&#x60; label via relabeling. If empty, Prometheus uses the default value &#x60;http&#x60;.
   */
  @JsonAdapter(ScrapeSchemeEnum.Adapter.class)
  public enum ScrapeSchemeEnum {
    HTTP("http"),
    
    HTTPS("https");

    private String value;

    ScrapeSchemeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScrapeSchemeEnum fromValue(String value) {
      for (ScrapeSchemeEnum b : ScrapeSchemeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ScrapeSchemeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScrapeSchemeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScrapeSchemeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScrapeSchemeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SCRAPE_SCHEME = "scrapeScheme";
  @SerializedName(SERIALIZED_NAME_SCRAPE_SCHEME)
  private ScrapeSchemeEnum scrapeScheme;

  public V1alpha1ComponentDefinitionSpecExporter() {
  }

  public V1alpha1ComponentDefinitionSpecExporter containerName(String containerName) {
    
    this.containerName = containerName;
    return this;
  }

   /**
   * Specifies the name of the built-in metrics exporter container.
   * @return containerName
  **/
  @jakarta.annotation.Nullable
  public String getContainerName() {
    return containerName;
  }


  public void setContainerName(String containerName) {
    this.containerName = containerName;
  }


  public V1alpha1ComponentDefinitionSpecExporter scrapePath(String scrapePath) {
    
    this.scrapePath = scrapePath;
    return this;
  }

   /**
   * Specifies the http/https url path to scrape for metrics. If empty, Prometheus uses the default value (e.g. &#x60;/metrics&#x60;).
   * @return scrapePath
  **/
  @jakarta.annotation.Nullable
  public String getScrapePath() {
    return scrapePath;
  }


  public void setScrapePath(String scrapePath) {
    this.scrapePath = scrapePath;
  }


  public V1alpha1ComponentDefinitionSpecExporter scrapePort(String scrapePort) {
    
    this.scrapePort = scrapePort;
    return this;
  }

   /**
   * Specifies the port name to scrape for metrics.
   * @return scrapePort
  **/
  @jakarta.annotation.Nullable
  public String getScrapePort() {
    return scrapePort;
  }


  public void setScrapePort(String scrapePort) {
    this.scrapePort = scrapePort;
  }


  public V1alpha1ComponentDefinitionSpecExporter scrapeScheme(ScrapeSchemeEnum scrapeScheme) {
    
    this.scrapeScheme = scrapeScheme;
    return this;
  }

   /**
   * Specifies the schema to use for scraping. &#x60;http&#x60; and &#x60;https&#x60; are the expected values unless you rewrite the &#x60;__scheme__&#x60; label via relabeling. If empty, Prometheus uses the default value &#x60;http&#x60;.
   * @return scrapeScheme
  **/
  @jakarta.annotation.Nullable
  public ScrapeSchemeEnum getScrapeScheme() {
    return scrapeScheme;
  }


  public void setScrapeScheme(ScrapeSchemeEnum scrapeScheme) {
    this.scrapeScheme = scrapeScheme;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentDefinitionSpecExporter v1alpha1ComponentDefinitionSpecExporter = (V1alpha1ComponentDefinitionSpecExporter) o;
    return Objects.equals(this.containerName, v1alpha1ComponentDefinitionSpecExporter.containerName) &&
        Objects.equals(this.scrapePath, v1alpha1ComponentDefinitionSpecExporter.scrapePath) &&
        Objects.equals(this.scrapePort, v1alpha1ComponentDefinitionSpecExporter.scrapePort) &&
        Objects.equals(this.scrapeScheme, v1alpha1ComponentDefinitionSpecExporter.scrapeScheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerName, scrapePath, scrapePort, scrapeScheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentDefinitionSpecExporter {\n");
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    scrapePath: ").append(toIndentedString(scrapePath)).append("\n");
    sb.append("    scrapePort: ").append(toIndentedString(scrapePort)).append("\n");
    sb.append("    scrapeScheme: ").append(toIndentedString(scrapeScheme)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("containerName");
    openapiFields.add("scrapePath");
    openapiFields.add("scrapePort");
    openapiFields.add("scrapeScheme");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentDefinitionSpecExporter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentDefinitionSpecExporter.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentDefinitionSpecExporter is not found in the empty JSON string", V1alpha1ComponentDefinitionSpecExporter.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentDefinitionSpecExporter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentDefinitionSpecExporter` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("containerName") != null && !jsonObj.get("containerName").isJsonNull()) && !jsonObj.get("containerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `containerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("containerName").toString()));
      }
      if ((jsonObj.get("scrapePath") != null && !jsonObj.get("scrapePath").isJsonNull()) && !jsonObj.get("scrapePath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scrapePath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scrapePath").toString()));
      }
      if ((jsonObj.get("scrapePort") != null && !jsonObj.get("scrapePort").isJsonNull()) && !jsonObj.get("scrapePort").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scrapePort` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scrapePort").toString()));
      }
      if ((jsonObj.get("scrapeScheme") != null && !jsonObj.get("scrapeScheme").isJsonNull()) && !jsonObj.get("scrapeScheme").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scrapeScheme` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scrapeScheme").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentDefinitionSpecExporter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentDefinitionSpecExporter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentDefinitionSpecExporter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentDefinitionSpecExporter.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentDefinitionSpecExporter>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentDefinitionSpecExporter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentDefinitionSpecExporter read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentDefinitionSpecExporter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentDefinitionSpecExporter
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentDefinitionSpecExporter
  */
  public static V1alpha1ComponentDefinitionSpecExporter fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ComponentDefinitionSpecExporter.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentDefinitionSpecExporter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

