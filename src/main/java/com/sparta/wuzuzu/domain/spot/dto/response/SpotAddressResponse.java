package com.sparta.wuzuzu.domain.spot.dto.response;

import lombok.Getter;
import org.json.JSONObject;

@Getter
public class SpotAddressResponse {

    private String spotName;
    private String address;
    private String category;
    private String telephone;
    private String link;

    public SpotAddressResponse(JSONObject item) {
        this.spotName = item.getString("title");
        this.address = item.getString("address");
        this.category = item.getString("category");
        this.telephone = item.getString("telephone");
        this.link = item.getString("link");
    }
}
