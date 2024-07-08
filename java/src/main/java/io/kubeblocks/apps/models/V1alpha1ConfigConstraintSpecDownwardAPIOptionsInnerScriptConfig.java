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
 * ScriptConfig object specifies a ConfigMap that contains script files that should be mounted inside the pod. The scripts are mounted as volumes and can be referenced and executed by the DownwardAction to perform specific tasks or configurations.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T07:33:32.812607Z[Etc/UTC]")
public class V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig {
  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_SCRIPT_CONFIG_MAP_REF = "scriptConfigMapRef";
  @SerializedName(SERIALIZED_NAME_SCRIPT_CONFIG_MAP_REF)
  private String scriptConfigMapRef;

  public V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig() {
  }

  public V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Specifies the namespace for the ConfigMap. If not specified, it defaults to the \&quot;default\&quot; namespace.
   * @return namespace
  **/
  @jakarta.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig scriptConfigMapRef(String scriptConfigMapRef) {
    
    this.scriptConfigMapRef = scriptConfigMapRef;
    return this;
  }

   /**
   * Specifies the reference to the ConfigMap containing the scripts.
   * @return scriptConfigMapRef
  **/
  @jakarta.annotation.Nonnull
  public String getScriptConfigMapRef() {
    return scriptConfigMapRef;
  }


  public void setScriptConfigMapRef(String scriptConfigMapRef) {
    this.scriptConfigMapRef = scriptConfigMapRef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig v1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig = (V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig) o;
    return Objects.equals(this.namespace, v1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig.namespace) &&
        Objects.equals(this.scriptConfigMapRef, v1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig.scriptConfigMapRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, scriptConfigMapRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig {\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    scriptConfigMapRef: ").append(toIndentedString(scriptConfigMapRef)).append("\n");
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
    openapiFields.add("namespace");
    openapiFields.add("scriptConfigMapRef");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("scriptConfigMapRef");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig is not found in the empty JSON string", V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if (!jsonObj.get("scriptConfigMapRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scriptConfigMapRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scriptConfigMapRef").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig>() {
           @Override
           public void write(JsonWriter out, V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig
  */
  public static V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig.class);
  }

 /**
  * Convert an instance of V1alpha1ConfigConstraintSpecDownwardAPIOptionsInnerScriptConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

