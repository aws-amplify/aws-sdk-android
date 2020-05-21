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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sets the configuration of the website that is specified in the
 * <code>website</code> subresource. To configure a bucket as a website, you can
 * add this subresource on the bucket with website configuration information
 * such as the file name of the index document and any redirect rules. For more
 * information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html"
 * >Hosting Websites on Amazon S3</a>.
 * </p>
 * <p>
 * This PUT operation requires the <code>S3:PutBucketWebsite</code> permission.
 * By default, only the bucket owner can configure the website attached to a
 * bucket; however, bucket owners can allow other users to set the website
 * configuration by writing a bucket policy that grants them the
 * <code>S3:PutBucketWebsite</code> permission.
 * </p>
 * <p>
 * To redirect all website requests sent to the bucket's website endpoint, you
 * add a website configuration with the following elements. Because all requests
 * are sent to another website, you don't need to provide index document name
 * for the bucket.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>WebsiteConfiguration</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RedirectAllRequestsTo</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>HostName</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Protocol</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * If you want granular control over redirects, you can use the following
 * elements to add routing rules that describe conditions for redirecting
 * requests and information about the redirect destination. In this case, the
 * website configuration must provide an index document for the bucket, because
 * some requests might not be redirected.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>WebsiteConfiguration</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>IndexDocument</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Suffix</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ErrorDocument</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Key</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RoutingRules</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RoutingRule</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Condition</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>HttpErrorCodeReturnedEquals</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>KeyPrefixEquals</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Redirect</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Protocol</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>HostName</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ReplaceKeyPrefixWith</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ReplaceKeyWith</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>HttpRedirectCode</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * Amazon S3 has a limitation of 50 routing rules per website configuration. If
 * you require more than 50 routing rules, you can use object redirect. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html"
 * >Configuring an Object Redirect</a> in the <i>Amazon Simple Storage Service
 * Developer Guide</i>.
 * </p>
 */
public class PutBucketWebsiteRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The bucket name.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the data. You must use this
     * header as a message integrity check to verify that the request body was
     * not corrupted in transit. For more information, see <a
     * href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864</a>.
     * </p>
     */
    private String contentMD5;

    /**
     * <p>
     * Container for the request.
     * </p>
     */
    private WebsiteConfiguration websiteConfiguration;

    /**
     * <p>
     * The bucket name.
     * </p>
     *
     * @return <p>
     *         The bucket name.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The bucket name.
     * </p>
     *
     * @param bucket <p>
     *            The bucket name.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The bucket name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The bucket name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketWebsiteRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the data. You must use this
     * header as a message integrity check to verify that the request body was
     * not corrupted in transit. For more information, see <a
     * href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864</a>.
     * </p>
     *
     * @return <p>
     *         The base64-encoded 128-bit MD5 digest of the data. You must use
     *         this header as a message integrity check to verify that the
     *         request body was not corrupted in transit. For more information,
     *         see <a href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864</a>.
     *         </p>
     */
    public String getContentMD5() {
        return contentMD5;
    }

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the data. You must use this
     * header as a message integrity check to verify that the request body was
     * not corrupted in transit. For more information, see <a
     * href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864</a>.
     * </p>
     *
     * @param contentMD5 <p>
     *            The base64-encoded 128-bit MD5 digest of the data. You must
     *            use this header as a message integrity check to verify that
     *            the request body was not corrupted in transit. For more
     *            information, see <a
     *            href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864</a>.
     *            </p>
     */
    public void setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
    }

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the data. You must use this
     * header as a message integrity check to verify that the request body was
     * not corrupted in transit. For more information, see <a
     * href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentMD5 <p>
     *            The base64-encoded 128-bit MD5 digest of the data. You must
     *            use this header as a message integrity check to verify that
     *            the request body was not corrupted in transit. For more
     *            information, see <a
     *            href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketWebsiteRequest withContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    /**
     * <p>
     * Container for the request.
     * </p>
     *
     * @return <p>
     *         Container for the request.
     *         </p>
     */
    public WebsiteConfiguration getWebsiteConfiguration() {
        return websiteConfiguration;
    }

    /**
     * <p>
     * Container for the request.
     * </p>
     *
     * @param websiteConfiguration <p>
     *            Container for the request.
     *            </p>
     */
    public void setWebsiteConfiguration(WebsiteConfiguration websiteConfiguration) {
        this.websiteConfiguration = websiteConfiguration;
    }

    /**
     * <p>
     * Container for the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param websiteConfiguration <p>
     *            Container for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketWebsiteRequest withWebsiteConfiguration(
            WebsiteConfiguration websiteConfiguration) {
        this.websiteConfiguration = websiteConfiguration;
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
        if (getContentMD5() != null)
            sb.append("ContentMD5: " + getContentMD5() + ",");
        if (getWebsiteConfiguration() != null)
            sb.append("WebsiteConfiguration: " + getWebsiteConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getContentMD5() == null) ? 0 : getContentMD5().hashCode());
        hashCode = prime * hashCode
                + ((getWebsiteConfiguration() == null) ? 0 : getWebsiteConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBucketWebsiteRequest == false)
            return false;
        PutBucketWebsiteRequest other = (PutBucketWebsiteRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getContentMD5() == null ^ this.getContentMD5() == null)
            return false;
        if (other.getContentMD5() != null
                && other.getContentMD5().equals(this.getContentMD5()) == false)
            return false;
        if (other.getWebsiteConfiguration() == null ^ this.getWebsiteConfiguration() == null)
            return false;
        if (other.getWebsiteConfiguration() != null
                && other.getWebsiteConfiguration().equals(this.getWebsiteConfiguration()) == false)
            return false;
        return true;
    }
}
