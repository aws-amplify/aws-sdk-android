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
 * Sets the versioning state of an existing bucket. To set the versioning state,
 * you must be the bucket owner.
 * </p>
 * <p>
 * You can set the versioning state with one of the following values:
 * </p>
 * <p>
 * <b>Enabled</b>—Enables versioning for the objects in the bucket. All objects
 * added to the bucket receive a unique version ID.
 * </p>
 * <p>
 * <b>Suspended</b>—Disables versioning for the objects in the bucket. All
 * objects added to the bucket receive the version ID null.
 * </p>
 * <p>
 * If the versioning state has never been set on a bucket, it has no versioning
 * state; a <a>GetBucketVersioning</a> request does not return a versioning
 * state value.
 * </p>
 * <p>
 * If the bucket owner enables MFA Delete in the bucket versioning
 * configuration, the bucket owner must include the
 * <code>x-amz-mfa request</code> header and the <code>Status</code> and the
 * <code>MfaDelete</code> request elements in a request to set the versioning
 * state of the bucket.
 * </p>
 * <important>
 * <p>
 * If you have an object expiration lifecycle policy in your non-versioned
 * bucket and you want to maintain the same permanent delete behavior when you
 * enable versioning, you must add a noncurrent expiration policy. The
 * noncurrent expiration lifecycle policy will manage the deletes of the
 * noncurrent object versions in the version-enabled bucket. (A version-enabled
 * bucket maintains one current and zero or more noncurrent object versions.)
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html#lifecycle-and-other-bucket-config"
 * >Lifecycle and Versioning</a>.
 * </p>
 * </important>
 * <p class="title">
 * <b>Related Resources</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateBucket</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteBucket</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetBucketVersioning</a>
 * </p>
 * </li>
 * </ul>
 */
public class PutBucketVersioningRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The concatenation of the authentication device's serial number, a space,
     * and the value that is displayed on your authentication device.
     * </p>
     */
    private String mFA;

    /**
     * <p>
     * Container for setting the versioning state.
     * </p>
     */
    private VersioningConfiguration versioningConfiguration;

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
    public PutBucketVersioningRequest withBucket(String bucket) {
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
    public PutBucketVersioningRequest withContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    /**
     * <p>
     * The concatenation of the authentication device's serial number, a space,
     * and the value that is displayed on your authentication device.
     * </p>
     *
     * @return <p>
     *         The concatenation of the authentication device's serial number, a
     *         space, and the value that is displayed on your authentication
     *         device.
     *         </p>
     */
    public String getMFA() {
        return mFA;
    }

    /**
     * <p>
     * The concatenation of the authentication device's serial number, a space,
     * and the value that is displayed on your authentication device.
     * </p>
     *
     * @param mFA <p>
     *            The concatenation of the authentication device's serial
     *            number, a space, and the value that is displayed on your
     *            authentication device.
     *            </p>
     */
    public void setMFA(String mFA) {
        this.mFA = mFA;
    }

    /**
     * <p>
     * The concatenation of the authentication device's serial number, a space,
     * and the value that is displayed on your authentication device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mFA <p>
     *            The concatenation of the authentication device's serial
     *            number, a space, and the value that is displayed on your
     *            authentication device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketVersioningRequest withMFA(String mFA) {
        this.mFA = mFA;
        return this;
    }

    /**
     * <p>
     * Container for setting the versioning state.
     * </p>
     *
     * @return <p>
     *         Container for setting the versioning state.
     *         </p>
     */
    public VersioningConfiguration getVersioningConfiguration() {
        return versioningConfiguration;
    }

    /**
     * <p>
     * Container for setting the versioning state.
     * </p>
     *
     * @param versioningConfiguration <p>
     *            Container for setting the versioning state.
     *            </p>
     */
    public void setVersioningConfiguration(VersioningConfiguration versioningConfiguration) {
        this.versioningConfiguration = versioningConfiguration;
    }

    /**
     * <p>
     * Container for setting the versioning state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versioningConfiguration <p>
     *            Container for setting the versioning state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketVersioningRequest withVersioningConfiguration(
            VersioningConfiguration versioningConfiguration) {
        this.versioningConfiguration = versioningConfiguration;
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
        if (getMFA() != null)
            sb.append("MFA: " + getMFA() + ",");
        if (getVersioningConfiguration() != null)
            sb.append("VersioningConfiguration: " + getVersioningConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getContentMD5() == null) ? 0 : getContentMD5().hashCode());
        hashCode = prime * hashCode + ((getMFA() == null) ? 0 : getMFA().hashCode());
        hashCode = prime
                * hashCode
                + ((getVersioningConfiguration() == null) ? 0 : getVersioningConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBucketVersioningRequest == false)
            return false;
        PutBucketVersioningRequest other = (PutBucketVersioningRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getContentMD5() == null ^ this.getContentMD5() == null)
            return false;
        if (other.getContentMD5() != null
                && other.getContentMD5().equals(this.getContentMD5()) == false)
            return false;
        if (other.getMFA() == null ^ this.getMFA() == null)
            return false;
        if (other.getMFA() != null && other.getMFA().equals(this.getMFA()) == false)
            return false;
        if (other.getVersioningConfiguration() == null ^ this.getVersioningConfiguration() == null)
            return false;
        if (other.getVersioningConfiguration() != null
                && other.getVersioningConfiguration().equals(this.getVersioningConfiguration()) == false)
            return false;
        return true;
    }
}
