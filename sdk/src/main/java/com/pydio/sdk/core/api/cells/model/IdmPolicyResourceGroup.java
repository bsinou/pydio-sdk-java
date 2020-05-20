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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Gets or Sets idmPolicyResourceGroup
 */
@JsonAdapter(IdmPolicyResourceGroup.Adapter.class)
public enum IdmPolicyResourceGroup {

    REST("rest"),

    ACL("acl"),

    OIDC("oidc");

    private String value;

    IdmPolicyResourceGroup(String value) {
        this.value = value;
    }

    public static IdmPolicyResourceGroup fromValue(String text) {
        for (IdmPolicyResourceGroup b : IdmPolicyResourceGroup.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static class Adapter extends TypeAdapter<IdmPolicyResourceGroup> {
        @Override
        public void write(final JsonWriter jsonWriter, final IdmPolicyResourceGroup enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public IdmPolicyResourceGroup read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return IdmPolicyResourceGroup.fromValue(String.valueOf(value));
        }
    }
}

