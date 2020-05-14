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

/**
 * <p>
 * Defines the settings for a specific Region.
 * </p>
 */
public class Distribution implements Serializable {
    /**
     * <p>
     * The target Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String region;

    /**
     * <p>
     * The specific AMI settings (for example, launch permissions, AMI tags).
     * </p>
     */
    private AmiDistributionConfiguration amiDistributionConfiguration;

    /**
     * <p>
     * The License Manager Configuration to associate with the AMI in the
     * specified Region.
     * </p>
     */
    private java.util.List<String> licenseConfigurationArns;

    /**
     * <p>
     * The target Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The target Region.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The target Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param region <p>
     *            The target Region.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The target Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param region <p>
     *            The target Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Distribution withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <p>
     * The specific AMI settings (for example, launch permissions, AMI tags).
     * </p>
     *
     * @return <p>
     *         The specific AMI settings (for example, launch permissions, AMI
     *         tags).
     *         </p>
     */
    public AmiDistributionConfiguration getAmiDistributionConfiguration() {
        return amiDistributionConfiguration;
    }

    /**
     * <p>
     * The specific AMI settings (for example, launch permissions, AMI tags).
     * </p>
     *
     * @param amiDistributionConfiguration <p>
     *            The specific AMI settings (for example, launch permissions,
     *            AMI tags).
     *            </p>
     */
    public void setAmiDistributionConfiguration(
            AmiDistributionConfiguration amiDistributionConfiguration) {
        this.amiDistributionConfiguration = amiDistributionConfiguration;
    }

    /**
     * <p>
     * The specific AMI settings (for example, launch permissions, AMI tags).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param amiDistributionConfiguration <p>
     *            The specific AMI settings (for example, launch permissions,
     *            AMI tags).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Distribution withAmiDistributionConfiguration(
            AmiDistributionConfiguration amiDistributionConfiguration) {
        this.amiDistributionConfiguration = amiDistributionConfiguration;
        return this;
    }

    /**
     * <p>
     * The License Manager Configuration to associate with the AMI in the
     * specified Region.
     * </p>
     *
     * @return <p>
     *         The License Manager Configuration to associate with the AMI in
     *         the specified Region.
     *         </p>
     */
    public java.util.List<String> getLicenseConfigurationArns() {
        return licenseConfigurationArns;
    }

    /**
     * <p>
     * The License Manager Configuration to associate with the AMI in the
     * specified Region.
     * </p>
     *
     * @param licenseConfigurationArns <p>
     *            The License Manager Configuration to associate with the AMI in
     *            the specified Region.
     *            </p>
     */
    public void setLicenseConfigurationArns(java.util.Collection<String> licenseConfigurationArns) {
        if (licenseConfigurationArns == null) {
            this.licenseConfigurationArns = null;
            return;
        }

        this.licenseConfigurationArns = new java.util.ArrayList<String>(licenseConfigurationArns);
    }

    /**
     * <p>
     * The License Manager Configuration to associate with the AMI in the
     * specified Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param licenseConfigurationArns <p>
     *            The License Manager Configuration to associate with the AMI in
     *            the specified Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Distribution withLicenseConfigurationArns(String... licenseConfigurationArns) {
        if (getLicenseConfigurationArns() == null) {
            this.licenseConfigurationArns = new java.util.ArrayList<String>(
                    licenseConfigurationArns.length);
        }
        for (String value : licenseConfigurationArns) {
            this.licenseConfigurationArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The License Manager Configuration to associate with the AMI in the
     * specified Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param licenseConfigurationArns <p>
     *            The License Manager Configuration to associate with the AMI in
     *            the specified Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Distribution withLicenseConfigurationArns(
            java.util.Collection<String> licenseConfigurationArns) {
        setLicenseConfigurationArns(licenseConfigurationArns);
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
        if (getRegion() != null)
            sb.append("region: " + getRegion() + ",");
        if (getAmiDistributionConfiguration() != null)
            sb.append("amiDistributionConfiguration: " + getAmiDistributionConfiguration() + ",");
        if (getLicenseConfigurationArns() != null)
            sb.append("licenseConfigurationArns: " + getLicenseConfigurationArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime
                * hashCode
                + ((getAmiDistributionConfiguration() == null) ? 0
                        : getAmiDistributionConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getLicenseConfigurationArns() == null) ? 0 : getLicenseConfigurationArns()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Distribution == false)
            return false;
        Distribution other = (Distribution) obj;

        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getAmiDistributionConfiguration() == null
                ^ this.getAmiDistributionConfiguration() == null)
            return false;
        if (other.getAmiDistributionConfiguration() != null
                && other.getAmiDistributionConfiguration().equals(
                        this.getAmiDistributionConfiguration()) == false)
            return false;
        if (other.getLicenseConfigurationArns() == null
                ^ this.getLicenseConfigurationArns() == null)
            return false;
        if (other.getLicenseConfigurationArns() != null
                && other.getLicenseConfigurationArns().equals(this.getLicenseConfigurationArns()) == false)
            return false;
        return true;
    }
}
