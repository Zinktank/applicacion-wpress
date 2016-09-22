
package es.zinktank.www.applicacion_wpress;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WpTerm {

    @SerializedName("taxonomy")
    @Expose
    private String taxonomy;
    @SerializedName("embeddable")
    @Expose
    private Boolean embeddable;
    @SerializedName("href")
    @Expose
    private String href;

    /**
     * 
     * @return
     *     The taxonomy
     */
    public String getTaxonomy() {
        return taxonomy;
    }

    /**
     * 
     * @param taxonomy
     *     The taxonomy
     */
    public void setTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy;
    }

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
