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
 * Sets the request payment configuration for a bucket. By default, the bucket
 * owner pays for downloads from the bucket. This configuration parameter
 * enables the bucket owner (only) to specify that the person requesting the
 * download will be charged for the download. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html"
 * >Requester Pays Buckets</a>.
 * </p>
 * <p>
 * The following operations are related to <code>PutBucketRequestPayment</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateBucket</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetBucketRequestPayment</a>
 * </p>
 * </li>
 * </ul>
 */
public class PutBucketRequestPaymentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The bucket name.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * &gt;The base64-encoded 128-bit MD5 digest of the data. You must use this
     * header as a message integrity check to verify that the request body was
     * not corrupted in transit. For more information, see <a
     * href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864</a>.
     * </p>
     */
    private String contentMD5;

    /**
     * <p>
     * Container for Payer.
     * </p>
     */
    private RequestPaymentConfiguration requestPaymentConfiguration;

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
    public PutBucketRequestPaymentRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * &gt;The base64-encoded 128-bit MD5 digest of the data. You must use this
     * header as a message integrity check to verify that the request body was
     * not corrupted in transit. For more information, see <a
     * href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864</a>.
     * </p>
     *
     * @return <p>
     *         &gt;The base64-encoded 128-bit MD5 digest of the data. You must
     *         use this header as a message integrity check to verify that the
     *         request body was not corrupted in transit. For more information,
     *         see <a href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864</a>.
     *         </p>
     */
    public String getContentMD5() {
        return contentMD5;
    }

    /**
     * <p>
     * &gt;The base64-encoded 128-bit MD5 digest of the data. You must use this
     * header as a message integrity check to verify that the request body was
     * not corrupted in transit. For more information, see <a
     * href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864</a>.
     * </p>
     *
     * @param contentMD5 <p>
     *            &gt;The base64-encoded 128-bit MD5 digest of the data. You
     *            must use this header as a message integrity check to verify
     *            that the request body was not corrupted in transit. For more
     *            information, see <a
     *            href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864</a>.
     *            </p>
     */
    public void setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
    }

    /**
     * <p>
     * &gt;The base64-encoded 128-bit MD5 digest of the data. You must use this
     * header as a message integrity check to verify that the request body was
     * not corrupted in transit. For more information, see <a
     * href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentMD5 <p>
     *            &gt;The base64-encoded 128-bit MD5 digest of the data. You
     *            must use this header as a message integrity check to verify
     *            that the request body was not corrupted in transit. For more
     *            information, see <a
     *            href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketRequestPaymentRequest withContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    /**
     * <p>
     * Container for Payer.
     * </p>
     *
     * @return <p>
     *         Container for Payer.
     *         </p>
     */
    public RequestPaymentConfiguration getRequestPaymentConfiguration() {
        return requestPaymentConfiguration;
    }

    /**
     * <p>
     * Container for Payer.
     * </p>
     *
     * @param requestPaymentConfiguration <p>
     *            Container for Payer.
     *            </p>
     */
    public void setRequestPaymentConfiguration(
            RequestPaymentConfiguration requestPaymentConfiguration) {
        this.requestPaymentConfiguration = requestPaymentConfiguration;
    }

    /**
     * <p>
     * Container for Payer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestPaymentConfiguration <p>
     *            Container for Payer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketRequestPaymentRequest withRequestPaymentConfiguration(
            RequestPaymentConfiguration requestPaymentConfiguration) {
        this.requestPaymentConfiguration = requestPaymentConfiguration;
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
        if (getRequestPaymentConfiguration() != null)
            sb.append("RequestPaymentConfiguration: " + getRequestPaymentConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getContentMD5() == null) ? 0 : getContentMD5().hashCode());
        hashCode = prime
                * hashCode
                + ((getRequestPaymentConfiguration() == null) ? 0
                        : getRequestPaymentConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBucketRequestPaymentRequest == false)
            return false;
        PutBucketRequestPaymentRequest other = (PutBucketRequestPaymentRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getContentMD5() == null ^ this.getContentMD5() == null)
            return false;
        if (other.getContentMD5() != null
                && other.getContentMD5().equals(this.getContentMD5()) == false)
            return false;
        if (other.getRequestPaymentConfiguration() == null
                ^ this.getRequestPaymentConfiguration() == null)
            return false;
        if (other.getRequestPaymentConfiguration() != null
                && other.getRequestPaymentConfiguration().equals(
                        this.getRequestPaymentConfiguration()) == false)
            return false;
        return true;
    }
}
