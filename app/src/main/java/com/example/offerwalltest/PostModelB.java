package com.example.offerwalltest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostModelB {
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("contents")
    @Expose
    private String contents;
    @SerializedName("url")
    @Expose
    private String url;

    public String getUrl(){
        return url;
    }
    public void setUrl(){
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
