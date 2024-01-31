/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * resources specifies the resources of the first componentSpec, if the resources of the first componentSpec is specified, this value will be ignored.
 */
@ApiModel(description = "resources specifies the resources of the first componentSpec, if the resources of the first componentSpec is specified, this value will be ignored.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T07:24:37.743Z[Etc/UTC]")
public class V1alpha1ClusterSpecResources {
  public static final String SERIALIZED_NAME_CPU = "cpu";
  @SerializedName(SERIALIZED_NAME_CPU)
  private Object cpu;

  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private Object memory;


  public V1alpha1ClusterSpecResources cpu(Object cpu) {
    
    this.cpu = cpu;
    return this;
  }

   /**
   * cpu resource needed, more info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
   * @return cpu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "cpu resource needed, more info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/")

  public Object getCpu() {
    return cpu;
  }


  public void setCpu(Object cpu) {
    this.cpu = cpu;
  }


  public V1alpha1ClusterSpecResources memory(Object memory) {
    
    this.memory = memory;
    return this;
  }

   /**
   * memory resource needed, more info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
   * @return memory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "memory resource needed, more info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/")

  public Object getMemory() {
    return memory;
  }


  public void setMemory(Object memory) {
    this.memory = memory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterSpecResources v1alpha1ClusterSpecResources = (V1alpha1ClusterSpecResources) o;
    return Objects.equals(this.cpu, v1alpha1ClusterSpecResources.cpu) &&
        Objects.equals(this.memory, v1alpha1ClusterSpecResources.memory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpu, memory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterSpecResources {\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
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

}
