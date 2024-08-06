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
import io.kubeblocks.apps.models.V1alpha1ComponentDefinitionSpecConfigsInnerLegacyRenderedConfigSpec;
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
 * V1alpha1ComponentDefinitionSpecConfigsInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T14:00:09.127576Z[Etc/UTC]")
public class V1alpha1ComponentDefinitionSpecConfigsInner {
  public static final String SERIALIZED_NAME_AS_ENV_FROM = "asEnvFrom";
  @SerializedName(SERIALIZED_NAME_AS_ENV_FROM)
  private List<String> asEnvFrom;

  public static final String SERIALIZED_NAME_CONSTRAINT_REF = "constraintRef";
  @SerializedName(SERIALIZED_NAME_CONSTRAINT_REF)
  private String constraintRef;

  public static final String SERIALIZED_NAME_DEFAULT_MODE = "defaultMode";
  @SerializedName(SERIALIZED_NAME_DEFAULT_MODE)
  private Integer defaultMode;

  public static final String SERIALIZED_NAME_INJECT_ENV_TO = "injectEnvTo";
  @SerializedName(SERIALIZED_NAME_INJECT_ENV_TO)
  private List<String> injectEnvTo;

  public static final String SERIALIZED_NAME_KEYS = "keys";
  @SerializedName(SERIALIZED_NAME_KEYS)
  private List<String> keys;

  public static final String SERIALIZED_NAME_LEGACY_RENDERED_CONFIG_SPEC = "legacyRenderedConfigSpec";
  @SerializedName(SERIALIZED_NAME_LEGACY_RENDERED_CONFIG_SPEC)
  private V1alpha1ComponentDefinitionSpecConfigsInnerLegacyRenderedConfigSpec legacyRenderedConfigSpec;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  /**
   * RerenderResourceType defines the resource requirements for a component.
   */
  @JsonAdapter(ReRenderResourceTypesEnum.Adapter.class)
  public enum ReRenderResourceTypesEnum {
    VSCALE("vscale"),
    
    HSCALE("hscale"),
    
    TLS("tls");

    private String value;

    ReRenderResourceTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReRenderResourceTypesEnum fromValue(String value) {
      for (ReRenderResourceTypesEnum b : ReRenderResourceTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReRenderResourceTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReRenderResourceTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReRenderResourceTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReRenderResourceTypesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RE_RENDER_RESOURCE_TYPES = "reRenderResourceTypes";
  @SerializedName(SERIALIZED_NAME_RE_RENDER_RESOURCE_TYPES)
  private List<ReRenderResourceTypesEnum> reRenderResourceTypes;

  public static final String SERIALIZED_NAME_TEMPLATE_REF = "templateRef";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_REF)
  private String templateRef;

  public static final String SERIALIZED_NAME_VOLUME_NAME = "volumeName";
  @SerializedName(SERIALIZED_NAME_VOLUME_NAME)
  private String volumeName;

  public V1alpha1ComponentDefinitionSpecConfigsInner() {
  }

  public V1alpha1ComponentDefinitionSpecConfigsInner asEnvFrom(List<String> asEnvFrom) {
    
    this.asEnvFrom = asEnvFrom;
    return this;
  }

  public V1alpha1ComponentDefinitionSpecConfigsInner addAsEnvFromItem(String asEnvFromItem) {
    if (this.asEnvFrom == null) {
      this.asEnvFrom = new ArrayList<>();
    }
    this.asEnvFrom.add(asEnvFromItem);
    return this;
  }

   /**
   * Specifies the containers to inject the ConfigMap parameters as environment variables.   This is useful when application images accept parameters through environment variables and generate the final configuration file in the startup script based on these variables.   This field allows users to specify a list of container names, and KubeBlocks will inject the environment variables converted from the ConfigMap into these designated containers. This provides a flexible way to pass the configuration items from the ConfigMap to the container without modifying the image.   Deprecated: &#x60;asEnvFrom&#x60; has been deprecated since 0.9.0 and will be removed in 0.10.0. Use &#x60;injectEnvTo&#x60; instead.
   * @return asEnvFrom
  **/
  @jakarta.annotation.Nullable
  public List<String> getAsEnvFrom() {
    return asEnvFrom;
  }


  public void setAsEnvFrom(List<String> asEnvFrom) {
    this.asEnvFrom = asEnvFrom;
  }


  public V1alpha1ComponentDefinitionSpecConfigsInner constraintRef(String constraintRef) {
    
    this.constraintRef = constraintRef;
    return this;
  }

   /**
   * Specifies the name of the referenced configuration constraints object.
   * @return constraintRef
  **/
  @jakarta.annotation.Nullable
  public String getConstraintRef() {
    return constraintRef;
  }


  public void setConstraintRef(String constraintRef) {
    this.constraintRef = constraintRef;
  }


  public V1alpha1ComponentDefinitionSpecConfigsInner defaultMode(Integer defaultMode) {
    
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


  public V1alpha1ComponentDefinitionSpecConfigsInner injectEnvTo(List<String> injectEnvTo) {
    
    this.injectEnvTo = injectEnvTo;
    return this;
  }

  public V1alpha1ComponentDefinitionSpecConfigsInner addInjectEnvToItem(String injectEnvToItem) {
    if (this.injectEnvTo == null) {
      this.injectEnvTo = new ArrayList<>();
    }
    this.injectEnvTo.add(injectEnvToItem);
    return this;
  }

   /**
   * Specifies the containers to inject the ConfigMap parameters as environment variables.   This is useful when application images accept parameters through environment variables and generate the final configuration file in the startup script based on these variables.   This field allows users to specify a list of container names, and KubeBlocks will inject the environment variables converted from the ConfigMap into these designated containers. This provides a flexible way to pass the configuration items from the ConfigMap to the container without modifying the image.
   * @return injectEnvTo
  **/
  @jakarta.annotation.Nullable
  public List<String> getInjectEnvTo() {
    return injectEnvTo;
  }


  public void setInjectEnvTo(List<String> injectEnvTo) {
    this.injectEnvTo = injectEnvTo;
  }


  public V1alpha1ComponentDefinitionSpecConfigsInner keys(List<String> keys) {
    
    this.keys = keys;
    return this;
  }

  public V1alpha1ComponentDefinitionSpecConfigsInner addKeysItem(String keysItem) {
    if (this.keys == null) {
      this.keys = new ArrayList<>();
    }
    this.keys.add(keysItem);
    return this;
  }

   /**
   * Specifies the configuration files within the ConfigMap that support dynamic updates.   A configuration template (provided in the form of a ConfigMap) may contain templates for multiple configuration files. Each configuration file corresponds to a key in the ConfigMap. Some of these configuration files may support dynamic modification and reloading without requiring a pod restart.   If empty or omitted, all configuration files in the ConfigMap are assumed to support dynamic updates, and ConfigConstraint applies to all keys.
   * @return keys
  **/
  @jakarta.annotation.Nullable
  public List<String> getKeys() {
    return keys;
  }


  public void setKeys(List<String> keys) {
    this.keys = keys;
  }


  public V1alpha1ComponentDefinitionSpecConfigsInner legacyRenderedConfigSpec(V1alpha1ComponentDefinitionSpecConfigsInnerLegacyRenderedConfigSpec legacyRenderedConfigSpec) {
    
    this.legacyRenderedConfigSpec = legacyRenderedConfigSpec;
    return this;
  }

   /**
   * Get legacyRenderedConfigSpec
   * @return legacyRenderedConfigSpec
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ComponentDefinitionSpecConfigsInnerLegacyRenderedConfigSpec getLegacyRenderedConfigSpec() {
    return legacyRenderedConfigSpec;
  }


  public void setLegacyRenderedConfigSpec(V1alpha1ComponentDefinitionSpecConfigsInnerLegacyRenderedConfigSpec legacyRenderedConfigSpec) {
    this.legacyRenderedConfigSpec = legacyRenderedConfigSpec;
  }


  public V1alpha1ComponentDefinitionSpecConfigsInner name(String name) {
    
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


  public V1alpha1ComponentDefinitionSpecConfigsInner namespace(String namespace) {
    
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


  public V1alpha1ComponentDefinitionSpecConfigsInner reRenderResourceTypes(List<ReRenderResourceTypesEnum> reRenderResourceTypes) {
    
    this.reRenderResourceTypes = reRenderResourceTypes;
    return this;
  }

  public V1alpha1ComponentDefinitionSpecConfigsInner addReRenderResourceTypesItem(ReRenderResourceTypesEnum reRenderResourceTypesItem) {
    if (this.reRenderResourceTypes == null) {
      this.reRenderResourceTypes = new ArrayList<>();
    }
    this.reRenderResourceTypes.add(reRenderResourceTypesItem);
    return this;
  }

   /**
   * Specifies whether the configuration needs to be re-rendered after v-scale or h-scale operations to reflect changes.   In some scenarios, the configuration may need to be updated to reflect the changes in resource allocation or cluster topology. Examples:   - Redis: adjust maxmemory after v-scale operation. - MySQL: increase max connections after v-scale operation. - Zookeeper: update zoo.cfg with new node addresses after h-scale operation.
   * @return reRenderResourceTypes
  **/
  @jakarta.annotation.Nullable
  public List<ReRenderResourceTypesEnum> getReRenderResourceTypes() {
    return reRenderResourceTypes;
  }


  public void setReRenderResourceTypes(List<ReRenderResourceTypesEnum> reRenderResourceTypes) {
    this.reRenderResourceTypes = reRenderResourceTypes;
  }


  public V1alpha1ComponentDefinitionSpecConfigsInner templateRef(String templateRef) {
    
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


  public V1alpha1ComponentDefinitionSpecConfigsInner volumeName(String volumeName) {
    
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
    V1alpha1ComponentDefinitionSpecConfigsInner v1alpha1ComponentDefinitionSpecConfigsInner = (V1alpha1ComponentDefinitionSpecConfigsInner) o;
    return Objects.equals(this.asEnvFrom, v1alpha1ComponentDefinitionSpecConfigsInner.asEnvFrom) &&
        Objects.equals(this.constraintRef, v1alpha1ComponentDefinitionSpecConfigsInner.constraintRef) &&
        Objects.equals(this.defaultMode, v1alpha1ComponentDefinitionSpecConfigsInner.defaultMode) &&
        Objects.equals(this.injectEnvTo, v1alpha1ComponentDefinitionSpecConfigsInner.injectEnvTo) &&
        Objects.equals(this.keys, v1alpha1ComponentDefinitionSpecConfigsInner.keys) &&
        Objects.equals(this.legacyRenderedConfigSpec, v1alpha1ComponentDefinitionSpecConfigsInner.legacyRenderedConfigSpec) &&
        Objects.equals(this.name, v1alpha1ComponentDefinitionSpecConfigsInner.name) &&
        Objects.equals(this.namespace, v1alpha1ComponentDefinitionSpecConfigsInner.namespace) &&
        Objects.equals(this.reRenderResourceTypes, v1alpha1ComponentDefinitionSpecConfigsInner.reRenderResourceTypes) &&
        Objects.equals(this.templateRef, v1alpha1ComponentDefinitionSpecConfigsInner.templateRef) &&
        Objects.equals(this.volumeName, v1alpha1ComponentDefinitionSpecConfigsInner.volumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asEnvFrom, constraintRef, defaultMode, injectEnvTo, keys, legacyRenderedConfigSpec, name, namespace, reRenderResourceTypes, templateRef, volumeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentDefinitionSpecConfigsInner {\n");
    sb.append("    asEnvFrom: ").append(toIndentedString(asEnvFrom)).append("\n");
    sb.append("    constraintRef: ").append(toIndentedString(constraintRef)).append("\n");
    sb.append("    defaultMode: ").append(toIndentedString(defaultMode)).append("\n");
    sb.append("    injectEnvTo: ").append(toIndentedString(injectEnvTo)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    legacyRenderedConfigSpec: ").append(toIndentedString(legacyRenderedConfigSpec)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    reRenderResourceTypes: ").append(toIndentedString(reRenderResourceTypes)).append("\n");
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
    openapiFields.add("asEnvFrom");
    openapiFields.add("constraintRef");
    openapiFields.add("defaultMode");
    openapiFields.add("injectEnvTo");
    openapiFields.add("keys");
    openapiFields.add("legacyRenderedConfigSpec");
    openapiFields.add("name");
    openapiFields.add("namespace");
    openapiFields.add("reRenderResourceTypes");
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
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentDefinitionSpecConfigsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentDefinitionSpecConfigsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentDefinitionSpecConfigsInner is not found in the empty JSON string", V1alpha1ComponentDefinitionSpecConfigsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentDefinitionSpecConfigsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentDefinitionSpecConfigsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ComponentDefinitionSpecConfigsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("asEnvFrom") != null && !jsonObj.get("asEnvFrom").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `asEnvFrom` to be an array in the JSON string but got `%s`", jsonObj.get("asEnvFrom").toString()));
      }
      if ((jsonObj.get("constraintRef") != null && !jsonObj.get("constraintRef").isJsonNull()) && !jsonObj.get("constraintRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `constraintRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("constraintRef").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("injectEnvTo") != null && !jsonObj.get("injectEnvTo").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `injectEnvTo` to be an array in the JSON string but got `%s`", jsonObj.get("injectEnvTo").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("keys") != null && !jsonObj.get("keys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `keys` to be an array in the JSON string but got `%s`", jsonObj.get("keys").toString()));
      }
      // validate the optional field `legacyRenderedConfigSpec`
      if (jsonObj.get("legacyRenderedConfigSpec") != null && !jsonObj.get("legacyRenderedConfigSpec").isJsonNull()) {
        V1alpha1ComponentDefinitionSpecConfigsInnerLegacyRenderedConfigSpec.validateJsonObject(jsonObj.getAsJsonObject("legacyRenderedConfigSpec"));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("reRenderResourceTypes") != null && !jsonObj.get("reRenderResourceTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `reRenderResourceTypes` to be an array in the JSON string but got `%s`", jsonObj.get("reRenderResourceTypes").toString()));
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
       if (!V1alpha1ComponentDefinitionSpecConfigsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentDefinitionSpecConfigsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentDefinitionSpecConfigsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentDefinitionSpecConfigsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentDefinitionSpecConfigsInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentDefinitionSpecConfigsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentDefinitionSpecConfigsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentDefinitionSpecConfigsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentDefinitionSpecConfigsInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentDefinitionSpecConfigsInner
  */
  public static V1alpha1ComponentDefinitionSpecConfigsInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ComponentDefinitionSpecConfigsInner.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentDefinitionSpecConfigsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}
