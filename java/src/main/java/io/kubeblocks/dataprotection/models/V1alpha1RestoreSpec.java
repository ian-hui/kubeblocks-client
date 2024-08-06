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
import io.kubeblocks.dataprotection.models.V1alpha1RestoreSpecBackup;
import io.kubeblocks.dataprotection.models.V1alpha1RestoreSpecContainerResources;
import io.kubeblocks.dataprotection.models.V1alpha1RestoreSpecPrepareDataConfig;
import io.kubeblocks.dataprotection.models.V1alpha1RestoreSpecReadyConfig;
import io.kubeblocks.dataprotection.models.V1alpha1RestoreSpecResources;
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
 * RestoreSpec defines the desired state of Restore
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T14:00:51.636603Z[Etc/UTC]")
public class V1alpha1RestoreSpec {
  public static final String SERIALIZED_NAME_BACKOFF_LIMIT = "backoffLimit";
  @SerializedName(SERIALIZED_NAME_BACKOFF_LIMIT)
  private Integer backoffLimit;

  public static final String SERIALIZED_NAME_BACKUP = "backup";
  @SerializedName(SERIALIZED_NAME_BACKUP)
  private V1alpha1RestoreSpecBackup backup;

  public static final String SERIALIZED_NAME_CONTAINER_RESOURCES = "containerResources";
  @SerializedName(SERIALIZED_NAME_CONTAINER_RESOURCES)
  private V1alpha1RestoreSpecContainerResources containerResources;

  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private Object env;

  public static final String SERIALIZED_NAME_PREPARE_DATA_CONFIG = "prepareDataConfig";
  @SerializedName(SERIALIZED_NAME_PREPARE_DATA_CONFIG)
  private V1alpha1RestoreSpecPrepareDataConfig prepareDataConfig;

  public static final String SERIALIZED_NAME_READY_CONFIG = "readyConfig";
  @SerializedName(SERIALIZED_NAME_READY_CONFIG)
  private V1alpha1RestoreSpecReadyConfig readyConfig;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1alpha1RestoreSpecResources resources;

