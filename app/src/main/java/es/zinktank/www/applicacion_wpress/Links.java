
package es.zinktank.www.applicacion_wpress;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Links {

    @SerializedName("self")
    @Expose
    private List<Self> self = new ArrayList<Self>();
    @SerializedName("collection")
    @Expose
    private List<Collection> collection = new ArrayList<Collection>();
    @SerializedName("about")
    @Expose
    private List<About> about = new ArrayList<About>();
    @SerializedName("author")
    @Expose
    private List<Author> author = new ArrayList<Author>();
    @SerializedName("replies")
    @Expose
    private List<Reply> replies = new ArrayList<Reply>();
    @SerializedName("version-history")
    @Expose
    private List<VersionHistory> versionHistory = new ArrayList<VersionHistory>();
    @SerializedName("wp:attachment")
    @Expose
    private List<WpAttachment> wpAttachment = new ArrayList<WpAttachment>();
    @SerializedName("wp:term")
    @Expose
    private List<WpTerm> wpTerm = new ArrayList<WpTerm>();
    @SerializedName("curies")
    @Expose
    private List<Cury> curies = new ArrayList<Cury>();

    /**
     * 
     * @return
     *     The self
     */
    public List<Self> getSelf() {
        return self;
    }

    /**
     * 
     * @param self
     *     The self
     */
    public void setSelf(List<Self> self) {
        this.self = self;
    }

    /**
     * 
     * @return
     *     The collection
     */
    public List<Collection> getCollection() {
        return collection;
    }

    /**
     * 
     * @param collection
     *     The collection
     */
    public void setCollection(List<Collection> collection) {
        this.collection = collection;
    }

    /**
     * 
     * @return
     *     The about
     */
    public List<About> getAbout() {
        return about;
    }

    /**
     * 
     * @param about
     *     The about
     */
    public void setAbout(List<About> about) {
        this.about = about;
    }

    /**
     * 
     * @return
     *     The author
     */
    public List<Author> getAuthor() {
        return author;
    }

    /**
     * 
     * @param author
     *     The author
     */
    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    /**
     * 
     * @return
     *     The replies
     */
    public List<Reply> getReplies() {
        return replies;
    }

    /**
     * 
     * @param replies
     *     The replies
     */
    public void setReplies(List<Reply> replies) {
        this.replies = replies;
    }

    /**
     * 
     * @return
     *     The versionHistory
     */
    public List<VersionHistory> getVersionHistory() {
        return versionHistory;
    }

    /**
     * 
     * @param versionHistory
     *     The version-history
     */
    public void setVersionHistory(List<VersionHistory> versionHistory) {
        this.versionHistory = versionHistory;
    }

    /**
     * 
     * @return
     *     The wpAttachment
     */
    public List<WpAttachment> getWpAttachment() {
        return wpAttachment;
    }

    /**
     * 
     * @param wpAttachment
     *     The wp:attachment
     */
    public void setWpAttachment(List<WpAttachment> wpAttachment) {
        this.wpAttachment = wpAttachment;
    }

    /**
     * 
     * @return
     *     The wpTerm
     */
    public List<WpTerm> getWpTerm() {
        return wpTerm;
    }

    /**
     * 
     * @param wpTerm
     *     The wp:term
     */
    public void setWpTerm(List<WpTerm> wpTerm) {
        this.wpTerm = wpTerm;
    }

    /**
     * 
     * @return
     *     The curies
     */
    public List<Cury> getCuries() {
        return curies;
    }

    /**
     * 
     * @param curies
     *     The curies
     */
    public void setCuries(List<Cury> curies) {
        this.curies = curies;
    }


}
