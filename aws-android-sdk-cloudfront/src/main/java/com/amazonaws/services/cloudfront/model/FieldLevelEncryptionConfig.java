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
 * A complex data type that includes the profile configurations specified for
 * field-level encryption.
 * </p>
 */
public class FieldLevelEncryptionConfig implements Serializable {
    /**
     * <p>
     * A unique number that ensures the request can't be replayed.
     * </p>
     */
    private String callerReference;

    /**
     * <p>
     * An optional comment about the configuration.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * A complex data type that specifies when to forward content if a profile
     * isn't found and the profile that can be provided as a query argument in a
     * request.
     * </p>
     */
    private QueryArgProfileConfig queryArgProfileConfig;

    /**
     * <p>
     * A complex data type that specifies when to forward content if a content
     * type isn't recognized and profiles to use as by default in a request if a
     * query argument doesn't specify a profile to use.
     * </p>
     */
    private ContentTypeProfileConfig contentTypeProfileConfig;

    /**
     * <p>
     * A unique number that ensures the request can't be replayed.
     * </p>
     *
     * @return <p>
     *         A unique number that ensures the request can't be replayed.
     *         </p>
     */
    public String getCallerReference() {
        return callerReference;
    }

    /**
     * <p>
     * A unique number that ensures the request can't be replayed.
     * </p>
     *
     * @param callerReference <p>
     *            A unique number that ensures the request can't be replayed.
     *            </p>
     */
    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A unique number that ensures the request can't be replayed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param callerReference <p>
     *            A unique number that ensures the request can't be replayed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldLevelEncryptionConfig withCallerReference(String callerReference) {
        this.callerReference = callerReference;
        return this;
    }

    /**
     * <p>
     * An optional comment about the configuration.
     * </p>
     *
     * @return <p>
     *         An optional comment about the configuration.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * An optional comment about the configuration.
     * </p>
     *
     * @param comment <p>
     *            An optional comment about the configuration.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * An optional comment about the configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param comment <p>
     *            An optional comment about the configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldLevelEncryptionConfig withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * <p>
     * A complex data type that specifies when to forward content if a profile
     * isn't found and the profile that can be provided as a query argument in a
     * request.
     * </p>
     *
     * @return <p>
     *         A complex data type that specifies when to forward content if a
     *         profile isn't found and the profile that can be provided as a
     *         query argument in a request.
     *         </p>
     */
    public QueryArgProfileConfig getQueryArgProfileConfig() {
        return queryArgProfileConfig;
    }

    /**
     * <p>
     * A complex data type that specifies when to forward content if a profile
     * isn't found and the profile that can be provided as a query argument in a
     * request.
     * </p>
     *
     * @param queryArgProfileConfig <p>
     *            A complex data type that specifies when to forward content if
     *            a profile isn't found and the profile that can be provided as
     *            a query argument in a request.
     *            </p>
     */
    public void setQueryArgProfileConfig(QueryArgProfileConfig queryArgProfileConfig) {
        this.queryArgProfileConfig = queryArgProfileConfig;
    }

    /**
     * <p>
     * A complex data type that specifies when to forward content if a profile
     * isn't found and the profile that can be provided as a query argument in a
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryArgProfileConfig <p>
     *            A complex data type that specifies when to forward content if
     *            a profile isn't found and the profile that can be provided as
     *            a query argument in a request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldLevelEncryptionConfig withQueryArgProfileConfig(
            QueryArgProfileConfig queryArgProfileConfig) {
        this.queryArgProfileConfig = queryArgProfileConfig;
        return this;
    }

    /**
     * <p>
     * A complex data type that specifies when to forward content if a content
     * type isn't recognized and profiles to use as by default in a request if a
     * query argument doesn't specify a profile to use.
     * </p>
     *
     * @return <p>
     *         A complex data type that specifies when to forward content if a
     *         content type isn't recognized and profiles to use as by default
     *         in a request if a query argument doesn't specify a profile to
     *         use.
     *         </p>
     */
    public ContentTypeProfileConfig getContentTypeProfileConfig() {
        return contentTypeProfileConfig;
    }

    /**
     * <p>
     * A complex data type that specifies when to forward content if a content
     * type isn't recognized and profiles to use as by default in a request if a
     * query argument doesn't specify a profile to use.
     * </p>
     *
     * @param contentTypeProfileConfig <p>
     *            A complex data type that specifies when to forward content if
     *            a content type isn't recognized and profiles to use as by
     *            default in a request if a query argument doesn't specify a
     *            profile to use.
     *            </p>
     */
    public void setContentTypeProfileConfig(ContentTypeProfileConfig contentTypeProfileConfig) {
        this.contentTypeProfileConfig = contentTypeProfileConfig;
    }

    /**
     * <p>
     * A complex data type that specifies when to forward content if a content
     * type isn't recognized and profiles to use as by default in a request if a
     * query argument doesn't specify a profile to use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentTypeProfileConfig <p>
     *            A complex data type that specifies when to forward content if
     *            a content type isn't recognized and profiles to use as by
     *            default in a request if a query argument doesn't specify a
     *            profile to use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldLevelEncryptionConfig withContentTypeProfileConfig(
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
        if (getCallerReference() != null)
            sb.append("CallerReference: " + getCallerReference() + ",");
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

        hashCode = prime * hashCode
                + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode());
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

        if (obj instanceof FieldLevelEncryptionConfig == false)
            return false;
        FieldLevelEncryptionConfig other = (FieldLevelEncryptionConfig) obj;

        if (other.getCallerReference() == null ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null
                && other.getCallerReference().equals(this.getCallerReference()) == false)
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
