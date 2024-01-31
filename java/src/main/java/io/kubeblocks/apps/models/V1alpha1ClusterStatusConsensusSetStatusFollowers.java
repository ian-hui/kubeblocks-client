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
 * V1alpha1ClusterStatusConsensusSetStatusFollowers
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T07:24:37.743Z[Etc/UTC]")
public class V1alpha1ClusterStatusConsensusSetStatusFollowers {
  /**
   * accessMode defines what service this pod provides.
   */
  @JsonAdapter(AccessModeEnum.Adapter.class)
  public enum AccessModeEnum {
    NONE("None"),
    
    READONLY("Readonly"),
    
    READWRITE("ReadWrite");

    private String value;

    AccessModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessModeEnum fromValue(String value) {
      for (AccessModeEnum b : AccessModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccessModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccessModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCESS_MODE = "accessMode";
  @SerializedName(SERIALIZED_NAME_ACCESS_MODE)
  private AccessModeEnum accessMode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_POD = "pod";
  @SerializedName(SERIALIZED_NAME_POD)
  private String pod;


  public V1alpha1ClusterStatusConsensusSetStatusFollowers accessMode(AccessModeEnum accessMode) {
    
    this.accessMode = accessMode;
    return this;
  }

   /**
   * accessMode defines what service this pod provides.
   * @return accessMode
  **/
  @ApiModelProperty(required = true, value = "accessMode defines what service this pod provides.")

  public AccessModeEnum getAccessMode() {
    return accessMode;
  }


  public void setAccessMode(AccessModeEnum accessMode) {
    this.accessMode = accessMode;
  }


  public V1alpha1ClusterStatusConsensusSetStatusFollowers name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Defines the role name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Defines the role name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1ClusterStatusConsensusSetStatusFollowers pod(String pod) {
    
    this.pod = pod;
    return this;
  }

   /**
   * Pod name.
   * @return pod
  **/
  @ApiModelProperty(required = true, value = "Pod name.")

  public String getPod() {
    return pod;
  }


  public void setPod(String pod) {
    this.pod = pod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterStatusConsensusSetStatusFollowers v1alpha1ClusterStatusConsensusSetStatusFollowers = (V1alpha1ClusterStatusConsensusSetStatusFollowers) o;
    return Objects.equals(this.accessMode, v1alpha1ClusterStatusConsensusSetStatusFollowers.accessMode) &&
        Objects.equals(this.name, v1alpha1ClusterStatusConsensusSetStatusFollowers.name) &&
        Objects.equals(this.pod, v1alpha1ClusterStatusConsensusSetStatusFollowers.pod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessMode, name, pod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterStatusConsensusSetStatusFollowers {\n");
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pod: ").append(toIndentedString(pod)).append("\n");
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

