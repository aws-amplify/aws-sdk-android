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
 * Sets the tags for a bucket.
 * </p>
 * <p>
 * Use tags to organize your AWS bill to reflect your own cost structure. To do
 * this, sign up to get your AWS account bill with tag key values included.
 * Then, to see the cost of combined resources, organize your billing
 * information according to resources with the same tag key values. For example,
 * you can tag several resources with a specific application name, and then
 * organize your billing information to see the total cost of that application
 * across several services. For more information, see <a href=
 * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html"
 * >Cost Allocation and Tagging</a>.
 * </p>
 * <note>
 * <p>
 * Within a bucket, if you add a tag that has the same key as an existing tag,
 * the new value overwrites the old value. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/CostAllocTagging.html">Using
 * Cost Allocation in Amazon S3 Bucket Tags</a>.
 * </p>
 * </note>
 * <p>
 * To use this operation, you must have permissions to perform the
 * <code>s3:PutBucketTagging</code> action. The bucket owner has this permission
 * by default and can grant this permission to others. For more information
 * about permissions, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
 * >Permissions Related to Bucket Subresource Operations</a> and <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-access-control.html"
 * >Managing Access Permissions to Your Amazon S3 Resources</a>.
 * </p>
 * <p>
 * <code>PutBucketTagging</code> has the following special errors:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Error code: <code>InvalidTagError</code>
 * </p>
 * <ul>
 * <li>
 * <p>
 * Description: The tag provided was not a valid tag. This error can occur if
 * the tag did not pass input validation. For information about tag
 * restrictions, see <a href=
 * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html"
 * >User-Defined Tag Restrictions</a> and <a href=
 * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/aws-tag-restrictions.html"
 * >AWS-Generated Cost Allocation Tag Restrictions</a>.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Error code: <code>MalformedXMLError</code>
 * </p>
 * <ul>
 * <li>
 * <p>
 * Description: The XML provided does not match the schema.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Error code: <code>OperationAbortedError </code>
 * </p>
 * <ul>
 * <li>
 * <p>
 * Description: A conflicting conditional operation is currently in progress
 * against this resource. Please try again.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Error code: <code>InternalError</code>
 * </p>
 * <ul>
 * <li>
 * <p>
 * Description: The service was unable to apply the provided tag to the bucket.
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * The following operations are related to <code>PutBucketTagging</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetBucketTagging</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteBucketTagging</a>
 * </p>
 * </li>
 * </ul>
 */
public class PutBucketTaggingRequest extends AmazonWebServiceRequest implements Serializable {
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
     * Container for the <code>TagSet</code> and <code>Tag</code> elements.
     * </p>
     */
    private Tagging tagging;

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
    public PutBucketTaggingRequest withBucket(String bucket) {
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
    public PutBucketTaggingRequest withContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    /**
     * <p>
     * Container for the <code>TagSet</code> and <code>Tag</code> elements.
     * </p>
     *
     * @return <p>
     *         Container for the <code>TagSet</code> and <code>Tag</code>
     *         elements.
     *         </p>
     */
    public Tagging getTagging() {
        return tagging;
    }

    /**
     * <p>
     * Container for the <code>TagSet</code> and <code>Tag</code> elements.
     * </p>
     *
     * @param tagging <p>
     *            Container for the <code>TagSet</code> and <code>Tag</code>
     *            elements.
     *            </p>
     */
    public void setTagging(Tagging tagging) {
        this.tagging = tagging;
    }

    /**
     * <p>
     * Container for the <code>TagSet</code> and <code>Tag</code> elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagging <p>
     *            Container for the <code>TagSet</code> and <code>Tag</code>
     *            elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketTaggingRequest withTagging(Tagging tagging) {
        this.tagging = tagging;
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
        if (getTagging() != null)
            sb.append("Tagging: " + getTagging());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getContentMD5() == null) ? 0 : getContentMD5().hashCode());
        hashCode = prime * hashCode + ((getTagging() == null) ? 0 : getTagging().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBucketTaggingRequest == false)
            return false;
        PutBucketTaggingRequest other = (PutBucketTaggingRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getContentMD5() == null ^ this.getContentMD5() == null)
            return false;
        if (other.getContentMD5() != null
                && other.getContentMD5().equals(this.getContentMD5()) == false)
            return false;
        if (other.getTagging() == null ^ this.getTagging() == null)
            return false;
        if (other.getTagging() != null && other.getTagging().equals(this.getTagging()) == false)
            return false;
        return true;
    }
}
