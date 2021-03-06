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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * RestDeleteNodesRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-30T14:51:15.861Z")
public class RestDeleteNodesRequest {
    @SerializedName("Nodes")
    private List<TreeNode> nodes = null;

    @SerializedName("Recursive")
    private Boolean recursive = null;

    public RestDeleteNodesRequest nodes(List<TreeNode> nodes) {
        this.nodes = nodes;
        return this;
    }

    public RestDeleteNodesRequest addNodesItem(TreeNode nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<TreeNode>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    /**
     * Get nodes
     *
     * @return nodes
     **/
    @ApiModelProperty(value = "")
    public List<TreeNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<TreeNode> nodes) {
        this.nodes = nodes;
    }

    public RestDeleteNodesRequest recursive(Boolean recursive) {
        this.recursive = recursive;
        return this;
    }

    /**
     * Get recursive
     *
     * @return recursive
     **/
    @ApiModelProperty(value = "")
    public Boolean isRecursive() {
        return recursive;
    }

    public void setRecursive(Boolean recursive) {
        this.recursive = recursive;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestDeleteNodesRequest restDeleteNodesRequest = (RestDeleteNodesRequest) o;
        return Objects.equals(this.nodes, restDeleteNodesRequest.nodes) &&
                Objects.equals(this.recursive, restDeleteNodesRequest.recursive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodes, recursive);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestDeleteNodesRequest {\n");

        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    recursive: ").append(toIndentedString(recursive)).append("\n");
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

