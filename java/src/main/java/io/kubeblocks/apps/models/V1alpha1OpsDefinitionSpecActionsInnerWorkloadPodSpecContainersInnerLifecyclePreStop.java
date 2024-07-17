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
import io.kubeblocks.apps.models.V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePostStartExec;
import io.kubeblocks.apps.models.V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePostStartHttpGet;
import io.kubeblocks.apps.models.V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePostStartTcpSocket;
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
 * PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc. The handler is not called if the container crashes or exits. The Pod&#39;s termination grace period countdown begins before the PreStop hook is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod&#39;s termination grace period (unless delayed by finalizers). Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T07:33:32.812607Z[Etc/UTC]")
public class V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop {
  public static final String SERIALIZED_NAME_EXEC = "exec";
  @SerializedName(SERIALIZED_NAME_EXEC)
  private V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePostStartExec exec;

  public static final String SERIALIZED_NAME_HTTP_GET = "httpGet";
  @SerializedName(SERIALIZED_NAME_HTTP_GET)
  private V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePostStartHttpGet httpGet;

  public static final String SERIALIZED_NAME_TCP_SOCKET = "tcpSocket";
  @SerializedName(SERIALIZED_NAME_TCP_SOCKET)
  private V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePostStartTcpSocket tcpSocket;

  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop() {
  }

  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop exec(V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePostStartExec exec) {
    
    this.exec = exec;
    return this;
  }

   /**
   * Get exec
   * @return exec
  **/
  @jakarta.annotation.Nullable
  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePostStartExec getExec() {
    return exec;
  }


  public void setExec(V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePostStartExec exec) {
    this.exec = exec;
  }


  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop httpGet(V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePostStartHttpGet httpGet) {
    
    this.httpGet = httpGet;
    return this;
  }

   /**
   * Get httpGet
   * @return httpGet
  **/
  @jakarta.annotation.Nullable
  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePostStartHttpGet getHttpGet() {
    return httpGet;
  }


  public void setHttpGet(V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePostStartHttpGet httpGet) {
    this.httpGet = httpGet;
  }


  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop tcpSocket(V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePostStartTcpSocket tcpSocket) {
    
    this.tcpSocket = tcpSocket;
    return this;
  }

   /**
   * Get tcpSocket
   * @return tcpSocket
  **/
  @jakarta.annotation.Nullable
  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePostStartTcpSocket getTcpSocket() {
    return tcpSocket;
  }


  public void setTcpSocket(V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePostStartTcpSocket tcpSocket) {
    this.tcpSocket = tcpSocket;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop v1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop = (V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop) o;
    return Objects.equals(this.exec, v1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop.exec) &&
        Objects.equals(this.httpGet, v1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop.httpGet) &&
        Objects.equals(this.tcpSocket, v1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop.tcpSocket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exec, httpGet, tcpSocket);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop {\n");
    sb.append("    exec: ").append(toIndentedString(exec)).append("\n");
    sb.append("    httpGet: ").append(toIndentedString(httpGet)).append("\n");
    sb.append("    tcpSocket: ").append(toIndentedString(tcpSocket)).append("\n");
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
    openapiFields.add("exec");
    openapiFields.add("httpGet");
    openapiFields.add("tcpSocket");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop is not found in the empty JSON string", V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `exec`
      if (jsonObj.get("exec") != null && !jsonObj.get("exec").isJsonNull()) {
        V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePostStartExec.validateJsonObject(jsonObj.getAsJsonObject("exec"));
      }
      // validate the optional field `httpGet`
      if (jsonObj.get("httpGet") != null && !jsonObj.get("httpGet").isJsonNull()) {
        V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePostStartHttpGet.validateJsonObject(jsonObj.getAsJsonObject("httpGet"));
      }
      // validate the optional field `tcpSocket`
      if (jsonObj.get("tcpSocket") != null && !jsonObj.get("tcpSocket").isJsonNull()) {
        V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePostStartTcpSocket.validateJsonObject(jsonObj.getAsJsonObject("tcpSocket"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop
  */
  public static V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop.class);
  }

 /**
  * Convert an instance of V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerLifecyclePreStop to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}
