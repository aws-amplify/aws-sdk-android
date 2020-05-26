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
 * Associates specified S3 resources with Amazon Macie Classic for monitoring
 * and data classification. If memberAccountId isn't specified, the action
 * associates specified S3 resources with Macie Classic for the current master
 * account. If memberAccountId is specified, the action associates specified S3
 * resources with Macie Classic for the specified member account.
 * </p>
 */
public class AssociateS3ResourcesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the Amazon Macie Classic member account whose resources you
     * want to associate with Macie Classic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     */
    private String memberAccountId;

    /**
     * <p>
     * The S3 resources that you want to associate with Amazon Macie Classic for
     * monitoring and data classification.
     * </p>
     */
    private java.util.List<S3ResourceClassification> s3Resources;

    /**
     * <p>
     * The ID of the Amazon Macie Classic member account whose resources you
     * want to associate with Macie Classic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @return <p>
     *         The ID of the Amazon Macie Classic member account whose resources
     *         you want to associate with Macie Classic.
     *         </p>
     */
    public String getMemberAccountId() {
        return memberAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Macie Classic member account whose resources you
     * want to associate with Macie Classic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param memberAccountId <p>
     *            The ID of the Amazon Macie Classic member account whose
     *            resources you want to associate with Macie Classic.
     *            </p>
     */
    public void setMemberAccountId(String memberAccountId) {
        this.memberAccountId = memberAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Macie Classic member account whose resources you
     * want to associate with Macie Classic.
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
     *            resources you want to associate with Macie Classic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateS3ResourcesRequest withMemberAccountId(String memberAccountId) {
        this.memberAccountId = memberAccountId;
        return this;
    }

    /**
     * <p>
     * The S3 resources that you want to associate with Amazon Macie Classic for
     * monitoring and data classification.
     * </p>
     *
     * @return <p>
     *         The S3 resources that you want to associate with Amazon Macie
     *         Classic for monitoring and data classification.
     *         </p>
     */
    public java.util.List<S3ResourceClassification> getS3Resources() {
        return s3Resources;
    }

    /**
     * <p>
     * The S3 resources that you want to associate with Amazon Macie Classic for
     * monitoring and data classification.
     * </p>
     *
     * @param s3Resources <p>
     *            The S3 resources that you want to associate with Amazon Macie
     *            Classic for monitoring and data classification.
     *            </p>
     */
    public void setS3Resources(java.util.Collection<S3ResourceClassification> s3Resources) {
        if (s3Resources == null) {
            this.s3Resources = null;
            return;
        }

        this.s3Resources = new java.util.ArrayList<S3ResourceClassification>(s3Resources);
    }

    /**
     * <p>
     * The S3 resources that you want to associate with Amazon Macie Classic for
     * monitoring and data classification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Resources <p>
     *            The S3 resources that you want to associate with Amazon Macie
     *            Classic for monitoring and data classification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateS3ResourcesRequest withS3Resources(S3ResourceClassification... s3Resources) {
        if (getS3Resources() == null) {
            this.s3Resources = new java.util.ArrayList<S3ResourceClassification>(s3Resources.length);
        }
        for (S3ResourceClassification value : s3Resources) {
            this.s3Resources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The S3 resources that you want to associate with Amazon Macie Classic for
     * monitoring and data classification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Resources <p>
     *            The S3 resources that you want to associate with Amazon Macie
     *            Classic for monitoring and data classification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateS3ResourcesRequest withS3Resources(
            java.util.Collection<S3ResourceClassification> s3Resources) {
        setS3Resources(s3Resources);
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
        if (getS3Resources() != null)
            sb.append("s3Resources: " + getS3Resources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMemberAccountId() == null) ? 0 : getMemberAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getS3Resources() == null) ? 0 : getS3Resources().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateS3ResourcesRequest == false)
            return false;
        AssociateS3ResourcesRequest other = (AssociateS3ResourcesRequest) obj;

        if (other.getMemberAccountId() == null ^ this.getMemberAccountId() == null)
            return false;
        if (other.getMemberAccountId() != null
                && other.getMemberAccountId().equals(this.getMemberAccountId()) == false)
            return false;
        if (other.getS3Resources() == null ^ this.getS3Resources() == null)
            return false;
        if (other.getS3Resources() != null
                && other.getS3Resources().equals(this.getS3Resources()) == false)
            return false;
        return true;
    }
}
