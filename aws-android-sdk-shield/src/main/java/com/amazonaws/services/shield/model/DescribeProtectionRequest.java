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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the details of a <a>Protection</a> object.
 * </p>
 */
public class DescribeProtectionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier (ID) for the <a>Protection</a> object that is
     * described. When submitting the <code>DescribeProtection</code> request
     * you must provide either the <code>ResourceArn</code> or the
     * <code>ProtectionID</code>, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\\-]*<br/>
     */
    private String protectionId;

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the AWS resource for the
     * <a>Protection</a> object that is described. When submitting the
     * <code>DescribeProtection</code> request you must provide either the
     * <code>ResourceArn</code> or the <code>ProtectionID</code>, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws.*<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * The unique identifier (ID) for the <a>Protection</a> object that is
     * described. When submitting the <code>DescribeProtection</code> request
     * you must provide either the <code>ResourceArn</code> or the
     * <code>ProtectionID</code>, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\\-]*<br/>
     *
     * @return <p>
     *         The unique identifier (ID) for the <a>Protection</a> object that
     *         is described. When submitting the <code>DescribeProtection</code>
     *         request you must provide either the <code>ResourceArn</code> or
     *         the <code>ProtectionID</code>, but not both.
     *         </p>
     */
    public String getProtectionId() {
        return protectionId;
    }

    /**
     * <p>
     * The unique identifier (ID) for the <a>Protection</a> object that is
     * described. When submitting the <code>DescribeProtection</code> request
     * you must provide either the <code>ResourceArn</code> or the
     * <code>ProtectionID</code>, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\\-]*<br/>
     *
     * @param protectionId <p>
     *            The unique identifier (ID) for the <a>Protection</a> object
     *            that is described. When submitting the
     *            <code>DescribeProtection</code> request you must provide
     *            either the <code>ResourceArn</code> or the
     *            <code>ProtectionID</code>, but not both.
     *            </p>
     */
    public void setProtectionId(String protectionId) {
        this.protectionId = protectionId;
    }

    /**
     * <p>
     * The unique identifier (ID) for the <a>Protection</a> object that is
     * described. When submitting the <code>DescribeProtection</code> request
     * you must provide either the <code>ResourceArn</code> or the
     * <code>ProtectionID</code>, but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\\-]*<br/>
     *
     * @param protectionId <p>
     *            The unique identifier (ID) for the <a>Protection</a> object
     *            that is described. When submitting the
     *            <code>DescribeProtection</code> request you must provide
     *            either the <code>ResourceArn</code> or the
     *            <code>ProtectionID</code>, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProtectionRequest withProtectionId(String protectionId) {
        this.protectionId = protectionId;
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the AWS resource for the
     * <a>Protection</a> object that is described. When submitting the
     * <code>DescribeProtection</code> request you must provide either the
     * <code>ResourceArn</code> or the <code>ProtectionID</code>, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws.*<br/>
     *
     * @return <p>
     *         The ARN (Amazon Resource Name) of the AWS resource for the
     *         <a>Protection</a> object that is described. When submitting the
     *         <code>DescribeProtection</code> request you must provide either
     *         the <code>ResourceArn</code> or the <code>ProtectionID</code>,
     *         but not both.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the AWS resource for the
     * <a>Protection</a> object that is described. When submitting the
     * <code>DescribeProtection</code> request you must provide either the
     * <code>ResourceArn</code> or the <code>ProtectionID</code>, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws.*<br/>
     *
     * @param resourceArn <p>
     *            The ARN (Amazon Resource Name) of the AWS resource for the
     *            <a>Protection</a> object that is described. When submitting
     *            the <code>DescribeProtection</code> request you must provide
     *            either the <code>ResourceArn</code> or the
     *            <code>ProtectionID</code>, but not both.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the AWS resource for the
     * <a>Protection</a> object that is described. When submitting the
     * <code>DescribeProtection</code> request you must provide either the
     * <code>ResourceArn</code> or the <code>ProtectionID</code>, but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws.*<br/>
     *
     * @param resourceArn <p>
     *            The ARN (Amazon Resource Name) of the AWS resource for the
     *            <a>Protection</a> object that is described. When submitting
     *            the <code>DescribeProtection</code> request you must provide
     *            either the <code>ResourceArn</code> or the
     *            <code>ProtectionID</code>, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProtectionRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
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
        if (getProtectionId() != null)
            sb.append("ProtectionId: " + getProtectionId() + ",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: " + getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProtectionId() == null) ? 0 : getProtectionId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProtectionRequest == false)
            return false;
        DescribeProtectionRequest other = (DescribeProtectionRequest) obj;

        if (other.getProtectionId() == null ^ this.getProtectionId() == null)
            return false;
        if (other.getProtectionId() != null
                && other.getProtectionId().equals(this.getProtectionId()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }
}
