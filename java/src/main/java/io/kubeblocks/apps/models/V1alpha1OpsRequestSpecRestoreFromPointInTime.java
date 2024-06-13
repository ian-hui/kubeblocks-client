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
import io.kubeblocks.apps.models.V1alpha1OpsRequestSpecRestoreFromPointInTimeRef;
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * Refers to the specific point in time for recovery.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T14:34:07.299798Z[Etc/UTC]")
public class V1alpha1OpsRequestSpecRestoreFromPointInTime {
  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private V1alpha1OpsRequestSpecRestoreFromPointInTimeRef ref;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private OffsetDateTime time;

  public V1alpha1OpsRequestSpecRestoreFromPointInTime() {
  }

  public V1alpha1OpsRequestSpecRestoreFromPointInTime ref(V1alpha1OpsRequestSpecRestoreFromPointInTimeRef ref) {
    
    this.ref = ref;
    return this;
  }

   /**
   * Get ref
   * @return ref
  **/
  @jakarta.annotation.Nullable
  public V1alpha1OpsRequestSpecRestoreFromPointInTimeRef getRef() {
    return ref;
  }


  public void setRef(V1alpha1OpsRequestSpecRestoreFromPointInTimeRef ref) {
    this.ref = ref;
  }


  public V1alpha1OpsRequestSpecRestoreFromPointInTime time(OffsetDateTime time) {
    
    this.time = time;
    return this;
  }

   /**
   * Refers to the specific time point for restoration, with UTC as the time zone.
   * @return time
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getTime() {
    return time;
  }


  public void setTime(OffsetDateTime time) {
    this.time = time;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsRequestSpecRestoreFromPointInTime v1alpha1OpsRequestSpecRestoreFromPointInTime = (V1alpha1OpsRequestSpecRestoreFromPointInTime) o;
    return Objects.equals(this.ref, v1alpha1OpsRequestSpecRestoreFromPointInTime.ref) &&
        Objects.equals(this.time, v1alpha1OpsRequestSpecRestoreFromPointInTime.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsRequestSpecRestoreFromPointInTime {\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
    openapiFields.add("ref");
    openapiFields.add("time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsRequestSpecRestoreFromPointInTime
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsRequestSpecRestoreFromPointInTime.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsRequestSpecRestoreFromPointInTime is not found in the empty JSON string", V1alpha1OpsRequestSpecRestoreFromPointInTime.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsRequestSpecRestoreFromPointInTime.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsRequestSpecRestoreFromPointInTime` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `ref`
      if (jsonObj.get("ref") != null && !jsonObj.get("ref").isJsonNull()) {
        V1alpha1OpsRequestSpecRestoreFromPointInTimeRef.validateJsonObject(jsonObj.getAsJsonObject("ref"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsRequestSpecRestoreFromPointInTime.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsRequestSpecRestoreFromPointInTime' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsRequestSpecRestoreFromPointInTime> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsRequestSpecRestoreFromPointInTime.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsRequestSpecRestoreFromPointInTime>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsRequestSpecRestoreFromPointInTime value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsRequestSpecRestoreFromPointInTime read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsRequestSpecRestoreFromPointInTime given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsRequestSpecRestoreFromPointInTime
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsRequestSpecRestoreFromPointInTime
  */
  public static V1alpha1OpsRequestSpecRestoreFromPointInTime fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsRequestSpecRestoreFromPointInTime.class);
  }

 /**
  * Convert an instance of V1alpha1OpsRequestSpecRestoreFromPointInTime to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

