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
 * ContainerPort represents a network port in a single container.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T14:34:07.299798Z[Etc/UTC]")
public class V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner {
  public static final String SERIALIZED_NAME_CONTAINER_PORT = "containerPort";
  @SerializedName(SERIALIZED_NAME_CONTAINER_PORT)
  private Integer containerPort;

  public static final String SERIALIZED_NAME_HOST_I_P = "hostIP";
  @SerializedName(SERIALIZED_NAME_HOST_I_P)
  private String hostIP;

  public static final String SERIALIZED_NAME_HOST_PORT = "hostPort";
  @SerializedName(SERIALIZED_NAME_HOST_PORT)
  private Integer hostPort;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner() {
  }

  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner containerPort(Integer containerPort) {
    
    this.containerPort = containerPort;
    return this;
  }

   /**
   * Number of port to expose on the pod&#39;s IP address. This must be a valid port number, 0 &lt; x &lt; 65536.
   * @return containerPort
  **/
  @jakarta.annotation.Nonnull
  public Integer getContainerPort() {
    return containerPort;
  }


  public void setContainerPort(Integer containerPort) {
    this.containerPort = containerPort;
  }


  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner hostIP(String hostIP) {
    
    this.hostIP = hostIP;
    return this;
  }

   /**
   * What host IP to bind the external port to.
   * @return hostIP
  **/
  @jakarta.annotation.Nullable
  public String getHostIP() {
    return hostIP;
  }


  public void setHostIP(String hostIP) {
    this.hostIP = hostIP;
  }


  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner hostPort(Integer hostPort) {
    
    this.hostPort = hostPort;
    return this;
  }

   /**
   * Number of port to expose on the host. If specified, this must be a valid port number, 0 &lt; x &lt; 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.
   * @return hostPort
  **/
  @jakarta.annotation.Nullable
  public Integer getHostPort() {
    return hostPort;
  }


  public void setHostPort(Integer hostPort) {
    this.hostPort = hostPort;
  }


  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services.
   * @return name
  **/
  @jakarta.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner protocol(String protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Protocol for port. Must be UDP, TCP, or SCTP. Defaults to \&quot;TCP\&quot;.
   * @return protocol
  **/
  @jakarta.annotation.Nullable
  public String getProtocol() {
    return protocol;
  }


  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner v1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner = (V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner) o;
    return Objects.equals(this.containerPort, v1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner.containerPort) &&
        Objects.equals(this.hostIP, v1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner.hostIP) &&
        Objects.equals(this.hostPort, v1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner.hostPort) &&
        Objects.equals(this.name, v1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner.name) &&
        Objects.equals(this.protocol, v1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerPort, hostIP, hostPort, name, protocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner {\n");
    sb.append("    containerPort: ").append(toIndentedString(containerPort)).append("\n");
    sb.append("    hostIP: ").append(toIndentedString(hostIP)).append("\n");
    sb.append("    hostPort: ").append(toIndentedString(hostPort)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
    openapiFields.add("containerPort");
    openapiFields.add("hostIP");
    openapiFields.add("hostPort");
    openapiFields.add("name");
    openapiFields.add("protocol");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("containerPort");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner is not found in the empty JSON string", V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("hostIP") != null && !jsonObj.get("hostIP").isJsonNull()) && !jsonObj.get("hostIP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostIP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostIP").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("protocol") != null && !jsonObj.get("protocol").isJsonNull()) && !jsonObj.get("protocol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protocol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protocol").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner
  */
  public static V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner.class);
  }

 /**
  * Convert an instance of V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerPortsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

