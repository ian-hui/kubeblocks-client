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
import io.kubeblocks.apps.models.V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecMembershipReconfiguration;
import io.kubeblocks.apps.models.V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe;
import io.kubeblocks.apps.models.V1alpha1ClusterStatusComponentsValueMembersStatusInnerRole;
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
 * RSMSpec defines workload related spec of this component. start from KB 0.7.0, RSM(ReplicatedStateMachineSpec) will be the underlying CR which powers all kinds of workload in KB. RSM is an enhanced stateful workload extension dedicated for heavy-state workloads like databases.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec {
  /**
   * MemberUpdateStrategy, Members(Pods) update strategy. serial: update Members one by one that guarantee minimum component unavailable time. Learner -&gt; Follower(with AccessMode&#x3D;none) -&gt; Follower(with AccessMode&#x3D;readonly) -&gt; Follower(with AccessMode&#x3D;readWrite) -&gt; Leader bestEffortParallel: update Members in parallel that guarantee minimum component un-writable time. Learner, Follower(minority) in parallel -&gt; Follower(majority) -&gt; Leader, keep majority online all the time. parallel: force parallel
   */
  @JsonAdapter(MemberUpdateStrategyEnum.Adapter.class)
  public enum MemberUpdateStrategyEnum {
    SERIAL("Serial"),
    
    BESTEFFORTPARALLEL("BestEffortParallel"),
    
    PARALLEL("Parallel");

    private String value;

    MemberUpdateStrategyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MemberUpdateStrategyEnum fromValue(String value) {
      for (MemberUpdateStrategyEnum b : MemberUpdateStrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MemberUpdateStrategyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MemberUpdateStrategyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MemberUpdateStrategyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MemberUpdateStrategyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MEMBER_UPDATE_STRATEGY = "memberUpdateStrategy";
  @SerializedName(SERIALIZED_NAME_MEMBER_UPDATE_STRATEGY)
  private MemberUpdateStrategyEnum memberUpdateStrategy;

  public static final String SERIALIZED_NAME_MEMBERSHIP_RECONFIGURATION = "membershipReconfiguration";
  @SerializedName(SERIALIZED_NAME_MEMBERSHIP_RECONFIGURATION)
  private V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecMembershipReconfiguration membershipReconfiguration;

  public static final String SERIALIZED_NAME_ROLE_PROBE = "roleProbe";
  @SerializedName(SERIALIZED_NAME_ROLE_PROBE)
  private V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe roleProbe;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<V1alpha1ClusterStatusComponentsValueMembersStatusInnerRole> roles;

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec() {
  }

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec memberUpdateStrategy(MemberUpdateStrategyEnum memberUpdateStrategy) {
    
    this.memberUpdateStrategy = memberUpdateStrategy;
    return this;
  }

   /**
   * MemberUpdateStrategy, Members(Pods) update strategy. serial: update Members one by one that guarantee minimum component unavailable time. Learner -&gt; Follower(with AccessMode&#x3D;none) -&gt; Follower(with AccessMode&#x3D;readonly) -&gt; Follower(with AccessMode&#x3D;readWrite) -&gt; Leader bestEffortParallel: update Members in parallel that guarantee minimum component un-writable time. Learner, Follower(minority) in parallel -&gt; Follower(majority) -&gt; Leader, keep majority online all the time. parallel: force parallel
   * @return memberUpdateStrategy
  **/
  @jakarta.annotation.Nullable
  public MemberUpdateStrategyEnum getMemberUpdateStrategy() {
    return memberUpdateStrategy;
  }


  public void setMemberUpdateStrategy(MemberUpdateStrategyEnum memberUpdateStrategy) {
    this.memberUpdateStrategy = memberUpdateStrategy;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec membershipReconfiguration(V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecMembershipReconfiguration membershipReconfiguration) {
    
    this.membershipReconfiguration = membershipReconfiguration;
    return this;
  }

   /**
   * Get membershipReconfiguration
   * @return membershipReconfiguration
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecMembershipReconfiguration getMembershipReconfiguration() {
    return membershipReconfiguration;
  }


  public void setMembershipReconfiguration(V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecMembershipReconfiguration membershipReconfiguration) {
    this.membershipReconfiguration = membershipReconfiguration;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec roleProbe(V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe roleProbe) {
    
    this.roleProbe = roleProbe;
    return this;
  }

   /**
   * Get roleProbe
   * @return roleProbe
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe getRoleProbe() {
    return roleProbe;
  }


  public void setRoleProbe(V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe roleProbe) {
    this.roleProbe = roleProbe;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec roles(List<V1alpha1ClusterStatusComponentsValueMembersStatusInnerRole> roles) {
    
    this.roles = roles;
    return this;
  }

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec addRolesItem(V1alpha1ClusterStatusComponentsValueMembersStatusInnerRole rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Roles, a list of roles defined in the system.
   * @return roles
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ClusterStatusComponentsValueMembersStatusInnerRole> getRoles() {
    return roles;
  }


  public void setRoles(List<V1alpha1ClusterStatusComponentsValueMembersStatusInnerRole> roles) {
    this.roles = roles;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec v1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec = (V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec) o;
    return Objects.equals(this.memberUpdateStrategy, v1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec.memberUpdateStrategy) &&
        Objects.equals(this.membershipReconfiguration, v1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec.membershipReconfiguration) &&
        Objects.equals(this.roleProbe, v1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec.roleProbe) &&
        Objects.equals(this.roles, v1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberUpdateStrategy, membershipReconfiguration, roleProbe, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec {\n");
    sb.append("    memberUpdateStrategy: ").append(toIndentedString(memberUpdateStrategy)).append("\n");
    sb.append("    membershipReconfiguration: ").append(toIndentedString(membershipReconfiguration)).append("\n");
    sb.append("    roleProbe: ").append(toIndentedString(roleProbe)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
    openapiFields.add("memberUpdateStrategy");
    openapiFields.add("membershipReconfiguration");
    openapiFields.add("roleProbe");
    openapiFields.add("roles");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec is not found in the empty JSON string", V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("memberUpdateStrategy") != null && !jsonObj.get("memberUpdateStrategy").isJsonNull()) && !jsonObj.get("memberUpdateStrategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memberUpdateStrategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memberUpdateStrategy").toString()));
      }
      // validate the optional field `membershipReconfiguration`
      if (jsonObj.get("membershipReconfiguration") != null && !jsonObj.get("membershipReconfiguration").isJsonNull()) {
        V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecMembershipReconfiguration.validateJsonObject(jsonObj.getAsJsonObject("membershipReconfiguration"));
      }
      // validate the optional field `roleProbe`
      if (jsonObj.get("roleProbe") != null && !jsonObj.get("roleProbe").isJsonNull()) {
        V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe.validateJsonObject(jsonObj.getAsJsonObject("roleProbe"));
      }
      if (jsonObj.get("roles") != null && !jsonObj.get("roles").isJsonNull()) {
        JsonArray jsonArrayroles = jsonObj.getAsJsonArray("roles");
        if (jsonArrayroles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("roles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `roles` to be an array in the JSON string but got `%s`", jsonObj.get("roles").toString()));
          }

          // validate the optional field `roles` (array)
          for (int i = 0; i < jsonArrayroles.size(); i++) {
            V1alpha1ClusterStatusComponentsValueMembersStatusInnerRole.validateJsonObject(jsonArrayroles.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec
  */
  public static V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}
