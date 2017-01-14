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
* A class which represents the config table.
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


@Module(name = "Config", tablename = "config")
@JsonRootName(value = "config")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Config {
    public String getCategory() {
        return category;
    }

    public void setCategory(String value) {
        category = value;
    }
    public String getName() {
        return name;
    }

    public void setName(String value) {
        name = value;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        value = value;
    }

    @JsonProperty("category")
    private String category;
  
    @JsonProperty("name")
    private String name;
  
    @JsonProperty("value")
    private String value;
  
}
