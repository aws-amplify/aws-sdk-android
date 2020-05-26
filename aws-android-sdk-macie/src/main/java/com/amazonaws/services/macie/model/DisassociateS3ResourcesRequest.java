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

package com.amazonaws.services.macie.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes specified S3 resources from being monitored by Amazon Macie Classic.
 * If memberAccountId isn't specified, the action removes specified S3 resources
 * from Macie Classic for the current master account. If memberAccountId is
 * specified, the action removes specified S3 resources from Macie Classic for
 * the specified member account.
 * </p>
 */
public class DisassociateS3ResourcesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the Amazon Macie Classic member account whose resources you
     * want to remove from being monitored by Amazon Macie Classic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     */
    private String memberAccountId;

    /**
     * <p>
     * The S3 resources (buckets or prefixes) that you want to remove from being
     * monitored and classified by Amazon Macie Classic.
     * </p>
     */
    private java.util.List<S3Resource> associatedS3Resources;

    /**
     * <p>
     * The ID of the Amazon Macie Classic member account whose resources you
     * want to remove from being monitored by Amazon Macie Classic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @return <p>
     *         The ID of the Amazon Macie Classic member account whose resources
     *         you want to remove from being monitored by Amazon Macie Classic.
     *         </p>
     */
    public String getMemberAccountId() {
        return memberAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Macie Classic member account whose resources you
     * want to remove from being monitored by Amazon Macie Classic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param memberAccountId <p>
     *            The ID of the Amazon Macie Classic member account whose
     *            resources you want to remove from being monitored by Amazon
     *            Macie Classic.
     *            </p>
     */
    public void setMemberAccountId(String memberAccountId) {
        this.memberAccountId = memberAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Macie Classic member account whose resources you
     * want to remove from being monitored by Amazon Macie Classic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param memberAccountId <p>
     *            The ID of the Amazon Macie Classic member account whose
     *            resources you want to remove from being monitored by Amazon
     *            Macie Classic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateS3ResourcesRequest withMemberAccountId(String memberAccountId) {
        this.memberAccountId = memberAccountId;
        return this;
    }

    /**
     * <p>
     * The S3 resources (buckets or prefixes) that you want to remove from being
     * monitored and classified by Amazon Macie Classic.
     * </p>
     *
     * @return <p>
     *         The S3 resources (buckets or prefixes) that you want to remove
     *         from being monitored and classified by Amazon Macie Classic.
     *         </p>
     */
    public java.util.List<S3Resource> getAssociatedS3Resources() {
        return associatedS3Resources;
    }

    /**
     * <p>
     * The S3 resources (buckets or prefixes) that you want to remove from being
     * monitored and classified by Amazon Macie Classic.
     * </p>
     *
     * @param associatedS3Resources <p>
     *            The S3 resources (buckets or prefixes) that you want to remove
     *            from being monitored and classified by Amazon Macie Classic.
     *            </p>
     */
    public void setAssociatedS3Resources(java.util.Collection<S3Resource> associatedS3Resources) {
        if (associatedS3Resources == null) {
            this.associatedS3Resources = null;
            return;
        }

        this.associatedS3Resources = new java.util.ArrayList<S3Resource>(associatedS3Resources);
    }

    /**
     * <p>
     * The S3 resources (buckets or prefixes) that you want to remove from being
     * monitored and classified by Amazon Macie Classic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedS3Resources <p>
     *            The S3 resources (buckets or prefixes) that you want to remove
     *            from being monitored and classified by Amazon Macie Classic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateS3ResourcesRequest withAssociatedS3Resources(
            S3Resource... associatedS3Resources) {
        if (getAssociatedS3Resources() == null) {
            this.associatedS3Resources = new java.util.ArrayList<S3Resource>(
                    associatedS3Resources.length);
        }
        for (S3Resource value : associatedS3Resources) {
            this.associatedS3Resources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The S3 resources (buckets or prefixes) that you want to remove from being
     * monitored and classified by Amazon Macie Classic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedS3Resources <p>
     *            The S3 resources (buckets or prefixes) that you want to remove
     *            from being monitored and classified by Amazon Macie Classic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateS3ResourcesRequest withAssociatedS3Resources(
            java.util.Collection<S3Resource> associatedS3Resources) {
        setAssociatedS3Resources(associatedS3Resources);
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
        if (getMemberAccountId() != null)
            sb.append("memberAccountId: " + getMemberAccountId() + ",");
        if (getAssociatedS3Resources() != null)
            sb.append("associatedS3Resources: " + getAssociatedS3Resources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMemberAccountId() == null) ? 0 : getMemberAccountId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssociatedS3Resources() == null) ? 0 : getAssociatedS3Resources().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateS3ResourcesRequest == false)
            return false;
        DisassociateS3ResourcesRequest other = (DisassociateS3ResourcesRequest) obj;

        if (other.getMemberAccountId() == null ^ this.getMemberAccountId() == null)
            return false;
        if (other.getMemberAccountId() != null
                && other.getMemberAccountId().equals(this.getMemberAccountId()) == false)
            return false;
        if (other.getAssociatedS3Resources() == null ^ this.getAssociatedS3Resources() == null)
            return false;
        if (other.getAssociatedS3Resources() != null
                && other.getAssociatedS3Resources().equals(this.getAssociatedS3Resources()) == false)
            return false;
        return true;
    }
}
