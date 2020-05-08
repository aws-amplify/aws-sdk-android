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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the Amazon Resource Name (ARN) of the resource to publish to, such
 * as an S3 bucket, and the ARN of the KMS key to use to encrypt published
 * findings.
 * </p>
 */
public class DestinationProperties implements Serializable {
    /**
     * <p>
     * The ARN of the resource to publish to.
     * </p>
     */
    private String destinationArn;

    /**
     * <p>
     * The ARN of the KMS key to use for encryption.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The ARN of the resource to publish to.
     * </p>
     *
     * @return <p>
     *         The ARN of the resource to publish to.
     *         </p>
     */
    public String getDestinationArn() {
        return destinationArn;
    }

    /**
     * <p>
     * The ARN of the resource to publish to.
     * </p>
     *
     * @param destinationArn <p>
     *            The ARN of the resource to publish to.
     *            </p>
     */
    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * The ARN of the resource to publish to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationArn <p>
     *            The ARN of the resource to publish to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DestinationProperties withDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the KMS key to use for encryption.
     * </p>
     *
     * @return <p>
     *         The ARN of the KMS key to use for encryption.
     *         </p>
     */
    public String getKmsKeyArn() {
        return kmsKeyArn;
    }

    /**
     * <p>
     * The ARN of the KMS key to use for encryption.
     * </p>
     *
     * @param kmsKeyArn <p>
     *            The ARN of the KMS key to use for encryption.
     *            </p>
     */
    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The ARN of the KMS key to use for encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyArn <p>
     *            The ARN of the KMS key to use for encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DestinationProperties withKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
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
        if (getDestinationArn() != null)
            sb.append("DestinationArn: " + getDestinationArn() + ",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: " + getKmsKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DestinationProperties == false)
            return false;
        DestinationProperties other = (DestinationProperties) obj;

        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null)
            return false;
        if (other.getDestinationArn() != null
                && other.getDestinationArn().equals(this.getDestinationArn()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null
                && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        return true;
    }
}
