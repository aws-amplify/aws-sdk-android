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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes the tags associated with the specified AWS Direct Connect
 * resources.
 * </p>
 */
public class DescribeTagsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the resources.
     * </p>
     */
    private java.util.List<String> resourceArns;

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the resources.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Names (ARNs) of the resources.
     *         </p>
     */
    public java.util.List<String> getResourceArns() {
        return resourceArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the resources.
     * </p>
     *
     * @param resourceArns <p>
     *            The Amazon Resource Names (ARNs) of the resources.
     *            </p>
     */
    public void setResourceArns(java.util.Collection<String> resourceArns) {
        if (resourceArns == null) {
            this.resourceArns = null;
            return;
        }

        this.resourceArns = new java.util.ArrayList<String>(resourceArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArns <p>
     *            The Amazon Resource Names (ARNs) of the resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTagsRequest withResourceArns(String... resourceArns) {
        if (getResourceArns() == null) {
            this.resourceArns = new java.util.ArrayList<String>(resourceArns.length);
        }
        for (String value : resourceArns) {
            this.resourceArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArns <p>
     *            The Amazon Resource Names (ARNs) of the resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTagsRequest withResourceArns(java.util.Collection<String> resourceArns) {
        setResourceArns(resourceArns);
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
        if (getResourceArns() != null)
            sb.append("resourceArns: " + getResourceArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceArns() == null) ? 0 : getResourceArns().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTagsRequest == false)
            return false;
        DescribeTagsRequest other = (DescribeTagsRequest) obj;

        if (other.getResourceArns() == null ^ this.getResourceArns() == null)
            return false;
        if (other.getResourceArns() != null
                && other.getResourceArns().equals(this.getResourceArns()) == false)
            return false;
        return true;
    }
}
