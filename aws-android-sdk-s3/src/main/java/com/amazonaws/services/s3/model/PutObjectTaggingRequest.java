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
 * Sets the supplied tag-set to an object that already exists in a bucket.
 * </p>
 * <p>
 * A tag is a key-value pair. You can associate tags with an object by sending a
 * PUT request against the tagging subresource that is associated with the
 * object. You can retrieve tags by sending a GET request. For more information,
 * see <a>GetObjectTagging</a>.
 * </p>
 * <p>
 * For tagging-related restrictions related to characters and encodings, see <a
 * href=
 * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html"
 * >Tag Restrictions</a>. Note that Amazon S3 limits the maximum number of tags
 * to 10 tags per object.
 * </p>
 * <p>
 * To use this operation, you must have permission to perform the
 * <code>s3:PutObjectTagging</code> action. By default, the bucket owner has
 * this permission and can grant this permission to others.
 * </p>
 * <p>
 * To put tags of any other version, use the <code>versionId</code> query
 * parameter. You also need permission for the
 * <code>s3:PutObjectVersionTagging</code> action.
 * </p>
 * <p>
 * For information about the Amazon S3 object tagging feature, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-tagging.html"
 * >Object Tagging</a>.
 * </p>
 * <p class="title">
 * <b>Special Errors</b>
 * </p>
 * <ul>
 * <li>
 * <p class="title">
 * <b/>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>Code: InvalidTagError </i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Cause: The tag provided was not a valid tag. This error can occur if the
 * tag did not pass input validation. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-tagging.html"
 * >Object Tagging</a>.</i>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p class="title">
 * <b/>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>Code: MalformedXMLError </i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Cause: The XML provided does not match the schema.</i>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <ul>
 * <li>
 * <p>
 * <i>Code: OperationAbortedError </i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Cause: A conflicting conditional operation is currently in progress
 * against this resource. Please try again.</i>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <ul>
 * <li>
 * <p>
 * <i>Code: InternalError</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Cause: The service was unable to apply the provided tag to the object.</i>
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <p class="title">
 * <b>Related Resources</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetObjectTagging</a>
 * </p>
 * </li>
 * </ul>
 */
