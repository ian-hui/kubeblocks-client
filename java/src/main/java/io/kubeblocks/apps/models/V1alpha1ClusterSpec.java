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
import io.kubeblocks.apps.models.V1alpha1ClusterSpecAffinity;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecBackup;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInner;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecNetwork;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecResources;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecShardingSpecsInner;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecStorage;
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
 * ClusterSpec defines the desired state of Cluster.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T07:33:32.812607Z[Etc/UTC]")
public class V1alpha1ClusterSpec {
  public static final String SERIALIZED_NAME_AFFINITY = "affinity";
  @SerializedName(SERIALIZED_NAME_AFFINITY)
  private V1alpha1ClusterSpecAffinity affinity;

  /**
   * Describes the availability policy, including zone, node, and none.   Deprecated since v0.9. This field is maintained for backward compatibility and its use is discouraged. Existing usage should be updated to the current preferred approach to avoid compatibility issues in future releases.
   */
  @JsonAdapter(AvailabilityPolicyEnum.Adapter.class)
  public enum AvailabilityPolicyEnum {
    ZONE("zone"),
    
    NODE("node"),
    
    NONE("none");

    private String value;

    AvailabilityPolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AvailabilityPolicyEnum fromValue(String value) {
      for (AvailabilityPolicyEnum b : AvailabilityPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AvailabilityPolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AvailabilityPolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AvailabilityPolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AvailabilityPolicyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AVAILABILITY_POLICY = "availabilityPolicy";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_POLICY)
  private AvailabilityPolicyEnum availabilityPolicy;

  public static final String SERIALIZED_NAME_BACKUP = "backup";
  @SerializedName(SERIALIZED_NAME_BACKUP)
  private V1alpha1ClusterSpecBackup backup;

  public static final String SERIALIZED_NAME_CLUSTER_DEFINITION_REF = "clusterDefinitionRef";
  @SerializedName(SERIALIZED_NAME_CLUSTER_DEFINITION_REF)
  private String clusterDefinitionRef;

  public static final String SERIALIZED_NAME_CLUSTER_VERSION_REF = "clusterVersionRef";
  @SerializedName(SERIALIZED_NAME_CLUSTER_VERSION_REF)
  private String clusterVersionRef;

  public static final String SERIALIZED_NAME_COMPONENT_SPECS = "componentSpecs";
  @SerializedName(SERIALIZED_NAME_COMPONENT_SPECS)
  private List<V1alpha1ClusterSpecComponentSpecsInner> componentSpecs;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private V1alpha1ClusterSpecNetwork network;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1alpha1ClusterSpecResources resources;

  public static final String SERIALIZED_NAME_RUNTIME_CLASS_NAME = "runtimeClassName";
  @SerializedName(SERIALIZED_NAME_RUNTIME_CLASS_NAME)
  private String runtimeClassName;

  public static final String SERIALIZED_NAME_SERVICES = "services";
  @SerializedName(SERIALIZED_NAME_SERVICES)
  private Object services;

  public static final String SERIALIZED_NAME_SHARDING_SPECS = "shardingSpecs";
  @SerializedName(SERIALIZED_NAME_SHARDING_SPECS)
  private List<V1alpha1ClusterSpecShardingSpecsInner> shardingSpecs;

  public static final String SERIALIZED_NAME_STORAGE = "storage";
  @SerializedName(SERIALIZED_NAME_STORAGE)
  private V1alpha1ClusterSpecStorage storage;

  /**
   * Describes how Pods are distributed across node.   Deprecated since v0.9. This field is maintained for backward compatibility and its use is discouraged. Existing usage should be updated to the current preferred approach to avoid compatibility issues in future releases.
   */
  @JsonAdapter(TenancyEnum.Adapter.class)
  public enum TenancyEnum {
    SHAREDNODE("SharedNode"),
    
    DEDICATEDNODE("DedicatedNode");

    private String value;

    TenancyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TenancyEnum fromValue(String value) {
      for (TenancyEnum b : TenancyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TenancyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TenancyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TenancyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TenancyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TENANCY = "tenancy";
  @SerializedName(SERIALIZED_NAME_TENANCY)
  private TenancyEnum tenancy;

  /**
   * Specifies the behavior when a Cluster is deleted. It defines how resources, data, and backups associated with a Cluster are managed during termination. Choose a policy based on the desired level of resource cleanup and data preservation:   - &#x60;DoNotTerminate&#x60;: Prevents deletion of the Cluster. This policy ensures that all resources remain intact. - &#x60;Halt&#x60;: Deletes Cluster resources like Pods and Services but retains Persistent Volume Claims (PVCs), allowing for data preservation while stopping other operations. - &#x60;Delete&#x60;: Extends the &#x60;Halt&#x60; policy by also removing PVCs, leading to a thorough cleanup while removing all persistent data. - &#x60;WipeOut&#x60;: An aggressive policy that deletes all Cluster resources, including volume snapshots and backups in external storage. This results in complete data removal and should be used cautiously, primarily in non-production environments to avoid irreversible data loss.   Warning: Choosing an inappropriate termination policy can result in data loss. The &#x60;WipeOut&#x60; policy is particularly risky in production environments due to its irreversible nature.
   */
  @JsonAdapter(TerminationPolicyEnum.Adapter.class)
  public enum TerminationPolicyEnum {
    DONOTTERMINATE("DoNotTerminate"),
    
    HALT("Halt"),
    
    DELETE("Delete"),
    
    WIPEOUT("WipeOut");

    private String value;

    TerminationPolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TerminationPolicyEnum fromValue(String value) {
      for (TerminationPolicyEnum b : TerminationPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TerminationPolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TerminationPolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TerminationPolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TerminationPolicyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TERMINATION_POLICY = "terminationPolicy";
  @SerializedName(SERIALIZED_NAME_TERMINATION_POLICY)
  private TerminationPolicyEnum terminationPolicy;

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";
  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  private Object tolerations;

  public static final String SERIALIZED_NAME_TOPOLOGY = "topology";
  @SerializedName(SERIALIZED_NAME_TOPOLOGY)
  private String topology;

  public V1alpha1ClusterSpec() {
  }

  public V1alpha1ClusterSpec affinity(V1alpha1ClusterSpecAffinity affinity) {
    
    this.affinity = affinity;
    return this;
  }

   /**
   * Get affinity
   * @return affinity
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterSpecAffinity getAffinity() {
    return affinity;
  }


  public void setAffinity(V1alpha1ClusterSpecAffinity affinity) {
    this.affinity = affinity;
  }


  public V1alpha1ClusterSpec availabilityPolicy(AvailabilityPolicyEnum availabilityPolicy) {
    
    this.availabilityPolicy = availabilityPolicy;
    return this;
  }

   /**
   * Describes the availability policy, including zone, node, and none.   Deprecated since v0.9. This field is maintained for backward compatibility and its use is discouraged. Existing usage should be updated to the current preferred approach to avoid compatibility issues in future releases.
   * @return availabilityPolicy
  **/
  @jakarta.annotation.Nullable
  public AvailabilityPolicyEnum getAvailabilityPolicy() {
    return availabilityPolicy;
  }


  public void setAvailabilityPolicy(AvailabilityPolicyEnum availabilityPolicy) {
    this.availabilityPolicy = availabilityPolicy;
  }


  public V1alpha1ClusterSpec backup(V1alpha1ClusterSpecBackup backup) {
    
    this.backup = backup;
    return this;
  }

   /**
   * Get backup
   * @return backup
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterSpecBackup getBackup() {
    return backup;
  }


  public void setBackup(V1alpha1ClusterSpecBackup backup) {
    this.backup = backup;
  }


  public V1alpha1ClusterSpec clusterDefinitionRef(String clusterDefinitionRef) {
    
    this.clusterDefinitionRef = clusterDefinitionRef;
    return this;
  }

   /**
   * Specifies the name of the ClusterDefinition to use when creating a Cluster.   This field enables users to create a Cluster based on a specific ClusterDefinition. Which, in conjunction with the &#x60;topology&#x60; field, determine:   - The Components to be included in the Cluster. - The sequences in which the Components are created, updated, and terminate.   This facilitates multiple-components management with predefined ClusterDefinition.   Users with advanced requirements can bypass this general setting and specify more precise control over the composition of the Cluster by directly referencing specific ComponentDefinitions for each component within &#x60;componentSpecs[*].componentDef&#x60;.   If this field is not provided, each component must be explicitly defined in &#x60;componentSpecs[*].componentDef&#x60;.   Note: Once set, this field cannot be modified; it is immutable.
   * @return clusterDefinitionRef
  **/
  @jakarta.annotation.Nullable
  public String getClusterDefinitionRef() {
    return clusterDefinitionRef;
  }


  public void setClusterDefinitionRef(String clusterDefinitionRef) {
    this.clusterDefinitionRef = clusterDefinitionRef;
  }


  public V1alpha1ClusterSpec clusterVersionRef(String clusterVersionRef) {
    
    this.clusterVersionRef = clusterVersionRef;
    return this;
  }

   /**
   * Refers to the ClusterVersion name.   Deprecated since v0.9, use ComponentVersion instead. This field is maintained for backward compatibility and its use is discouraged. Existing usage should be updated to the current preferred approach to avoid compatibility issues in future releases.
   * @return clusterVersionRef
  **/
  @jakarta.annotation.Nullable
  public String getClusterVersionRef() {
    return clusterVersionRef;
  }


  public void setClusterVersionRef(String clusterVersionRef) {
    this.clusterVersionRef = clusterVersionRef;
  }


  public V1alpha1ClusterSpec componentSpecs(List<V1alpha1ClusterSpecComponentSpecsInner> componentSpecs) {
    
    this.componentSpecs = componentSpecs;
    return this;
  }

  public V1alpha1ClusterSpec addComponentSpecsItem(V1alpha1ClusterSpecComponentSpecsInner componentSpecsItem) {
    if (this.componentSpecs == null) {
      this.componentSpecs = new ArrayList<>();
    }
    this.componentSpecs.add(componentSpecsItem);
    return this;
  }

   /**
   * Specifies a list of ClusterComponentSpec objects used to define the individual Components that make up a Cluster. This field allows for detailed configuration of each Component within the Cluster.   Note: &#x60;shardingSpecs&#x60; and &#x60;componentSpecs&#x60; cannot both be empty; at least one must be defined to configure a Cluster.
   * @return componentSpecs
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ClusterSpecComponentSpecsInner> getComponentSpecs() {
    return componentSpecs;
  }


  public void setComponentSpecs(List<V1alpha1ClusterSpecComponentSpecsInner> componentSpecs) {
    this.componentSpecs = componentSpecs;
  }


  public V1alpha1ClusterSpec network(V1alpha1ClusterSpecNetwork network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterSpecNetwork getNetwork() {
    return network;
  }


  public void setNetwork(V1alpha1ClusterSpecNetwork network) {
    this.network = network;
  }


  public V1alpha1ClusterSpec replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * Specifies the replicas of the first componentSpec, if the replicas of the first componentSpec is specified, this value will be ignored.   Deprecated since v0.9. This field is maintained for backward compatibility and its use is discouraged. Existing usage should be updated to the current preferred approach to avoid compatibility issues in future releases.
   * @return replicas
  **/
  @jakarta.annotation.Nullable
  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  public V1alpha1ClusterSpec resources(V1alpha1ClusterSpecResources resources) {
    
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterSpecResources getResources() {
    return resources;
  }


  public void setResources(V1alpha1ClusterSpecResources resources) {
    this.resources = resources;
  }


  public V1alpha1ClusterSpec runtimeClassName(String runtimeClassName) {
    
    this.runtimeClassName = runtimeClassName;
    return this;
  }

   /**
   * Specifies runtimeClassName for all Pods managed by this Cluster.
   * @return runtimeClassName
  **/
  @jakarta.annotation.Nullable
  public String getRuntimeClassName() {
    return runtimeClassName;
  }


  public void setRuntimeClassName(String runtimeClassName) {
    this.runtimeClassName = runtimeClassName;
  }


  public V1alpha1ClusterSpec services(Object services) {
    
    this.services = services;
    return this;
  }

   /**
   * Defines a list of additional Services that are exposed by a Cluster. This field allows Services of selected Components, either from &#x60;componentSpecs&#x60; or &#x60;shardingSpecs&#x60; to be exposed, alongside Services defined with ComponentService.   Services defined here can be referenced by other clusters using the ServiceRefClusterSelector.
   * @return services
  **/
  @jakarta.annotation.Nullable
  public Object getServices() {
    return services;
  }


  public void setServices(Object services) {
    this.services = services;
  }


  public V1alpha1ClusterSpec shardingSpecs(List<V1alpha1ClusterSpecShardingSpecsInner> shardingSpecs) {
    
    this.shardingSpecs = shardingSpecs;
    return this;
  }

  public V1alpha1ClusterSpec addShardingSpecsItem(V1alpha1ClusterSpecShardingSpecsInner shardingSpecsItem) {
    if (this.shardingSpecs == null) {
      this.shardingSpecs = new ArrayList<>();
    }
    this.shardingSpecs.add(shardingSpecsItem);
    return this;
  }

   /**
   * Specifies a list of ShardingSpec objects that manage the sharding topology for Cluster Components. Each ShardingSpec organizes components into shards, with each shard corresponding to a Component. Components within a shard are all based on a common ClusterComponentSpec template, ensuring uniform configurations.   This field supports dynamic resharding by facilitating the addition or removal of shards through the &#x60;shards&#x60; field in ShardingSpec.   Note: &#x60;shardingSpecs&#x60; and &#x60;componentSpecs&#x60; cannot both be empty; at least one must be defined to configure a Cluster.
   * @return shardingSpecs
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ClusterSpecShardingSpecsInner> getShardingSpecs() {
    return shardingSpecs;
  }


  public void setShardingSpecs(List<V1alpha1ClusterSpecShardingSpecsInner> shardingSpecs) {
    this.shardingSpecs = shardingSpecs;
  }


  public V1alpha1ClusterSpec storage(V1alpha1ClusterSpecStorage storage) {
    
    this.storage = storage;
    return this;
  }

   /**
   * Get storage
   * @return storage
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterSpecStorage getStorage() {
    return storage;
  }


  public void setStorage(V1alpha1ClusterSpecStorage storage) {
    this.storage = storage;
  }


  public V1alpha1ClusterSpec tenancy(TenancyEnum tenancy) {
    
    this.tenancy = tenancy;
    return this;
  }

   /**
   * Describes how Pods are distributed across node.   Deprecated since v0.9. This field is maintained for backward compatibility and its use is discouraged. Existing usage should be updated to the current preferred approach to avoid compatibility issues in future releases.
   * @return tenancy
  **/
  @jakarta.annotation.Nullable
  public TenancyEnum getTenancy() {
    return tenancy;
  }


  public void setTenancy(TenancyEnum tenancy) {
    this.tenancy = tenancy;
  }


  public V1alpha1ClusterSpec terminationPolicy(TerminationPolicyEnum terminationPolicy) {
    
    this.terminationPolicy = terminationPolicy;
    return this;
  }

   /**
   * Specifies the behavior when a Cluster is deleted. It defines how resources, data, and backups associated with a Cluster are managed during termination. Choose a policy based on the desired level of resource cleanup and data preservation:   - &#x60;DoNotTerminate&#x60;: Prevents deletion of the Cluster. This policy ensures that all resources remain intact. - &#x60;Halt&#x60;: Deletes Cluster resources like Pods and Services but retains Persistent Volume Claims (PVCs), allowing for data preservation while stopping other operations. - &#x60;Delete&#x60;: Extends the &#x60;Halt&#x60; policy by also removing PVCs, leading to a thorough cleanup while removing all persistent data. - &#x60;WipeOut&#x60;: An aggressive policy that deletes all Cluster resources, including volume snapshots and backups in external storage. This results in complete data removal and should be used cautiously, primarily in non-production environments to avoid irreversible data loss.   Warning: Choosing an inappropriate termination policy can result in data loss. The &#x60;WipeOut&#x60; policy is particularly risky in production environments due to its irreversible nature.
   * @return terminationPolicy
  **/
  @jakarta.annotation.Nonnull
  public TerminationPolicyEnum getTerminationPolicy() {
    return terminationPolicy;
  }


  public void setTerminationPolicy(TerminationPolicyEnum terminationPolicy) {
    this.terminationPolicy = terminationPolicy;
  }


  public V1alpha1ClusterSpec tolerations(Object tolerations) {
    
    this.tolerations = tolerations;
    return this;
  }

   /**
   * An array that specifies tolerations attached to the Cluster&#39;s Pods, allowing them to be scheduled onto nodes with matching taints.
   * @return tolerations
  **/
  @jakarta.annotation.Nullable
  public Object getTolerations() {
    return tolerations;
  }


  public void setTolerations(Object tolerations) {
    this.tolerations = tolerations;
  }


  public V1alpha1ClusterSpec topology(String topology) {
    
    this.topology = topology;
    return this;
  }

   /**
   * Specifies the name of the ClusterTopology to be used when creating the Cluster.   This field defines which set of Components, as outlined in the ClusterDefinition, will be used to construct the Cluster based on the named topology. The ClusterDefinition may list multiple topologies under &#x60;clusterdefinition.spec.topologies[*]&#x60;, each tailored to different use cases or environments.   If &#x60;topology&#x60; is not specified, the Cluster will use the default topology defined in the ClusterDefinition.   Note: Once set during the Cluster creation, the &#x60;topology&#x60; field cannot be modified. It establishes the initial composition and structure of the Cluster and is intended for one-time configuration.
   * @return topology
  **/
  @jakarta.annotation.Nullable
  public String getTopology() {
    return topology;
  }


  public void setTopology(String topology) {
    this.topology = topology;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterSpec v1alpha1ClusterSpec = (V1alpha1ClusterSpec) o;
    return Objects.equals(this.affinity, v1alpha1ClusterSpec.affinity) &&
        Objects.equals(this.availabilityPolicy, v1alpha1ClusterSpec.availabilityPolicy) &&
        Objects.equals(this.backup, v1alpha1ClusterSpec.backup) &&
        Objects.equals(this.clusterDefinitionRef, v1alpha1ClusterSpec.clusterDefinitionRef) &&
        Objects.equals(this.clusterVersionRef, v1alpha1ClusterSpec.clusterVersionRef) &&
        Objects.equals(this.componentSpecs, v1alpha1ClusterSpec.componentSpecs) &&
        Objects.equals(this.network, v1alpha1ClusterSpec.network) &&
        Objects.equals(this.replicas, v1alpha1ClusterSpec.replicas) &&
        Objects.equals(this.resources, v1alpha1ClusterSpec.resources) &&
        Objects.equals(this.runtimeClassName, v1alpha1ClusterSpec.runtimeClassName) &&
        Objects.equals(this.services, v1alpha1ClusterSpec.services) &&
        Objects.equals(this.shardingSpecs, v1alpha1ClusterSpec.shardingSpecs) &&
        Objects.equals(this.storage, v1alpha1ClusterSpec.storage) &&
        Objects.equals(this.tenancy, v1alpha1ClusterSpec.tenancy) &&
        Objects.equals(this.terminationPolicy, v1alpha1ClusterSpec.terminationPolicy) &&
        Objects.equals(this.tolerations, v1alpha1ClusterSpec.tolerations) &&
        Objects.equals(this.topology, v1alpha1ClusterSpec.topology);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affinity, availabilityPolicy, backup, clusterDefinitionRef, clusterVersionRef, componentSpecs, network, replicas, resources, runtimeClassName, services, shardingSpecs, storage, tenancy, terminationPolicy, tolerations, topology);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterSpec {\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    availabilityPolicy: ").append(toIndentedString(availabilityPolicy)).append("\n");
    sb.append("    backup: ").append(toIndentedString(backup)).append("\n");
    sb.append("    clusterDefinitionRef: ").append(toIndentedString(clusterDefinitionRef)).append("\n");
    sb.append("    clusterVersionRef: ").append(toIndentedString(clusterVersionRef)).append("\n");
    sb.append("    componentSpecs: ").append(toIndentedString(componentSpecs)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    runtimeClassName: ").append(toIndentedString(runtimeClassName)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    shardingSpecs: ").append(toIndentedString(shardingSpecs)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    tenancy: ").append(toIndentedString(tenancy)).append("\n");
    sb.append("    terminationPolicy: ").append(toIndentedString(terminationPolicy)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
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
    openapiFields.add("affinity");
    openapiFields.add("availabilityPolicy");
    openapiFields.add("backup");
    openapiFields.add("clusterDefinitionRef");
    openapiFields.add("clusterVersionRef");
    openapiFields.add("componentSpecs");
    openapiFields.add("network");
    openapiFields.add("replicas");
    openapiFields.add("resources");
    openapiFields.add("runtimeClassName");
    openapiFields.add("services");
    openapiFields.add("shardingSpecs");
    openapiFields.add("storage");
    openapiFields.add("tenancy");
    openapiFields.add("terminationPolicy");
    openapiFields.add("tolerations");
    openapiFields.add("topology");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("terminationPolicy");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterSpec is not found in the empty JSON string", V1alpha1ClusterSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ClusterSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `affinity`
      if (jsonObj.get("affinity") != null && !jsonObj.get("affinity").isJsonNull()) {
        V1alpha1ClusterSpecAffinity.validateJsonObject(jsonObj.getAsJsonObject("affinity"));
      }
      if ((jsonObj.get("availabilityPolicy") != null && !jsonObj.get("availabilityPolicy").isJsonNull()) && !jsonObj.get("availabilityPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `availabilityPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("availabilityPolicy").toString()));
      }
      // validate the optional field `backup`
      if (jsonObj.get("backup") != null && !jsonObj.get("backup").isJsonNull()) {
        V1alpha1ClusterSpecBackup.validateJsonObject(jsonObj.getAsJsonObject("backup"));
      }
      if ((jsonObj.get("clusterDefinitionRef") != null && !jsonObj.get("clusterDefinitionRef").isJsonNull()) && !jsonObj.get("clusterDefinitionRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clusterDefinitionRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clusterDefinitionRef").toString()));
      }
      if ((jsonObj.get("clusterVersionRef") != null && !jsonObj.get("clusterVersionRef").isJsonNull()) && !jsonObj.get("clusterVersionRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clusterVersionRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clusterVersionRef").toString()));
      }
      if (jsonObj.get("componentSpecs") != null && !jsonObj.get("componentSpecs").isJsonNull()) {
        JsonArray jsonArraycomponentSpecs = jsonObj.getAsJsonArray("componentSpecs");
        if (jsonArraycomponentSpecs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("componentSpecs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `componentSpecs` to be an array in the JSON string but got `%s`", jsonObj.get("componentSpecs").toString()));
          }

          // validate the optional field `componentSpecs` (array)
          for (int i = 0; i < jsonArraycomponentSpecs.size(); i++) {
            V1alpha1ClusterSpecComponentSpecsInner.validateJsonObject(jsonArraycomponentSpecs.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `network`
      if (jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull()) {
        V1alpha1ClusterSpecNetwork.validateJsonObject(jsonObj.getAsJsonObject("network"));
      }
      // validate the optional field `resources`
      if (jsonObj.get("resources") != null && !jsonObj.get("resources").isJsonNull()) {
        V1alpha1ClusterSpecResources.validateJsonObject(jsonObj.getAsJsonObject("resources"));
      }
      if ((jsonObj.get("runtimeClassName") != null && !jsonObj.get("runtimeClassName").isJsonNull()) && !jsonObj.get("runtimeClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runtimeClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runtimeClassName").toString()));
      }
      if (jsonObj.get("shardingSpecs") != null && !jsonObj.get("shardingSpecs").isJsonNull()) {
        JsonArray jsonArrayshardingSpecs = jsonObj.getAsJsonArray("shardingSpecs");
        if (jsonArrayshardingSpecs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("shardingSpecs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `shardingSpecs` to be an array in the JSON string but got `%s`", jsonObj.get("shardingSpecs").toString()));
          }

          // validate the optional field `shardingSpecs` (array)
          for (int i = 0; i < jsonArrayshardingSpecs.size(); i++) {
            V1alpha1ClusterSpecShardingSpecsInner.validateJsonObject(jsonArrayshardingSpecs.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `storage`
      if (jsonObj.get("storage") != null && !jsonObj.get("storage").isJsonNull()) {
        V1alpha1ClusterSpecStorage.validateJsonObject(jsonObj.getAsJsonObject("storage"));
      }
      if ((jsonObj.get("tenancy") != null && !jsonObj.get("tenancy").isJsonNull()) && !jsonObj.get("tenancy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenancy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenancy").toString()));
      }
      if (!jsonObj.get("terminationPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminationPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminationPolicy").toString()));
      }
      if ((jsonObj.get("topology") != null && !jsonObj.get("topology").isJsonNull()) && !jsonObj.get("topology").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `topology` to be a primitive type in the JSON string but got `%s`", jsonObj.get("topology").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterSpec
  */
  public static V1alpha1ClusterSpec fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterSpec.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

