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
 * The seccomp options to use by the containers in this pod. Note that this field cannot be set when spec.os.name is windows.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T07:33:32.812607Z[Etc/UTC]")
public class V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile {
  public static final String SERIALIZED_NAME_LOCALHOST_PROFILE = "localhostProfile";
  @SerializedName(SERIALIZED_NAME_LOCALHOST_PROFILE)
  private String localhostProfile;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile() {
  }

  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile localhostProfile(String localhostProfile) {
    
    this.localhostProfile = localhostProfile;
    return this;
  }

   /**
   * localhostProfile indicates a profile defined in a file on the node should be used. The profile must be preconfigured on the node to work. Must be a descending path, relative to the kubelet&#39;s configured seccomp profile location. Must be set if type is \&quot;Localhost\&quot;. Must NOT be set for any other type.
   * @return localhostProfile
  **/
  @jakarta.annotation.Nullable
  public String getLocalhostProfile() {
    return localhostProfile;
  }


  public void setLocalhostProfile(String localhostProfile) {
    this.localhostProfile = localhostProfile;
  }


  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * type indicates which kind of seccomp profile will be applied. Valid options are:   Localhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no profile should be applied.
   * @return type
  **/
  @jakarta.annotation.Nonnull
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile v1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile = (V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile) o;
    return Objects.equals(this.localhostProfile, v1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile.localhostProfile) &&
        Objects.equals(this.type, v1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localhostProfile, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile {\n");
    sb.append("    localhostProfile: ").append(toIndentedString(localhostProfile)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("localhostProfile");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile is not found in the empty JSON string", V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("localhostProfile") != null && !jsonObj.get("localhostProfile").isJsonNull()) && !jsonObj.get("localhostProfile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `localhostProfile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("localhostProfile").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile
  */
  public static V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile.class);
  }

 /**
  * Convert an instance of V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecSecurityContextSeccompProfile to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

