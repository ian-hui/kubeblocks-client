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
import io.kubeblocks.apps.models.V1alpha1ClusterSpecShardingSpecsInnerTemplate;
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
 * ShardingSpec defines the sharding spec.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T14:34:07.299798Z[Etc/UTC]")
public class V1alpha1ClusterSpecShardingSpecsInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHARDS = "shards";
  @SerializedName(SERIALIZED_NAME_SHARDS)
  private Integer shards;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private V1alpha1ClusterSpecShardingSpecsInnerTemplate template;

  public V1alpha1ClusterSpecShardingSpecsInner() {
  }

  public V1alpha1ClusterSpecShardingSpecsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies the identifier for the sharding configuration. This identifier is included as part of the Service DNS name and must comply with IANA Service Naming rules. It is used to generate the names of underlying components following the pattern &#x60;$(ShardingSpec.Name)-$(ShardID)&#x60;. Note that the name of the component template defined in ShardingSpec.Template.Name will be disregarded.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1ClusterSpecShardingSpecsInner shards(Integer shards) {
    
    this.shards = shards;
    return this;
  }

   /**
   * Specifies the number of components, all of which will have identical specifications and definitions.   The number of replicas for each component should be defined by template.replicas. The logical relationship between these components should be maintained by the components themselves. KubeBlocks only provides lifecycle management for sharding, including:   1. Executing the postProvision Action defined in the ComponentDefinition when the number of shards increases, provided the conditions are met. 2. Executing the preTerminate Action defined in the ComponentDefinition when the number of shards decreases, provided the conditions are met. Resources and data associated with the corresponding Component will also be deleted.
   * minimum: 0
   * maximum: 2048
   * @return shards
  **/
  @jakarta.annotation.Nullable
  public Integer getShards() {
    return shards;
  }


  public void setShards(Integer shards) {
    this.shards = shards;
  }


  public V1alpha1ClusterSpecShardingSpecsInner template(V1alpha1ClusterSpecShardingSpecsInnerTemplate template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @jakarta.annotation.Nonnull
  public V1alpha1ClusterSpecShardingSpecsInnerTemplate getTemplate() {
    return template;
  }


  public void setTemplate(V1alpha1ClusterSpecShardingSpecsInnerTemplate template) {
    this.template = template;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterSpecShardingSpecsInner v1alpha1ClusterSpecShardingSpecsInner = (V1alpha1ClusterSpecShardingSpecsInner) o;
    return Objects.equals(this.name, v1alpha1ClusterSpecShardingSpecsInner.name) &&
        Objects.equals(this.shards, v1alpha1ClusterSpecShardingSpecsInner.shards) &&
        Objects.equals(this.template, v1alpha1ClusterSpecShardingSpecsInner.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, shards, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterSpecShardingSpecsInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shards: ").append(toIndentedString(shards)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("shards");
    openapiFields.add("template");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("template");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterSpecShardingSpecsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterSpecShardingSpecsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterSpecShardingSpecsInner is not found in the empty JSON string", V1alpha1ClusterSpecShardingSpecsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterSpecShardingSpecsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterSpecShardingSpecsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ClusterSpecShardingSpecsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `template`
      V1alpha1ClusterSpecShardingSpecsInnerTemplate.validateJsonObject(jsonObj.getAsJsonObject("template"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterSpecShardingSpecsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterSpecShardingSpecsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterSpecShardingSpecsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterSpecShardingSpecsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterSpecShardingSpecsInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterSpecShardingSpecsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterSpecShardingSpecsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterSpecShardingSpecsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterSpecShardingSpecsInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterSpecShardingSpecsInner
  */
  public static V1alpha1ClusterSpecShardingSpecsInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterSpecShardingSpecsInner.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterSpecShardingSpecsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

