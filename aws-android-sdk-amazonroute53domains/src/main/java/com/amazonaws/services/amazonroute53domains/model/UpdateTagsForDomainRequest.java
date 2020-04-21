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

package com.amazonaws.services.amazonroute53domains.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This operation adds or updates tags for a specified domain.
 * </p>
 * <p>
 * All tag operations are eventually consistent; subsequent operations might not
 * immediately represent all issued operations.
 * </p>
 */
public class UpdateTagsForDomainRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The domain for which you want to add or update tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String domainName;

    /**
     * <p>
     * A list of the tag keys and values that you want to add or update. If you
     * specify a key that already exists, the corresponding value will be
     * replaced.
     * </p>
     */
    private java.util.List<Tag> tagsToUpdate;

    /**
     * <p>
     * The domain for which you want to add or update tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The domain for which you want to add or update tags.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The domain for which you want to add or update tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The domain for which you want to add or update tags.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain for which you want to add or update tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The domain for which you want to add or update tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTagsForDomainRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to add or update. If you
     * specify a key that already exists, the corresponding value will be
     * replaced.
     * </p>
     *
     * @return <p>
     *         A list of the tag keys and values that you want to add or update.
     *         If you specify a key that already exists, the corresponding value
     *         will be replaced.
     *         </p>
     */
    public java.util.List<Tag> getTagsToUpdate() {
        return tagsToUpdate;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to add or update. If you
     * specify a key that already exists, the corresponding value will be
     * replaced.
     * </p>
     *
     * @param tagsToUpdate <p>
     *            A list of the tag keys and values that you want to add or
     *            update. If you specify a key that already exists, the
     *            corresponding value will be replaced.
     *            </p>
     */
    public void setTagsToUpdate(java.util.Collection<Tag> tagsToUpdate) {
        if (tagsToUpdate == null) {
            this.tagsToUpdate = null;
            return;
        }

        this.tagsToUpdate = new java.util.ArrayList<Tag>(tagsToUpdate);
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to add or update. If you
     * specify a key that already exists, the corresponding value will be
     * replaced.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagsToUpdate <p>
     *            A list of the tag keys and values that you want to add or
     *            update. If you specify a key that already exists, the
     *            corresponding value will be replaced.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTagsForDomainRequest withTagsToUpdate(Tag... tagsToUpdate) {
        if (getTagsToUpdate() == null) {
            this.tagsToUpdate = new java.util.ArrayList<Tag>(tagsToUpdate.length);
        }
        for (Tag value : tagsToUpdate) {
            this.tagsToUpdate.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to add or update. If you
     * specify a key that already exists, the corresponding value will be
     * replaced.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagsToUpdate <p>
     *            A list of the tag keys and values that you want to add or
     *            update. If you specify a key that already exists, the
     *            corresponding value will be replaced.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTagsForDomainRequest withTagsToUpdate(java.util.Collection<Tag> tagsToUpdate) {
        setTagsToUpdate(tagsToUpdate);
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
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getTagsToUpdate() != null)
            sb.append("TagsToUpdate: " + getTagsToUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getTagsToUpdate() == null) ? 0 : getTagsToUpdate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTagsForDomainRequest == false)
            return false;
        UpdateTagsForDomainRequest other = (UpdateTagsForDomainRequest) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getTagsToUpdate() == null ^ this.getTagsToUpdate() == null)
            return false;
        if (other.getTagsToUpdate() != null
                && other.getTagsToUpdate().equals(this.getTagsToUpdate()) == false)
            return false;
        return true;
    }
}
