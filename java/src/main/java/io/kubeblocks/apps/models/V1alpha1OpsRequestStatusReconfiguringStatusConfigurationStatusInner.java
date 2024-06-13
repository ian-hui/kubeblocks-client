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
import io.kubeblocks.apps.models.V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
 * V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T14:34:07.299798Z[Etc/UTC]")
public class V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner {
  public static final String SERIALIZED_NAME_EXPECTED_COUNT = "expectedCount";
  @SerializedName(SERIALIZED_NAME_EXPECTED_COUNT)
  private Integer expectedCount;

  public static final String SERIALIZED_NAME_LAST_APPLIED_CONFIGURATION = "lastAppliedConfiguration";
  @SerializedName(SERIALIZED_NAME_LAST_APPLIED_CONFIGURATION)
  private Map<String, String> lastAppliedConfiguration = new HashMap<>();

  public static final String SERIALIZED_NAME_LAST_STATUS = "lastStatus";
  @SerializedName(SERIALIZED_NAME_LAST_STATUS)
  private String lastStatus;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SUCCEED_COUNT = "succeedCount";
  @SerializedName(SERIALIZED_NAME_SUCCEED_COUNT)
  private Integer succeedCount;

  /**
   * Defines the policy for reconfiguration.
   */
  @JsonAdapter(UpdatePolicyEnum.Adapter.class)
  public enum UpdatePolicyEnum {
    SIMPLE("simple"),
    
    PARALLEL("parallel"),
    
    ROLLING("rolling"),
    
    AUTORELOAD("autoReload"),
    
    OPERATORSYNCUPDATE("operatorSyncUpdate");

    private String value;

    UpdatePolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UpdatePolicyEnum fromValue(String value) {
      for (UpdatePolicyEnum b : UpdatePolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UpdatePolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UpdatePolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UpdatePolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UpdatePolicyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_UPDATE_POLICY = "updatePolicy";
  @SerializedName(SERIALIZED_NAME_UPDATE_POLICY)
  private UpdatePolicyEnum updatePolicy;

  public static final String SERIALIZED_NAME_UPDATED_PARAMETERS = "updatedParameters";
  @SerializedName(SERIALIZED_NAME_UPDATED_PARAMETERS)
  private V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters updatedParameters;

  public V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner() {
  }

  public V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner expectedCount(Integer expectedCount) {
    
    this.expectedCount = expectedCount;
    return this;
  }

   /**
   * Specifies the number of expected reconfigurations.
   * @return expectedCount
  **/
  @jakarta.annotation.Nullable
  public Integer getExpectedCount() {
    return expectedCount;
  }


  public void setExpectedCount(Integer expectedCount) {
    this.expectedCount = expectedCount;
  }


  public V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner lastAppliedConfiguration(Map<String, String> lastAppliedConfiguration) {
    
    this.lastAppliedConfiguration = lastAppliedConfiguration;
    return this;
  }

  public V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner putLastAppliedConfigurationItem(String key, String lastAppliedConfigurationItem) {
    if (this.lastAppliedConfiguration == null) {
      this.lastAppliedConfiguration = new HashMap<>();
    }
    this.lastAppliedConfiguration.put(key, lastAppliedConfigurationItem);
    return this;
  }

   /**
   * Stores the last applied configuration.
   * @return lastAppliedConfiguration
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getLastAppliedConfiguration() {
    return lastAppliedConfiguration;
  }


  public void setLastAppliedConfiguration(Map<String, String> lastAppliedConfiguration) {
    this.lastAppliedConfiguration = lastAppliedConfiguration;
  }


  public V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner lastStatus(String lastStatus) {
    
    this.lastStatus = lastStatus;
    return this;
  }

   /**
   * Records the last status of the reconfiguration controller.
   * @return lastStatus
  **/
  @jakarta.annotation.Nullable
  public String getLastStatus() {
    return lastStatus;
  }


  public void setLastStatus(String lastStatus) {
    this.lastStatus = lastStatus;
  }


  public V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Provides details about the operation.
   * @return message
  **/
  @jakarta.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the configuration template.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Indicates the current state of the reconfiguration state machine.
   * @return status
  **/
  @jakarta.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner succeedCount(Integer succeedCount) {
    
    this.succeedCount = succeedCount;
    return this;
  }

   /**
   * Counts the number of successful reconfigurations.
   * @return succeedCount
  **/
  @jakarta.annotation.Nullable
  public Integer getSucceedCount() {
    return succeedCount;
  }


  public void setSucceedCount(Integer succeedCount) {
    this.succeedCount = succeedCount;
  }


  public V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner updatePolicy(UpdatePolicyEnum updatePolicy) {
    
    this.updatePolicy = updatePolicy;
    return this;
  }

   /**
   * Defines the policy for reconfiguration.
   * @return updatePolicy
  **/
  @jakarta.annotation.Nullable
  public UpdatePolicyEnum getUpdatePolicy() {
    return updatePolicy;
  }


  public void setUpdatePolicy(UpdatePolicyEnum updatePolicy) {
    this.updatePolicy = updatePolicy;
  }


  public V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner updatedParameters(V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters updatedParameters) {
    
    this.updatedParameters = updatedParameters;
    return this;
  }

   /**
   * Get updatedParameters
   * @return updatedParameters
  **/
  @jakarta.annotation.Nullable
  public V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters getUpdatedParameters() {
    return updatedParameters;
  }


  public void setUpdatedParameters(V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters updatedParameters) {
    this.updatedParameters = updatedParameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner v1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner = (V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner) o;
    return Objects.equals(this.expectedCount, v1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner.expectedCount) &&
        Objects.equals(this.lastAppliedConfiguration, v1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner.lastAppliedConfiguration) &&
        Objects.equals(this.lastStatus, v1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner.lastStatus) &&
        Objects.equals(this.message, v1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner.message) &&
        Objects.equals(this.name, v1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner.name) &&
        Objects.equals(this.status, v1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner.status) &&
        Objects.equals(this.succeedCount, v1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner.succeedCount) &&
        Objects.equals(this.updatePolicy, v1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner.updatePolicy) &&
        Objects.equals(this.updatedParameters, v1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner.updatedParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedCount, lastAppliedConfiguration, lastStatus, message, name, status, succeedCount, updatePolicy, updatedParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner {\n");
    sb.append("    expectedCount: ").append(toIndentedString(expectedCount)).append("\n");
    sb.append("    lastAppliedConfiguration: ").append(toIndentedString(lastAppliedConfiguration)).append("\n");
    sb.append("    lastStatus: ").append(toIndentedString(lastStatus)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    succeedCount: ").append(toIndentedString(succeedCount)).append("\n");
    sb.append("    updatePolicy: ").append(toIndentedString(updatePolicy)).append("\n");
    sb.append("    updatedParameters: ").append(toIndentedString(updatedParameters)).append("\n");
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
    openapiFields.add("expectedCount");
    openapiFields.add("lastAppliedConfiguration");
    openapiFields.add("lastStatus");
    openapiFields.add("message");
    openapiFields.add("name");
    openapiFields.add("status");
    openapiFields.add("succeedCount");
    openapiFields.add("updatePolicy");
    openapiFields.add("updatedParameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner is not found in the empty JSON string", V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("lastStatus") != null && !jsonObj.get("lastStatus").isJsonNull()) && !jsonObj.get("lastStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastStatus").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("updatePolicy") != null && !jsonObj.get("updatePolicy").isJsonNull()) && !jsonObj.get("updatePolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updatePolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updatePolicy").toString()));
      }
      // validate the optional field `updatedParameters`
      if (jsonObj.get("updatedParameters") != null && !jsonObj.get("updatedParameters").isJsonNull()) {
        V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters.validateJsonObject(jsonObj.getAsJsonObject("updatedParameters"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner
  */
  public static V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner.class);
  }

 /**
  * Convert an instance of V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

