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
import io.kubeblocks.apps.models.V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInnerOnExitCodes;
import io.kubeblocks.apps.models.V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInnerOnPodConditionsInner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * PodFailurePolicyRule describes how a pod failure is handled when the requirements are met. One of onExitCodes and onPodConditions, but not both, can be used in each rule.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_ON_EXIT_CODES = "onExitCodes";
  @SerializedName(SERIALIZED_NAME_ON_EXIT_CODES)
  private V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInnerOnExitCodes onExitCodes;

  public static final String SERIALIZED_NAME_ON_POD_CONDITIONS = "onPodConditions";
  @SerializedName(SERIALIZED_NAME_ON_POD_CONDITIONS)
  private List<V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInnerOnPodConditionsInner> onPodConditions;

  public V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner() {
  }

  public V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Specifies the action taken on a pod failure when the requirements are satisfied. Possible values are:   - FailJob: indicates that the pod&#39;s job is marked as Failed and all running pods are terminated. - FailIndex: indicates that the pod&#39;s index is marked as Failed and will not be restarted. This value is alpha-level. It can be used when the &#x60;JobBackoffLimitPerIndex&#x60; feature gate is enabled (disabled by default). - Ignore: indicates that the counter towards the .backoffLimit is not incremented and a replacement pod is created. - Count: indicates that the pod is handled in the default way - the counter towards the .backoffLimit is incremented. Additional values are considered to be added in the future. Clients should react to an unknown action by skipping the rule.
   * @return action
  **/
  @jakarta.annotation.Nonnull
  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner onExitCodes(V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInnerOnExitCodes onExitCodes) {
    
    this.onExitCodes = onExitCodes;
    return this;
  }

   /**
   * Get onExitCodes
   * @return onExitCodes
  **/
  @jakarta.annotation.Nullable
  public V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInnerOnExitCodes getOnExitCodes() {
    return onExitCodes;
  }


  public void setOnExitCodes(V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInnerOnExitCodes onExitCodes) {
    this.onExitCodes = onExitCodes;
  }


  public V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner onPodConditions(List<V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInnerOnPodConditionsInner> onPodConditions) {
    
    this.onPodConditions = onPodConditions;
    return this;
  }

  public V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner addOnPodConditionsItem(V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInnerOnPodConditionsInner onPodConditionsItem) {
    if (this.onPodConditions == null) {
      this.onPodConditions = new ArrayList<>();
    }
    this.onPodConditions.add(onPodConditionsItem);
    return this;
  }

   /**
   * Represents the requirement on the pod conditions. The requirement is represented as a list of pod condition patterns. The requirement is satisfied if at least one pattern matches an actual pod condition. At most 20 elements are allowed.
   * @return onPodConditions
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInnerOnPodConditionsInner> getOnPodConditions() {
    return onPodConditions;
  }


  public void setOnPodConditions(List<V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInnerOnPodConditionsInner> onPodConditions) {
    this.onPodConditions = onPodConditions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner v1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner = (V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner) o;
    return Objects.equals(this.action, v1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner.action) &&
        Objects.equals(this.onExitCodes, v1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner.onExitCodes) &&
        Objects.equals(this.onPodConditions, v1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner.onPodConditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, onExitCodes, onPodConditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    onExitCodes: ").append(toIndentedString(onExitCodes)).append("\n");
    sb.append("    onPodConditions: ").append(toIndentedString(onPodConditions)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("onExitCodes");
    openapiFields.add("onPodConditions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("action");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner is not found in the empty JSON string", V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      // validate the optional field `onExitCodes`
      if (jsonObj.get("onExitCodes") != null && !jsonObj.get("onExitCodes").isJsonNull()) {
        V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInnerOnExitCodes.validateJsonObject(jsonObj.getAsJsonObject("onExitCodes"));
      }
      if (jsonObj.get("onPodConditions") != null && !jsonObj.get("onPodConditions").isJsonNull()) {
        JsonArray jsonArrayonPodConditions = jsonObj.getAsJsonArray("onPodConditions");
        if (jsonArrayonPodConditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("onPodConditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `onPodConditions` to be an array in the JSON string but got `%s`", jsonObj.get("onPodConditions").toString()));
          }

          // validate the optional field `onPodConditions` (array)
          for (int i = 0; i < jsonArrayonPodConditions.size(); i++) {
            V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInnerOnPodConditionsInner.validateJsonObject(jsonArrayonPodConditions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner
  */
  public static V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner.class);
  }

 /**
  * Convert an instance of V1alpha1OpsDefinitionSpecJobSpecPodFailurePolicyRulesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

