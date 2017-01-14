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
* A class which represents the cases_audit table.
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

@Module(name = "CasesAudit", tablename = "cases_audit")
@JsonRootName(value = "cases_audit")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CasesAudit {
    public String getId() {
        return id;
    }

    public void setId(String value) {
        id = value;
    }
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String value) {
        parentId = value;
    }
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date value) {
        dateCreated = value;
    }
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String value) {
        createdBy = value;
    }
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String value) {
        fieldName = value;
    }
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String value) {
        dataType = value;
    }
    public String getBeforeValueString() {
        return beforeValueString;
    }

    public void setBeforeValueString(String value) {
        beforeValueString = value;
    }
    public String getAfterValueString() {
        return afterValueString;
    }

    public void setAfterValueString(String value) {
        afterValueString = value;
    }
    public String getBeforeValueText() {
        return beforeValueText;
    }

    public void setBeforeValueText(String value) {
        beforeValueText = value;
    }
    public String getAfterValueText() {
        return afterValueText;
    }

    public void setAfterValueText(String value) {
        afterValueText = value;
    }

    @JsonProperty("id")
    private String id;
  
    @JsonProperty("parent_id")
    private String parentId;
  
    @JsonProperty("date_created")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dateCreated;
  
    @JsonProperty("created_by")
    private String createdBy;
  
    @JsonProperty("field_name")
    private String fieldName;
  
    @JsonProperty("data_type")
    private String dataType;
  
    @JsonProperty("before_value_string")
    private String beforeValueString;
  
    @JsonProperty("after_value_string")
    private String afterValueString;
  
    @JsonProperty("before_value_text")
    private String beforeValueText;
  
    @JsonProperty("after_value_text")
    private String afterValueText;
  
}
