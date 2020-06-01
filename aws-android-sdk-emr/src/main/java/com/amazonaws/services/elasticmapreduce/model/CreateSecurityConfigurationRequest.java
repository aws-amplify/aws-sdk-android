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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a security configuration, which is stored in the service and can be
 * specified when a cluster is created.
 * </p>
 */
public class CreateSecurityConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the security configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String name;

    /**
     * <p>
     * The security configuration details in JSON format. For JSON parameters
     * and examples, see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-security-configurations.html"
     * >Use Security Configurations to Set Up Cluster Security</a> in the
     * <i>Amazon EMR Management Guide</i>.
     * </p>
     */
    private String securityConfiguration;

    /**
     * <p>
     * The name of the security configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the security configuration.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the security configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param name <p>
     *            The name of the security configuration.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the security configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param name <p>
     *            The name of the security configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSecurityConfigurationRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The security configuration details in JSON format. For JSON parameters
     * and examples, see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-security-configurations.html"
     * >Use Security Configurations to Set Up Cluster Security</a> in the
     * <i>Amazon EMR Management Guide</i>.
     * </p>
     *
     * @return <p>
     *         The security configuration details in JSON format. For JSON
     *         parameters and examples, see <a href=
     *         "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-security-configurations.html"
     *         >Use Security Configurations to Set Up Cluster Security</a> in
     *         the <i>Amazon EMR Management Guide</i>.
     *         </p>
     */
    public String getSecurityConfiguration() {
        return securityConfiguration;
    }

    /**
     * <p>
     * The security configuration details in JSON format. For JSON parameters
     * and examples, see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-security-configurations.html"
     * >Use Security Configurations to Set Up Cluster Security</a> in the
     * <i>Amazon EMR Management Guide</i>.
     * </p>
     *
     * @param securityConfiguration <p>
     *            The security configuration details in JSON format. For JSON
     *            parameters and examples, see <a href=
     *            "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-security-configurations.html"
     *            >Use Security Configurations to Set Up Cluster Security</a> in
     *            the <i>Amazon EMR Management Guide</i>.
     *            </p>
     */
    public void setSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    /**
     * <p>
     * The security configuration details in JSON format. For JSON parameters
     * and examples, see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-security-configurations.html"
     * >Use Security Configurations to Set Up Cluster Security</a> in the
     * <i>Amazon EMR Management Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityConfiguration <p>
     *            The security configuration details in JSON format. For JSON
     *            parameters and examples, see <a href=
     *            "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-security-configurations.html"
     *            >Use Security Configurations to Set Up Cluster Security</a> in
     *            the <i>Amazon EMR Management Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSecurityConfigurationRequest withSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getSecurityConfiguration() != null)
            sb.append("SecurityConfiguration: " + getSecurityConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecurityConfiguration() == null) ? 0 : getSecurityConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSecurityConfigurationRequest == false)
            return false;
        CreateSecurityConfigurationRequest other = (CreateSecurityConfigurationRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSecurityConfiguration() == null ^ this.getSecurityConfiguration() == null)
            return false;
        if (other.getSecurityConfiguration() != null
                && other.getSecurityConfiguration().equals(this.getSecurityConfiguration()) == false)
            return false;
        return true;
    }
}
