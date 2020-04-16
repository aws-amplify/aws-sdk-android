/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * Represents metadata about a patch.
 * </p>
 */
public class Patch implements Serializable {
    /**
     * <p>
     * The ID of the patch (this is different than the Microsoft Knowledge Base
     * ID).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String id;

    /**
     * <p>
     * The date the patch was released.
     * </p>
     */
    private java.util.Date releaseDate;

    /**
     * <p>
     * The title of the patch.
     * </p>
     */
    private String title;

    /**
     * <p>
     * The description of the patch.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The URL where more information can be obtained about the patch.
     * </p>
     */
    private String contentUrl;

    /**
     * <p>
     * The name of the vendor providing the patch.
     * </p>
     */
    private String vendor;

    /**
     * <p>
     * The product family the patch is applicable for (for example, Windows).
     * </p>
     */
    private String productFamily;

    /**
     * <p>
     * The specific product the patch is applicable for (for example,
     * WindowsServer2016).
     * </p>
     */
    private String product;

    /**
     * <p>
     * The classification of the patch (for example, SecurityUpdates, Updates,
     * CriticalUpdates).
     * </p>
     */
    private String classification;

    /**
     * <p>
     * The severity of the patch (for example Critical, Important, Moderate).
     * </p>
     */
    private String msrcSeverity;

    /**
     * <p>
     * The Microsoft Knowledge Base ID of the patch.
     * </p>
     */
    private String kbNumber;

    /**
     * <p>
     * The ID of the MSRC bulletin the patch is related to.
     * </p>
     */
    private String msrcNumber;

    /**
     * <p>
     * The language of the patch if it's language-specific.
     * </p>
     */
    private String language;

    /**
     * <p>
     * The ID of the patch (this is different than the Microsoft Knowledge Base
     * ID).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The ID of the patch (this is different than the Microsoft
     *         Knowledge Base ID).
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the patch (this is different than the Microsoft Knowledge Base
     * ID).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param id <p>
     *            The ID of the patch (this is different than the Microsoft
     *            Knowledge Base ID).
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the patch (this is different than the Microsoft Knowledge Base
     * ID).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param id <p>
     *            The ID of the patch (this is different than the Microsoft
     *            Knowledge Base ID).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Patch withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The date the patch was released.
     * </p>
     *
     * @return <p>
     *         The date the patch was released.
     *         </p>
     */
    public java.util.Date getReleaseDate() {
        return releaseDate;
    }

