/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * A container for information about a domain.
 * </p>
 */
public class DomainDescriptionType implements Serializable {
    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * The AWS account ID for the user pool owner.
     * </p>
     */
    private String aWSAccountId;

    /**
     * <p>
     * The domain string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,61}[a-z0-9])?$<br/>
     */
    private String domain;

    /**
     * <p>
     * The S3 bucket where the static files for this domain are stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 1024<br/>
     * <b>Pattern: </b>^[0-9A-Za-z\.\-_]*(?<!\.)$<br/>
     */
    private String s3Bucket;

    /**
     * <p>
     * The ARN of the CloudFront distribution.
     * </p>
     */
    private String cloudFrontDistribution;

    /**
     * <p>
     * The app version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     */
    private String version;

    /**
     * <p>
     * The domain status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, UPDATING, ACTIVE, FAILED
     */
    private String status;

    /**
     * <p>
     * The configuration for a custom domain that hosts the sign-up and sign-in
     * webpages for your application.
     * </p>
     */
    private CustomDomainConfigType customDomainConfig;

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainDescriptionType withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The AWS account ID for the user pool owner.
     * </p>
     *
     * @return <p>
     *         The AWS account ID for the user pool owner.
     *         </p>
     */
    public String getAWSAccountId() {
        return aWSAccountId;
    }

    /**
     * <p>
     * The AWS account ID for the user pool owner.
     * </p>
     *
     * @param aWSAccountId <p>
     *            The AWS account ID for the user pool owner.
     *            </p>
     */
    public void setAWSAccountId(String aWSAccountId) {
        this.aWSAccountId = aWSAccountId;
    }

    /**
     * <p>
     * The AWS account ID for the user pool owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aWSAccountId <p>
     *            The AWS account ID for the user pool owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainDescriptionType withAWSAccountId(String aWSAccountId) {
        this.aWSAccountId = aWSAccountId;
        return this;
    }

    /**
     * <p>
     * The domain string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,61}[a-z0-9])?$<br/>
     *
     * @return <p>
     *         The domain string.
     *         </p>
     */
    public String getDomain() {
        return domain;
    }

    /**
     * <p>
     * The domain string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,61}[a-z0-9])?$<br/>
     *
     * @param domain <p>
     *            The domain string.
     *            </p>
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The domain string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,61}[a-z0-9])?$<br/>
     *
     * @param domain <p>
     *            The domain string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainDescriptionType withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * <p>
     * The S3 bucket where the static files for this domain are stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 1024<br/>
     * <b>Pattern: </b>^[0-9A-Za-z\.\-_]*(?<!\.)$<br/>
     *
     * @return <p>
     *         The S3 bucket where the static files for this domain are stored.
     *         </p>
     */
    public String getS3Bucket() {
        return s3Bucket;
    }

