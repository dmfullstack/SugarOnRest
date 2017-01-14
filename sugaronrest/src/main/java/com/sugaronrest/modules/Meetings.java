/**
* <auto-generated />
* This file was generated by a StringTemplate 4 template.
* Don't change it directly as your change would get overwritten.  Instead, make changes
* to the .stg file (i.e. the StringTemplate 4 template) and save it to regenerate this file.
*
* For more infor on StringTemplate 4 template please go to -
* https://github.com/antlr/antlrcs
*
* @author  Kola Oyewumi
* @version 1.0
* @since   2017-01-03
*
* A class which represents the meetings table.
*/

package com.sugaronrest.modules;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sugaronrest.restapicalls.Module;
import com.sugaronrest.restapicalls.CustomDateDeserializer;
import com.sugaronrest.restapicalls.CustomDateSerializer;

import java.util.Date;

@Module(name = "Meetings", tablename = "meetings")
@JsonRootName(value = "meetings")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Meetings {
    public String getId() {
        return id;
    }

    public void setId(String value) {
        id = value;
    }
    public String getName() {
        return name;
    }

    public void setName(String value) {
        name = value;
    }
    public Date getDateEntered() {
        return dateEntered;
    }

    public void setDateEntered(Date value) {
        dateEntered = value;
    }
    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date value) {
        dateModified = value;
    }
    public String getModifiedUserId() {
        return modifiedUserId;
    }

    public void setModifiedUserId(String value) {
        modifiedUserId = value;
    }
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String value) {
        createdBy = value;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        description = value;
    }
    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer value) {
        deleted = value;
    }
    public String getAssignedUserId() {
        return assignedUserId;
    }

    public void setAssignedUserId(String value) {
        assignedUserId = value;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String value) {
        location = value;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        password = value;
    }
    public String getJoinUrl() {
        return joinUrl;
    }

    public void setJoinUrl(String value) {
        joinUrl = value;
    }
    public String getHostUrl() {
        return hostUrl;
    }

    public void setHostUrl(String value) {
        hostUrl = value;
    }
    public String getDisplayedUrl() {
        return displayedUrl;
    }

    public void setDisplayedUrl(String value) {
        displayedUrl = value;
    }
    public String getCreator() {
        return creator;
    }

    public void setCreator(String value) {
        creator = value;
    }
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String value) {
        externalId = value;
    }
    public Integer getDurationHours() {
        return durationHours;
    }

    public void setDurationHours(Integer value) {
        durationHours = value;
    }
    public Integer getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(Integer value) {
        durationMinutes = value;
    }
    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date value) {
        dateStart = value;
    }
    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date value) {
        dateEnd = value;
    }
    public String getParentType() {
        return parentType;
    }

    public void setParentType(String value) {
        parentType = value;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String value) {
        status = value;
    }
    public String getType() {
        return type;
    }

    public void setType(String value) {
        type = value;
    }
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String value) {
        parentId = value;
    }
    public Integer getReminderTime() {
        return reminderTime;
    }

    public void setReminderTime(Integer value) {
        reminderTime = value;
    }
    public Integer getEmailReminderTime() {
        return emailReminderTime;
    }

    public void setEmailReminderTime(Integer value) {
        emailReminderTime = value;
    }
    public Integer getEmailReminderSent() {
        return emailReminderSent;
    }

    public void setEmailReminderSent(Integer value) {
        emailReminderSent = value;
    }
    public String getOutlookId() {
        return outlookId;
    }

    public void setOutlookId(String value) {
        outlookId = value;
    }
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer value) {
        sequence = value;
    }
    public String getRepeatType() {
        return repeatType;
    }

    public void setRepeatType(String value) {
        repeatType = value;
    }
    public Integer getRepeatInterval() {
        return repeatInterval;
    }

    public void setRepeatInterval(Integer value) {
        repeatInterval = value;
    }
    public String getRepeatDow() {
        return repeatDow;
    }

    public void setRepeatDow(String value) {
        repeatDow = value;
    }
    public Date getRepeatUntil() {
        return repeatUntil;
    }

    public void setRepeatUntil(Date value) {
        repeatUntil = value;
    }
    public Integer getRepeatCount() {
        return repeatCount;
    }

    public void setRepeatCount(Integer value) {
        repeatCount = value;
    }
    public String getRepeatParentId() {
        return repeatParentId;
    }

    public void setRepeatParentId(String value) {
        repeatParentId = value;
    }
    public String getRecurringSource() {
        return recurringSource;
    }

    public void setRecurringSource(String value) {
        recurringSource = value;
    }

    @JsonProperty("id")
    private String id;
  
    @JsonProperty("name")
    private String name;
  
    @JsonProperty("date_entered")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dateEntered;
  
    @JsonProperty("date_modified")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dateModified;
  
    @JsonProperty("modified_user_id")
    private String modifiedUserId;
  
    @JsonProperty("created_by")
    private String createdBy;
  
    @JsonProperty("description")
    private String description;
  
    @JsonProperty("deleted")
    private Integer deleted;
  
    @JsonProperty("assigned_user_id")
    private String assignedUserId;
  
    @JsonProperty("location")
    private String location;
  
    @JsonProperty("password")
    private String password;
  
    @JsonProperty("join_url")
    private String joinUrl;
  
    @JsonProperty("host_url")
    private String hostUrl;
  
    @JsonProperty("displayed_url")
    private String displayedUrl;
  
    @JsonProperty("creator")
    private String creator;
  
    @JsonProperty("external_id")
    private String externalId;
  
    @JsonProperty("duration_hours")
    private Integer durationHours;
  
    @JsonProperty("duration_minutes")
    private Integer durationMinutes;
  
    @JsonProperty("date_start")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dateStart;
  
    @JsonProperty("date_end")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dateEnd;
  
    @JsonProperty("parent_type")
    private String parentType;
  
    @JsonProperty("status")
    private String status;
  
    @JsonProperty("type")
    private String type;
  
    @JsonProperty("parent_id")
    private String parentId;
  
    @JsonProperty("reminder_time")
    private Integer reminderTime;
  
    @JsonProperty("email_reminder_time")
    private Integer emailReminderTime;
  
    @JsonProperty("email_reminder_sent")
    private Integer emailReminderSent;
  
    @JsonProperty("outlook_id")
    private String outlookId;
  
    @JsonProperty("sequence")
    private Integer sequence;
  
    @JsonProperty("repeat_type")
    private String repeatType;
  
    @JsonProperty("repeat_interval")
    private Integer repeatInterval;
  
    @JsonProperty("repeat_dow")
    private String repeatDow;
  
    @JsonProperty("repeat_until")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date repeatUntil;
  
    @JsonProperty("repeat_count")
    private Integer repeatCount;
  
    @JsonProperty("repeat_parent_id")
    private String repeatParentId;
  
    @JsonProperty("recurring_source")
    private String recurringSource;
  
}