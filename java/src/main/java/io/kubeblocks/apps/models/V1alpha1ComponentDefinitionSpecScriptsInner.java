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
 * V1alpha1ComponentDefinitionSpecScriptsInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T14:00:09.127576Z[Etc/UTC]")
public class V1alpha1ComponentDefinitionSpecScriptsInner {
  public static final String SERIALIZED_NAME_DEFAULT_MODE = "defaultMode";
  @SerializedName(SERIALIZED_NAME_DEFAULT_MODE)
  private Integer defaultMode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_TEMPLATE_REF = "templateRef";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_REF)
  private String templateRef;

  public static final String SERIALIZED_NAME_VOLUME_NAME = "volumeName";
  @SerializedName(SERIALIZED_NAME_VOLUME_NAME)
  private String volumeName;

  public V1alpha1ComponentDefinitionSpecScriptsInner() {
  }

  public V1alpha1ComponentDefinitionSpecScriptsInner defaultMode(Integer defaultMode) {
    
    this.defaultMode = defaultMode;
    return this;
  }

   /**
   * The operator attempts to set default file permissions for scripts (0555) and configurations (0444). However, certain database engines may require different file permissions. You can specify the desired file permissions here.   Must be specified as an octal value between 0000 and 0777 (inclusive), or as a decimal value between 0 and 511 (inclusive). YAML supports both octal and decimal values for file permissions.   Please note that this setting only affects the permissions of the files themselves. Directories within the specified path are not impacted by this setting. It&#39;s important to be aware that this setting might conflict with other options that influence the file mode, such as fsGroup. In such cases, the resulting file mode may have additional bits set. Refers to documents of k8s.ConfigMapVolumeSource.defaultMode for more information.
   * @return defaultMode
  **/
  @jakarta.annotation.Nullable
  public Integer getDefaultMode() {
    return defaultMode;
  }


  public void setDefaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
  }


  public V1alpha1ComponentDefinitionSpecScriptsInner name(String name) {
    
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


  public V1alpha1ComponentDefinitionSpecScriptsInner namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Specifies the namespace of the referenced configuration template ConfigMap object. An empty namespace is equivalent to the \&quot;default\&quot; namespace.
   * @return namespace
  **/
  @jakarta.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public V1alpha1ComponentDefinitionSpecScriptsInner templateRef(String templateRef) {
    
    this.templateRef = templateRef;
    return this;
  }

   /**
   * Specifies the name of the referenced configuration template ConfigMap object.
   * @return templateRef
  **/
  @jakarta.annotation.Nonnull
  public String getTemplateRef() {
    return templateRef;
  }


  public void setTemplateRef(String templateRef) {
    this.templateRef = templateRef;
  }


  public V1alpha1ComponentDefinitionSpecScriptsInner volumeName(String volumeName) {
    
    this.volumeName = volumeName;
    return this;
  }

   /**
   * Refers to the volume name of PodTemplate. The configuration file produced through the configuration template will be mounted to the corresponding volume. Must be a DNS_LABEL name. The volume name must be defined in podSpec.containers[*].volumeMounts.
   * @return volumeName
  **/
  @jakarta.annotation.Nonnull
  public String getVolumeName() {
    return volumeName;
  }


  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentDefinitionSpecScriptsInner v1alpha1ComponentDefinitionSpecScriptsInner = (V1alpha1ComponentDefinitionSpecScriptsInner) o;
    return Objects.equals(this.defaultMode, v1alpha1ComponentDefinitionSpecScriptsInner.defaultMode) &&
        Objects.equals(this.name, v1alpha1ComponentDefinitionSpecScriptsInner.name) &&
        Objects.equals(this.namespace, v1alpha1ComponentDefinitionSpecScriptsInner.namespace) &&
        Objects.equals(this.templateRef, v1alpha1ComponentDefinitionSpecScriptsInner.templateRef) &&
        Objects.equals(this.volumeName, v1alpha1ComponentDefinitionSpecScriptsInner.volumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultMode, name, namespace, templateRef, volumeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentDefinitionSpecScriptsInner {\n");
    sb.append("    defaultMode: ").append(toIndentedString(defaultMode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    templateRef: ").append(toIndentedString(templateRef)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
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
    openapiFields.add("defaultMode");
    openapiFields.add("name");
    openapiFields.add("namespace");
    openapiFields.add("templateRef");
    openapiFields.add("volumeName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("templateRef");
    openapiRequiredFields.add("volumeName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentDefinitionSpecScriptsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentDefinitionSpecScriptsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentDefinitionSpecScriptsInner is not found in the empty JSON string", V1alpha1ComponentDefinitionSpecScriptsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentDefinitionSpecScriptsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentDefinitionSpecScriptsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ComponentDefinitionSpecScriptsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if (!jsonObj.get("templateRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateRef").toString()));
      }
      if (!jsonObj.get("volumeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentDefinitionSpecScriptsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentDefinitionSpecScriptsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentDefinitionSpecScriptsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentDefinitionSpecScriptsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentDefinitionSpecScriptsInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentDefinitionSpecScriptsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentDefinitionSpecScriptsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentDefinitionSpecScriptsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentDefinitionSpecScriptsInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentDefinitionSpecScriptsInner
  */
  public static V1alpha1ComponentDefinitionSpecScriptsInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ComponentDefinitionSpecScriptsInner.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentDefinitionSpecScriptsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}