    /**
     * <p>
     * The S3 bucket where the static files for this domain are stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 1024<br/>
     * <b>Pattern: </b>^[0-9A-Za-z\.\-_]*(?<!\.)$<br/>
     *
     * @param s3Bucket <p>
     *            The S3 bucket where the static files for this domain are
     *            stored.
     *            </p>
     */
    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The S3 bucket where the static files for this domain are stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 1024<br/>
     * <b>Pattern: </b>^[0-9A-Za-z\.\-_]*(?<!\.)$<br/>
     *
     * @param s3Bucket <p>
     *            The S3 bucket where the static files for this domain are
     *            stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainDescriptionType withS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
        return this;
    }

    /**
     * <p>
     * The ARN of the CloudFront distribution.
     * </p>
     *
     * @return <p>
     *         The ARN of the CloudFront distribution.
     *         </p>
     */
    public String getCloudFrontDistribution() {
        return cloudFrontDistribution;
    }

    /**
     * <p>
     * The ARN of the CloudFront distribution.
     * </p>
     *
     * @param cloudFrontDistribution <p>
     *            The ARN of the CloudFront distribution.
     *            </p>
     */
    public void setCloudFrontDistribution(String cloudFrontDistribution) {
        this.cloudFrontDistribution = cloudFrontDistribution;
    }

    /**
     * <p>
     * The ARN of the CloudFront distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudFrontDistribution <p>
     *            The ARN of the CloudFront distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainDescriptionType withCloudFrontDistribution(String cloudFrontDistribution) {
        this.cloudFrontDistribution = cloudFrontDistribution;
        return this;
    }

    /**
     * <p>
     * The app version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     *
     * @return <p>
     *         The app version.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The app version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     *
     * @param version <p>
     *            The app version.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The app version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     *
     * @param version <p>
     *            The app version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainDescriptionType withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The domain status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, UPDATING, ACTIVE, FAILED
     *
     * @return <p>
     *         The domain status.
     *         </p>
     * @see DomainStatusType
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The domain status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, UPDATING, ACTIVE, FAILED
     *
     * @param status <p>
     *            The domain status.
     *            </p>
     * @see DomainStatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The domain status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, UPDATING, ACTIVE, FAILED
     *
     * @param status <p>
     *            The domain status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainStatusType
     */
    public DomainDescriptionType withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The domain status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, UPDATING, ACTIVE, FAILED
     *
     * @param status <p>
     *            The domain status.
     *            </p>
     * @see DomainStatusType
     */
    public void setStatus(DomainStatusType status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The domain status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, UPDATING, ACTIVE, FAILED
     *
     * @param status <p>
     *            The domain status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainStatusType
     */
    public DomainDescriptionType withStatus(DomainStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The configuration for a custom domain that hosts the sign-up and sign-in
     * webpages for your application.
     * </p>
     *
     * @return <p>
     *         The configuration for a custom domain that hosts the sign-up and
     *         sign-in webpages for your application.
     *         </p>
     */
    public CustomDomainConfigType getCustomDomainConfig() {
        return customDomainConfig;
    }

    /**
     * <p>
     * The configuration for a custom domain that hosts the sign-up and sign-in
     * webpages for your application.
     * </p>
     *
     * @param customDomainConfig <p>
     *            The configuration for a custom domain that hosts the sign-up
     *            and sign-in webpages for your application.
     *            </p>
     */
    public void setCustomDomainConfig(CustomDomainConfigType customDomainConfig) {
        this.customDomainConfig = customDomainConfig;
    }

    /**
     * <p>
     * The configuration for a custom domain that hosts the sign-up and sign-in
     * webpages for your application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customDomainConfig <p>
     *            The configuration for a custom domain that hosts the sign-up
     *            and sign-in webpages for your application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainDescriptionType withCustomDomainConfig(CustomDomainConfigType customDomainConfig) {
        this.customDomainConfig = customDomainConfig;
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getAWSAccountId() != null)
            sb.append("AWSAccountId: " + getAWSAccountId() + ",");
        if (getDomain() != null)
            sb.append("Domain: " + getDomain() + ",");
        if (getS3Bucket() != null)
            sb.append("S3Bucket: " + getS3Bucket() + ",");
        if (getCloudFrontDistribution() != null)
            sb.append("CloudFrontDistribution: " + getCloudFrontDistribution() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCustomDomainConfig() != null)
            sb.append("CustomDomainConfig: " + getCustomDomainConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode
                + ((getAWSAccountId() == null) ? 0 : getAWSAccountId().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime
                * hashCode
                + ((getCloudFrontDistribution() == null) ? 0 : getCloudFrontDistribution()
                        .hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCustomDomainConfig() == null) ? 0 : getCustomDomainConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainDescriptionType == false)
            return false;
        DomainDescriptionType other = (DomainDescriptionType) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getAWSAccountId() == null ^ this.getAWSAccountId() == null)
            return false;
        if (other.getAWSAccountId() != null
                && other.getAWSAccountId().equals(this.getAWSAccountId()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getCloudFrontDistribution() == null ^ this.getCloudFrontDistribution() == null)
            return false;
        if (other.getCloudFrontDistribution() != null
                && other.getCloudFrontDistribution().equals(this.getCloudFrontDistribution()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCustomDomainConfig() == null ^ this.getCustomDomainConfig() == null)
            return false;
        if (other.getCustomDomainConfig() != null
                && other.getCustomDomainConfig().equals(this.getCustomDomainConfig()) == false)
            return false;
        return true;
    }
}
