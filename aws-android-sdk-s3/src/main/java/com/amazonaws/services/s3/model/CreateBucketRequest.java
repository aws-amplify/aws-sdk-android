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
 * Creates a new bucket. To create a bucket, you must register with Amazon S3
 * and have a valid AWS Access Key ID to authenticate requests. Anonymous
 * requests are never allowed to create buckets. By creating the bucket, you
 * become the bucket owner.
 * </p>
 * <p>
 * Not every string is an acceptable bucket name. For information on bucket
 * naming restrictions, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingBucket.html"
 * >Working with Amazon S3 Buckets</a>.
 * </p>
 * <p>
 * By default, the bucket is created in the US East (N. Virginia) Region. You
 * can optionally specify a Region in the request body. You might choose a
 * Region to optimize latency, minimize costs, or address regulatory
 * requirements. For example, if you reside in Europe, you will probably find it
 * advantageous to create buckets in the Europe (Ireland) Region. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingBucket.html#access-bucket-intro"
 * >How to Select a Region for Your Buckets</a>.
 * </p>
 * <note>
 * <p>
 * If you send your create bucket request to the <code>s3.amazonaws.com</code>
 * endpoint, the request goes to the us-east-1 Region. Accordingly, the
 * signature calculations in Signature Version 4 must use us-east-1 as the
 * Region, even if the location constraint in the request specifies another
 * Region where the bucket is to be created. If you create a bucket in a Region
 * other than US East (N. Virginia), your application must be able to handle 307
 * redirect. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/VirtualHosting.html"
 * >Virtual Hosting of Buckets</a>.
 * </p>
 * </note>
 * <p>
 * When creating a bucket using this operation, you can optionally specify the
 * accounts or groups that should be granted specific permissions on the bucket.
 * There are two ways to grant the appropriate permissions using the request
 * headers.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Specify a canned ACL using the <code>x-amz-acl</code> request header. Amazon
 * S3 supports a set of predefined ACLs, known as <i>canned ACLs</i>. Each
 * canned ACL has a predefined set of grantees and permissions. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL"
 * >Canned ACL</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Specify access permissions explicitly using the <code>x-amz-grant-read</code>, <code>x-amz-grant-write</code>, <code>x-amz-grant-read-acp</code>,
 * <code>x-amz-grant-write-acp</code>, and <code>x-amz-grant-full-control</code>
 * headers. These headers map to the set of permissions Amazon S3 supports in an
 * ACL. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html"
 * >Access Control List (ACL) Overview</a>.
 * </p>
 * <p>
 * You specify each grantee as a type=value pair, where the type is one of the
 * following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>id</code> – if the value specified is the canonical user ID of an AWS
 * account
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>uri</code> – if you are granting permissions to a predefined group
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>emailAddress</code> – if the value specified is the email address of an
 * AWS account
 * </p>
 * <note>
 * <p>
 * Using email addresses to specify a grantee is only supported in the following
 * AWS Regions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * US East (N. Virginia)
 * </p>
 * </li>
 * <li>
 * <p>
 * US West (N. California)
 * </p>
 * </li>
 * <li>
 * <p>
 * US West (Oregon)
 * </p>
 * </li>
 * <li>
 * <p>
 * Asia Pacific (Singapore)
 * </p>
 * </li>
 * <li>
 * <p>
 * Asia Pacific (Sydney)
 * </p>
 * </li>
 * <li>
 * <p>
 * Asia Pacific (Tokyo)
 * </p>
 * </li>
 * <li>
 * <p>
 * Europe (Ireland)
 * </p>
 * </li>
 * <li>
 * <p>
 * South America (São Paulo)
 * </p>
 * </li>
 * </ul>
 * <p>
 * For a list of all the Amazon S3 supported Regions and endpoints, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"
 * >Regions and Endpoints</a> in the AWS General Reference.
 * </p>
 * </note></li>
 * </ul>
 * <p>
 * For example, the following <code>x-amz-grant-read</code> header grants the
 * AWS accounts identified by account IDs permissions to read object data and
 * its metadata:
 * </p>
 * <p>
 * <code>x-amz-grant-read: id="11112222333", id="444455556666" </code>
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * You can use either a canned ACL or specify access permissions explicitly. You
 * cannot do both.
 * </p>
 * </note>
 * <p>
 * The following operations are related to <code>CreateBucket</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>PutObject</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteBucket</a>
 * </p>
 * </li>
 * </ul>
 */
