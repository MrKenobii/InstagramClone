package com.anilduyguc.instagramclone.model;

public class Post {
    private String eMail,comment,downloadUrl;

    public Post(String eMail, String comment, String downloadUrl) {
        this.eMail = eMail;
        this.comment = comment;
        this.downloadUrl = downloadUrl;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
}
