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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * <p>
 * A summary of a field-level encryption item.
 * </p>
 */
public class FieldLevelEncryptionSummary implements Serializable {
    /**
     * <p>
     * The unique ID of a field-level encryption item.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The last time that the summary of field-level encryption items was
     * modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * An optional comment about the field-level encryption item.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * A summary of a query argument-profile mapping.
     * </p>
     */
    private QueryArgProfileConfig queryArgProfileConfig;

    /**
     * <p>
     * A summary of a content type-profile mapping.
     * </p>
     */
    private ContentTypeProfileConfig contentTypeProfileConfig;

    /**
     * <p>
     * The unique ID of a field-level encryption item.
     * </p>
     *
     * @return <p>
     *         The unique ID of a field-level encryption item.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique ID of a field-level encryption item.
     * </p>
     *
     * @param id <p>
     *            The unique ID of a field-level encryption item.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID of a field-level encryption item.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique ID of a field-level encryption item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldLevelEncryptionSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The last time that the summary of field-level encryption items was
     * modified.
     * </p>
     *
     * @return <p>
     *         The last time that the summary of field-level encryption items
     *         was modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The last time that the summary of field-level encryption items was
     * modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The last time that the summary of field-level encryption items
     *            was modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last time that the summary of field-level encryption items was
     * modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The last time that the summary of field-level encryption items
     *            was modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldLevelEncryptionSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * An optional comment about the field-level encryption item.
     * </p>
     *
     * @return <p>
     *         An optional comment about the field-level encryption item.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * An optional comment about the field-level encryption item.
     * </p>
     *
     * @param comment <p>
     *            An optional comment about the field-level encryption item.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * An optional comment about the field-level encryption item.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param comment <p>
     *            An optional comment about the field-level encryption item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldLevelEncryptionSummary withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * <p>
     * A summary of a query argument-profile mapping.
     * </p>
     *
     * @return <p>
     *         A summary of a query argument-profile mapping.
     *         </p>
     */
    public QueryArgProfileConfig getQueryArgProfileConfig() {
        return queryArgProfileConfig;
    }

    /**
     * <p>
     * A summary of a query argument-profile mapping.
     * </p>
     *
     * @param queryArgProfileConfig <p>
     *            A summary of a query argument-profile mapping.
     *            </p>
     */
    public void setQueryArgProfileConfig(QueryArgProfileConfig queryArgProfileConfig) {
        this.queryArgProfileConfig = queryArgProfileConfig;
    }

    /**
     * <p>
     * A summary of a query argument-profile mapping.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryArgProfileConfig <p>
     *            A summary of a query argument-profile mapping.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldLevelEncryptionSummary withQueryArgProfileConfig(
            QueryArgProfileConfig queryArgProfileConfig) {
        this.queryArgProfileConfig = queryArgProfileConfig;
        return this;
    }

    /**
     * <p>
     * A summary of a content type-profile mapping.
     * </p>
     *
     * @return <p>
     *         A summary of a content type-profile mapping.
     *         </p>
     */
    public ContentTypeProfileConfig getContentTypeProfileConfig() {
        return contentTypeProfileConfig;
    }

    /**
     * <p>
     * A summary of a content type-profile mapping.
     * </p>
     *
     * @param contentTypeProfileConfig <p>
     *            A summary of a content type-profile mapping.
     *            </p>
     */
    public void setContentTypeProfileConfig(ContentTypeProfileConfig contentTypeProfileConfig) {
        this.contentTypeProfileConfig = contentTypeProfileConfig;
    }

    /**
     * <p>
     * A summary of a content type-profile mapping.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentTypeProfileConfig <p>
     *            A summary of a content type-profile mapping.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldLevelEncryptionSummary withContentTypeProfileConfig(
            ContentTypeProfileConfig contentTypeProfileConfig) {
        this.contentTypeProfileConfig = contentTypeProfileConfig;
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
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment() + ",");
        if (getQueryArgProfileConfig() != null)
            sb.append("QueryArgProfileConfig: " + getQueryArgProfileConfig() + ",");
        if (getContentTypeProfileConfig() != null)
            sb.append("ContentTypeProfileConfig: " + getContentTypeProfileConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime
                * hashCode
                + ((getQueryArgProfileConfig() == null) ? 0 : getQueryArgProfileConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getContentTypeProfileConfig() == null) ? 0 : getContentTypeProfileConfig()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldLevelEncryptionSummary == false)
            return false;
        FieldLevelEncryptionSummary other = (FieldLevelEncryptionSummary) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getQueryArgProfileConfig() == null ^ this.getQueryArgProfileConfig() == null)
            return false;
        if (other.getQueryArgProfileConfig() != null
                && other.getQueryArgProfileConfig().equals(this.getQueryArgProfileConfig()) == false)
            return false;
        if (other.getContentTypeProfileConfig() == null
                ^ this.getContentTypeProfileConfig() == null)
            return false;
        if (other.getContentTypeProfileConfig() != null
                && other.getContentTypeProfileConfig().equals(this.getContentTypeProfileConfig()) == false)
            return false;
        return true;
    }
}
