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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates or updates an Amazon EMR block public access configuration for your
 * AWS account in the current Region. For more information see <a href=
 * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/configure-block-public-access.html"
 * >Configure Block Public Access for Amazon EMR</a> in the <i>Amazon EMR
 * Management Guide</i>.
 * </p>
 */
public class PutBlockPublicAccessConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A configuration for Amazon EMR block public access. The configuration
     * applies to all clusters created in your account for the current Region.
     * The configuration specifies whether block public access is enabled. If
     * block public access is enabled, security groups associated with the
     * cluster cannot have rules that allow inbound traffic from 0.0.0.0/0 or
     * ::/0 on a port, unless the port is specified as an exception using
     * <code>PermittedPublicSecurityGroupRuleRanges</code> in the
     * <code>BlockPublicAccessConfiguration</code>. By default, Port 22 (SSH) is
     * an exception, and public access is allowed on this port. You can change
     * this by updating <code>BlockPublicSecurityGroupRules</code> to remove the
     * exception.
     * </p>
     * <note>
     * <p>
     * For accounts that created clusters in a Region before November 25, 2019,
     * block public access is disabled by default in that Region. To use this
     * feature, you must manually enable and configure it. For accounts that did
     * not create an EMR cluster in a Region before this date, block public
     * access is enabled by default in that Region.
     * </p>
     * </note>
     */
    private BlockPublicAccessConfiguration blockPublicAccessConfiguration;

    /**
     * <p>
     * A configuration for Amazon EMR block public access. The configuration
     * applies to all clusters created in your account for the current Region.
     * The configuration specifies whether block public access is enabled. If
     * block public access is enabled, security groups associated with the
     * cluster cannot have rules that allow inbound traffic from 0.0.0.0/0 or
     * ::/0 on a port, unless the port is specified as an exception using
     * <code>PermittedPublicSecurityGroupRuleRanges</code> in the
     * <code>BlockPublicAccessConfiguration</code>. By default, Port 22 (SSH) is
     * an exception, and public access is allowed on this port. You can change
     * this by updating <code>BlockPublicSecurityGroupRules</code> to remove the
     * exception.
     * </p>
     * <note>
     * <p>
     * For accounts that created clusters in a Region before November 25, 2019,
     * block public access is disabled by default in that Region. To use this
     * feature, you must manually enable and configure it. For accounts that did
     * not create an EMR cluster in a Region before this date, block public
     * access is enabled by default in that Region.
     * </p>
     * </note>
     *
     * @return <p>
     *         A configuration for Amazon EMR block public access. The
     *         configuration applies to all clusters created in your account for
     *         the current Region. The configuration specifies whether block
     *         public access is enabled. If block public access is enabled,
     *         security groups associated with the cluster cannot have rules
     *         that allow inbound traffic from 0.0.0.0/0 or ::/0 on a port,
     *         unless the port is specified as an exception using
     *         <code>PermittedPublicSecurityGroupRuleRanges</code> in the
     *         <code>BlockPublicAccessConfiguration</code>. By default, Port 22
     *         (SSH) is an exception, and public access is allowed on this port.
     *         You can change this by updating
     *         <code>BlockPublicSecurityGroupRules</code> to remove the
     *         exception.
     *         </p>
     *         <note>
     *         <p>
     *         For accounts that created clusters in a Region before November
     *         25, 2019, block public access is disabled by default in that
     *         Region. To use this feature, you must manually enable and
     *         configure it. For accounts that did not create an EMR cluster in
     *         a Region before this date, block public access is enabled by
     *         default in that Region.
     *         </p>
     *         </note>
     */
    public BlockPublicAccessConfiguration getBlockPublicAccessConfiguration() {
        return blockPublicAccessConfiguration;
    }

    /**
     * <p>
     * A configuration for Amazon EMR block public access. The configuration
     * applies to all clusters created in your account for the current Region.
     * The configuration specifies whether block public access is enabled. If
     * block public access is enabled, security groups associated with the
     * cluster cannot have rules that allow inbound traffic from 0.0.0.0/0 or
     * ::/0 on a port, unless the port is specified as an exception using
     * <code>PermittedPublicSecurityGroupRuleRanges</code> in the
     * <code>BlockPublicAccessConfiguration</code>. By default, Port 22 (SSH) is
     * an exception, and public access is allowed on this port. You can change
     * this by updating <code>BlockPublicSecurityGroupRules</code> to remove the
     * exception.
     * </p>
     * <note>
     * <p>
     * For accounts that created clusters in a Region before November 25, 2019,
     * block public access is disabled by default in that Region. To use this
     * feature, you must manually enable and configure it. For accounts that did
     * not create an EMR cluster in a Region before this date, block public
     * access is enabled by default in that Region.
     * </p>
     * </note>
     *
     * @param blockPublicAccessConfiguration <p>
     *            A configuration for Amazon EMR block public access. The
     *            configuration applies to all clusters created in your account
     *            for the current Region. The configuration specifies whether
     *            block public access is enabled. If block public access is
     *            enabled, security groups associated with the cluster cannot
     *            have rules that allow inbound traffic from 0.0.0.0/0 or ::/0
     *            on a port, unless the port is specified as an exception using
     *            <code>PermittedPublicSecurityGroupRuleRanges</code> in the
     *            <code>BlockPublicAccessConfiguration</code>. By default, Port
     *            22 (SSH) is an exception, and public access is allowed on this
     *            port. You can change this by updating
     *            <code>BlockPublicSecurityGroupRules</code> to remove the
     *            exception.
     *            </p>
     *            <note>
     *            <p>
     *            For accounts that created clusters in a Region before November
     *            25, 2019, block public access is disabled by default in that
     *            Region. To use this feature, you must manually enable and
     *            configure it. For accounts that did not create an EMR cluster
     *            in a Region before this date, block public access is enabled
     *            by default in that Region.
     *            </p>
     *            </note>
     */
    public void setBlockPublicAccessConfiguration(
            BlockPublicAccessConfiguration blockPublicAccessConfiguration) {
        this.blockPublicAccessConfiguration = blockPublicAccessConfiguration;
    }

    /**
     * <p>
     * A configuration for Amazon EMR block public access. The configuration
     * applies to all clusters created in your account for the current Region.
     * The configuration specifies whether block public access is enabled. If
     * block public access is enabled, security groups associated with the
     * cluster cannot have rules that allow inbound traffic from 0.0.0.0/0 or
     * ::/0 on a port, unless the port is specified as an exception using
     * <code>PermittedPublicSecurityGroupRuleRanges</code> in the
     * <code>BlockPublicAccessConfiguration</code>. By default, Port 22 (SSH) is
     * an exception, and public access is allowed on this port. You can change
     * this by updating <code>BlockPublicSecurityGroupRules</code> to remove the
     * exception.
     * </p>
     * <note>
     * <p>
     * For accounts that created clusters in a Region before November 25, 2019,
     * block public access is disabled by default in that Region. To use this
     * feature, you must manually enable and configure it. For accounts that did
     * not create an EMR cluster in a Region before this date, block public
     * access is enabled by default in that Region.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockPublicAccessConfiguration <p>
     *            A configuration for Amazon EMR block public access. The
     *            configuration applies to all clusters created in your account
     *            for the current Region. The configuration specifies whether
     *            block public access is enabled. If block public access is
     *            enabled, security groups associated with the cluster cannot
     *            have rules that allow inbound traffic from 0.0.0.0/0 or ::/0
     *            on a port, unless the port is specified as an exception using
     *            <code>PermittedPublicSecurityGroupRuleRanges</code> in the
     *            <code>BlockPublicAccessConfiguration</code>. By default, Port
     *            22 (SSH) is an exception, and public access is allowed on this
     *            port. You can change this by updating
     *            <code>BlockPublicSecurityGroupRules</code> to remove the
     *            exception.
     *            </p>
     *            <note>
     *            <p>
     *            For accounts that created clusters in a Region before November
     *            25, 2019, block public access is disabled by default in that
     *            Region. To use this feature, you must manually enable and
     *            configure it. For accounts that did not create an EMR cluster
     *            in a Region before this date, block public access is enabled
     *            by default in that Region.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBlockPublicAccessConfigurationRequest withBlockPublicAccessConfiguration(
            BlockPublicAccessConfiguration blockPublicAccessConfiguration) {
        this.blockPublicAccessConfiguration = blockPublicAccessConfiguration;
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
        if (getBlockPublicAccessConfiguration() != null)
            sb.append("BlockPublicAccessConfiguration: " + getBlockPublicAccessConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getBlockPublicAccessConfiguration() == null) ? 0
                        : getBlockPublicAccessConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBlockPublicAccessConfigurationRequest == false)
            return false;
        PutBlockPublicAccessConfigurationRequest other = (PutBlockPublicAccessConfigurationRequest) obj;

        if (other.getBlockPublicAccessConfiguration() == null
                ^ this.getBlockPublicAccessConfiguration() == null)
            return false;
        if (other.getBlockPublicAccessConfiguration() != null
                && other.getBlockPublicAccessConfiguration().equals(
                        this.getBlockPublicAccessConfiguration()) == false)
            return false;
        return true;
    }
}
