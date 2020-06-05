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

/**
 * <p>
 * A complex type that controls whether access logs are written for the
 * distribution.
 * </p>
 */
public class LoggingConfig implements Serializable {
    /**
     * <p>
     * Specifies whether you want CloudFront to save access logs to an Amazon S3
     * bucket. If you don't want to enable logging when you create a
     * distribution or if you want to disable logging for an existing
     * distribution, specify <code>false</code> for <code>Enabled</code>, and
     * specify empty <code>Bucket</code> and <code>Prefix</code> elements. If
     * you specify <code>false</code> for <code>Enabled</code> but you specify
     * values for <code>Bucket</code>, <code>prefix</code>, and
     * <code>IncludeCookies</code>, the values are automatically deleted.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * Specifies whether you want CloudFront to include cookies in access logs,
     * specify <code>true</code> for <code>IncludeCookies</code>. If you choose
     * to include cookies in logs, CloudFront logs all cookies regardless of how
     * you configure the cache behaviors for this distribution. If you don't
     * want to include cookies when you create a distribution or if you want to
     * disable include cookies for an existing distribution, specify
     * <code>false</code> for <code>IncludeCookies</code>.
     * </p>
     */
    private Boolean includeCookies;

    /**
     * <p>
     * The Amazon S3 bucket to store the access logs in, for example,
     * <code>myawslogbucket.s3.amazonaws.com</code>.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * An optional string that you want CloudFront to prefix to the access log
     * <code>filenames</code> for this distribution, for example,
     * <code>myprefix/</code>. If you want to enable logging, but you don't want
     * to specify a prefix, you still must include an empty <code>Prefix</code>
     * element in the <code>Logging</code> element.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * Specifies whether you want CloudFront to save access logs to an Amazon S3
     * bucket. If you don't want to enable logging when you create a
     * distribution or if you want to disable logging for an existing
     * distribution, specify <code>false</code> for <code>Enabled</code>, and
     * specify empty <code>Bucket</code> and <code>Prefix</code> elements. If
     * you specify <code>false</code> for <code>Enabled</code> but you specify
     * values for <code>Bucket</code>, <code>prefix</code>, and
     * <code>IncludeCookies</code>, the values are automatically deleted.
     * </p>
     *
     * @return <p>
     *         Specifies whether you want CloudFront to save access logs to an
     *         Amazon S3 bucket. If you don't want to enable logging when you
     *         create a distribution or if you want to disable logging for an
     *         existing distribution, specify <code>false</code> for
     *         <code>Enabled</code>, and specify empty <code>Bucket</code> and
     *         <code>Prefix</code> elements. If you specify <code>false</code>
     *         for <code>Enabled</code> but you specify values for
     *         <code>Bucket</code>, <code>prefix</code>, and
     *         <code>IncludeCookies</code>, the values are automatically
     *         deleted.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether you want CloudFront to save access logs to an Amazon S3
     * bucket. If you don't want to enable logging when you create a
     * distribution or if you want to disable logging for an existing
     * distribution, specify <code>false</code> for <code>Enabled</code>, and
     * specify empty <code>Bucket</code> and <code>Prefix</code> elements. If
     * you specify <code>false</code> for <code>Enabled</code> but you specify
     * values for <code>Bucket</code>, <code>prefix</code>, and
     * <code>IncludeCookies</code>, the values are automatically deleted.
     * </p>
     *
     * @return <p>
     *         Specifies whether you want CloudFront to save access logs to an
     *         Amazon S3 bucket. If you don't want to enable logging when you
     *         create a distribution or if you want to disable logging for an
     *         existing distribution, specify <code>false</code> for
     *         <code>Enabled</code>, and specify empty <code>Bucket</code> and
     *         <code>Prefix</code> elements. If you specify <code>false</code>
     *         for <code>Enabled</code> but you specify values for
     *         <code>Bucket</code>, <code>prefix</code>, and
     *         <code>IncludeCookies</code>, the values are automatically
     *         deleted.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether you want CloudFront to save access logs to an Amazon S3
     * bucket. If you don't want to enable logging when you create a
     * distribution or if you want to disable logging for an existing
     * distribution, specify <code>false</code> for <code>Enabled</code>, and
     * specify empty <code>Bucket</code> and <code>Prefix</code> elements. If
     * you specify <code>false</code> for <code>Enabled</code> but you specify
     * values for <code>Bucket</code>, <code>prefix</code>, and
     * <code>IncludeCookies</code>, the values are automatically deleted.
     * </p>
     *
     * @param enabled <p>
     *            Specifies whether you want CloudFront to save access logs to
     *            an Amazon S3 bucket. If you don't want to enable logging when
     *            you create a distribution or if you want to disable logging
     *            for an existing distribution, specify <code>false</code> for
     *            <code>Enabled</code>, and specify empty <code>Bucket</code>
     *            and <code>Prefix</code> elements. If you specify
     *            <code>false</code> for <code>Enabled</code> but you specify
     *            values for <code>Bucket</code>, <code>prefix</code>, and
     *            <code>IncludeCookies</code>, the values are automatically
     *            deleted.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether you want CloudFront to save access logs to an Amazon S3
     * bucket. If you don't want to enable logging when you create a
     * distribution or if you want to disable logging for an existing
     * distribution, specify <code>false</code> for <code>Enabled</code>, and
     * specify empty <code>Bucket</code> and <code>Prefix</code> elements. If
     * you specify <code>false</code> for <code>Enabled</code> but you specify
     * values for <code>Bucket</code>, <code>prefix</code>, and
     * <code>IncludeCookies</code>, the values are automatically deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Specifies whether you want CloudFront to save access logs to
     *            an Amazon S3 bucket. If you don't want to enable logging when
     *            you create a distribution or if you want to disable logging
     *            for an existing distribution, specify <code>false</code> for
     *            <code>Enabled</code>, and specify empty <code>Bucket</code>
     *            and <code>Prefix</code> elements. If you specify
     *            <code>false</code> for <code>Enabled</code> but you specify
     *            values for <code>Bucket</code>, <code>prefix</code>, and
     *            <code>IncludeCookies</code>, the values are automatically
     *            deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoggingConfig withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * Specifies whether you want CloudFront to include cookies in access logs,
     * specify <code>true</code> for <code>IncludeCookies</code>. If you choose
     * to include cookies in logs, CloudFront logs all cookies regardless of how
     * you configure the cache behaviors for this distribution. If you don't
     * want to include cookies when you create a distribution or if you want to
     * disable include cookies for an existing distribution, specify
     * <code>false</code> for <code>IncludeCookies</code>.
     * </p>
     *
     * @return <p>
     *         Specifies whether you want CloudFront to include cookies in
     *         access logs, specify <code>true</code> for
     *         <code>IncludeCookies</code>. If you choose to include cookies in
     *         logs, CloudFront logs all cookies regardless of how you configure
     *         the cache behaviors for this distribution. If you don't want to
     *         include cookies when you create a distribution or if you want to
     *         disable include cookies for an existing distribution, specify
     *         <code>false</code> for <code>IncludeCookies</code>.
     *         </p>
     */
    public Boolean isIncludeCookies() {
        return includeCookies;
    }