public class PutObjectTaggingRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The bucket name containing the object.
     * </p>
     * <p>
     * When using this API with an access point, you must direct requests to the
     * access point hostname. The access point hostname takes the form
     * <i>AccessPointName
     * </i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When
     * using this operation using an access point through the AWS SDKs, you
     * provide the access point ARN in place of the bucket name. For more
     * information about access point ARNs, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     * >Using Access Points</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * Name of the tag.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String key;

    /**
     * <p>
     * The versionId of the object that the tag-set will be added to.
     * </p>
     */
    private String versionId;

    /**
     * <p>
     * The MD5 hash for the request body.
     * </p>
     */
    private String contentMD5;

    /**
     * <p>
     * Container for the <code>TagSet</code> and <code>Tag</code> elements
     * </p>
     */
    private Tagging tagging;

    /**
     * <p>
     * The bucket name containing the object.
     * </p>
     * <p>
     * When using this API with an access point, you must direct requests to the
     * access point hostname. The access point hostname takes the form
     * <i>AccessPointName
     * </i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When
     * using this operation using an access point through the AWS SDKs, you
     * provide the access point ARN in place of the bucket name. For more
     * information about access point ARNs, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     * >Using Access Points</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The bucket name containing the object.
     *         </p>
     *         <p>
     *         When using this API with an access point, you must direct
     *         requests to the access point hostname. The access point hostname
     *         takes the form
     *         <i>AccessPointName</i>-<i>AccountId</i>.s3-accesspoint
     *         .<i>Region</i>.amazonaws.com. When using this operation using an
     *         access point through the AWS SDKs, you provide the access point
     *         ARN in place of the bucket name. For more information about
     *         access point ARNs, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     *         >Using Access Points</a> in the <i>Amazon Simple Storage Service
     *         Developer Guide</i>.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The bucket name containing the object.
     * </p>
     * <p>
     * When using this API with an access point, you must direct requests to the
     * access point hostname. The access point hostname takes the form
     * <i>AccessPointName
     * </i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When
     * using this operation using an access point through the AWS SDKs, you
     * provide the access point ARN in place of the bucket name. For more
     * information about access point ARNs, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     * >Using Access Points</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     *
     * @param bucket <p>
     *            The bucket name containing the object.
     *            </p>
     *            <p>
     *            When using this API with an access point, you must direct
     *            requests to the access point hostname. The access point
     *            hostname takes the form
     *            <i>AccessPointName</i>-<i>AccountId</i>
     *            .s3-accesspoint.<i>Region</i>.amazonaws.com. When using this
     *            operation using an access point through the AWS SDKs, you
     *            provide the access point ARN in place of the bucket name. For
     *            more information about access point ARNs, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     *            >Using Access Points</a> in the <i>Amazon Simple Storage
     *            Service Developer Guide</i>.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The bucket name containing the object.
     * </p>
     * <p>
     * When using this API with an access point, you must direct requests to the
     * access point hostname. The access point hostname takes the form
     * <i>AccessPointName
     * </i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When
     * using this operation using an access point through the AWS SDKs, you
     * provide the access point ARN in place of the bucket name. For more
     * information about access point ARNs, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     * >Using Access Points</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The bucket name containing the object.
     *            </p>
     *            <p>
     *            When using this API with an access point, you must direct
     *            requests to the access point hostname. The access point
     *            hostname takes the form
     *            <i>AccessPointName</i>-<i>AccountId</i>
     *            .s3-accesspoint.<i>Region</i>.amazonaws.com. When using this
     *            operation using an access point through the AWS SDKs, you
     *            provide the access point ARN in place of the bucket name. For
     *            more information about access point ARNs, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     *            >Using Access Points</a> in the <i>Amazon Simple Storage
     *            Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutObjectTaggingRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * Name of the tag.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Name of the tag.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * Name of the tag.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            Name of the tag.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Name of the tag.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            Name of the tag.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutObjectTaggingRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The versionId of the object that the tag-set will be added to.
     * </p>
     *
     * @return <p>
     *         The versionId of the object that the tag-set will be added to.
     *         </p>
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * <p>
     * The versionId of the object that the tag-set will be added to.
     * </p>
     *
     * @param versionId <p>
     *            The versionId of the object that the tag-set will be added to.
     *            </p>
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The versionId of the object that the tag-set will be added to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionId <p>
     *            The versionId of the object that the tag-set will be added to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutObjectTaggingRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * <p>
     * The MD5 hash for the request body.
     * </p>
     *
     * @return <p>
     *         The MD5 hash for the request body.
     *         </p>
     */
    public String getContentMD5() {
        return contentMD5;
    }

    /**
     * <p>
     * The MD5 hash for the request body.
     * </p>
     *
     * @param contentMD5 <p>
     *            The MD5 hash for the request body.
     *            </p>
     */
    public void setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
    }

    /**
     * <p>
     * The MD5 hash for the request body.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentMD5 <p>
     *            The MD5 hash for the request body.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutObjectTaggingRequest withContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    /**
     * <p>
     * Container for the <code>TagSet</code> and <code>Tag</code> elements
     * </p>
     *
     * @return <p>
     *         Container for the <code>TagSet</code> and <code>Tag</code>
     *         elements
     *         </p>
     */
    public Tagging getTagging() {
        return tagging;
    }

    /**
     * <p>
     * Container for the <code>TagSet</code> and <code>Tag</code> elements
     * </p>
     *
     * @param tagging <p>
     *            Container for the <code>TagSet</code> and <code>Tag</code>
     *            elements
     *            </p>
     */
    public void setTagging(Tagging tagging) {
        this.tagging = tagging;
    }

    /**
     * <p>
     * Container for the <code>TagSet</code> and <code>Tag</code> elements
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagging <p>
     *            Container for the <code>TagSet</code> and <code>Tag</code>
     *            elements
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutObjectTaggingRequest withTagging(Tagging tagging) {
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getVersionId() != null)
            sb.append("VersionId: " + getVersionId() + ",");
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
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
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

        if (obj instanceof PutObjectTaggingRequest == false)
            return false;
        PutObjectTaggingRequest other = (PutObjectTaggingRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null
                && other.getVersionId().equals(this.getVersionId()) == false)
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
