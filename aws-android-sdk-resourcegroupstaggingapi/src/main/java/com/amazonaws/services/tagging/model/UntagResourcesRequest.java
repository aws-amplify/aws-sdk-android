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

package com.amazonaws.services.tagging.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes the specified tags from the specified resources. When you specify a
 * tag key, the action removes both that key and its associated value. The
 * operation succeeds even if you attempt to remove tags from a resource that
 * were already removed. Note the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * To remove tags from a resource, you need the necessary permissions for the
 * service that the resource belongs to as well as permissions for removing
 * tags. For more information, see <a href=
 * "http://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/Welcome.html"
 * >this list</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You can only tag resources that are located in the specified Region for the
 * AWS account.
 * </p>
 * </li>
 * </ul>
 */
public class UntagResourcesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a
     * resource. For more information, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     */
    private java.util.List<String> resourceARNList;

    /**
     * <p>
     * A list of the tag keys that you want to remove from the specified
     * resources.
     * </p>
     */
    private java.util.List<String> tagKeys;

    /**
     * <p>
     * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a
     * resource. For more information, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     *
     * @return <p>
     *         A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies
     *         a resource. For more information, see <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in
     *         the <i>AWS General Reference</i>.
     *         </p>
     */
    public java.util.List<String> getResourceARNList() {
        return resourceARNList;
    }

    /**
     * <p>
     * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a
     * resource. For more information, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     *
     * @param resourceARNList <p>
     *            A list of ARNs. An ARN (Amazon Resource Name) uniquely
     *            identifies a resource. For more information, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>
     *            in the <i>AWS General Reference</i>.
     *            </p>
     */
    public void setResourceARNList(java.util.Collection<String> resourceARNList) {
        if (resourceARNList == null) {
            this.resourceARNList = null;
            return;
        }

        this.resourceARNList = new java.util.ArrayList<String>(resourceARNList);
    }

    /**
     * <p>
     * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a
     * resource. For more information, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceARNList <p>
     *            A list of ARNs. An ARN (Amazon Resource Name) uniquely
     *            identifies a resource. For more information, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>
     *            in the <i>AWS General Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResourcesRequest withResourceARNList(String... resourceARNList) {
        if (getResourceARNList() == null) {
            this.resourceARNList = new java.util.ArrayList<String>(resourceARNList.length);
        }
        for (String value : resourceARNList) {
            this.resourceARNList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a
     * resource. For more information, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceARNList <p>
     *            A list of ARNs. An ARN (Amazon Resource Name) uniquely
     *            identifies a resource. For more information, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>
     *            in the <i>AWS General Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResourcesRequest withResourceARNList(java.util.Collection<String> resourceARNList) {
        setResourceARNList(resourceARNList);
        return this;
    }

    /**
     * <p>
     * A list of the tag keys that you want to remove from the specified
     * resources.
     * </p>
     *
     * @return <p>
     *         A list of the tag keys that you want to remove from the specified
     *         resources.
     *         </p>
     */
    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * A list of the tag keys that you want to remove from the specified
     * resources.
     * </p>
     *
     * @param tagKeys <p>
     *            A list of the tag keys that you want to remove from the
     *            specified resources.
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
     * A list of the tag keys that you want to remove from the specified
     * resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            A list of the tag keys that you want to remove from the
     *            specified resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResourcesRequest withTagKeys(String... tagKeys) {
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
     * A list of the tag keys that you want to remove from the specified
     * resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            A list of the tag keys that you want to remove from the
     *            specified resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResourcesRequest withTagKeys(java.util.Collection<String> tagKeys) {
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
        if (getResourceARNList() != null)
            sb.append("ResourceARNList: " + getResourceARNList() + ",");
        if (getTagKeys() != null)
            sb.append("TagKeys: " + getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceARNList() == null) ? 0 : getResourceARNList().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UntagResourcesRequest == false)
            return false;
        UntagResourcesRequest other = (UntagResourcesRequest) obj;

        if (other.getResourceARNList() == null ^ this.getResourceARNList() == null)
            return false;
        if (other.getResourceARNList() != null
                && other.getResourceARNList().equals(this.getResourceARNList()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }
}
