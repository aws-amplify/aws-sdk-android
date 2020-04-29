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

package com.amazonaws.services.awswafregional.model;

import java.io.Serializable;

/**
 * <note>
 * <p>
 * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
 * >AWS WAF Classic</a> in the developer guide.
 * </p>
 * <p>
 * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the
 * <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS
 * WAF Developer Guide</a>. With the latest version, AWS WAF has a single set of
 * endpoints for regional and global use.
 * </p>
 * </note>
 * <p>
 * Information for a tag associated with an AWS resource. Tags are key:value
 * pairs that you can use to categorize and manage your resources, for purposes
 * like billing. For example, you might set the tag key to "customer" and the
 * value to the customer name or ID. You can specify one or more tags to add to
 * each AWS resource, up to 50 tags for a resource.
 * </p>
 * <p>
 * Tagging is only available through the API, SDKs, and CLI. You can't manage or
 * view tags through the AWS WAF Classic console. You can tag the AWS resources
 * that you manage through AWS WAF Classic: web ACLs, rule groups, and rules.
 * </p>
 */
public class TagInfoForResource implements Serializable {
    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String resourceARN;

    /**
     * <p/>
     */
    private java.util.List<Tag> tagList;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p/>
     */
    public String getResourceARN() {
        return resourceARN;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param resourceARN <p/>
     */
    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param resourceARN <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagInfoForResource withResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public java.util.List<Tag> getTagList() {
        return tagList;
    }

    /**
     * <p/>
     *
     * @param tagList <p/>
     */
    public void setTagList(java.util.Collection<Tag> tagList) {
        if (tagList == null) {
            this.tagList = null;
            return;
        }

        this.tagList = new java.util.ArrayList<Tag>(tagList);
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagList <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagInfoForResource withTagList(Tag... tagList) {
        if (getTagList() == null) {
            this.tagList = new java.util.ArrayList<Tag>(tagList.length);
        }
        for (Tag value : tagList) {
            this.tagList.add(value);
        }
        return this;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagList <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagInfoForResource withTagList(java.util.Collection<Tag> tagList) {
        setTagList(tagList);
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
        if (getTagList() != null)
            sb.append("TagList: " + getTagList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagInfoForResource == false)
            return false;
        TagInfoForResource other = (TagInfoForResource) obj;

        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null
                && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getTagList() == null ^ this.getTagList() == null)
            return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false)
            return false;
        return true;
    }
}
