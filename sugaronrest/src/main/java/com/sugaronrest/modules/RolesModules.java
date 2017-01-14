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
* A class which represents the roles_modules table.
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

@Module(name = "RolesModules", tablename = "roles_modules")
@JsonRootName(value = "roles_modules")
@JsonIgnoreProperties(ignoreUnknown = true)
public class RolesModules {
    public String getId() {
        return id;
    }

    public void setId(String value) {
        id = value;
    }
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String value) {
        roleId = value;
    }
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String value) {
        moduleId = value;
    }
    public Integer getAllow() {
        return allow;
    }

    public void setAllow(Integer value) {
        allow = value;
    }
    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date value) {
        dateModified = value;
    }
    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer value) {
        deleted = value;
    }

    @JsonProperty("id")
    private String id;
  
    @JsonProperty("role_id")
    private String roleId;
  
    @JsonProperty("module_id")
    private String moduleId;
  
    @JsonProperty("allow")
    private Integer allow;
  
    @JsonProperty("date_modified")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dateModified;
  
    @JsonProperty("deleted")
    private Integer deleted;
  
}
