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

package com.amazonaws.services.ec2imagebuilder.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets an infrastructure configuration.
 * </p>
 */
public class GetInfrastructureConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration that
     * you want to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):infrastructure
     * -configuration/[a-z0-9-_]+$<br/>
     */
    private String infrastructureConfigurationArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration that
     * you want to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):infrastructure
     * -configuration/[a-z0-9-_]+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the infrastructure
     *         configuration that you want to retrieve.
     *         </p>
     */
    public String getInfrastructureConfigurationArn() {
        return infrastructureConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration that
     * you want to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):infrastructure
     * -configuration/[a-z0-9-_]+$<br/>
     *
     * @param infrastructureConfigurationArn <p>
     *            The Amazon Resource Name (ARN) of the infrastructure
     *            configuration that you want to retrieve.
     *            </p>
     */
    public void setInfrastructureConfigurationArn(String infrastructureConfigurationArn) {
        this.infrastructureConfigurationArn = infrastructureConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration that
     * you want to retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):infrastructure
     * -configuration/[a-z0-9-_]+$<br/>
     *
     * @param infrastructureConfigurationArn <p>
     *            The Amazon Resource Name (ARN) of the infrastructure
     *            configuration that you want to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInfrastructureConfigurationRequest withInfrastructureConfigurationArn(
            String infrastructureConfigurationArn) {
        this.infrastructureConfigurationArn = infrastructureConfigurationArn;
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
        if (getInfrastructureConfigurationArn() != null)
            sb.append("infrastructureConfigurationArn: " + getInfrastructureConfigurationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getInfrastructureConfigurationArn() == null) ? 0
                        : getInfrastructureConfigurationArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInfrastructureConfigurationRequest == false)
            return false;
        GetInfrastructureConfigurationRequest other = (GetInfrastructureConfigurationRequest) obj;

        if (other.getInfrastructureConfigurationArn() == null
                ^ this.getInfrastructureConfigurationArn() == null)
            return false;
        if (other.getInfrastructureConfigurationArn() != null
                && other.getInfrastructureConfigurationArn().equals(
                        this.getInfrastructureConfigurationArn()) == false)
            return false;
        return true;
    }
}
