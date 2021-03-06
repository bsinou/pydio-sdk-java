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
 * Gets or Sets jobsTaskStatus
 */
@JsonAdapter(JobsTaskStatus.Adapter.class)
public enum JobsTaskStatus {
  
  UNKNOWN("Unknown"),
  
  IDLE("Idle"),
  
  RUNNING("Running"),
  
  FINISHED("Finished"),
  
  INTERRUPTED("Interrupted"),
  
  PAUSED("Paused"),
  
  ANY("Any"),

    ERROR("Error"),
  
  QUEUED("Queued");

  private String value;

  JobsTaskStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static JobsTaskStatus fromValue(String text) {
    for (JobsTaskStatus b : JobsTaskStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<JobsTaskStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final JobsTaskStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public JobsTaskStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return JobsTaskStatus.fromValue(String.valueOf(value));
    }
  }
}