  public static final String SERIALIZED_NAME_RESTORE_TIME = "restoreTime";
  @SerializedName(SERIALIZED_NAME_RESTORE_TIME)
  private String restoreTime;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_NAME = "serviceAccountName";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_NAME)
  private String serviceAccountName;

  public V1alpha1RestoreSpec() {
  }

  public V1alpha1RestoreSpec backoffLimit(Integer backoffLimit) {
    
    this.backoffLimit = backoffLimit;
    return this;
  }

   /**
   * Specifies the number of retries before marking the restore failed.
   * minimum: 0
   * maximum: 10
   * @return backoffLimit
  **/
  @jakarta.annotation.Nullable
  public Integer getBackoffLimit() {
    return backoffLimit;
  }


  public void setBackoffLimit(Integer backoffLimit) {
    this.backoffLimit = backoffLimit;
  }


  public V1alpha1RestoreSpec backup(V1alpha1RestoreSpecBackup backup) {
    
    this.backup = backup;
    return this;
  }

   /**
   * Get backup
   * @return backup
  **/
  @jakarta.annotation.Nonnull
  public V1alpha1RestoreSpecBackup getBackup() {
    return backup;
  }


  public void setBackup(V1alpha1RestoreSpecBackup backup) {
    this.backup = backup;
  }


  public V1alpha1RestoreSpec containerResources(V1alpha1RestoreSpecContainerResources containerResources) {
    
    this.containerResources = containerResources;
    return this;
  }

   /**
   * Get containerResources
   * @return containerResources
  **/
  @jakarta.annotation.Nullable
  public V1alpha1RestoreSpecContainerResources getContainerResources() {
    return containerResources;
  }


  public void setContainerResources(V1alpha1RestoreSpecContainerResources containerResources) {
    this.containerResources = containerResources;
  }


  public V1alpha1RestoreSpec env(Object env) {
    
    this.env = env;
    return this;
  }

   /**
   * List of environment variables to set in the container for restore. These will be merged with the env of Backup and ActionSet.   The priority of merging is as follows: &#x60;Restore env &gt; Backup env &gt; ActionSet env&#x60;.
   * @return env
  **/
  @jakarta.annotation.Nullable
  public Object getEnv() {
    return env;
  }


  public void setEnv(Object env) {
    this.env = env;
  }


  public V1alpha1RestoreSpec prepareDataConfig(V1alpha1RestoreSpecPrepareDataConfig prepareDataConfig) {
    
    this.prepareDataConfig = prepareDataConfig;
    return this;
  }

   /**
   * Get prepareDataConfig
   * @return prepareDataConfig
  **/
  @jakarta.annotation.Nullable
  public V1alpha1RestoreSpecPrepareDataConfig getPrepareDataConfig() {
    return prepareDataConfig;
  }


  public void setPrepareDataConfig(V1alpha1RestoreSpecPrepareDataConfig prepareDataConfig) {
    this.prepareDataConfig = prepareDataConfig;
  }


  public V1alpha1RestoreSpec readyConfig(V1alpha1RestoreSpecReadyConfig readyConfig) {
    
    this.readyConfig = readyConfig;
    return this;
  }

   /**
   * Get readyConfig
   * @return readyConfig
  **/
  @jakarta.annotation.Nullable
  public V1alpha1RestoreSpecReadyConfig getReadyConfig() {
    return readyConfig;
  }


  public void setReadyConfig(V1alpha1RestoreSpecReadyConfig readyConfig) {
    this.readyConfig = readyConfig;
  }


  public V1alpha1RestoreSpec resources(V1alpha1RestoreSpecResources resources) {
    
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @jakarta.annotation.Nullable
  public V1alpha1RestoreSpecResources getResources() {
    return resources;
  }


  public void setResources(V1alpha1RestoreSpecResources resources) {
    this.resources = resources;
  }


  public V1alpha1RestoreSpec restoreTime(String restoreTime) {
    
    this.restoreTime = restoreTime;
    return this;
  }

   /**
   * Specifies the point in time for restoring.
   * @return restoreTime
  **/
  @jakarta.annotation.Nullable
  public String getRestoreTime() {
    return restoreTime;
  }


  public void setRestoreTime(String restoreTime) {
    this.restoreTime = restoreTime;
  }


  public V1alpha1RestoreSpec serviceAccountName(String serviceAccountName) {
    
    this.serviceAccountName = serviceAccountName;
    return this;
  }

   /**
   * Specifies the service account name needed for recovery pod.
   * @return serviceAccountName
  **/
  @jakarta.annotation.Nullable
  public String getServiceAccountName() {
    return serviceAccountName;
  }


  public void setServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RestoreSpec v1alpha1RestoreSpec = (V1alpha1RestoreSpec) o;
    return Objects.equals(this.backoffLimit, v1alpha1RestoreSpec.backoffLimit) &&
        Objects.equals(this.backup, v1alpha1RestoreSpec.backup) &&
        Objects.equals(this.containerResources, v1alpha1RestoreSpec.containerResources) &&
        Objects.equals(this.env, v1alpha1RestoreSpec.env) &&
        Objects.equals(this.prepareDataConfig, v1alpha1RestoreSpec.prepareDataConfig) &&
        Objects.equals(this.readyConfig, v1alpha1RestoreSpec.readyConfig) &&
        Objects.equals(this.resources, v1alpha1RestoreSpec.resources) &&
        Objects.equals(this.restoreTime, v1alpha1RestoreSpec.restoreTime) &&
        Objects.equals(this.serviceAccountName, v1alpha1RestoreSpec.serviceAccountName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backoffLimit, backup, containerResources, env, prepareDataConfig, readyConfig, resources, restoreTime, serviceAccountName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RestoreSpec {\n");
    sb.append("    backoffLimit: ").append(toIndentedString(backoffLimit)).append("\n");
    sb.append("    backup: ").append(toIndentedString(backup)).append("\n");
    sb.append("    containerResources: ").append(toIndentedString(containerResources)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    prepareDataConfig: ").append(toIndentedString(prepareDataConfig)).append("\n");
    sb.append("    readyConfig: ").append(toIndentedString(readyConfig)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
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
    openapiFields.add("backoffLimit");
    openapiFields.add("backup");
    openapiFields.add("containerResources");
    openapiFields.add("env");
    openapiFields.add("prepareDataConfig");
    openapiFields.add("readyConfig");
    openapiFields.add("resources");
    openapiFields.add("restoreTime");
    openapiFields.add("serviceAccountName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("backup");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1RestoreSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1RestoreSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1RestoreSpec is not found in the empty JSON string", V1alpha1RestoreSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1RestoreSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1RestoreSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1RestoreSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `backup`
      V1alpha1RestoreSpecBackup.validateJsonObject(jsonObj.getAsJsonObject("backup"));
      // validate the optional field `containerResources`
      if (jsonObj.get("containerResources") != null && !jsonObj.get("containerResources").isJsonNull()) {
        V1alpha1RestoreSpecContainerResources.validateJsonObject(jsonObj.getAsJsonObject("containerResources"));
      }
      // validate the optional field `prepareDataConfig`
      if (jsonObj.get("prepareDataConfig") != null && !jsonObj.get("prepareDataConfig").isJsonNull()) {
        V1alpha1RestoreSpecPrepareDataConfig.validateJsonObject(jsonObj.getAsJsonObject("prepareDataConfig"));
      }
      // validate the optional field `readyConfig`
      if (jsonObj.get("readyConfig") != null && !jsonObj.get("readyConfig").isJsonNull()) {
        V1alpha1RestoreSpecReadyConfig.validateJsonObject(jsonObj.getAsJsonObject("readyConfig"));
      }
      // validate the optional field `resources`
      if (jsonObj.get("resources") != null && !jsonObj.get("resources").isJsonNull()) {
        V1alpha1RestoreSpecResources.validateJsonObject(jsonObj.getAsJsonObject("resources"));
      }
      if ((jsonObj.get("restoreTime") != null && !jsonObj.get("restoreTime").isJsonNull()) && !jsonObj.get("restoreTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `restoreTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("restoreTime").toString()));
      }
      if ((jsonObj.get("serviceAccountName") != null && !jsonObj.get("serviceAccountName").isJsonNull()) && !jsonObj.get("serviceAccountName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceAccountName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceAccountName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1RestoreSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1RestoreSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1RestoreSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1RestoreSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1RestoreSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha1RestoreSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1RestoreSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1RestoreSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1RestoreSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha1RestoreSpec
  */
  public static V1alpha1RestoreSpec fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1RestoreSpec.class);
  }

 /**
  * Convert an instance of V1alpha1RestoreSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}
