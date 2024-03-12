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
import io.kubeblocks.apps.models.V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLlUpdateStrategy;
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
 * Defines spec for &#x60;Stateful&#x60; workloads.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-12T08:58:42.064637Z[Etc/UTC]")
public class V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec {
  public static final String SERIALIZED_NAME_LL_POD_MANAGEMENT_POLICY = "llPodManagementPolicy";
  @SerializedName(SERIALIZED_NAME_LL_POD_MANAGEMENT_POLICY)
  private String llPodManagementPolicy;

  public static final String SERIALIZED_NAME_LL_UPDATE_STRATEGY = "llUpdateStrategy";
  @SerializedName(SERIALIZED_NAME_LL_UPDATE_STRATEGY)
  private V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLlUpdateStrategy llUpdateStrategy;

  /**
   * Specifies the strategy for updating Pods. For workloadType&#x3D;&#x60;Consensus&#x60;, the update strategy can be one of the following:   - &#x60;Serial&#x60;: Updates Members sequentially to minimize component downtime. - &#x60;BestEffortParallel&#x60;: Updates Members in parallel to minimize component write downtime. Majority remains online at all times. - &#x60;Parallel&#x60;: Forces parallel updates.
   */
  @JsonAdapter(UpdateStrategyEnum.Adapter.class)
  public enum UpdateStrategyEnum {
    SERIAL("Serial"),
    
    BESTEFFORTPARALLEL("BestEffortParallel"),
    
    PARALLEL("Parallel");

    private String value;

    UpdateStrategyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UpdateStrategyEnum fromValue(String value) {
      for (UpdateStrategyEnum b : UpdateStrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UpdateStrategyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UpdateStrategyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UpdateStrategyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UpdateStrategyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_UPDATE_STRATEGY = "updateStrategy";
  @SerializedName(SERIALIZED_NAME_UPDATE_STRATEGY)
  private UpdateStrategyEnum updateStrategy;

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec() {
  }

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec llPodManagementPolicy(String llPodManagementPolicy) {
    
    this.llPodManagementPolicy = llPodManagementPolicy;
    return this;
  }

   /**
   * Controls the creation of pods during initial scale up, replacement of pods on nodes, and scaling down.   - &#x60;OrderedReady&#x60;: Creates pods in increasing order (pod-0, then pod-1, etc). The controller waits until each pod is ready before continuing. Pods are removed in reverse order when scaling down. - &#x60;Parallel&#x60;: Creates pods in parallel to match the desired scale without waiting. All pods are deleted at once when scaling down.
   * @return llPodManagementPolicy
  **/
  @jakarta.annotation.Nullable
  public String getLlPodManagementPolicy() {
    return llPodManagementPolicy;
  }


  public void setLlPodManagementPolicy(String llPodManagementPolicy) {
    this.llPodManagementPolicy = llPodManagementPolicy;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec llUpdateStrategy(V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLlUpdateStrategy llUpdateStrategy) {
    
    this.llUpdateStrategy = llUpdateStrategy;
    return this;
  }

   /**
   * Get llUpdateStrategy
   * @return llUpdateStrategy
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLlUpdateStrategy getLlUpdateStrategy() {
    return llUpdateStrategy;
  }


  public void setLlUpdateStrategy(V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLlUpdateStrategy llUpdateStrategy) {
    this.llUpdateStrategy = llUpdateStrategy;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec updateStrategy(UpdateStrategyEnum updateStrategy) {
    
    this.updateStrategy = updateStrategy;
    return this;
  }

   /**
   * Specifies the strategy for updating Pods. For workloadType&#x3D;&#x60;Consensus&#x60;, the update strategy can be one of the following:   - &#x60;Serial&#x60;: Updates Members sequentially to minimize component downtime. - &#x60;BestEffortParallel&#x60;: Updates Members in parallel to minimize component write downtime. Majority remains online at all times. - &#x60;Parallel&#x60;: Forces parallel updates.
   * @return updateStrategy
  **/
  @jakarta.annotation.Nullable
  public UpdateStrategyEnum getUpdateStrategy() {
    return updateStrategy;
  }


  public void setUpdateStrategy(UpdateStrategyEnum updateStrategy) {
    this.updateStrategy = updateStrategy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec v1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec = (V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec) o;
    return Objects.equals(this.llPodManagementPolicy, v1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec.llPodManagementPolicy) &&
        Objects.equals(this.llUpdateStrategy, v1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec.llUpdateStrategy) &&
        Objects.equals(this.updateStrategy, v1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec.updateStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(llPodManagementPolicy, llUpdateStrategy, updateStrategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec {\n");
    sb.append("    llPodManagementPolicy: ").append(toIndentedString(llPodManagementPolicy)).append("\n");
    sb.append("    llUpdateStrategy: ").append(toIndentedString(llUpdateStrategy)).append("\n");
    sb.append("    updateStrategy: ").append(toIndentedString(updateStrategy)).append("\n");
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
    openapiFields.add("llPodManagementPolicy");
    openapiFields.add("llUpdateStrategy");
    openapiFields.add("updateStrategy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec is not found in the empty JSON string", V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("llPodManagementPolicy") != null && !jsonObj.get("llPodManagementPolicy").isJsonNull()) && !jsonObj.get("llPodManagementPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `llPodManagementPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("llPodManagementPolicy").toString()));
      }
      // validate the optional field `llUpdateStrategy`
      if (jsonObj.get("llUpdateStrategy") != null && !jsonObj.get("llUpdateStrategy").isJsonNull()) {
        V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLlUpdateStrategy.validateJsonObject(jsonObj.getAsJsonObject("llUpdateStrategy"));
      }
      if ((jsonObj.get("updateStrategy") != null && !jsonObj.get("updateStrategy").isJsonNull()) && !jsonObj.get("updateStrategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateStrategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateStrategy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec
  */
  public static V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerStatefulSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

