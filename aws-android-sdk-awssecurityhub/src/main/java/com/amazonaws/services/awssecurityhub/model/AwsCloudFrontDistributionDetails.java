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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * A distribution configuration.
 * </p>
 */
public class AwsCloudFrontDistributionDetails implements Serializable {
    /**
     * <p>
     * The domain name corresponding to the distribution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String domainName;

    /**
     * <p>
     * The entity tag is a hash of the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String eTag;

    /**
     * <p>
     * The date and time that the distribution was last modified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String lastModifiedTime;

    /**
     * <p>
     * A complex type that controls whether access logs are written for the
     * distribution.
     * </p>
     */
    private AwsCloudFrontDistributionLogging logging;

    /**
     * <p>
     * A complex type that contains information about origins for this
     * distribution.
     * </p>
     */
    private AwsCloudFrontDistributionOrigins origins;

    /**
     * <p>
     * Indicates the current status of the distribution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String status;

    /**
     * <p>
     * A unique identifier that specifies the AWS WAF web ACL, if any, to
     * associate with this distribution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String webAclId;

    /**
     * <p>
     * The domain name corresponding to the distribution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The domain name corresponding to the distribution.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The domain name corresponding to the distribution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param domainName <p>
     *            The domain name corresponding to the distribution.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name corresponding to the distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param domainName <p>
     *            The domain name corresponding to the distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCloudFrontDistributionDetails withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The entity tag is a hash of the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The entity tag is a hash of the object.
     *         </p>
     */
    public String getETag() {
        return eTag;
    }

    /**
     * <p>
     * The entity tag is a hash of the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param eTag <p>
     *            The entity tag is a hash of the object.
     *            </p>
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The entity tag is a hash of the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param eTag <p>
     *            The entity tag is a hash of the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCloudFrontDistributionDetails withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * <p>
     * The date and time that the distribution was last modified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The date and time that the distribution was last modified.
     *         </p>
     */
    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the distribution was last modified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param lastModifiedTime <p>
     *            The date and time that the distribution was last modified.
     *            </p>
     */
    public void setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the distribution was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param lastModifiedTime <p>
     *            The date and time that the distribution was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCloudFrontDistributionDetails withLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * A complex type that controls whether access logs are written for the
     * distribution.
     * </p>
     *
     * @return <p>
     *         A complex type that controls whether access logs are written for
     *         the distribution.
     *         </p>
     */
    public AwsCloudFrontDistributionLogging getLogging() {
        return logging;
    }

    /**
     * <p>
     * A complex type that controls whether access logs are written for the
     * distribution.
     * </p>
     *
     * @param logging <p>
     *            A complex type that controls whether access logs are written
     *            for the distribution.
     *            </p>
     */
    public void setLogging(AwsCloudFrontDistributionLogging logging) {
        this.logging = logging;
    }

    /**
     * <p>
     * A complex type that controls whether access logs are written for the
     * distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logging <p>
     *            A complex type that controls whether access logs are written
     *            for the distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCloudFrontDistributionDetails withLogging(AwsCloudFrontDistributionLogging logging) {
        this.logging = logging;
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about origins for this
     * distribution.
     * </p>
     *
     * @return <p>
     *         A complex type that contains information about origins for this
     *         distribution.
     *         </p>
     */
    public AwsCloudFrontDistributionOrigins getOrigins() {
        return origins;
    }

    /**
     * <p>
     * A complex type that contains information about origins for this
     * distribution.
     * </p>
     *
     * @param origins <p>
     *            A complex type that contains information about origins for
     *            this distribution.
     *            </p>
     */
    public void setOrigins(AwsCloudFrontDistributionOrigins origins) {
        this.origins = origins;
    }

    /**
     * <p>
     * A complex type that contains information about origins for this
     * distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param origins <p>
     *            A complex type that contains information about origins for
     *            this distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCloudFrontDistributionDetails withOrigins(AwsCloudFrontDistributionOrigins origins) {
        this.origins = origins;
        return this;
    }

    /**
     * <p>
     * Indicates the current status of the distribution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         Indicates the current status of the distribution.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Indicates the current status of the distribution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param status <p>
     *            Indicates the current status of the distribution.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the current status of the distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param status <p>
     *            Indicates the current status of the distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCloudFrontDistributionDetails withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * A unique identifier that specifies the AWS WAF web ACL, if any, to
     * associate with this distribution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A unique identifier that specifies the AWS WAF web ACL, if any,
     *         to associate with this distribution.
     *         </p>
     */
    public String getWebAclId() {
        return webAclId;
    }

    /**
     * <p>
     * A unique identifier that specifies the AWS WAF web ACL, if any, to
     * associate with this distribution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param webAclId <p>
     *            A unique identifier that specifies the AWS WAF web ACL, if
     *            any, to associate with this distribution.
     *            </p>
     */
    public void setWebAclId(String webAclId) {
        this.webAclId = webAclId;
    }

    /**
     * <p>
     * A unique identifier that specifies the AWS WAF web ACL, if any, to
     * associate with this distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param webAclId <p>
     *            A unique identifier that specifies the AWS WAF web ACL, if
     *            any, to associate with this distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCloudFrontDistributionDetails withWebAclId(String webAclId) {
        this.webAclId = webAclId;
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
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getETag() != null)
            sb.append("ETag: " + getETag() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getLogging() != null)
            sb.append("Logging: " + getLogging() + ",");
        if (getOrigins() != null)
            sb.append("Origins: " + getOrigins() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getWebAclId() != null)
            sb.append("WebAclId: " + getWebAclId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLogging() == null) ? 0 : getLogging().hashCode());
        hashCode = prime * hashCode + ((getOrigins() == null) ? 0 : getOrigins().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getWebAclId() == null) ? 0 : getWebAclId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCloudFrontDistributionDetails == false)
            return false;
        AwsCloudFrontDistributionDetails other = (AwsCloudFrontDistributionDetails) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLogging() == null ^ this.getLogging() == null)
            return false;
        if (other.getLogging() != null && other.getLogging().equals(this.getLogging()) == false)
            return false;
        if (other.getOrigins() == null ^ this.getOrigins() == null)
            return false;
        if (other.getOrigins() != null && other.getOrigins().equals(this.getOrigins()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getWebAclId() == null ^ this.getWebAclId() == null)
            return false;
        if (other.getWebAclId() != null && other.getWebAclId().equals(this.getWebAclId()) == false)
            return false;
        return true;
    }
}
