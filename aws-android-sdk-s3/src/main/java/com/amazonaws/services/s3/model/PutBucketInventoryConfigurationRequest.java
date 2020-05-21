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
 * This implementation of the <code>PUT</code> operation adds an inventory
 * configuration (identified by the inventory ID) to the bucket. You can have up
 * to 1,000 inventory configurations per bucket.
 * </p>
 * <p>
 * Amazon S3 inventory generates inventories of the objects in the bucket on a
 * daily or weekly basis, and the results are published to a flat file. The
 * bucket that is inventoried is called the <i>source</i> bucket, and the bucket
 * where the inventory flat file is stored is called the <i>destination</i>
 * bucket. The <i>destination</i> bucket must be in the same AWS Region as the
 * <i>source</i> bucket.
 * </p>
 * <p>
 * When you configure an inventory for a <i>source</i> bucket, you specify the
 * <i>destination</i> bucket where you want the inventory to be stored, and
 * whether to generate the inventory daily or weekly. You can also configure
 * what object metadata to include and whether to inventory all object versions
 * or only current versions. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html"
 * >Amazon S3 Inventory</a> in the Amazon Simple Storage Service Developer
 * Guide.
 * </p>
 * <important>
 * <p>
 * You must create a bucket policy on the <i>destination</i> bucket to grant
 * permissions to Amazon S3 to write objects to the bucket in the defined
 * location. For an example policy, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html#example-bucket-policies-use-case-9"
 * > Granting Permissions for Amazon S3 Inventory and Storage Class
 * Analysis</a>.
 * </p>
 * </important>
 * <p>
 * To use this operation, you must have permissions to perform the
 * <code>s3:PutInventoryConfiguration</code> action. The bucket owner has this
 * permission by default and can grant this permission to others. For more
 * information about permissions, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
 * >Permissions Related to Bucket Subresource Operations</a> and <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-access-control.html"
 * >Managing Access Permissions to Your Amazon S3 Resources</a> in the Amazon
 * Simple Storage Service Developer Guide.
 * </p>
 * <p class="title">
 * <b>Special Errors</b>
 * </p>
 * <ul>
 * <li>
 * <p class="title">
 * <b>HTTP 400 Bad Request Error</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>Code:</i> InvalidArgument
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Cause:</i> Invalid Argument
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p class="title">
 * <b>HTTP 400 Bad Request Error</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>Code:</i> TooManyConfigurations
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Cause:</i> You are attempting to create a new configuration but have
 * already reached the 1,000-configuration limit.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p class="title">
 * <b>HTTP 403 Forbidden Error</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>Code:</i> AccessDenied
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Cause:</i> You are not the owner of the specified bucket, or you do not
 * have the <code>s3:PutInventoryConfiguration</code> bucket permission to set
 * the configuration on the bucket.
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
 * <a>GetBucketInventoryConfiguration</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteBucketInventoryConfiguration</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListBucketInventoryConfigurations</a>
 * </p>
 * </li>
 * </ul>
 */
public class PutBucketInventoryConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the bucket where the inventory configuration will be stored.
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
     * Specifies the inventory configuration.
     * </p>
     */
    private InventoryConfiguration inventoryConfiguration;

    /**
     * <p>
     * The name of the bucket where the inventory configuration will be stored.
     * </p>
     *
     * @return <p>
     *         The name of the bucket where the inventory configuration will be
     *         stored.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The name of the bucket where the inventory configuration will be stored.
     * </p>
     *
     * @param bucket <p>
     *            The name of the bucket where the inventory configuration will
     *            be stored.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket where the inventory configuration will be stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The name of the bucket where the inventory configuration will
     *            be stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketInventoryConfigurationRequest withBucket(String bucket) {
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
    public PutBucketInventoryConfigurationRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * Specifies the inventory configuration.
     * </p>
     *
     * @return <p>
     *         Specifies the inventory configuration.
     *         </p>
     */
    public InventoryConfiguration getInventoryConfiguration() {
        return inventoryConfiguration;
    }

    /**
     * <p>
     * Specifies the inventory configuration.
     * </p>
     *
     * @param inventoryConfiguration <p>
     *            Specifies the inventory configuration.
     *            </p>
     */
    public void setInventoryConfiguration(InventoryConfiguration inventoryConfiguration) {
        this.inventoryConfiguration = inventoryConfiguration;
    }

    /**
     * <p>
     * Specifies the inventory configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inventoryConfiguration <p>
     *            Specifies the inventory configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketInventoryConfigurationRequest withInventoryConfiguration(
            InventoryConfiguration inventoryConfiguration) {
        this.inventoryConfiguration = inventoryConfiguration;
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
            sb.append("Id: " + getId() + ",");
        if (getInventoryConfiguration() != null)
            sb.append("InventoryConfiguration: " + getInventoryConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime
                * hashCode
                + ((getInventoryConfiguration() == null) ? 0 : getInventoryConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBucketInventoryConfigurationRequest == false)
            return false;
        PutBucketInventoryConfigurationRequest other = (PutBucketInventoryConfigurationRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getInventoryConfiguration() == null ^ this.getInventoryConfiguration() == null)
            return false;
        if (other.getInventoryConfiguration() != null
                && other.getInventoryConfiguration().equals(this.getInventoryConfiguration()) == false)
            return false;
        return true;
    }
}
