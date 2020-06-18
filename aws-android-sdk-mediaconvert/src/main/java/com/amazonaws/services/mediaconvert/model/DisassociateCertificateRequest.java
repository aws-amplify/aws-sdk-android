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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Removes an association between the Amazon Resource Name (ARN) of an AWS
 * Certificate Manager (ACM) certificate and an AWS Elemental MediaConvert
 * resource.
 */
public class DisassociateCertificateRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The ARN of the ACM certificate that you want to disassociate from your
     * MediaConvert resource.
     */
    private String arn;

    /**
     * The ARN of the ACM certificate that you want to disassociate from your
     * MediaConvert resource.
     *
     * @return The ARN of the ACM certificate that you want to disassociate from
     *         your MediaConvert resource.
     */
    public String getArn() {
        return arn;
    }

    /**
     * The ARN of the ACM certificate that you want to disassociate from your
     * MediaConvert resource.
     *
     * @param arn The ARN of the ACM certificate that you want to disassociate
     *            from your MediaConvert resource.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The ARN of the ACM certificate that you want to disassociate from your
     * MediaConvert resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn The ARN of the ACM certificate that you want to disassociate
     *            from your MediaConvert resource.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateCertificateRequest withArn(String arn) {
        this.arn = arn;
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
        if (getArn() != null)
            sb.append("Arn: " + getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateCertificateRequest == false)
            return false;
        DisassociateCertificateRequest other = (DisassociateCertificateRequest) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }
}
