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
* A class which represents the folders table.
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


@Module(name = "Folders", tablename = "folders")
@JsonRootName(value = "folders")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Folders {
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
    public String getFolderType() {
        return folderType;
    }

    public void setFolderType(String value) {
        folderType = value;
    }
    public String getParentFolder() {
        return parentFolder;
    }

    public void setParentFolder(String value) {
        parentFolder = value;
    }
    public Integer getHasChild() {
        return hasChild;
    }

    public void setHasChild(Integer value) {
        hasChild = value;
    }
    public Integer getIsGroup() {
        return isGroup;
    }

    public void setIsGroup(Integer value) {
        isGroup = value;
    }
    public Integer getIsDynamic() {
        return isDynamic;
    }

    public void setIsDynamic(Integer value) {
        isDynamic = value;
    }
    public String getDynamicQuery() {
        return dynamicQuery;
    }

    public void setDynamicQuery(String value) {
        dynamicQuery = value;
    }
    public String getAssignToId() {
        return assignToId;
    }

    public void setAssignToId(String value) {
        assignToId = value;
    }
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String value) {
        createdBy = value;
    }
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String value) {
        modifiedBy = value;
    }
    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer value) {
        deleted = value;
    }

    @JsonProperty("id")
    private String id;
  
    @JsonProperty("name")
    private String name;
  
    @JsonProperty("folder_type")
    private String folderType;
  
    @JsonProperty("parent_folder")
    private String parentFolder;
  
    @JsonProperty("has_child")
    private Integer hasChild;
  
    @JsonProperty("is_group")
    private Integer isGroup;
  
    @JsonProperty("is_dynamic")
    private Integer isDynamic;
  
    @JsonProperty("dynamic_query")
    private String dynamicQuery;
  
    @JsonProperty("assign_to_id")
    private String assignToId;
  
    @JsonProperty("created_by")
    private String createdBy;
  
    @JsonProperty("modified_by")
    private String modifiedBy;
  
    @JsonProperty("deleted")
    private Integer deleted;
  
}
