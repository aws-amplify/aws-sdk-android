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
 * A complex type that controls whether access logs are written for the
 * distribution.
 * </p>
 */
public class AwsCloudFrontDistributionLogging implements Serializable {
    /**
     * <p>
     * The Amazon S3 bucket to store the access logs in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String bucket;

    /**
     * <p>
     * With this field, you can enable or disable the selected distribution.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * Specifies whether you want CloudFront to include cookies in access logs.
     * </p>
     */
    private Boolean includeCookies;

    /**
     * <p>
     * An optional string that you want CloudFront to use as a prefix to the
     * access log filenames for this distribution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String prefix;

    /**
     * <p>
     * The Amazon S3 bucket to store the access logs in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon S3 bucket to store the access logs in.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket to store the access logs in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param bucket <p>
     *            The Amazon S3 bucket to store the access logs in.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket to store the access logs in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param bucket <p>
     *            The Amazon S3 bucket to store the access logs in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCloudFrontDistributionLogging withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * With this field, you can enable or disable the selected distribution.
     * </p>
     *
     * @return <p>
     *         With this field, you can enable or disable the selected
     *         distribution.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * With this field, you can enable or disable the selected distribution.
     * </p>
     *
     * @return <p>
     *         With this field, you can enable or disable the selected
     *         distribution.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * With this field, you can enable or disable the selected distribution.
     * </p>
     *
     * @param enabled <p>
     *            With this field, you can enable or disable the selected
     *            distribution.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * With this field, you can enable or disable the selected distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            With this field, you can enable or disable the selected
     *            distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCloudFrontDistributionLogging withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * Specifies whether you want CloudFront to include cookies in access logs.
     * </p>
     *
     * @return <p>
     *         Specifies whether you want CloudFront to include cookies in
     *         access logs.
     *         </p>
     */
    public Boolean isIncludeCookies() {
        return includeCookies;
    }

    /**
     * <p>
     * Specifies whether you want CloudFront to include cookies in access logs.
     * </p>
     *
     * @return <p>
     *         Specifies whether you want CloudFront to include cookies in
     *         access logs.
     *         </p>
     */
    public Boolean getIncludeCookies() {
        return includeCookies;
    }

    /**
     * <p>
     * Specifies whether you want CloudFront to include cookies in access logs.
     * </p>
     *
     * @param includeCookies <p>
     *            Specifies whether you want CloudFront to include cookies in
     *            access logs.
     *            </p>
     */
    public void setIncludeCookies(Boolean includeCookies) {
        this.includeCookies = includeCookies;
    }

    /**
     * <p>
     * Specifies whether you want CloudFront to include cookies in access logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeCookies <p>
     *            Specifies whether you want CloudFront to include cookies in
     *            access logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCloudFrontDistributionLogging withIncludeCookies(Boolean includeCookies) {
        this.includeCookies = includeCookies;
        return this;
    }

    /**
     * <p>
     * An optional string that you want CloudFront to use as a prefix to the
     * access log filenames for this distribution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         An optional string that you want CloudFront to use as a prefix to
     *         the access log filenames for this distribution.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * An optional string that you want CloudFront to use as a prefix to the
     * access log filenames for this distribution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param prefix <p>
     *            An optional string that you want CloudFront to use as a prefix
     *            to the access log filenames for this distribution.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * An optional string that you want CloudFront to use as a prefix to the
     * access log filenames for this distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param prefix <p>
     *            An optional string that you want CloudFront to use as a prefix
     *            to the access log filenames for this distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCloudFrontDistributionLogging withPrefix(String prefix) {
        this.prefix = prefix;
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
        if (getBucket() != null)
            sb.append("Bucket: " + getBucket() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getIncludeCookies() != null)
            sb.append("IncludeCookies: " + getIncludeCookies() + ",");
        if (getPrefix() != null)
            sb.append("Prefix: " + getPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getIncludeCookies() == null) ? 0 : getIncludeCookies().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCloudFrontDistributionLogging == false)
            return false;
        AwsCloudFrontDistributionLogging other = (AwsCloudFrontDistributionLogging) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getIncludeCookies() == null ^ this.getIncludeCookies() == null)
            return false;
        if (other.getIncludeCookies() != null
                && other.getIncludeCookies().equals(this.getIncludeCookies()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        return true;
    }
}
