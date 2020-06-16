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
 * Creates a new origin access identity. If you're using Amazon S3 for your
 * origin, you can use an origin access identity to require users to access your
 * content using a CloudFront URL instead of the Amazon S3 URL. For more
 * information about how to use origin access identities, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html"
 * >Serving Private Content through CloudFront</a> in the <i>Amazon CloudFront
 * Developer Guide</i>.
 * </p>
 */
public class CreateCloudFrontOriginAccessIdentity2019_03_26Request extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The current configuration information for the identity.
     * </p>
     */
    private CloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig;

    /**
     * <p>
     * The current configuration information for the identity.
     * </p>
     *
     * @return <p>
     *         The current configuration information for the identity.
     *         </p>
     */
    public CloudFrontOriginAccessIdentityConfig getCloudFrontOriginAccessIdentityConfig() {
        return cloudFrontOriginAccessIdentityConfig;
    }

    /**
     * <p>
     * The current configuration information for the identity.
     * </p>
     *
     * @param cloudFrontOriginAccessIdentityConfig <p>
     *            The current configuration information for the identity.
     *            </p>
     */
    public void setCloudFrontOriginAccessIdentityConfig(
            CloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig) {
        this.cloudFrontOriginAccessIdentityConfig = cloudFrontOriginAccessIdentityConfig;
    }

    /**
     * <p>
     * The current configuration information for the identity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudFrontOriginAccessIdentityConfig <p>
     *            The current configuration information for the identity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCloudFrontOriginAccessIdentity2019_03_26Request withCloudFrontOriginAccessIdentityConfig(
            CloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig) {
        this.cloudFrontOriginAccessIdentityConfig = cloudFrontOriginAccessIdentityConfig;
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
        if (getCloudFrontOriginAccessIdentityConfig() != null)
            sb.append("CloudFrontOriginAccessIdentityConfig: "
                    + getCloudFrontOriginAccessIdentityConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCloudFrontOriginAccessIdentityConfig() == null) ? 0
                        : getCloudFrontOriginAccessIdentityConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCloudFrontOriginAccessIdentity2019_03_26Request == false)
            return false;
        CreateCloudFrontOriginAccessIdentity2019_03_26Request other = (CreateCloudFrontOriginAccessIdentity2019_03_26Request) obj;

        if (other.getCloudFrontOriginAccessIdentityConfig() == null
                ^ this.getCloudFrontOriginAccessIdentityConfig() == null)
            return false;
        if (other.getCloudFrontOriginAccessIdentityConfig() != null
                && other.getCloudFrontOriginAccessIdentityConfig().equals(
                        this.getCloudFrontOriginAccessIdentityConfig()) == false)
            return false;
        return true;
    }
}
