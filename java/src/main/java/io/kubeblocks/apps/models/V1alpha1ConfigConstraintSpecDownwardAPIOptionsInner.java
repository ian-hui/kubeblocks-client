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
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerDownwardAPIItemsInner;
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
 * V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T14:34:07.299798Z[Etc/UTC]")
public class V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner {
  public static final String SERIALIZED_NAME_COMMAND = "command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  private List<String> command;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerDownwardAPIItemsInner> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_MOUNT_POINT = "mountPoint";
  @SerializedName(SERIALIZED_NAME_MOUNT_POINT)
  private String mountPoint;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner() {
  }

  public V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner command(List<String> command) {
    
    this.command = command;
    return this;
  }

  public V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner addCommandItem(String commandItem) {
    if (this.command == null) {
      this.command = new ArrayList<>();
    }
    this.command.add(commandItem);
    return this;
  }

   /**
   * The command used to execute for the downward API. This field is optional.
   * @return command
  **/
  @jakarta.annotation.Nullable
  public List<String> getCommand() {
    return command;
  }


  public void setCommand(List<String> command) {
    this.command = command;
  }


  public V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner items(List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerDownwardAPIItemsInner> items) {
    
    this.items = items;
    return this;
  }

  public V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner addItemsItem(V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerDownwardAPIItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Represents a list of downward API volume files. This is a required field.
   * @return items
  **/
  @jakarta.annotation.Nonnull
  public List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerDownwardAPIItemsInner> getItems() {
    return items;
  }


  public void setItems(List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerDownwardAPIItemsInner> items) {
    this.items = items;
  }


  public V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner mountPoint(String mountPoint) {
    
    this.mountPoint = mountPoint;
    return this;
  }

   /**
   * Specifies the mount point of the scripts file. This is a required field and must be a string of maximum length 128.
   * @return mountPoint
  **/
  @jakarta.annotation.Nonnull
  public String getMountPoint() {
    return mountPoint;
  }


  public void setMountPoint(String mountPoint) {
    this.mountPoint = mountPoint;
  }


  public V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the field. This is a required field and must be a string of maximum length 63. The name should match the regex pattern &#x60;^[a-z0-9]([a-z0-9\\.\\-]*[a-z0-9])?$&#x60;.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner v1alpha1ConfigConstraintSpecDownwardAPIOptionsInner = (V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner) o;
    return Objects.equals(this.command, v1alpha1ConfigConstraintSpecDownwardAPIOptionsInner.command) &&
        Objects.equals(this.items, v1alpha1ConfigConstraintSpecDownwardAPIOptionsInner.items) &&
        Objects.equals(this.mountPoint, v1alpha1ConfigConstraintSpecDownwardAPIOptionsInner.mountPoint) &&
        Objects.equals(this.name, v1alpha1ConfigConstraintSpecDownwardAPIOptionsInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(command, items, mountPoint, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner {\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    mountPoint: ").append(toIndentedString(mountPoint)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("command");
    openapiFields.add("items");
    openapiFields.add("mountPoint");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("items");
    openapiRequiredFields.add("mountPoint");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner is not found in the empty JSON string", V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("command") != null && !jsonObj.get("command").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `command` to be an array in the JSON string but got `%s`", jsonObj.get("command").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("items").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
      }

      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      // validate the required field `items` (array)
      for (int i = 0; i < jsonArrayitems.size(); i++) {
        V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerDownwardAPIItemsInner.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("mountPoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mountPoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mountPoint").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner
  */
  public static V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner.class);
  }

 /**
  * Convert an instance of V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

