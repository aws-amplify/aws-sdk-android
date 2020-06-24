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

package com.amazonaws.services.organizations.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes a tag from the specified resource.
 * </p>
 * <p>
 * Currently, you can tag and untag accounts in AWS Organizations.
 * </p>
 * <p>
 * This operation can be called only from the organization's master account.
 * </p>
 */
public class UntagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the resource to remove the tag from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 12<br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     */
    private String resourceId;

    /**
     * <p>
     * The tag to remove from the specified resource.
     * </p>
     */
    private java.util.List<String> tagKeys;

    /**
     * <p>
     * The ID of the resource to remove the tag from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 12<br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @return <p>
     *         The ID of the resource to remove the tag from.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * The ID of the resource to remove the tag from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 12<br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param resourceId <p>
     *            The ID of the resource to remove the tag from.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource to remove the tag from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 12<br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param resourceId <p>
     *            The ID of the resource to remove the tag from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResourceRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>
     * The tag to remove from the specified resource.
     * </p>
     *
     * @return <p>
     *         The tag to remove from the specified resource.
     *         </p>
     */
    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * The tag to remove from the specified resource.
     * </p>
     *
     * @param tagKeys <p>
     *            The tag to remove from the specified resource.
     *            </p>
     */
    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new java.util.ArrayList<String>(tagKeys);
    }

    /**
     * <p>
     * The tag to remove from the specified resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            The tag to remove from the specified resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResourceRequest withTagKeys(String... tagKeys) {
        if (getTagKeys() == null) {
            this.tagKeys = new java.util.ArrayList<String>(tagKeys.length);
        }
        for (String value : tagKeys) {
            this.tagKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tag to remove from the specified resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            The tag to remove from the specified resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResourceRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
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
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getTagKeys() != null)
            sb.append("TagKeys: " + getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UntagResourceRequest == false)
            return false;
        UntagResourceRequest other = (UntagResourceRequest) obj;

        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }
}
