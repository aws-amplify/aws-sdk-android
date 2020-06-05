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
 * A field-level encryption content type profile.
 * </p>
 */
public class ContentTypeProfile implements Serializable {
    /**
     * <p>
     * The format for a field-level encryption content type-profile mapping.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>URLEncoded
     */
    private String format;

    /**
     * <p>
     * The profile ID for a field-level encryption content type-profile mapping.
     * </p>
     */
    private String profileId;

    /**
     * <p>
     * The content type for a field-level encryption content type-profile
     * mapping.
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * The format for a field-level encryption content type-profile mapping.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>URLEncoded
     *
     * @return <p>
     *         The format for a field-level encryption content type-profile
     *         mapping.
     *         </p>
     * @see Format
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * The format for a field-level encryption content type-profile mapping.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>URLEncoded
     *
     * @param format <p>
     *            The format for a field-level encryption content type-profile
     *            mapping.
     *            </p>
     * @see Format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format for a field-level encryption content type-profile mapping.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>URLEncoded
     *
     * @param format <p>
     *            The format for a field-level encryption content type-profile
     *            mapping.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Format
     */
    public ContentTypeProfile withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p>
     * The format for a field-level encryption content type-profile mapping.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>URLEncoded
     *
     * @param format <p>
     *            The format for a field-level encryption content type-profile
     *            mapping.
     *            </p>
     * @see Format
     */
    public void setFormat(Format format) {
        this.format = format.toString();
    }

    /**
     * <p>
     * The format for a field-level encryption content type-profile mapping.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>URLEncoded
     *
     * @param format <p>
     *            The format for a field-level encryption content type-profile
     *            mapping.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Format
     */
    public ContentTypeProfile withFormat(Format format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The profile ID for a field-level encryption content type-profile mapping.
     * </p>
     *
     * @return <p>
     *         The profile ID for a field-level encryption content type-profile
     *         mapping.
     *         </p>
     */
    public String getProfileId() {
        return profileId;
    }

    /**
     * <p>
     * The profile ID for a field-level encryption content type-profile mapping.
     * </p>
     *
     * @param profileId <p>
     *            The profile ID for a field-level encryption content
     *            type-profile mapping.
     *            </p>
     */
    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    /**
     * <p>
     * The profile ID for a field-level encryption content type-profile mapping.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param profileId <p>
     *            The profile ID for a field-level encryption content
     *            type-profile mapping.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContentTypeProfile withProfileId(String profileId) {
        this.profileId = profileId;
        return this;
    }

    /**
     * <p>
     * The content type for a field-level encryption content type-profile
     * mapping.
     * </p>
     *
     * @return <p>
     *         The content type for a field-level encryption content
     *         type-profile mapping.
     *         </p>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * The content type for a field-level encryption content type-profile
     * mapping.
     * </p>
     *
     * @param contentType <p>
     *            The content type for a field-level encryption content
     *            type-profile mapping.
     *            </p>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type for a field-level encryption content type-profile
     * mapping.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentType <p>
     *            The content type for a field-level encryption content
     *            type-profile mapping.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContentTypeProfile withContentType(String contentType) {
        this.contentType = contentType;
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
        if (getFormat() != null)
            sb.append("Format: " + getFormat() + ",");
        if (getProfileId() != null)
            sb.append("ProfileId: " + getProfileId() + ",");
        if (getContentType() != null)
            sb.append("ContentType: " + getContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getProfileId() == null) ? 0 : getProfileId().hashCode());
        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContentTypeProfile == false)
            return false;
        ContentTypeProfile other = (ContentTypeProfile) obj;

        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getProfileId() == null ^ this.getProfileId() == null)
            return false;
        if (other.getProfileId() != null
                && other.getProfileId().equals(this.getProfileId()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        return true;
    }
}