public class CreateBucketRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The canned ACL to apply to the bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read
     */
    private String aCL;

    /**
     * <p>
     * The name of the bucket to create.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The configuration information for the bucket.
     * </p>
     */
    private CreateBucketConfiguration createBucketConfiguration;

    /**
     * <p>
     * Allows grantee the read, write, read ACP, and write ACP permissions on
     * the bucket.
     * </p>
     */
    private String grantFullControl;

    /**
     * <p>
     * Allows grantee to list the objects in the bucket.
     * </p>
     */
    private String grantRead;

    /**
     * <p>
     * Allows grantee to read the bucket ACL.
     * </p>
     */
    private String grantReadACP;

    /**
     * <p>
     * Allows grantee to create, overwrite, and delete any object in the bucket.
     * </p>
     */
    private String grantWrite;

    /**
     * <p>
     * Allows grantee to write the ACL for the applicable bucket.
     * </p>
     */
    private String grantWriteACP;

    /**
     * <p>
     * Specifies whether you want S3 Object Lock to be enabled for the new
     * bucket.
     * </p>
     */
    private Boolean objectLockEnabledForBucket;

    /**
     * <p>
     * The canned ACL to apply to the bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read
     *
     * @return <p>
     *         The canned ACL to apply to the bucket.
     *         </p>
     * @see BucketCannedACL
     */
    public String getACL() {
        return aCL;
    }

    /**
     * <p>
     * The canned ACL to apply to the bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read
     *
     * @param aCL <p>
     *            The canned ACL to apply to the bucket.
     *            </p>
     * @see BucketCannedACL
     */
    public void setACL(String aCL) {
        this.aCL = aCL;
    }

    /**
     * <p>
     * The canned ACL to apply to the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read
     *
     * @param aCL <p>
     *            The canned ACL to apply to the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BucketCannedACL
     */
    public CreateBucketRequest withACL(String aCL) {
        this.aCL = aCL;
        return this;
    }

    /**
     * <p>
     * The canned ACL to apply to the bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read
     *
     * @param aCL <p>
     *            The canned ACL to apply to the bucket.
     *            </p>
     * @see BucketCannedACL
     */
    public void setACL(BucketCannedACL aCL) {
        this.aCL = aCL.toString();
    }

    /**
     * <p>
     * The canned ACL to apply to the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read
     *
     * @param aCL <p>
     *            The canned ACL to apply to the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BucketCannedACL
     */
    public CreateBucketRequest withACL(BucketCannedACL aCL) {
        this.aCL = aCL.toString();
        return this;
    }

    /**
     * <p>
     * The name of the bucket to create.
     * </p>
     *
     * @return <p>
     *         The name of the bucket to create.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The name of the bucket to create.
     * </p>
     *
     * @param bucket <p>
     *            The name of the bucket to create.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket to create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The name of the bucket to create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBucketRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * The configuration information for the bucket.
     * </p>
     *
     * @return <p>
     *         The configuration information for the bucket.
     *         </p>
     */
    public CreateBucketConfiguration getCreateBucketConfiguration() {
        return createBucketConfiguration;
    }

    /**
     * <p>
     * The configuration information for the bucket.
     * </p>
     *
     * @param createBucketConfiguration <p>
     *            The configuration information for the bucket.
     *            </p>
     */
    public void setCreateBucketConfiguration(CreateBucketConfiguration createBucketConfiguration) {
        this.createBucketConfiguration = createBucketConfiguration;
    }

    /**
     * <p>
     * The configuration information for the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createBucketConfiguration <p>
     *            The configuration information for the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBucketRequest withCreateBucketConfiguration(
            CreateBucketConfiguration createBucketConfiguration) {
        this.createBucketConfiguration = createBucketConfiguration;
        return this;
    }

    /**
     * <p>
     * Allows grantee the read, write, read ACP, and write ACP permissions on
     * the bucket.
     * </p>
     *
     * @return <p>
     *         Allows grantee the read, write, read ACP, and write ACP
     *         permissions on the bucket.
     *         </p>
     */
    public String getGrantFullControl() {
        return grantFullControl;
    }

    /**
     * <p>
     * Allows grantee the read, write, read ACP, and write ACP permissions on
     * the bucket.
     * </p>
     *
     * @param grantFullControl <p>
     *            Allows grantee the read, write, read ACP, and write ACP
     *            permissions on the bucket.
     *            </p>
     */
    public void setGrantFullControl(String grantFullControl) {
        this.grantFullControl = grantFullControl;
    }

    /**
     * <p>
     * Allows grantee the read, write, read ACP, and write ACP permissions on
     * the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantFullControl <p>
     *            Allows grantee the read, write, read ACP, and write ACP
     *            permissions on the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBucketRequest withGrantFullControl(String grantFullControl) {
        this.grantFullControl = grantFullControl;
        return this;
    }

    /**
     * <p>
     * Allows grantee to list the objects in the bucket.
     * </p>
     *
     * @return <p>
     *         Allows grantee to list the objects in the bucket.
     *         </p>
     */
    public String getGrantRead() {
        return grantRead;
    }

    /**
     * <p>
     * Allows grantee to list the objects in the bucket.
     * </p>
     *
     * @param grantRead <p>
     *            Allows grantee to list the objects in the bucket.
     *            </p>
     */
    public void setGrantRead(String grantRead) {
        this.grantRead = grantRead;
    }

    /**
     * <p>
     * Allows grantee to list the objects in the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantRead <p>
     *            Allows grantee to list the objects in the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBucketRequest withGrantRead(String grantRead) {
        this.grantRead = grantRead;
        return this;
    }

    /**
     * <p>
     * Allows grantee to read the bucket ACL.
     * </p>
     *
     * @return <p>
     *         Allows grantee to read the bucket ACL.
     *         </p>
     */
    public String getGrantReadACP() {
        return grantReadACP;
    }

    /**
     * <p>
     * Allows grantee to read the bucket ACL.
     * </p>
     *
     * @param grantReadACP <p>
     *            Allows grantee to read the bucket ACL.
     *            </p>
     */
    public void setGrantReadACP(String grantReadACP) {
        this.grantReadACP = grantReadACP;
    }

    /**
     * <p>
     * Allows grantee to read the bucket ACL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantReadACP <p>
     *            Allows grantee to read the bucket ACL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBucketRequest withGrantReadACP(String grantReadACP) {
        this.grantReadACP = grantReadACP;
        return this;
    }

    /**
     * <p>
     * Allows grantee to create, overwrite, and delete any object in the bucket.
     * </p>
     *
     * @return <p>
     *         Allows grantee to create, overwrite, and delete any object in the
     *         bucket.
     *         </p>
     */
    public String getGrantWrite() {
        return grantWrite;
    }

    /**
     * <p>
     * Allows grantee to create, overwrite, and delete any object in the bucket.
     * </p>
     *
     * @param grantWrite <p>
     *            Allows grantee to create, overwrite, and delete any object in
     *            the bucket.
     *            </p>
     */
    public void setGrantWrite(String grantWrite) {
        this.grantWrite = grantWrite;
    }

    /**
     * <p>
     * Allows grantee to create, overwrite, and delete any object in the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantWrite <p>
     *            Allows grantee to create, overwrite, and delete any object in
     *            the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBucketRequest withGrantWrite(String grantWrite) {
        this.grantWrite = grantWrite;
        return this;
    }

    /**
     * <p>
     * Allows grantee to write the ACL for the applicable bucket.
     * </p>
     *
     * @return <p>
     *         Allows grantee to write the ACL for the applicable bucket.
     *         </p>
     */
    public String getGrantWriteACP() {
        return grantWriteACP;
    }

    /**
     * <p>
     * Allows grantee to write the ACL for the applicable bucket.
     * </p>
     *
     * @param grantWriteACP <p>
     *            Allows grantee to write the ACL for the applicable bucket.
     *            </p>
     */
    public void setGrantWriteACP(String grantWriteACP) {
        this.grantWriteACP = grantWriteACP;
    }

    /**
     * <p>
     * Allows grantee to write the ACL for the applicable bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantWriteACP <p>
     *            Allows grantee to write the ACL for the applicable bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBucketRequest withGrantWriteACP(String grantWriteACP) {
        this.grantWriteACP = grantWriteACP;
        return this;
    }

    /**
     * <p>
     * Specifies whether you want S3 Object Lock to be enabled for the new
     * bucket.
     * </p>
     *
     * @return <p>
     *         Specifies whether you want S3 Object Lock to be enabled for the
     *         new bucket.
     *         </p>
     */
    public Boolean isObjectLockEnabledForBucket() {
        return objectLockEnabledForBucket;
    }

    /**
     * <p>
     * Specifies whether you want S3 Object Lock to be enabled for the new
     * bucket.
     * </p>
     *
     * @return <p>
     *         Specifies whether you want S3 Object Lock to be enabled for the
     *         new bucket.
     *         </p>
     */
    public Boolean getObjectLockEnabledForBucket() {
        return objectLockEnabledForBucket;
    }

    /**
     * <p>
     * Specifies whether you want S3 Object Lock to be enabled for the new
     * bucket.
     * </p>
     *
     * @param objectLockEnabledForBucket <p>
     *            Specifies whether you want S3 Object Lock to be enabled for
     *            the new bucket.
     *            </p>
     */
    public void setObjectLockEnabledForBucket(Boolean objectLockEnabledForBucket) {
        this.objectLockEnabledForBucket = objectLockEnabledForBucket;
    }

    /**
     * <p>
     * Specifies whether you want S3 Object Lock to be enabled for the new
     * bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param objectLockEnabledForBucket <p>
     *            Specifies whether you want S3 Object Lock to be enabled for
     *            the new bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBucketRequest withObjectLockEnabledForBucket(Boolean objectLockEnabledForBucket) {
        this.objectLockEnabledForBucket = objectLockEnabledForBucket;
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
        if (getACL() != null)
            sb.append("ACL: " + getACL() + ",");
        if (getBucket() != null)
            sb.append("Bucket: " + getBucket() + ",");
        if (getCreateBucketConfiguration() != null)
            sb.append("CreateBucketConfiguration: " + getCreateBucketConfiguration() + ",");
        if (getGrantFullControl() != null)
            sb.append("GrantFullControl: " + getGrantFullControl() + ",");
        if (getGrantRead() != null)
            sb.append("GrantRead: " + getGrantRead() + ",");
        if (getGrantReadACP() != null)
            sb.append("GrantReadACP: " + getGrantReadACP() + ",");
        if (getGrantWrite() != null)
            sb.append("GrantWrite: " + getGrantWrite() + ",");
        if (getGrantWriteACP() != null)
            sb.append("GrantWriteACP: " + getGrantWriteACP() + ",");
        if (getObjectLockEnabledForBucket() != null)
            sb.append("ObjectLockEnabledForBucket: " + getObjectLockEnabledForBucket());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getACL() == null) ? 0 : getACL().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime
                * hashCode
                + ((getCreateBucketConfiguration() == null) ? 0 : getCreateBucketConfiguration()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getGrantFullControl() == null) ? 0 : getGrantFullControl().hashCode());
        hashCode = prime * hashCode + ((getGrantRead() == null) ? 0 : getGrantRead().hashCode());
        hashCode = prime * hashCode
                + ((getGrantReadACP() == null) ? 0 : getGrantReadACP().hashCode());
        hashCode = prime * hashCode + ((getGrantWrite() == null) ? 0 : getGrantWrite().hashCode());
        hashCode = prime * hashCode
                + ((getGrantWriteACP() == null) ? 0 : getGrantWriteACP().hashCode());
        hashCode = prime
                * hashCode
                + ((getObjectLockEnabledForBucket() == null) ? 0 : getObjectLockEnabledForBucket()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBucketRequest == false)
            return false;
        CreateBucketRequest other = (CreateBucketRequest) obj;

        if (other.getACL() == null ^ this.getACL() == null)
            return false;
        if (other.getACL() != null && other.getACL().equals(this.getACL()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getCreateBucketConfiguration() == null
                ^ this.getCreateBucketConfiguration() == null)
            return false;
        if (other.getCreateBucketConfiguration() != null
                && other.getCreateBucketConfiguration().equals(this.getCreateBucketConfiguration()) == false)
            return false;
        if (other.getGrantFullControl() == null ^ this.getGrantFullControl() == null)
            return false;
        if (other.getGrantFullControl() != null
                && other.getGrantFullControl().equals(this.getGrantFullControl()) == false)
            return false;
        if (other.getGrantRead() == null ^ this.getGrantRead() == null)
            return false;
        if (other.getGrantRead() != null
                && other.getGrantRead().equals(this.getGrantRead()) == false)
            return false;
        if (other.getGrantReadACP() == null ^ this.getGrantReadACP() == null)
            return false;
        if (other.getGrantReadACP() != null
                && other.getGrantReadACP().equals(this.getGrantReadACP()) == false)
            return false;
        if (other.getGrantWrite() == null ^ this.getGrantWrite() == null)
            return false;
        if (other.getGrantWrite() != null
                && other.getGrantWrite().equals(this.getGrantWrite()) == false)
            return false;
        if (other.getGrantWriteACP() == null ^ this.getGrantWriteACP() == null)
            return false;
        if (other.getGrantWriteACP() != null
                && other.getGrantWriteACP().equals(this.getGrantWriteACP()) == false)
            return false;
        if (other.getObjectLockEnabledForBucket() == null
                ^ this.getObjectLockEnabledForBucket() == null)
            return false;
        if (other.getObjectLockEnabledForBucket() != null
                && other.getObjectLockEnabledForBucket().equals(
                        this.getObjectLockEnabledForBucket()) == false)
            return false;
        return true;
    }
}