    /**
     * <p>
     * The date the patch was released.
     * </p>
     *
     * @param releaseDate <p>
     *            The date the patch was released.
     *            </p>
     */
    public void setReleaseDate(java.util.Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * <p>
     * The date the patch was released.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param releaseDate <p>
     *            The date the patch was released.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Patch withReleaseDate(java.util.Date releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    /**
     * <p>
     * The title of the patch.
     * </p>
     *
     * @return <p>
     *         The title of the patch.
     *         </p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>
     * The title of the patch.
     * </p>
     *
     * @param title <p>
     *            The title of the patch.
     *            </p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the patch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param title <p>
     *            The title of the patch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Patch withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * <p>
     * The description of the patch.
     * </p>
     *
     * @return <p>
     *         The description of the patch.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the patch.
     * </p>
     *
     * @param description <p>
     *            The description of the patch.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the patch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the patch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Patch withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The URL where more information can be obtained about the patch.
     * </p>
     *
     * @return <p>
     *         The URL where more information can be obtained about the patch.
     *         </p>
     */
    public String getContentUrl() {
        return contentUrl;
    }

    /**
     * <p>
     * The URL where more information can be obtained about the patch.
     * </p>
     *
     * @param contentUrl <p>
     *            The URL where more information can be obtained about the
     *            patch.
     *            </p>
     */
    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    /**
     * <p>
     * The URL where more information can be obtained about the patch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentUrl <p>
     *            The URL where more information can be obtained about the
     *            patch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Patch withContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
        return this;
    }

    /**
     * <p>
     * The name of the vendor providing the patch.
     * </p>
     *
     * @return <p>
     *         The name of the vendor providing the patch.
     *         </p>
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * <p>
     * The name of the vendor providing the patch.
     * </p>
     *
     * @param vendor <p>
     *            The name of the vendor providing the patch.
     *            </p>
     */
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    /**
     * <p>
     * The name of the vendor providing the patch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vendor <p>
     *            The name of the vendor providing the patch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Patch withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * <p>
     * The product family the patch is applicable for (for example, Windows).
     * </p>
     *
     * @return <p>
     *         The product family the patch is applicable for (for example,
     *         Windows).
     *         </p>
     */
    public String getProductFamily() {
        return productFamily;
    }

    /**
     * <p>
     * The product family the patch is applicable for (for example, Windows).
     * </p>
     *
     * @param productFamily <p>
     *            The product family the patch is applicable for (for example,
     *            Windows).
     *            </p>
     */
    public void setProductFamily(String productFamily) {
        this.productFamily = productFamily;
    }

    /**
     * <p>
     * The product family the patch is applicable for (for example, Windows).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productFamily <p>
     *            The product family the patch is applicable for (for example,
     *            Windows).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Patch withProductFamily(String productFamily) {
        this.productFamily = productFamily;
        return this;
    }

    /**
     * <p>
     * The specific product the patch is applicable for (for example,
     * WindowsServer2016).
     * </p>
     *
     * @return <p>
     *         The specific product the patch is applicable for (for example,
     *         WindowsServer2016).
     *         </p>
     */
    public String getProduct() {
        return product;
    }

    /**
     * <p>
     * The specific product the patch is applicable for (for example,
     * WindowsServer2016).
     * </p>
     *
     * @param product <p>
     *            The specific product the patch is applicable for (for example,
     *            WindowsServer2016).
     *            </p>
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * <p>
     * The specific product the patch is applicable for (for example,
     * WindowsServer2016).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param product <p>
     *            The specific product the patch is applicable for (for example,
     *            WindowsServer2016).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Patch withProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * <p>
     * The classification of the patch (for example, SecurityUpdates, Updates,
     * CriticalUpdates).
     * </p>
     *
     * @return <p>
     *         The classification of the patch (for example, SecurityUpdates,
     *         Updates, CriticalUpdates).
     *         </p>
     */
    public String getClassification() {
        return classification;
    }

    /**
     * <p>
     * The classification of the patch (for example, SecurityUpdates, Updates,
     * CriticalUpdates).
     * </p>
     *
     * @param classification <p>
     *            The classification of the patch (for example, SecurityUpdates,
     *            Updates, CriticalUpdates).
     *            </p>
     */
    public void setClassification(String classification) {
        this.classification = classification;
    }

    /**
     * <p>
     * The classification of the patch (for example, SecurityUpdates, Updates,
     * CriticalUpdates).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classification <p>
     *            The classification of the patch (for example, SecurityUpdates,
     *            Updates, CriticalUpdates).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Patch withClassification(String classification) {
        this.classification = classification;
        return this;
    }

    /**
     * <p>
     * The severity of the patch (for example Critical, Important, Moderate).
     * </p>
     *
     * @return <p>
     *         The severity of the patch (for example Critical, Important,
     *         Moderate).
     *         </p>
     */
    public String getMsrcSeverity() {
        return msrcSeverity;
    }

    /**
     * <p>
     * The severity of the patch (for example Critical, Important, Moderate).
     * </p>
     *
     * @param msrcSeverity <p>
     *            The severity of the patch (for example Critical, Important,
     *            Moderate).
     *            </p>
     */
    public void setMsrcSeverity(String msrcSeverity) {
        this.msrcSeverity = msrcSeverity;
    }

    /**
     * <p>
     * The severity of the patch (for example Critical, Important, Moderate).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param msrcSeverity <p>
     *            The severity of the patch (for example Critical, Important,
     *            Moderate).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Patch withMsrcSeverity(String msrcSeverity) {
        this.msrcSeverity = msrcSeverity;
        return this;
    }

    /**
     * <p>
     * The Microsoft Knowledge Base ID of the patch.
     * </p>
     *
     * @return <p>
     *         The Microsoft Knowledge Base ID of the patch.
     *         </p>
     */
    public String getKbNumber() {
        return kbNumber;
    }

    /**
     * <p>
     * The Microsoft Knowledge Base ID of the patch.
     * </p>
     *
     * @param kbNumber <p>
     *            The Microsoft Knowledge Base ID of the patch.
     *            </p>
     */
    public void setKbNumber(String kbNumber) {
        this.kbNumber = kbNumber;
    }

    /**
     * <p>
     * The Microsoft Knowledge Base ID of the patch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kbNumber <p>
     *            The Microsoft Knowledge Base ID of the patch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Patch withKbNumber(String kbNumber) {
        this.kbNumber = kbNumber;
        return this;
    }

    /**
     * <p>
     * The ID of the MSRC bulletin the patch is related to.
     * </p>
     *
     * @return <p>
     *         The ID of the MSRC bulletin the patch is related to.
     *         </p>
     */
    public String getMsrcNumber() {
        return msrcNumber;
    }

    /**
     * <p>
     * The ID of the MSRC bulletin the patch is related to.
     * </p>
     *
     * @param msrcNumber <p>
     *            The ID of the MSRC bulletin the patch is related to.
     *            </p>
     */
    public void setMsrcNumber(String msrcNumber) {
        this.msrcNumber = msrcNumber;
    }

    /**
     * <p>
     * The ID of the MSRC bulletin the patch is related to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param msrcNumber <p>
     *            The ID of the MSRC bulletin the patch is related to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Patch withMsrcNumber(String msrcNumber) {
        this.msrcNumber = msrcNumber;
        return this;
    }

    /**
     * <p>
     * The language of the patch if it's language-specific.
     * </p>
     *
     * @return <p>
     *         The language of the patch if it's language-specific.
     *         </p>
     */
    public String getLanguage() {
        return language;
    }

    /**
     * <p>
     * The language of the patch if it's language-specific.
     * </p>
     *
     * @param language <p>
     *            The language of the patch if it's language-specific.
     *            </p>
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The language of the patch if it's language-specific.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param language <p>
     *            The language of the patch if it's language-specific.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Patch withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getReleaseDate() != null)
            sb.append("ReleaseDate: " + getReleaseDate() + ",");
        if (getTitle() != null)
            sb.append("Title: " + getTitle() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getContentUrl() != null)
            sb.append("ContentUrl: " + getContentUrl() + ",");
        if (getVendor() != null)
            sb.append("Vendor: " + getVendor() + ",");
        if (getProductFamily() != null)
            sb.append("ProductFamily: " + getProductFamily() + ",");
        if (getProduct() != null)
            sb.append("Product: " + getProduct() + ",");
        if (getClassification() != null)
            sb.append("Classification: " + getClassification() + ",");
        if (getMsrcSeverity() != null)
            sb.append("MsrcSeverity: " + getMsrcSeverity() + ",");
        if (getKbNumber() != null)
            sb.append("KbNumber: " + getKbNumber() + ",");
        if (getMsrcNumber() != null)
            sb.append("MsrcNumber: " + getMsrcNumber() + ",");
        if (getLanguage() != null)
            sb.append("Language: " + getLanguage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getReleaseDate() == null) ? 0 : getReleaseDate().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getContentUrl() == null) ? 0 : getContentUrl().hashCode());
        hashCode = prime * hashCode + ((getVendor() == null) ? 0 : getVendor().hashCode());
        hashCode = prime * hashCode
                + ((getProductFamily() == null) ? 0 : getProductFamily().hashCode());
        hashCode = prime * hashCode + ((getProduct() == null) ? 0 : getProduct().hashCode());
        hashCode = prime * hashCode
                + ((getClassification() == null) ? 0 : getClassification().hashCode());
        hashCode = prime * hashCode
                + ((getMsrcSeverity() == null) ? 0 : getMsrcSeverity().hashCode());
        hashCode = prime * hashCode + ((getKbNumber() == null) ? 0 : getKbNumber().hashCode());
        hashCode = prime * hashCode + ((getMsrcNumber() == null) ? 0 : getMsrcNumber().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Patch == false)
            return false;
        Patch other = (Patch) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getReleaseDate() == null ^ this.getReleaseDate() == null)
            return false;
        if (other.getReleaseDate() != null
                && other.getReleaseDate().equals(this.getReleaseDate()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getContentUrl() == null ^ this.getContentUrl() == null)
            return false;
        if (other.getContentUrl() != null
                && other.getContentUrl().equals(this.getContentUrl()) == false)
            return false;
        if (other.getVendor() == null ^ this.getVendor() == null)
            return false;
        if (other.getVendor() != null && other.getVendor().equals(this.getVendor()) == false)
            return false;
        if (other.getProductFamily() == null ^ this.getProductFamily() == null)
            return false;
        if (other.getProductFamily() != null
                && other.getProductFamily().equals(this.getProductFamily()) == false)
            return false;
        if (other.getProduct() == null ^ this.getProduct() == null)
            return false;
        if (other.getProduct() != null && other.getProduct().equals(this.getProduct()) == false)
            return false;
        if (other.getClassification() == null ^ this.getClassification() == null)
            return false;
        if (other.getClassification() != null
                && other.getClassification().equals(this.getClassification()) == false)
            return false;
        if (other.getMsrcSeverity() == null ^ this.getMsrcSeverity() == null)
            return false;
        if (other.getMsrcSeverity() != null
                && other.getMsrcSeverity().equals(this.getMsrcSeverity()) == false)
            return false;
        if (other.getKbNumber() == null ^ this.getKbNumber() == null)
            return false;
        if (other.getKbNumber() != null && other.getKbNumber().equals(this.getKbNumber()) == false)
            return false;
        if (other.getMsrcNumber() == null ^ this.getMsrcNumber() == null)
            return false;
        if (other.getMsrcNumber() != null
                && other.getMsrcNumber().equals(this.getMsrcNumber()) == false)
            return false;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        return true;
    }
}
