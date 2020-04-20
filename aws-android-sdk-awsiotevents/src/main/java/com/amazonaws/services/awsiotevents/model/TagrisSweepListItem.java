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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

public class TagrisSweepListItem implements Serializable {
    /**
     * The new value for the tagrisAccountId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     */
    private String tagrisAccountId;

    /**
     * The new value for the tagrisAmazonResourceName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     */
    private String tagrisAmazonResourceName;

    /**
     * The new value for the tagrisInternalId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     */
    private String tagrisInternalId;

    /**
     * The new value for the tagrisVersion property for this object.
     */
    private Long tagrisVersion;

    /**
     * Returns the value of the tagrisAccountId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     *
     * @return The value of the tagrisAccountId property for this object.
     */
    public String getTagrisAccountId() {
        return tagrisAccountId;
    }

    /**
     * Sets the value of tagrisAccountId
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     *
     * @param tagrisAccountId The new value for the tagrisAccountId property for
     *            this object.
     */
    public void setTagrisAccountId(String tagrisAccountId) {
        this.tagrisAccountId = tagrisAccountId;
    }

    /**
     * Sets the value of the tagrisAccountId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     *
     * @param tagrisAccountId The new value for the tagrisAccountId property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagrisSweepListItem withTagrisAccountId(String tagrisAccountId) {
        this.tagrisAccountId = tagrisAccountId;
        return this;
    }

    /**
     * Returns the value of the tagrisAmazonResourceName property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     *
     * @return The value of the tagrisAmazonResourceName property for this
     *         object.
     */
    public String getTagrisAmazonResourceName() {
        return tagrisAmazonResourceName;
    }

    /**
     * Sets the value of tagrisAmazonResourceName
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     *
     * @param tagrisAmazonResourceName The new value for the
     *            tagrisAmazonResourceName property for this object.
     */
    public void setTagrisAmazonResourceName(String tagrisAmazonResourceName) {
        this.tagrisAmazonResourceName = tagrisAmazonResourceName;
    }

    /**
     * Sets the value of the tagrisAmazonResourceName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     *
     * @param tagrisAmazonResourceName The new value for the
     *            tagrisAmazonResourceName property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagrisSweepListItem withTagrisAmazonResourceName(String tagrisAmazonResourceName) {
        this.tagrisAmazonResourceName = tagrisAmazonResourceName;
        return this;
    }

    /**
     * Returns the value of the tagrisInternalId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return The value of the tagrisInternalId property for this object.
     */
    public String getTagrisInternalId() {
        return tagrisInternalId;
    }

    /**
     * Sets the value of tagrisInternalId
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param tagrisInternalId The new value for the tagrisInternalId property
     *            for this object.
     */
    public void setTagrisInternalId(String tagrisInternalId) {
        this.tagrisInternalId = tagrisInternalId;
    }

    /**
     * Sets the value of the tagrisInternalId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param tagrisInternalId The new value for the tagrisInternalId property
     *            for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagrisSweepListItem withTagrisInternalId(String tagrisInternalId) {
        this.tagrisInternalId = tagrisInternalId;
        return this;
    }

    /**
     * Returns the value of the tagrisVersion property for this object.
     *
     * @return The value of the tagrisVersion property for this object.
     */
    public Long getTagrisVersion() {
        return tagrisVersion;
    }

    /**
     * Sets the value of tagrisVersion
     *
     * @param tagrisVersion The new value for the tagrisVersion property for
     *            this object.
     */
    public void setTagrisVersion(Long tagrisVersion) {
        this.tagrisVersion = tagrisVersion;
    }

    /**
     * Sets the value of the tagrisVersion property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagrisVersion The new value for the tagrisVersion property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagrisSweepListItem withTagrisVersion(Long tagrisVersion) {
        this.tagrisVersion = tagrisVersion;
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
        if (getTagrisAccountId() != null)
            sb.append("TagrisAccountId: " + getTagrisAccountId() + ",");
        if (getTagrisAmazonResourceName() != null)
            sb.append("TagrisAmazonResourceName: " + getTagrisAmazonResourceName() + ",");
        if (getTagrisInternalId() != null)
            sb.append("TagrisInternalId: " + getTagrisInternalId() + ",");
        if (getTagrisVersion() != null)
            sb.append("TagrisVersion: " + getTagrisVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTagrisAccountId() == null) ? 0 : getTagrisAccountId().hashCode());
        hashCode = prime
                * hashCode
                + ((getTagrisAmazonResourceName() == null) ? 0 : getTagrisAmazonResourceName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTagrisInternalId() == null) ? 0 : getTagrisInternalId().hashCode());
        hashCode = prime * hashCode
                + ((getTagrisVersion() == null) ? 0 : getTagrisVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagrisSweepListItem == false)
            return false;
        TagrisSweepListItem other = (TagrisSweepListItem) obj;

        if (other.getTagrisAccountId() == null ^ this.getTagrisAccountId() == null)
            return false;
        if (other.getTagrisAccountId() != null
                && other.getTagrisAccountId().equals(this.getTagrisAccountId()) == false)
            return false;
        if (other.getTagrisAmazonResourceName() == null
                ^ this.getTagrisAmazonResourceName() == null)
            return false;
        if (other.getTagrisAmazonResourceName() != null
                && other.getTagrisAmazonResourceName().equals(this.getTagrisAmazonResourceName()) == false)
            return false;
        if (other.getTagrisInternalId() == null ^ this.getTagrisInternalId() == null)
            return false;
        if (other.getTagrisInternalId() != null
                && other.getTagrisInternalId().equals(this.getTagrisInternalId()) == false)
            return false;
        if (other.getTagrisVersion() == null ^ this.getTagrisVersion() == null)
            return false;
        if (other.getTagrisVersion() != null
                && other.getTagrisVersion().equals(this.getTagrisVersion()) == false)
            return false;
        return true;
    }
}
