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

package com.amazonaws.services.backup.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes a set of key-value pairs from a recovery point, backup plan, or
 * backup vault identified by an Amazon Resource Name (ARN)
 * </p>
 */
public class UntagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends
     * on the type of the tagged resource.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * A list of keys to identify which key-value tags to remove from a
     * resource.
     * </p>
     */
    private java.util.List<String> tagKeyList;

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends
     * on the type of the tagged resource.
     * </p>
     *
     * @return <p>
     *         An ARN that uniquely identifies a resource. The format of the ARN
     *         depends on the type of the tagged resource.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends
     * on the type of the tagged resource.
     * </p>
     *
     * @param resourceArn <p>
     *            An ARN that uniquely identifies a resource. The format of the
     *            ARN depends on the type of the tagged resource.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends
     * on the type of the tagged resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArn <p>
     *            An ARN that uniquely identifies a resource. The format of the
     *            ARN depends on the type of the tagged resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResourceRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * A list of keys to identify which key-value tags to remove from a
     * resource.
     * </p>
     *
     * @return <p>
     *         A list of keys to identify which key-value tags to remove from a
     *         resource.
     *         </p>
     */
    public java.util.List<String> getTagKeyList() {
        return tagKeyList;
    }

    /**
     * <p>
     * A list of keys to identify which key-value tags to remove from a
     * resource.
     * </p>
     *
     * @param tagKeyList <p>
     *            A list of keys to identify which key-value tags to remove from
     *            a resource.
     *            </p>
     */
    public void setTagKeyList(java.util.Collection<String> tagKeyList) {
        if (tagKeyList == null) {
            this.tagKeyList = null;
            return;
        }

        this.tagKeyList = new java.util.ArrayList<String>(tagKeyList);
    }

    /**
     * <p>
     * A list of keys to identify which key-value tags to remove from a
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeyList <p>
     *            A list of keys to identify which key-value tags to remove from
     *            a resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResourceRequest withTagKeyList(String... tagKeyList) {
        if (getTagKeyList() == null) {
            this.tagKeyList = new java.util.ArrayList<String>(tagKeyList.length);
        }
        for (String value : tagKeyList) {
            this.tagKeyList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of keys to identify which key-value tags to remove from a
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeyList <p>
     *            A list of keys to identify which key-value tags to remove from
     *            a resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResourceRequest withTagKeyList(java.util.Collection<String> tagKeyList) {
        setTagKeyList(tagKeyList);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: " + getResourceArn() + ",");
        if (getTagKeyList() != null)
            sb.append("TagKeyList: " + getTagKeyList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getTagKeyList() == null) ? 0 : getTagKeyList().hashCode());
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

        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getTagKeyList() == null ^ this.getTagKeyList() == null)
            return false;
        if (other.getTagKeyList() != null
                && other.getTagKeyList().equals(this.getTagKeyList()) == false)
            return false;
        return true;
    }
}