    /**
     * <p>
     * Specifies whether you want CloudFront to include cookies in access logs,
     * specify <code>true</code> for <code>IncludeCookies</code>. If you choose
     * to include cookies in logs, CloudFront logs all cookies regardless of how
     * you configure the cache behaviors for this distribution. If you don't
     * want to include cookies when you create a distribution or if you want to
     * disable include cookies for an existing distribution, specify
     * <code>false</code> for <code>IncludeCookies</code>.
     * </p>
     *
     * @return <p>
     *         Specifies whether you want CloudFront to include cookies in
     *         access logs, specify <code>true</code> for
     *         <code>IncludeCookies</code>. If you choose to include cookies in
     *         logs, CloudFront logs all cookies regardless of how you configure
     *         the cache behaviors for this distribution. If you don't want to
     *         include cookies when you create a distribution or if you want to
     *         disable include cookies for an existing distribution, specify
     *         <code>false</code> for <code>IncludeCookies</code>.
     *         </p>
     */
    public Boolean getIncludeCookies() {
        return includeCookies;
    }

    /**
     * <p>
     * Specifies whether you want CloudFront to include cookies in access logs,
     * specify <code>true</code> for <code>IncludeCookies</code>. If you choose
     * to include cookies in logs, CloudFront logs all cookies regardless of how
     * you configure the cache behaviors for this distribution. If you don't
     * want to include cookies when you create a distribution or if you want to
     * disable include cookies for an existing distribution, specify
     * <code>false</code> for <code>IncludeCookies</code>.
     * </p>
     *
     * @param includeCookies <p>
     *            Specifies whether you want CloudFront to include cookies in
     *            access logs, specify <code>true</code> for
     *            <code>IncludeCookies</code>. If you choose to include cookies
     *            in logs, CloudFront logs all cookies regardless of how you
     *            configure the cache behaviors for this distribution. If you
     *            don't want to include cookies when you create a distribution
     *            or if you want to disable include cookies for an existing
     *            distribution, specify <code>false</code> for
     *            <code>IncludeCookies</code>.
     *            </p>
     */
    public void setIncludeCookies(Boolean includeCookies) {
        this.includeCookies = includeCookies;
    }

