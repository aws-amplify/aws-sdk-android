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

package com.amazonaws.services.athena.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds one or more tags to an Athena resource. A tag is a label that you assign
 * to a resource. In Athena, a resource can be a workgroup or data catalog. Each
 * tag consists of a key and an optional value, both of which you define. For
 * example, you can use tags to categorize Athena workgroups or data catalogs by
 * purpose, owner, or environment. Use a consistent set of tag keys to make it
 * easier to search and filter workgroups or data catalogs in your account. For
 * best practices, see <a href=
 * "https://aws.amazon.com/answers/account-management/aws-tagging-strategies/"
 * >Tagging Best Practices</a>. Tag keys can be from 1 to 128 UTF-8 Unicode
 * characters, and tag values can be from 0 to 256 UTF-8 Unicode characters.
 * Tags can use letters and numbers representable in UTF-8, and the following
 * characters: + - = . _ : / @. Tag keys and values are case-sensitive. Tag keys
 * must be unique per resource. If you specify more than one tag, separate them
 * by commas.
 * </p>
 */
public class TagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies the ARN of the Athena resource (workgroup or data catalog) to
     * which tags are to be added.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     */
    private String resourceARN;

    /**
     * <p>
     * A collection of one or more tags, separated by commas, to be added to an
     * Athena workgroup or data catalog resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Specifies the ARN of the Athena resource (workgroup or data catalog) to
     * which tags are to be added.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     *
     * @return <p>
     *         Specifies the ARN of the Athena resource (workgroup or data
     *         catalog) to which tags are to be added.
     *         </p>
     */
    public String getResourceARN() {
        return resourceARN;
    }

    /**
     * <p>
     * Specifies the ARN of the Athena resource (workgroup or data catalog) to
     * which tags are to be added.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     *
     * @param resourceARN <p>
     *            Specifies the ARN of the Athena resource (workgroup or data
     *            catalog) to which tags are to be added.
     *            </p>
     */
    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * Specifies the ARN of the Athena resource (workgroup or data catalog) to
     * which tags are to be added.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     *
     * @param resourceARN <p>
     *            Specifies the ARN of the Athena resource (workgroup or data
     *            catalog) to which tags are to be added.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourceRequest withResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
        return this;
    }

    /**
     * <p>
     * A collection of one or more tags, separated by commas, to be added to an
     * Athena workgroup or data catalog resource.
     * </p>
     *
     * @return <p>
     *         A collection of one or more tags, separated by commas, to be
     *         added to an Athena workgroup or data catalog resource.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A collection of one or more tags, separated by commas, to be added to an
     * Athena workgroup or data catalog resource.
     * </p>
     *
     * @param tags <p>
     *            A collection of one or more tags, separated by commas, to be
     *            added to an Athena workgroup or data catalog resource.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A collection of one or more tags, separated by commas, to be added to an
     * Athena workgroup or data catalog resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A collection of one or more tags, separated by commas, to be
     *            added to an Athena workgroup or data catalog resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourceRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A collection of one or more tags, separated by commas, to be added to an
     * Athena workgroup or data catalog resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A collection of one or more tags, separated by commas, to be
     *            added to an Athena workgroup or data catalog resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getResourceARN() != null)
            sb.append("ResourceARN: " + getResourceARN() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagResourceRequest == false)
            return false;
        TagResourceRequest other = (TagResourceRequest) obj;

        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null
                && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
