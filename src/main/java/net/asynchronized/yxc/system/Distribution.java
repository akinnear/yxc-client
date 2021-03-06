/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.system;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author enrico
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Distribution {
    @JsonProperty("server_zone_list")
    private List<String> serverZoneList;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<String> getServerZoneList() {
        return serverZoneList;
    }

    public void setServerZoneList(List<String> serverZoneList) {
        this.serverZoneList = serverZoneList;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @Override
    public String toString() {
        return "Distribution{" + "serverZoneList=" + serverZoneList + ", additionalProperties=" + additionalProperties + '}';
    }
}