    /**
     * <p>
     * Specifies whether you want CloudFront to include cookies in access logs,
     * specify <code>true</code> for <code>IncludeCookies</code>. If you choose
     * to include cookies in logs, CloudFront logs all cookies regardless of how
     * you configure the cache behaviors for this distribution. If you don't
     * want to include cookies when you create a distribution or if you want to
     * disable include cookies for an existing distribution, specify
     * <code>false</code> for <code>IncludeCookies</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeCookies <p>
     *            Specifies whether you want CloudFront to include cookies in
     *            access logs, specify <code>true</code> for
     *            <code>IncludeCookies</code>. If you choose to include cookies
     *            in logs, CloudFront logs all cookies regardless of how you
     *            configure the cache behaviors for this distribution. If you
     *            don't want to include cookies when you create a distribution
     *            or if you want to disable include cookies for an existing
     *            distribution, specify <code>false</code> for
     *            <code>IncludeCookies</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoggingConfig withIncludeCookies(Boolean includeCookies) {
        this.includeCookies = includeCookies;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket to store the access logs in, for example,
     * <code>myawslogbucket.s3.amazonaws.com</code>.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 bucket to store the access logs in, for example,
     *         <code>myawslogbucket.s3.amazonaws.com</code>.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket to store the access logs in, for example,
     * <code>myawslogbucket.s3.amazonaws.com</code>.
     * </p>
     *
     * @param bucket <p>
     *            The Amazon S3 bucket to store the access logs in, for example,
     *            <code>myawslogbucket.s3.amazonaws.com</code>.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket to store the access logs in, for example,
     * <code>myawslogbucket.s3.amazonaws.com</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The Amazon S3 bucket to store the access logs in, for example,
     *            <code>myawslogbucket.s3.amazonaws.com</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoggingConfig withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * An optional string that you want CloudFront to prefix to the access log
     * <code>filenames</code> for this distribution, for example,
     * <code>myprefix/</code>. If you want to enable logging, but you don't want
     * to specify a prefix, you still must include an empty <code>Prefix</code>
     * element in the <code>Logging</code> element.
     * </p>
     *
     * @return <p>
     *         An optional string that you want CloudFront to prefix to the
     *         access log <code>filenames</code> for this distribution, for
     *         example, <code>myprefix/</code>. If you want to enable logging,
     *         but you don't want to specify a prefix, you still must include an
     *         empty <code>Prefix</code> element in the <code>Logging</code>
     *         element.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * An optional string that you want CloudFront to prefix to the access log
     * <code>filenames</code> for this distribution, for example,
     * <code>myprefix/</code>. If you want to enable logging, but you don't want
     * to specify a prefix, you still must include an empty <code>Prefix</code>
     * element in the <code>Logging</code> element.
     * </p>
     *
     * @param prefix <p>
     *            An optional string that you want CloudFront to prefix to the
     *            access log <code>filenames</code> for this distribution, for
     *            example, <code>myprefix/</code>. If you want to enable
     *            logging, but you don't want to specify a prefix, you still
     *            must include an empty <code>Prefix</code> element in the
     *            <code>Logging</code> element.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * An optional string that you want CloudFront to prefix to the access log
     * <code>filenames</code> for this distribution, for example,
     * <code>myprefix/</code>. If you want to enable logging, but you don't want
     * to specify a prefix, you still must include an empty <code>Prefix</code>
     * element in the <code>Logging</code> element.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefix <p>
     *            An optional string that you want CloudFront to prefix to the
     *            access log <code>filenames</code> for this distribution, for
     *            example, <code>myprefix/</code>. If you want to enable
     *            logging, but you don't want to specify a prefix, you still
     *            must include an empty <code>Prefix</code> element in the
     *            <code>Logging</code> element.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoggingConfig withPrefix(String prefix) {
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
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getIncludeCookies() != null)
            sb.append("IncludeCookies: " + getIncludeCookies() + ",");
        if (getBucket() != null)
            sb.append("Bucket: " + getBucket() + ",");
        if (getPrefix() != null)
            sb.append("Prefix: " + getPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getIncludeCookies() == null) ? 0 : getIncludeCookies().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingConfig == false)
            return false;
        LoggingConfig other = (LoggingConfig) obj;

        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getIncludeCookies() == null ^ this.getIncludeCookies() == null)
            return false;
        if (other.getIncludeCookies() != null
                && other.getIncludeCookies().equals(this.getIncludeCookies()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        return true;
    }
}
