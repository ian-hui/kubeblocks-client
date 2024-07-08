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
import io.kubeblocks.apps.models.V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerEnvInner;
import io.kubeblocks.apps.models.V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerExec;
import io.kubeblocks.apps.models.V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerHttp;
import io.kubeblocks.apps.models.V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy;
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
 * Represents a switchover process that does not involve a specific candidate primary or leader instance. As with the previous field, only Action.Exec is currently supported, not Action.HTTP.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T07:33:32.812607Z[Etc/UTC]")
public class V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate {
  public static final String SERIALIZED_NAME_CONTAINER = "container";
  @SerializedName(SERIALIZED_NAME_CONTAINER)
  private String container;

  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private List<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerEnvInner> env;

  public static final String SERIALIZED_NAME_EXEC = "exec";
  @SerializedName(SERIALIZED_NAME_EXEC)
  private V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerExec exec;

  public static final String SERIALIZED_NAME_HTTP = "http";
  @SerializedName(SERIALIZED_NAME_HTTP)
  private V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerHttp http;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_MATCHING_KEY = "matchingKey";
  @SerializedName(SERIALIZED_NAME_MATCHING_KEY)
  private String matchingKey;

  public static final String SERIALIZED_NAME_PRE_CONDITION = "preCondition";
  @SerializedName(SERIALIZED_NAME_PRE_CONDITION)
  private String preCondition;

  public static final String SERIALIZED_NAME_RETRY_POLICY = "retryPolicy";
  @SerializedName(SERIALIZED_NAME_RETRY_POLICY)
  private V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy retryPolicy;

  /**
   * Defines the criteria used to select the target Pod(s) for executing the Action. This is useful when there is no default target replica identified. It allows for precise control over which Pod(s) the Action should run in.   This field cannot be updated.   Note: This field is reserved for future use and is not currently active.
   */
  @JsonAdapter(TargetPodSelectorEnum.Adapter.class)
  public enum TargetPodSelectorEnum {
    ANY("Any"),
    
    ALL("All"),
    
    ROLE("Role"),
    
    ORDINAL("Ordinal");

    private String value;

    TargetPodSelectorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TargetPodSelectorEnum fromValue(String value) {
      for (TargetPodSelectorEnum b : TargetPodSelectorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TargetPodSelectorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TargetPodSelectorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TargetPodSelectorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TargetPodSelectorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TARGET_POD_SELECTOR = "targetPodSelector";
  @SerializedName(SERIALIZED_NAME_TARGET_POD_SELECTOR)
  private TargetPodSelectorEnum targetPodSelector;

  public static final String SERIALIZED_NAME_TIMEOUT_SECONDS = "timeoutSeconds";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_SECONDS)
  private Integer timeoutSeconds;

  public V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate() {
  }

  public V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate container(String container) {
    
    this.container = container;
    return this;
  }

   /**
   * Defines the name of the container within the target Pod where the action will be executed.   This name must correspond to one of the containers defined in &#x60;componentDefinition.spec.runtime&#x60;. If this field is not specified, the default behavior is to use the first container listed in &#x60;componentDefinition.spec.runtime&#x60;.   This field cannot be updated.   Note: This field is reserved for future use and is not currently active.
   * @return container
  **/
  @jakarta.annotation.Nullable
  public String getContainer() {
    return container;
  }


  public void setContainer(String container) {
    this.container = container;
  }


  public V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate env(List<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerEnvInner> env) {
    
    this.env = env;
    return this;
  }

  public V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate addEnvItem(V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerEnvInner envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

   /**
   * Represents a list of environment variables that will be injected into the container. These variables enable the container to adapt its behavior based on the environment it&#39;s running in.   This field cannot be updated.
   * @return env
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerEnvInner> getEnv() {
    return env;
  }


  public void setEnv(List<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerEnvInner> env) {
    this.env = env;
  }


  public V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate exec(V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerExec exec) {
    
    this.exec = exec;
    return this;
  }

   /**
   * Get exec
   * @return exec
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerExec getExec() {
    return exec;
  }


  public void setExec(V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerExec exec) {
    this.exec = exec;
  }


  public V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate http(V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerHttp http) {
    
    this.http = http;
    return this;
  }

   /**
   * Get http
   * @return http
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerHttp getHttp() {
    return http;
  }


  public void setHttp(V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerHttp http) {
    this.http = http;
  }


  public V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * Specifies the container image to be used for running the Action.   When specified, a dedicated container will be created using this image to execute the Action. This field is mutually exclusive with the &#x60;container&#x60; field; only one of them should be provided.   This field cannot be updated.
   * @return image
  **/
  @jakarta.annotation.Nullable
  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate matchingKey(String matchingKey) {
    
    this.matchingKey = matchingKey;
    return this;
  }

   /**
   * Used in conjunction with the &#x60;targetPodSelector&#x60; field to refine the selection of target pod(s) for Action execution. The impact of this field depends on the &#x60;targetPodSelector&#x60; value:   - When &#x60;targetPodSelector&#x60; is set to &#x60;Any&#x60; or &#x60;All&#x60;, this field will be ignored. - When &#x60;targetPodSelector&#x60; is set to &#x60;Role&#x60;, only those replicas whose role matches the &#x60;matchingKey&#x60; will be selected for the Action.   This field cannot be updated.   Note: This field is reserved for future use and is not currently active.
   * @return matchingKey
  **/
  @jakarta.annotation.Nullable
  public String getMatchingKey() {
    return matchingKey;
  }


  public void setMatchingKey(String matchingKey) {
    this.matchingKey = matchingKey;
  }


  public V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate preCondition(String preCondition) {
    
    this.preCondition = preCondition;
    return this;
  }

   /**
   * Specifies the state that the cluster must reach before the Action is executed. Currently, this is only applicable to the &#x60;postProvision&#x60; action.   The conditions are as follows:   - &#x60;Immediately&#x60;: Executed right after the Component object is created. The readiness of the Component and its resources is not guaranteed at this stage. - &#x60;RuntimeReady&#x60;: The Action is triggered after the Component object has been created and all associated runtime resources (e.g. Pods) are in a ready state. - &#x60;ComponentReady&#x60;: The Action is triggered after the Component itself is in a ready state. This process does not affect the readiness state of the Component or the Cluster. - &#x60;ClusterReady&#x60;: The Action is executed after the Cluster is in a ready state. This execution does not alter the Component or the Cluster&#39;s state of readiness.   This field cannot be updated.
   * @return preCondition
  **/
  @jakarta.annotation.Nullable
  public String getPreCondition() {
    return preCondition;
  }


  public void setPreCondition(String preCondition) {
    this.preCondition = preCondition;
  }


  public V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate retryPolicy(V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy retryPolicy) {
    
    this.retryPolicy = retryPolicy;
    return this;
  }

   /**
   * Get retryPolicy
   * @return retryPolicy
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy getRetryPolicy() {
    return retryPolicy;
  }


  public void setRetryPolicy(V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy retryPolicy) {
    this.retryPolicy = retryPolicy;
  }


  public V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate targetPodSelector(TargetPodSelectorEnum targetPodSelector) {
    
    this.targetPodSelector = targetPodSelector;
    return this;
  }

   /**
   * Defines the criteria used to select the target Pod(s) for executing the Action. This is useful when there is no default target replica identified. It allows for precise control over which Pod(s) the Action should run in.   This field cannot be updated.   Note: This field is reserved for future use and is not currently active.
   * @return targetPodSelector
  **/
  @jakarta.annotation.Nullable
  public TargetPodSelectorEnum getTargetPodSelector() {
    return targetPodSelector;
  }


  public void setTargetPodSelector(TargetPodSelectorEnum targetPodSelector) {
    this.targetPodSelector = targetPodSelector;
  }


  public V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate timeoutSeconds(Integer timeoutSeconds) {
    
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

   /**
   * Specifies the maximum duration in seconds that the Action is allowed to run.   If the Action does not complete within this time frame, it will be terminated.   This field cannot be updated.
   * @return timeoutSeconds
  **/
  @jakarta.annotation.Nullable
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }


  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate v1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate = (V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate) o;
    return Objects.equals(this.container, v1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate.container) &&
        Objects.equals(this.env, v1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate.env) &&
        Objects.equals(this.exec, v1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate.exec) &&
        Objects.equals(this.http, v1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate.http) &&
        Objects.equals(this.image, v1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate.image) &&
        Objects.equals(this.matchingKey, v1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate.matchingKey) &&
        Objects.equals(this.preCondition, v1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate.preCondition) &&
        Objects.equals(this.retryPolicy, v1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate.retryPolicy) &&
        Objects.equals(this.targetPodSelector, v1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate.targetPodSelector) &&
        Objects.equals(this.timeoutSeconds, v1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate.timeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(container, env, exec, http, image, matchingKey, preCondition, retryPolicy, targetPodSelector, timeoutSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate {\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    exec: ").append(toIndentedString(exec)).append("\n");
    sb.append("    http: ").append(toIndentedString(http)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    matchingKey: ").append(toIndentedString(matchingKey)).append("\n");
    sb.append("    preCondition: ").append(toIndentedString(preCondition)).append("\n");
    sb.append("    retryPolicy: ").append(toIndentedString(retryPolicy)).append("\n");
    sb.append("    targetPodSelector: ").append(toIndentedString(targetPodSelector)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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
    openapiFields.add("container");
    openapiFields.add("env");
    openapiFields.add("exec");
    openapiFields.add("http");
    openapiFields.add("image");
    openapiFields.add("matchingKey");
    openapiFields.add("preCondition");
    openapiFields.add("retryPolicy");
    openapiFields.add("targetPodSelector");
    openapiFields.add("timeoutSeconds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate is not found in the empty JSON string", V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("container") != null && !jsonObj.get("container").isJsonNull()) && !jsonObj.get("container").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `container` to be a primitive type in the JSON string but got `%s`", jsonObj.get("container").toString()));
      }
      if (jsonObj.get("env") != null && !jsonObj.get("env").isJsonNull()) {
        JsonArray jsonArrayenv = jsonObj.getAsJsonArray("env");
        if (jsonArrayenv != null) {
          // ensure the json data is an array
          if (!jsonObj.get("env").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `env` to be an array in the JSON string but got `%s`", jsonObj.get("env").toString()));
          }

          // validate the optional field `env` (array)
          for (int i = 0; i < jsonArrayenv.size(); i++) {
            V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerEnvInner.validateJsonObject(jsonArrayenv.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `exec`
      if (jsonObj.get("exec") != null && !jsonObj.get("exec").isJsonNull()) {
        V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerExec.validateJsonObject(jsonObj.getAsJsonObject("exec"));
      }
      // validate the optional field `http`
      if (jsonObj.get("http") != null && !jsonObj.get("http").isJsonNull()) {
        V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerHttp.validateJsonObject(jsonObj.getAsJsonObject("http"));
      }
      if ((jsonObj.get("image") != null && !jsonObj.get("image").isJsonNull()) && !jsonObj.get("image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image").toString()));
      }
      if ((jsonObj.get("matchingKey") != null && !jsonObj.get("matchingKey").isJsonNull()) && !jsonObj.get("matchingKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchingKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("matchingKey").toString()));
      }
      if ((jsonObj.get("preCondition") != null && !jsonObj.get("preCondition").isJsonNull()) && !jsonObj.get("preCondition").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preCondition` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preCondition").toString()));
      }
      // validate the optional field `retryPolicy`
      if (jsonObj.get("retryPolicy") != null && !jsonObj.get("retryPolicy").isJsonNull()) {
        V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy.validateJsonObject(jsonObj.getAsJsonObject("retryPolicy"));
      }
      if ((jsonObj.get("targetPodSelector") != null && !jsonObj.get("targetPodSelector").isJsonNull()) && !jsonObj.get("targetPodSelector").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetPodSelector` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetPodSelector").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate
  */
  public static V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentDefinitionSpecLifecycleActionsSwitchoverWithoutCandidate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

