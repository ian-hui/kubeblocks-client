/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.25.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubeblocks.dataprotection.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubeblocks.dataprotection.models.V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm;
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
 * The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s)
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T14:00:51.636603Z[Etc/UTC]")
public class V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner {
  public static final String SERIALIZED_NAME_POD_AFFINITY_TERM = "podAffinityTerm";
  @SerializedName(SERIALIZED_NAME_POD_AFFINITY_TERM)
  private V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm podAffinityTerm;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;

  public V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner() {
  }

  public V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner podAffinityTerm(V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm podAffinityTerm) {
    
    this.podAffinityTerm = podAffinityTerm;
    return this;
  }

   /**
   * Get podAffinityTerm
   * @return podAffinityTerm
  **/
  @jakarta.annotation.Nonnull
  public V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm getPodAffinityTerm() {
    return podAffinityTerm;
  }


  public void setPodAffinityTerm(V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm podAffinityTerm) {
    this.podAffinityTerm = podAffinityTerm;
  }


  public V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner weight(Integer weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
   * @return weight
  **/
  @jakarta.annotation.Nonnull
  public Integer getWeight() {
    return weight;
  }


  public void setWeight(Integer weight) {
    this.weight = weight;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner v1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner = (V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner) o;
    return Objects.equals(this.podAffinityTerm, v1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner.podAffinityTerm) &&
        Objects.equals(this.weight, v1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(podAffinityTerm, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner {\n");
    sb.append("    podAffinityTerm: ").append(toIndentedString(podAffinityTerm)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
    openapiFields.add("podAffinityTerm");
    openapiFields.add("weight");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("podAffinityTerm");
    openapiRequiredFields.add("weight");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner is not found in the empty JSON string", V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `podAffinityTerm`
      V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm.validateJsonObject(jsonObj.getAsJsonObject("podAffinityTerm"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner
  */
  public static V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner.class);
  }

 /**
  * Convert an instance of V1alpha1RestoreSpecPrepareDataConfigSchedulingSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}
