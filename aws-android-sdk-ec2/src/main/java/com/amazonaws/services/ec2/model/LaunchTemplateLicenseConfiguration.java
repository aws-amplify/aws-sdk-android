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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a license configuration.
 * </p>
 */
public class LaunchTemplateLicenseConfiguration implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the license configuration.
     * </p>
     */
    private String licenseConfigurationArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the license configuration.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the license configuration.
     *         </p>
     */
    public String getLicenseConfigurationArn() {
        return licenseConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the license configuration.
     * </p>
     *
     * @param licenseConfigurationArn <p>
     *            The Amazon Resource Name (ARN) of the license configuration.
     *            </p>
     */
    public void setLicenseConfigurationArn(String licenseConfigurationArn) {
        this.licenseConfigurationArn = licenseConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the license configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param licenseConfigurationArn <p>
     *            The Amazon Resource Name (ARN) of the license configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateLicenseConfiguration withLicenseConfigurationArn(
            String licenseConfigurationArn) {
        this.licenseConfigurationArn = licenseConfigurationArn;
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
        if (getLicenseConfigurationArn() != null)
            sb.append("LicenseConfigurationArn: " + getLicenseConfigurationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLicenseConfigurationArn() == null) ? 0 : getLicenseConfigurationArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchTemplateLicenseConfiguration == false)
            return false;
        LaunchTemplateLicenseConfiguration other = (LaunchTemplateLicenseConfiguration) obj;

        if (other.getLicenseConfigurationArn() == null ^ this.getLicenseConfigurationArn() == null)
            return false;
        if (other.getLicenseConfigurationArn() != null
                && other.getLicenseConfigurationArn().equals(this.getLicenseConfigurationArn()) == false)
            return false;
        return true;
    }
}
