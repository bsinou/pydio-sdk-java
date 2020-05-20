/*
 * Pydio Cells Rest API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.pydio.sdk.core.api.cells.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * RestControlServiceRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-30T14:51:15.861Z")
public class RestControlServiceRequest {
    @SerializedName("ServiceName")
    private String serviceName = null;

    @SerializedName("NodeName")
    private String nodeName = null;

    @SerializedName("Command")
    private CtlServiceCommand command = null;

    public RestControlServiceRequest serviceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get serviceName
     *
     * @return serviceName
     **/
    @ApiModelProperty(value = "")
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public RestControlServiceRequest nodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get nodeName
     *
     * @return nodeName
     **/
    @ApiModelProperty(value = "")
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public RestControlServiceRequest command(CtlServiceCommand command) {
        this.command = command;
        return this;
    }

    /**
     * Get command
     *
     * @return command
     **/
    @ApiModelProperty(value = "")
    public CtlServiceCommand getCommand() {
        return command;
    }

    public void setCommand(CtlServiceCommand command) {
        this.command = command;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestControlServiceRequest restControlServiceRequest = (RestControlServiceRequest) o;
        return Objects.equals(this.serviceName, restControlServiceRequest.serviceName) &&
                Objects.equals(this.nodeName, restControlServiceRequest.nodeName) &&
                Objects.equals(this.command, restControlServiceRequest.command);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceName, nodeName, command);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestControlServiceRequest {\n");

        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
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

