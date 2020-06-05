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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Create a new distribution with tags.
 * </p>
 */
public class CreateDistributionWithTags2019_03_26Request extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The distribution's configuration information.
     * </p>
     */
    private DistributionConfigWithTags distributionConfigWithTags;

    /**
     * <p>
     * The distribution's configuration information.
     * </p>
     *
     * @return <p>
     *         The distribution's configuration information.
     *         </p>
     */
    public DistributionConfigWithTags getDistributionConfigWithTags() {
        return distributionConfigWithTags;
    }

    /**
     * <p>
     * The distribution's configuration information.
     * </p>
     *
     * @param distributionConfigWithTags <p>
     *            The distribution's configuration information.
     *            </p>
     */
    public void setDistributionConfigWithTags(DistributionConfigWithTags distributionConfigWithTags) {
        this.distributionConfigWithTags = distributionConfigWithTags;
    }

    /**
     * <p>
     * The distribution's configuration information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param distributionConfigWithTags <p>
     *            The distribution's configuration information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDistributionWithTags2019_03_26Request withDistributionConfigWithTags(
            DistributionConfigWithTags distributionConfigWithTags) {
        this.distributionConfigWithTags = distributionConfigWithTags;
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
        if (getDistributionConfigWithTags() != null)
            sb.append("DistributionConfigWithTags: " + getDistributionConfigWithTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDistributionConfigWithTags() == null) ? 0 : getDistributionConfigWithTags()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDistributionWithTags2019_03_26Request == false)
            return false;
        CreateDistributionWithTags2019_03_26Request other = (CreateDistributionWithTags2019_03_26Request) obj;

        if (other.getDistributionConfigWithTags() == null
                ^ this.getDistributionConfigWithTags() == null)
            return false;
        if (other.getDistributionConfigWithTags() != null
                && other.getDistributionConfigWithTags().equals(
                        this.getDistributionConfigWithTags()) == false)
            return false;
        return true;
    }
}
