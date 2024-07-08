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
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermNamespaceSelector;
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
 * Required. A pod affinity term, associated with the corresponding weight.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T07:33:32.812607Z[Etc/UTC]")
public class V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm {
  public static final String SERIALIZED_NAME_LABEL_SELECTOR = "labelSelector";
  @SerializedName(SERIALIZED_NAME_LABEL_SELECTOR)
  private V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector labelSelector;

  public static final String SERIALIZED_NAME_NAMESPACE_SELECTOR = "namespaceSelector";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_SELECTOR)
  private V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermNamespaceSelector namespaceSelector;

  public static final String SERIALIZED_NAME_NAMESPACES = "namespaces";
  @SerializedName(SERIALIZED_NAME_NAMESPACES)
  private List<String> namespaces;

  public static final String SERIALIZED_NAME_TOPOLOGY_KEY = "topologyKey";
  @SerializedName(SERIALIZED_NAME_TOPOLOGY_KEY)
  private String topologyKey;

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm() {
  }

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm labelSelector(V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector labelSelector) {
    
    this.labelSelector = labelSelector;
    return this;
  }

   /**
   * Get labelSelector
   * @return labelSelector
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector getLabelSelector() {
    return labelSelector;
  }


  public void setLabelSelector(V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector labelSelector) {
    this.labelSelector = labelSelector;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm namespaceSelector(V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermNamespaceSelector namespaceSelector) {
    
    this.namespaceSelector = namespaceSelector;
    return this;
  }

   /**
   * Get namespaceSelector
   * @return namespaceSelector
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermNamespaceSelector getNamespaceSelector() {
    return namespaceSelector;
  }


  public void setNamespaceSelector(V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermNamespaceSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm namespaces(List<String> namespaces) {
    
    this.namespaces = namespaces;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm addNamespacesItem(String namespacesItem) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList<>();
    }
    this.namespaces.add(namespacesItem);
    return this;
  }

   /**
   * namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means \&quot;this pod&#39;s namespace\&quot;.
   * @return namespaces
  **/
  @jakarta.annotation.Nullable
  public List<String> getNamespaces() {
    return namespaces;
  }


  public void setNamespaces(List<String> namespaces) {
    this.namespaces = namespaces;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm topologyKey(String topologyKey) {
    
    this.topologyKey = topologyKey;
    return this;
  }

   /**
   * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
   * @return topologyKey
  **/
  @jakarta.annotation.Nonnull
  public String getTopologyKey() {
    return topologyKey;
  }


  public void setTopologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm v1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm = (V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm) o;
    return Objects.equals(this.labelSelector, v1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm.labelSelector) &&
        Objects.equals(this.namespaceSelector, v1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm.namespaceSelector) &&
        Objects.equals(this.namespaces, v1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm.namespaces) &&
        Objects.equals(this.topologyKey, v1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm.topologyKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelSelector, namespaceSelector, namespaces, topologyKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm {\n");
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    namespaceSelector: ").append(toIndentedString(namespaceSelector)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    topologyKey: ").append(toIndentedString(topologyKey)).append("\n");
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
    openapiFields.add("labelSelector");
    openapiFields.add("namespaceSelector");
    openapiFields.add("namespaces");
    openapiFields.add("topologyKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("topologyKey");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm is not found in the empty JSON string", V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `labelSelector`
      if (jsonObj.get("labelSelector") != null && !jsonObj.get("labelSelector").isJsonNull()) {
        V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector.validateJsonObject(jsonObj.getAsJsonObject("labelSelector"));
      }
      // validate the optional field `namespaceSelector`
      if (jsonObj.get("namespaceSelector") != null && !jsonObj.get("namespaceSelector").isJsonNull()) {
        V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermNamespaceSelector.validateJsonObject(jsonObj.getAsJsonObject("namespaceSelector"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("namespaces") != null && !jsonObj.get("namespaces").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespaces` to be an array in the JSON string but got `%s`", jsonObj.get("namespaces").toString()));
      }
      if (!jsonObj.get("topologyKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `topologyKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("topologyKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm
  */
  public static V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTerm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

