
package es.zinktank.www.applicacion_wpress;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Author {

    @SerializedName("embeddable")
    @Expose
    private Boolean embeddable;
    @SerializedName("href")
    @Expose
    private String href;

    /**
     * 
     * @return
     *     The embeddable
     */
    public Boolean getEmbeddable() {
        return embeddable;
    }

    /**
     * 
     * @param embeddable
     *     The embeddable
     */
    public void setEmbeddable(Boolean embeddable) {
        this.embeddable = embeddable;
    }

    /**
     * 
     * @return
     *     The href
     */
    public String getHref() {
        return href;
    }

    /**
     * 
     * @param href
     *     The href
     */
    public void setHref(String href) {
        this.href = href;
    }


}
