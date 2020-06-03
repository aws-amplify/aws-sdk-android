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

package com.amazonaws.services.es.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Attaches tags to an existing Elasticsearch domain. Tags are a set of
 * case-sensitive key value pairs. An Elasticsearch domain may have up to 10
 * tags. See <a href=
 * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-awsresorcetagging"
 * target="_blank"> Tagging Amazon Elasticsearch Service Domains for more
 * information.</a>
 * </p>
 */
public class AddTagsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specify the <code>ARN</code> for which you want to add the tags.
     * </p>
     */
    private String aRN;

    /**
     * <p>
     * List of <code>Tag</code> that need to be added for the Elasticsearch
     * domain.
     * </p>
     */
    private java.util.List<Tag> tagList;

    /**
     * <p>
     * Specify the <code>ARN</code> for which you want to add the tags.
     * </p>
     *
     * @return <p>
     *         Specify the <code>ARN</code> for which you want to add the tags.
     *         </p>
     */
    public String getARN() {
        return aRN;
    }

    /**
     * <p>
     * Specify the <code>ARN</code> for which you want to add the tags.
     * </p>
     *
     * @param aRN <p>
     *            Specify the <code>ARN</code> for which you want to add the
     *            tags.
     *            </p>
     */
    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * Specify the <code>ARN</code> for which you want to add the tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aRN <p>
     *            Specify the <code>ARN</code> for which you want to add the
     *            tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddTagsRequest withARN(String aRN) {
        this.aRN = aRN;
        return this;
    }

    /**
     * <p>
     * List of <code>Tag</code> that need to be added for the Elasticsearch
     * domain.
     * </p>
     *
     * @return <p>
     *         List of <code>Tag</code> that need to be added for the
     *         Elasticsearch domain.
     *         </p>
     */
    public java.util.List<Tag> getTagList() {
        return tagList;
    }

    /**
     * <p>
     * List of <code>Tag</code> that need to be added for the Elasticsearch
     * domain.
     * </p>
     *
     * @param tagList <p>
     *            List of <code>Tag</code> that need to be added for the
     *            Elasticsearch domain.
     *            </p>
     */
    public void setTagList(java.util.Collection<Tag> tagList) {
        if (tagList == null) {
            this.tagList = null;
            return;
        }

        this.tagList = new java.util.ArrayList<Tag>(tagList);
    }

    /**
     * <p>
     * List of <code>Tag</code> that need to be added for the Elasticsearch
     * domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagList <p>
     *            List of <code>Tag</code> that need to be added for the
     *            Elasticsearch domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddTagsRequest withTagList(Tag... tagList) {
        if (getTagList() == null) {
            this.tagList = new java.util.ArrayList<Tag>(tagList.length);
        }
        for (Tag value : tagList) {
            this.tagList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of <code>Tag</code> that need to be added for the Elasticsearch
     * domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagList <p>
     *            List of <code>Tag</code> that need to be added for the
     *            Elasticsearch domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddTagsRequest withTagList(java.util.Collection<Tag> tagList) {
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
        if (getARN() != null)
            sb.append("ARN: " + getARN() + ",");
        if (getTagList() != null)
            sb.append("TagList: " + getTagList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddTagsRequest == false)
            return false;
        AddTagsRequest other = (AddTagsRequest) obj;

        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getTagList() == null ^ this.getTagList() == null)
            return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false)
            return false;
        return true;
    }
}
