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

package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a distribution configuration.
 * </p>
 */
public class DeleteDistributionConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration to
     * delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):distribution
     * -configuration/[a-z0-9-_]+$<br/>
     */
    private String distributionConfigurationArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration to
     * delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):distribution
     * -configuration/[a-z0-9-_]+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the distribution configuration
     *         to delete.
     *         </p>
     */
    public String getDistributionConfigurationArn() {
        return distributionConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration to
     * delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):distribution
     * -configuration/[a-z0-9-_]+$<br/>
     *
     * @param distributionConfigurationArn <p>
     *            The Amazon Resource Name (ARN) of the distribution
     *            configuration to delete.
     *            </p>
     */
    public void setDistributionConfigurationArn(String distributionConfigurationArn) {
        this.distributionConfigurationArn = distributionConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration to
     * delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):distribution
     * -configuration/[a-z0-9-_]+$<br/>
     *
     * @param distributionConfigurationArn <p>
     *            The Amazon Resource Name (ARN) of the distribution
     *            configuration to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDistributionConfigurationRequest withDistributionConfigurationArn(
            String distributionConfigurationArn) {
        this.distributionConfigurationArn = distributionConfigurationArn;
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
        if (getDistributionConfigurationArn() != null)
            sb.append("distributionConfigurationArn: " + getDistributionConfigurationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDistributionConfigurationArn() == null) ? 0
                        : getDistributionConfigurationArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDistributionConfigurationRequest == false)
            return false;
        DeleteDistributionConfigurationRequest other = (DeleteDistributionConfigurationRequest) obj;

        if (other.getDistributionConfigurationArn() == null
                ^ this.getDistributionConfigurationArn() == null)
            return false;
        if (other.getDistributionConfigurationArn() != null
                && other.getDistributionConfigurationArn().equals(
                        this.getDistributionConfigurationArn()) == false)
            return false;
        return true;
    }
}
