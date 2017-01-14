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
* A class which represents the inbound_email_cache_ts table.
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


@Module(name = "InboundEmailCacheTs", tablename = "inbound_email_cache_ts")
@JsonRootName(value = "inbound_email_cache_ts")
@JsonIgnoreProperties(ignoreUnknown = true)
public class InboundEmailCacheTs {
    public String getId() {
        return id;
    }

    public void setId(String value) {
        id = value;
    }
    public Integer getIeTimestamp() {
        return ieTimestamp;
    }

    public void setIeTimestamp(Integer value) {
        ieTimestamp = value;
    }

    @JsonProperty("id")
    private String id;
  
    @JsonProperty("ie_timestamp")
    private Integer ieTimestamp;
  
}
