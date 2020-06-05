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
 * Creates a new web distribution. You create a CloudFront distribution to tell
 * CloudFront where you want content to be delivered from, and the details about
 * how to track and manage content delivery. Send a <code>POST</code> request to
 * the <code>/<i>CloudFront API version</i>/distribution</code>/
 * <code>distribution ID</code> resource.
 * </p>
 * <important>
 * <p>
 * When you update a distribution, there are more required fields than when you
 * create a distribution. When you update your distribution by using <a href=
 * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_UpdateDistribution.html"
 * >UpdateDistribution</a>, follow the steps included in the documentation to
 * get the current configuration and then make your updates. This helps to make
 * sure that you include all of the required fields. To view a summary, see <a
 * href=
 * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-overview-required-fields.html"
 * >Required Fields for Create Distribution and Update Distribution</a> in the
 * <i>Amazon CloudFront Developer Guide</i>.
 * </p>
 * </important>
 */
public class CreateDistribution2019_03_26Request extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The distribution's configuration information.
     * </p>
     */
    private DistributionConfig distributionConfig;

    /**
     * <p>
     * The distribution's configuration information.
     * </p>
     *
     * @return <p>
     *         The distribution's configuration information.
     *         </p>
     */
    public DistributionConfig getDistributionConfig() {
        return distributionConfig;
    }

    /**
     * <p>
     * The distribution's configuration information.
     * </p>
     *
     * @param distributionConfig <p>
     *            The distribution's configuration information.
     *            </p>
     */
    public void setDistributionConfig(DistributionConfig distributionConfig) {
        this.distributionConfig = distributionConfig;
    }

    /**
     * <p>
     * The distribution's configuration information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param distributionConfig <p>
     *            The distribution's configuration information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDistribution2019_03_26Request withDistributionConfig(
            DistributionConfig distributionConfig) {
        this.distributionConfig = distributionConfig;
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
        if (getDistributionConfig() != null)
            sb.append("DistributionConfig: " + getDistributionConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDistributionConfig() == null) ? 0 : getDistributionConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDistribution2019_03_26Request == false)
            return false;
        CreateDistribution2019_03_26Request other = (CreateDistribution2019_03_26Request) obj;

        if (other.getDistributionConfig() == null ^ this.getDistributionConfig() == null)
            return false;
        if (other.getDistributionConfig() != null
                && other.getDistributionConfig().equals(this.getDistributionConfig()) == false)
            return false;
        return true;
    }
}
