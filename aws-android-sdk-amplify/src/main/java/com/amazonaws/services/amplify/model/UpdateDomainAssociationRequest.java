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

package com.amazonaws.services.amplify.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new domain association for an Amplify app.
 * </p>
 */
public class UpdateDomainAssociationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String appId;

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String domainName;

    /**
     * <p>
     * Enables the automated creation of subdomains for branches.
     * </p>
     */
    private Boolean enableAutoSubDomain;

    /**
     * <p>
     * Describes the settings for the subdomain.
     * </p>
     */
    private java.util.List<SubDomainSetting> subDomainSettings;

    /**
     * <p>
     * Sets the branch patterns for automatic subdomain creation.
     * </p>
     */
    private java.util.List<String> autoSubDomainCreationPatterns;

    /**
     * <p>
     * The required AWS Identity and Access Management (IAM) service role for
     * the Amazon Resource Name (ARN) for automatically creating subdomains.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>^$|^arn:aws:iam::\d{12}:role.+<br/>
     */
    private String autoSubDomainIAMRole;

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The unique ID for an Amplify app.
     *         </p>
     */
    public String getAppId() {
        return appId;
    }

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param appId <p>
     *            The unique ID for an Amplify app.
     *            </p>
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param appId <p>
     *            The unique ID for an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainAssociationRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The name of the domain.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of the domain.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainAssociationRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * Enables the automated creation of subdomains for branches.
     * </p>
     *
     * @return <p>
     *         Enables the automated creation of subdomains for branches.
     *         </p>
     */
    public Boolean isEnableAutoSubDomain() {
        return enableAutoSubDomain;
    }

    /**
     * <p>
     * Enables the automated creation of subdomains for branches.
     * </p>
     *
     * @return <p>
     *         Enables the automated creation of subdomains for branches.
     *         </p>
     */
    public Boolean getEnableAutoSubDomain() {
        return enableAutoSubDomain;
    }

    /**
     * <p>
     * Enables the automated creation of subdomains for branches.
     * </p>
     *
     * @param enableAutoSubDomain <p>
     *            Enables the automated creation of subdomains for branches.
     *            </p>
     */
    public void setEnableAutoSubDomain(Boolean enableAutoSubDomain) {
        this.enableAutoSubDomain = enableAutoSubDomain;
    }

    /**
     * <p>
     * Enables the automated creation of subdomains for branches.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableAutoSubDomain <p>
     *            Enables the automated creation of subdomains for branches.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainAssociationRequest withEnableAutoSubDomain(Boolean enableAutoSubDomain) {
        this.enableAutoSubDomain = enableAutoSubDomain;
        return this;
    }

    /**
     * <p>
     * Describes the settings for the subdomain.
     * </p>
     *
     * @return <p>
     *         Describes the settings for the subdomain.
     *         </p>
     */
    public java.util.List<SubDomainSetting> getSubDomainSettings() {
        return subDomainSettings;
    }

    /**
     * <p>
     * Describes the settings for the subdomain.
     * </p>
     *
     * @param subDomainSettings <p>
     *            Describes the settings for the subdomain.
     *            </p>
     */
    public void setSubDomainSettings(java.util.Collection<SubDomainSetting> subDomainSettings) {
        if (subDomainSettings == null) {
            this.subDomainSettings = null;
            return;
        }

        this.subDomainSettings = new java.util.ArrayList<SubDomainSetting>(subDomainSettings);
    }

    /**
     * <p>
     * Describes the settings for the subdomain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subDomainSettings <p>
     *            Describes the settings for the subdomain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainAssociationRequest withSubDomainSettings(
            SubDomainSetting... subDomainSettings) {
        if (getSubDomainSettings() == null) {
            this.subDomainSettings = new java.util.ArrayList<SubDomainSetting>(
                    subDomainSettings.length);
        }
        for (SubDomainSetting value : subDomainSettings) {
            this.subDomainSettings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Describes the settings for the subdomain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subDomainSettings <p>
     *            Describes the settings for the subdomain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainAssociationRequest withSubDomainSettings(
            java.util.Collection<SubDomainSetting> subDomainSettings) {
        setSubDomainSettings(subDomainSettings);
        return this;
    }

    /**
     * <p>
     * Sets the branch patterns for automatic subdomain creation.
     * </p>
     *
     * @return <p>
     *         Sets the branch patterns for automatic subdomain creation.
     *         </p>
     */
    public java.util.List<String> getAutoSubDomainCreationPatterns() {
        return autoSubDomainCreationPatterns;
    }

    /**
     * <p>
     * Sets the branch patterns for automatic subdomain creation.
     * </p>
     *
     * @param autoSubDomainCreationPatterns <p>
     *            Sets the branch patterns for automatic subdomain creation.
     *            </p>
     */
    public void setAutoSubDomainCreationPatterns(
            java.util.Collection<String> autoSubDomainCreationPatterns) {
        if (autoSubDomainCreationPatterns == null) {
            this.autoSubDomainCreationPatterns = null;
            return;
        }

        this.autoSubDomainCreationPatterns = new java.util.ArrayList<String>(
                autoSubDomainCreationPatterns);
    }

    /**
     * <p>
     * Sets the branch patterns for automatic subdomain creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoSubDomainCreationPatterns <p>
     *            Sets the branch patterns for automatic subdomain creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainAssociationRequest withAutoSubDomainCreationPatterns(
            String... autoSubDomainCreationPatterns) {
        if (getAutoSubDomainCreationPatterns() == null) {
            this.autoSubDomainCreationPatterns = new java.util.ArrayList<String>(
                    autoSubDomainCreationPatterns.length);
        }
        for (String value : autoSubDomainCreationPatterns) {
            this.autoSubDomainCreationPatterns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Sets the branch patterns for automatic subdomain creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoSubDomainCreationPatterns <p>
     *            Sets the branch patterns for automatic subdomain creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainAssociationRequest withAutoSubDomainCreationPatterns(
            java.util.Collection<String> autoSubDomainCreationPatterns) {
        setAutoSubDomainCreationPatterns(autoSubDomainCreationPatterns);
        return this;
    }

    /**
     * <p>
     * The required AWS Identity and Access Management (IAM) service role for
     * the Amazon Resource Name (ARN) for automatically creating subdomains.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>^$|^arn:aws:iam::\d{12}:role.+<br/>
     *
     * @return <p>
     *         The required AWS Identity and Access Management (IAM) service
     *         role for the Amazon Resource Name (ARN) for automatically
     *         creating subdomains.
     *         </p>
     */
    public String getAutoSubDomainIAMRole() {
        return autoSubDomainIAMRole;
    }

    /**
     * <p>
     * The required AWS Identity and Access Management (IAM) service role for
     * the Amazon Resource Name (ARN) for automatically creating subdomains.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>^$|^arn:aws:iam::\d{12}:role.+<br/>
     *
     * @param autoSubDomainIAMRole <p>
     *            The required AWS Identity and Access Management (IAM) service
     *            role for the Amazon Resource Name (ARN) for automatically
     *            creating subdomains.
     *            </p>
     */
    public void setAutoSubDomainIAMRole(String autoSubDomainIAMRole) {
        this.autoSubDomainIAMRole = autoSubDomainIAMRole;
    }

    /**
     * <p>
     * The required AWS Identity and Access Management (IAM) service role for
     * the Amazon Resource Name (ARN) for automatically creating subdomains.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>^$|^arn:aws:iam::\d{12}:role.+<br/>
     *
     * @param autoSubDomainIAMRole <p>
     *            The required AWS Identity and Access Management (IAM) service
     *            role for the Amazon Resource Name (ARN) for automatically
     *            creating subdomains.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainAssociationRequest withAutoSubDomainIAMRole(String autoSubDomainIAMRole) {
        this.autoSubDomainIAMRole = autoSubDomainIAMRole;
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
        if (getAppId() != null)
            sb.append("appId: " + getAppId() + ",");
        if (getDomainName() != null)
            sb.append("domainName: " + getDomainName() + ",");
        if (getEnableAutoSubDomain() != null)
            sb.append("enableAutoSubDomain: " + getEnableAutoSubDomain() + ",");
        if (getSubDomainSettings() != null)
            sb.append("subDomainSettings: " + getSubDomainSettings() + ",");
        if (getAutoSubDomainCreationPatterns() != null)
            sb.append("autoSubDomainCreationPatterns: " + getAutoSubDomainCreationPatterns() + ",");
        if (getAutoSubDomainIAMRole() != null)
            sb.append("autoSubDomainIAMRole: " + getAutoSubDomainIAMRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getEnableAutoSubDomain() == null) ? 0 : getEnableAutoSubDomain().hashCode());
        hashCode = prime * hashCode
                + ((getSubDomainSettings() == null) ? 0 : getSubDomainSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoSubDomainCreationPatterns() == null) ? 0
                        : getAutoSubDomainCreationPatterns().hashCode());
        hashCode = prime * hashCode
                + ((getAutoSubDomainIAMRole() == null) ? 0 : getAutoSubDomainIAMRole().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDomainAssociationRequest == false)
            return false;
        UpdateDomainAssociationRequest other = (UpdateDomainAssociationRequest) obj;

        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getEnableAutoSubDomain() == null ^ this.getEnableAutoSubDomain() == null)
            return false;
        if (other.getEnableAutoSubDomain() != null
                && other.getEnableAutoSubDomain().equals(this.getEnableAutoSubDomain()) == false)
            return false;
        if (other.getSubDomainSettings() == null ^ this.getSubDomainSettings() == null)
            return false;
        if (other.getSubDomainSettings() != null
                && other.getSubDomainSettings().equals(this.getSubDomainSettings()) == false)
            return false;
        if (other.getAutoSubDomainCreationPatterns() == null
                ^ this.getAutoSubDomainCreationPatterns() == null)
            return false;
        if (other.getAutoSubDomainCreationPatterns() != null
                && other.getAutoSubDomainCreationPatterns().equals(
                        this.getAutoSubDomainCreationPatterns()) == false)
            return false;
        if (other.getAutoSubDomainIAMRole() == null ^ this.getAutoSubDomainIAMRole() == null)
            return false;
        if (other.getAutoSubDomainIAMRole() != null
                && other.getAutoSubDomainIAMRole().equals(this.getAutoSubDomainIAMRole()) == false)
            return false;
        return true;
    }
}
