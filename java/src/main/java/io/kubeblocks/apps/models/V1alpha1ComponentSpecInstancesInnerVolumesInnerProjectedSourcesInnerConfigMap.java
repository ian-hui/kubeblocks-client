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
import io.kubeblocks.apps.models.V1alpha1ComponentSpecInstancesInnerVolumesInnerConfigMapItemsInner;
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
 * configMap information about the configMap data to project
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T13:58:42.635097Z[Etc/UTC]")
public class V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<V1alpha1ComponentSpecInstancesInnerVolumesInnerConfigMapItemsInner> items;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;

  public V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap() {
  }

  public V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap items(List<V1alpha1ComponentSpecInstancesInnerVolumesInnerConfigMapItemsInner> items) {
    
    this.items = items;
    return this;
  }

  public V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap addItemsItem(V1alpha1ComponentSpecInstancesInnerVolumesInnerConfigMapItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * items if unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the &#39;..&#39; path or start with &#39;..&#39;.
   * @return items
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ComponentSpecInstancesInnerVolumesInnerConfigMapItemsInner> getItems() {
    return items;
  }


  public void setItems(List<V1alpha1ComponentSpecInstancesInnerVolumesInnerConfigMapItemsInner> items) {
    this.items = items;
  }


  public V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
   * @return name
  **/
  @jakarta.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap optional(Boolean optional) {
    
    this.optional = optional;
    return this;
  }

   /**
   * optional specify whether the ConfigMap or its keys must be defined
   * @return optional
  **/
  @jakarta.annotation.Nullable
  public Boolean getOptional() {
    return optional;
  }


  public void setOptional(Boolean optional) {
    this.optional = optional;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap v1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap = (V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap) o;
    return Objects.equals(this.items, v1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap.items) &&
        Objects.equals(this.name, v1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap.name) &&
        Objects.equals(this.optional, v1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap.optional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, name, optional);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
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
    openapiFields.add("items");
    openapiFields.add("name");
    openapiFields.add("optional");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap is not found in the empty JSON string", V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            V1alpha1ComponentSpecInstancesInnerVolumesInnerConfigMapItemsInner.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap
  */
  public static V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentSpecInstancesInnerVolumesInnerProjectedSourcesInnerConfigMap to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}
