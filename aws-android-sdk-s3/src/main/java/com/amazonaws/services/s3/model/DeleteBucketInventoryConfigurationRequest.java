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
 * Deletes an inventory configuration (identified by the inventory ID) from the
 * bucket.
 * </p>
 * <p>
 * To use this operation, you must have permissions to perform the
 * <code>s3:PutInventoryConfiguration</code> action. The bucket owner has this
 * permission by default. The bucket owner can grant this permission to others.
 * For more information about permissions, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
 * >Permissions Related to Bucket Subresource Operations</a> and <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-access-control.html"
 * >Managing Access Permissions to Your Amazon S3 Resources</a>.
 * </p>
 * <p>
 * For information about the Amazon S3 inventory feature, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html"
 * >Amazon S3 Inventory</a>.
 * </p>
 * <p>
 * Operations related to <code>DeleteBucketInventoryConfiguration</code>
 * include:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetBucketInventoryConfiguration</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutBucketInventoryConfiguration</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListBucketInventoryConfigurations</a>
 * </p>
 * </li>
 * </ul>
 */
public class DeleteBucketInventoryConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the bucket containing the inventory configuration to delete.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The ID used to identify the inventory configuration.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The name of the bucket containing the inventory configuration to delete.
     * </p>
     *
     * @return <p>
     *         The name of the bucket containing the inventory configuration to
     *         delete.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The name of the bucket containing the inventory configuration to delete.
     * </p>
     *
     * @param bucket <p>
     *            The name of the bucket containing the inventory configuration
     *            to delete.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket containing the inventory configuration to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The name of the bucket containing the inventory configuration
     *            to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteBucketInventoryConfigurationRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * The ID used to identify the inventory configuration.
     * </p>
     *
     * @return <p>
     *         The ID used to identify the inventory configuration.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID used to identify the inventory configuration.
     * </p>
     *
     * @param id <p>
     *            The ID used to identify the inventory configuration.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID used to identify the inventory configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The ID used to identify the inventory configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteBucketInventoryConfigurationRequest withId(String id) {
        this.id = id;
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
        if (getId() != null)
            sb.append("Id: " + getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteBucketInventoryConfigurationRequest == false)
            return false;
        DeleteBucketInventoryConfigurationRequest other = (DeleteBucketInventoryConfigurationRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }
}
