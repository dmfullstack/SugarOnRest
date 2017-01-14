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
* A class which represents the folders_rel table.
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


@Module(name = "FoldersRel", tablename = "folders_rel")
@JsonRootName(value = "folders_rel")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FoldersRel {
    public String getId() {
        return id;
    }

    public void setId(String value) {
        id = value;
    }
    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String value) {
        folderId = value;
    }
    public String getPolymorphicModule() {
        return polymorphicModule;
    }

    public void setPolymorphicModule(String value) {
        polymorphicModule = value;
    }
    public String getPolymorphicId() {
        return polymorphicId;
    }

    public void setPolymorphicId(String value) {
        polymorphicId = value;
    }
    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer value) {
        deleted = value;
    }

    @JsonProperty("id")
    private String id;
  
    @JsonProperty("folder_id")
    private String folderId;
  
    @JsonProperty("polymorphic_module")
    private String polymorphicModule;
  
    @JsonProperty("polymorphic_id")
    private String polymorphicId;
  
    @JsonProperty("deleted")
    private Integer deleted;
  
}
