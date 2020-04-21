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
 * This operation deletes the specified tags for a domain.
 * </p>
 * <p>
 * All tag operations are eventually consistent; subsequent operations might not
 * immediately represent all issued operations.
 * </p>
 */
public class DeleteTagsForDomainRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The domain for which you want to delete one or more tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String domainName;

    /**
     * <p>
     * A list of tag keys to delete.
     * </p>
     */
    private java.util.List<String> tagsToDelete;

    /**
     * <p>
     * The domain for which you want to delete one or more tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The domain for which you want to delete one or more tags.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The domain for which you want to delete one or more tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The domain for which you want to delete one or more tags.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain for which you want to delete one or more tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The domain for which you want to delete one or more tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteTagsForDomainRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * A list of tag keys to delete.
     * </p>
     *
     * @return <p>
     *         A list of tag keys to delete.
     *         </p>
     */
    public java.util.List<String> getTagsToDelete() {
        return tagsToDelete;
    }

    /**
     * <p>
     * A list of tag keys to delete.
     * </p>
     *
     * @param tagsToDelete <p>
     *            A list of tag keys to delete.
     *            </p>
     */
    public void setTagsToDelete(java.util.Collection<String> tagsToDelete) {
        if (tagsToDelete == null) {
            this.tagsToDelete = null;
            return;
        }

        this.tagsToDelete = new java.util.ArrayList<String>(tagsToDelete);
    }

    /**
     * <p>
     * A list of tag keys to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagsToDelete <p>
     *            A list of tag keys to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteTagsForDomainRequest withTagsToDelete(String... tagsToDelete) {
        if (getTagsToDelete() == null) {
            this.tagsToDelete = new java.util.ArrayList<String>(tagsToDelete.length);
        }
        for (String value : tagsToDelete) {
            this.tagsToDelete.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of tag keys to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagsToDelete <p>
     *            A list of tag keys to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteTagsForDomainRequest withTagsToDelete(java.util.Collection<String> tagsToDelete) {
        setTagsToDelete(tagsToDelete);
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
        if (getTagsToDelete() != null)
            sb.append("TagsToDelete: " + getTagsToDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getTagsToDelete() == null) ? 0 : getTagsToDelete().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTagsForDomainRequest == false)
            return false;
        DeleteTagsForDomainRequest other = (DeleteTagsForDomainRequest) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getTagsToDelete() == null ^ this.getTagsToDelete() == null)
            return false;
        if (other.getTagsToDelete() != null
                && other.getTagsToDelete().equals(this.getTagsToDelete()) == false)
            return false;
        return true;
    }
}
