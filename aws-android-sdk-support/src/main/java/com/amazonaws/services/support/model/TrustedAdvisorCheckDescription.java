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

package com.amazonaws.services.support.model;

import java.io.Serializable;

/**
 * <p>
 * The description and metadata for a Trusted Advisor check.
 * </p>
 */
public class TrustedAdvisorCheckDescription implements Serializable {
    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The display name for the Trusted Advisor check.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The description of the Trusted Advisor check, which includes the alert
     * criteria and recommended operations (contains HTML markup).
     * </p>
     */
    private String description;

    /**
     * <p>
     * The category of the Trusted Advisor check.
     * </p>
     */
    private String category;

    /**
     * <p>
     * The column headings for the data returned by the Trusted Advisor check.
     * The order of the headings corresponds to the order of the data in the
     * <b>Metadata</b> element of the <a>TrustedAdvisorResourceDetail</a> for
     * the check. <b>Metadata</b> contains all the data that is shown in the
     * Excel download, even in those cases where the UI shows just summary data.
     * </p>
     */
    private java.util.List<String> metadata;

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the Trusted Advisor check.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     *
     * @param id <p>
     *            The unique identifier for the Trusted Advisor check.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier for the Trusted Advisor check.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorCheckDescription withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The display name for the Trusted Advisor check.
     * </p>
     *
     * @return <p>
     *         The display name for the Trusted Advisor check.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The display name for the Trusted Advisor check.
     * </p>
     *
     * @param name <p>
     *            The display name for the Trusted Advisor check.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The display name for the Trusted Advisor check.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The display name for the Trusted Advisor check.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorCheckDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the Trusted Advisor check, which includes the alert
     * criteria and recommended operations (contains HTML markup).
     * </p>
     *
     * @return <p>
     *         The description of the Trusted Advisor check, which includes the
     *         alert criteria and recommended operations (contains HTML markup).
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the Trusted Advisor check, which includes the alert
     * criteria and recommended operations (contains HTML markup).
     * </p>
     *
     * @param description <p>
     *            The description of the Trusted Advisor check, which includes
     *            the alert criteria and recommended operations (contains HTML
     *            markup).
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the Trusted Advisor check, which includes the alert
     * criteria and recommended operations (contains HTML markup).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the Trusted Advisor check, which includes
     *            the alert criteria and recommended operations (contains HTML
     *            markup).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorCheckDescription withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The category of the Trusted Advisor check.
     * </p>
     *
     * @return <p>
     *         The category of the Trusted Advisor check.
     *         </p>
     */
    public String getCategory() {
        return category;
    }

    /**
     * <p>
     * The category of the Trusted Advisor check.
     * </p>
     *
     * @param category <p>
     *            The category of the Trusted Advisor check.
     *            </p>
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category of the Trusted Advisor check.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param category <p>
     *            The category of the Trusted Advisor check.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorCheckDescription withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * <p>
     * The column headings for the data returned by the Trusted Advisor check.
     * The order of the headings corresponds to the order of the data in the
     * <b>Metadata</b> element of the <a>TrustedAdvisorResourceDetail</a> for
     * the check. <b>Metadata</b> contains all the data that is shown in the
     * Excel download, even in those cases where the UI shows just summary data.
     * </p>
     *
     * @return <p>
     *         The column headings for the data returned by the Trusted Advisor
     *         check. The order of the headings corresponds to the order of the
     *         data in the <b>Metadata</b> element of the
     *         <a>TrustedAdvisorResourceDetail</a> for the check.
     *         <b>Metadata</b> contains all the data that is shown in the Excel
     *         download, even in those cases where the UI shows just summary
     *         data.
     *         </p>
     */
    public java.util.List<String> getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * The column headings for the data returned by the Trusted Advisor check.
     * The order of the headings corresponds to the order of the data in the
     * <b>Metadata</b> element of the <a>TrustedAdvisorResourceDetail</a> for
     * the check. <b>Metadata</b> contains all the data that is shown in the
     * Excel download, even in those cases where the UI shows just summary data.
     * </p>
     *
     * @param metadata <p>
     *            The column headings for the data returned by the Trusted
     *            Advisor check. The order of the headings corresponds to the
     *            order of the data in the <b>Metadata</b> element of the
     *            <a>TrustedAdvisorResourceDetail</a> for the check.
     *            <b>Metadata</b> contains all the data that is shown in the
     *            Excel download, even in those cases where the UI shows just
     *            summary data.
     *            </p>
     */
    public void setMetadata(java.util.Collection<String> metadata) {
        if (metadata == null) {
            this.metadata = null;
            return;
        }

        this.metadata = new java.util.ArrayList<String>(metadata);
    }

    /**
     * <p>
     * The column headings for the data returned by the Trusted Advisor check.
     * The order of the headings corresponds to the order of the data in the
     * <b>Metadata</b> element of the <a>TrustedAdvisorResourceDetail</a> for
     * the check. <b>Metadata</b> contains all the data that is shown in the
     * Excel download, even in those cases where the UI shows just summary data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metadata <p>
     *            The column headings for the data returned by the Trusted
     *            Advisor check. The order of the headings corresponds to the
     *            order of the data in the <b>Metadata</b> element of the
     *            <a>TrustedAdvisorResourceDetail</a> for the check.
     *            <b>Metadata</b> contains all the data that is shown in the
     *            Excel download, even in those cases where the UI shows just
     *            summary data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorCheckDescription withMetadata(String... metadata) {
        if (getMetadata() == null) {
            this.metadata = new java.util.ArrayList<String>(metadata.length);
        }
        for (String value : metadata) {
            this.metadata.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The column headings for the data returned by the Trusted Advisor check.
     * The order of the headings corresponds to the order of the data in the
     * <b>Metadata</b> element of the <a>TrustedAdvisorResourceDetail</a> for
     * the check. <b>Metadata</b> contains all the data that is shown in the
     * Excel download, even in those cases where the UI shows just summary data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metadata <p>
     *            The column headings for the data returned by the Trusted
     *            Advisor check. The order of the headings corresponds to the
     *            order of the data in the <b>Metadata</b> element of the
     *            <a>TrustedAdvisorResourceDetail</a> for the check.
     *            <b>Metadata</b> contains all the data that is shown in the
     *            Excel download, even in those cases where the UI shows just
     *            summary data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorCheckDescription withMetadata(java.util.Collection<String> metadata) {
        setMetadata(metadata);
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
            sb.append("id: " + getId() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getCategory() != null)
            sb.append("category: " + getCategory() + ",");
        if (getMetadata() != null)
            sb.append("metadata: " + getMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrustedAdvisorCheckDescription == false)
            return false;
        TrustedAdvisorCheckDescription other = (TrustedAdvisorCheckDescription) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        return true;
    }
}
