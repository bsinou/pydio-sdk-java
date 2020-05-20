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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * MailerMail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-30T14:51:15.861Z")
public class MailerMail {
  @SerializedName("From")
  private MailerUser from = null;

  @SerializedName("To")
  private List<MailerUser> to = null;

  @SerializedName("Cc")
  private List<MailerUser> cc = null;

  @SerializedName("DateSent")
  private String dateSent = null;

  @SerializedName("Subject")
  private String subject = null;

  @SerializedName("ContentPlain")
  private String contentPlain = null;

  @SerializedName("ContentHtml")
  private String contentHtml = null;

  @SerializedName("ContentMarkdown")
  private String contentMarkdown = null;

  @SerializedName("Attachments")
  private List<String> attachments = null;

  @SerializedName("ThreadUuid")
  private String threadUuid = null;

  @SerializedName("ThreadIndex")
  private String threadIndex = null;

  @SerializedName("TemplateId")
  private String templateId = null;

  @SerializedName("TemplateData")
  private Map<String, String> templateData = null;

  @SerializedName("Retries")
  private Integer retries = null;

  @SerializedName("sendErrors")
  private List<String> sendErrors = null;

  public MailerMail from(MailerUser from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(value = "")
  public MailerUser getFrom() {
    return from;
  }

  public void setFrom(MailerUser from) {
    this.from = from;
  }

  public MailerMail to(List<MailerUser> to) {
    this.to = to;
    return this;
  }

  public MailerMail addToItem(MailerUser toItem) {
    if (this.to == null) {
      this.to = new ArrayList<MailerUser>();
    }
    this.to.add(toItem);
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(value = "")
  public List<MailerUser> getTo() {
    return to;
  }

  public void setTo(List<MailerUser> to) {
    this.to = to;
  }

  public MailerMail cc(List<MailerUser> cc) {
    this.cc = cc;
    return this;
  }

  public MailerMail addCcItem(MailerUser ccItem) {
    if (this.cc == null) {
      this.cc = new ArrayList<MailerUser>();
    }
    this.cc.add(ccItem);
    return this;
  }

   /**
   * Get cc
   * @return cc
  **/
  @ApiModelProperty(value = "")
  public List<MailerUser> getCc() {
    return cc;
  }

  public void setCc(List<MailerUser> cc) {
    this.cc = cc;
  }

  public MailerMail dateSent(String dateSent) {
    this.dateSent = dateSent;
    return this;
  }

   /**
   * Get dateSent
   * @return dateSent
  **/
  @ApiModelProperty(value = "")
  public String getDateSent() {
    return dateSent;
  }

  public void setDateSent(String dateSent) {
    this.dateSent = dateSent;
  }

  public MailerMail subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @ApiModelProperty(value = "")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public MailerMail contentPlain(String contentPlain) {
    this.contentPlain = contentPlain;
    return this;
  }

   /**
   * Get contentPlain
   * @return contentPlain
  **/
  @ApiModelProperty(value = "")
  public String getContentPlain() {
    return contentPlain;
  }

  public void setContentPlain(String contentPlain) {
    this.contentPlain = contentPlain;
  }

  public MailerMail contentHtml(String contentHtml) {
    this.contentHtml = contentHtml;
    return this;
  }

   /**
   * Get contentHtml
   * @return contentHtml
  **/
  @ApiModelProperty(value = "")
  public String getContentHtml() {
    return contentHtml;
  }

  public void setContentHtml(String contentHtml) {
    this.contentHtml = contentHtml;
  }

  public MailerMail contentMarkdown(String contentMarkdown) {
    this.contentMarkdown = contentMarkdown;
    return this;
  }

   /**
   * Get contentMarkdown
   * @return contentMarkdown
  **/
  @ApiModelProperty(value = "")
  public String getContentMarkdown() {
    return contentMarkdown;
  }

  public void setContentMarkdown(String contentMarkdown) {
    this.contentMarkdown = contentMarkdown;
  }

  public MailerMail attachments(List<String> attachments) {
    this.attachments = attachments;
    return this;
  }

  public MailerMail addAttachmentsItem(String attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<String>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @ApiModelProperty(value = "")
  public List<String> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<String> attachments) {
    this.attachments = attachments;
  }

  public MailerMail threadUuid(String threadUuid) {
    this.threadUuid = threadUuid;
    return this;
  }

   /**
   * Get threadUuid
   * @return threadUuid
  **/
  @ApiModelProperty(value = "")
  public String getThreadUuid() {
    return threadUuid;
  }

  public void setThreadUuid(String threadUuid) {
    this.threadUuid = threadUuid;
  }

  public MailerMail threadIndex(String threadIndex) {
    this.threadIndex = threadIndex;
    return this;
  }

   /**
   * Get threadIndex
   * @return threadIndex
  **/
  @ApiModelProperty(value = "")
  public String getThreadIndex() {
    return threadIndex;
  }

  public void setThreadIndex(String threadIndex) {
    this.threadIndex = threadIndex;
  }

  public MailerMail templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @ApiModelProperty(value = "")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public MailerMail templateData(Map<String, String> templateData) {
    this.templateData = templateData;
    return this;
  }

  public MailerMail putTemplateDataItem(String key, String templateDataItem) {
    if (this.templateData == null) {
      this.templateData = new HashMap<String, String>();
    }
    this.templateData.put(key, templateDataItem);
    return this;
  }

   /**
   * Get templateData
   * @return templateData
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getTemplateData() {
    return templateData;
  }

  public void setTemplateData(Map<String, String> templateData) {
    this.templateData = templateData;
  }

  public MailerMail retries(Integer retries) {
    this.retries = retries;
    return this;
  }

   /**
   * Get retries
   * @return retries
  **/
  @ApiModelProperty(value = "")
  public Integer getRetries() {
    return retries;
  }

  public void setRetries(Integer retries) {
    this.retries = retries;
  }

  public MailerMail sendErrors(List<String> sendErrors) {
    this.sendErrors = sendErrors;
    return this;
  }

  public MailerMail addSendErrorsItem(String sendErrorsItem) {
    if (this.sendErrors == null) {
      this.sendErrors = new ArrayList<String>();
    }
    this.sendErrors.add(sendErrorsItem);
    return this;
  }

   /**
   * Get sendErrors
   * @return sendErrors
  **/
  @ApiModelProperty(value = "")
  public List<String> getSendErrors() {
    return sendErrors;
  }

  public void setSendErrors(List<String> sendErrors) {
    this.sendErrors = sendErrors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailerMail mailerMail = (MailerMail) o;
    return Objects.equals(this.from, mailerMail.from) &&
        Objects.equals(this.to, mailerMail.to) &&
        Objects.equals(this.cc, mailerMail.cc) &&
        Objects.equals(this.dateSent, mailerMail.dateSent) &&
        Objects.equals(this.subject, mailerMail.subject) &&
        Objects.equals(this.contentPlain, mailerMail.contentPlain) &&
        Objects.equals(this.contentHtml, mailerMail.contentHtml) &&
        Objects.equals(this.contentMarkdown, mailerMail.contentMarkdown) &&
        Objects.equals(this.attachments, mailerMail.attachments) &&
        Objects.equals(this.threadUuid, mailerMail.threadUuid) &&
        Objects.equals(this.threadIndex, mailerMail.threadIndex) &&
        Objects.equals(this.templateId, mailerMail.templateId) &&
        Objects.equals(this.templateData, mailerMail.templateData) &&
        Objects.equals(this.retries, mailerMail.retries) &&
        Objects.equals(this.sendErrors, mailerMail.sendErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, cc, dateSent, subject, contentPlain, contentHtml, contentMarkdown, attachments, threadUuid, threadIndex, templateId, templateData, retries, sendErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailerMail {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    dateSent: ").append(toIndentedString(dateSent)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    contentPlain: ").append(toIndentedString(contentPlain)).append("\n");
    sb.append("    contentHtml: ").append(toIndentedString(contentHtml)).append("\n");
    sb.append("    contentMarkdown: ").append(toIndentedString(contentMarkdown)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    threadUuid: ").append(toIndentedString(threadUuid)).append("\n");
    sb.append("    threadIndex: ").append(toIndentedString(threadIndex)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateData: ").append(toIndentedString(templateData)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    sendErrors: ").append(toIndentedString(sendErrors)).append("\n");
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

