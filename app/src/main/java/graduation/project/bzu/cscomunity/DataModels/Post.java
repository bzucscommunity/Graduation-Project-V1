package graduation.project.bzu.cscomunity.DataModels;

public class Post {

    private int postID;
    private String postType;
    private String postSubject;
    private String postTitle;
    private String postTags;
    private String postBody;
    private String postAttachment;
    private int userID;


    public Post() {
        super();
    }

    public Post(int postID, String postType, String postSubject, String postTitle, String postTags,
                     String postBody, String postAttachment, int userID) {
        super();
        this.postID = postID;
        this.postType = postType;
        this.postSubject = postSubject;
        this.postTitle = postTitle;
        this.postTags = postTags;
        this.postBody = postBody;
        this.postAttachment = postAttachment;
        this.userID = userID;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getPostSubject() {
        return postSubject;
    }

    public void setPostSubject(String postSubject) {
        this.postSubject = postSubject;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostTags() {
        return postTags;
    }

    public void setPostTags(String postTags) {
        this.postTags = postTags;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public String getPostAttachment() {
        return postAttachment;
    }

    public void setPostAttachment(String postAttachment) {
        this.postAttachment = postAttachment;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "postModel [postID=" + postID + ", postType=" + postType + ", postSubject=" + postSubject
                + ", postTitle=" + postTitle + ", postTags=" + postTags + ", postBody=" + postBody + ", postAttachment="
                + postAttachment + ", userID=" + userID + "]";
    }




}









