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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

public class GetDeployablePatchSnapshotForInstanceResult implements Serializable {
    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The user-defined snapshot ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{
     * 4}-[0-9a-fA-F]{12}$<br/>
     */
    private String snapshotId;

    /**
     * <p>
     * A pre-signed Amazon S3 URL that can be used to download the patch
     * snapshot.
     * </p>
     */
    private String snapshotDownloadUrl;

    /**
     * <p>
     * Returns the specific operating system (for example Windows Server 2012 or
     * Amazon Linux 2015.09) on the instance for the specified patch snapshot.
     * </p>
     */
    private String product;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @return <p>
     *         The ID of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDeployablePatchSnapshotForInstanceResult withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The user-defined snapshot ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{
     * 4}-[0-9a-fA-F]{12}$<br/>
     *
     * @return <p>
     *         The user-defined snapshot ID.
     *         </p>
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * <p>
     * The user-defined snapshot ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{
     * 4}-[0-9a-fA-F]{12}$<br/>
     *
     * @param snapshotId <p>
     *            The user-defined snapshot ID.
     *            </p>
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The user-defined snapshot ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{
     * 4}-[0-9a-fA-F]{12}$<br/>
     *
     * @param snapshotId <p>
     *            The user-defined snapshot ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDeployablePatchSnapshotForInstanceResult withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * <p>
     * A pre-signed Amazon S3 URL that can be used to download the patch
     * snapshot.
     * </p>
     *
     * @return <p>
     *         A pre-signed Amazon S3 URL that can be used to download the patch
     *         snapshot.
     *         </p>
     */
    public String getSnapshotDownloadUrl() {
        return snapshotDownloadUrl;
    }

    /**
     * <p>
     * A pre-signed Amazon S3 URL that can be used to download the patch
     * snapshot.
     * </p>
     *
     * @param snapshotDownloadUrl <p>
     *            A pre-signed Amazon S3 URL that can be used to download the
     *            patch snapshot.
     *            </p>
     */
    public void setSnapshotDownloadUrl(String snapshotDownloadUrl) {
        this.snapshotDownloadUrl = snapshotDownloadUrl;
    }

    /**
     * <p>
     * A pre-signed Amazon S3 URL that can be used to download the patch
     * snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotDownloadUrl <p>
     *            A pre-signed Amazon S3 URL that can be used to download the
     *            patch snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDeployablePatchSnapshotForInstanceResult withSnapshotDownloadUrl(
            String snapshotDownloadUrl) {
        this.snapshotDownloadUrl = snapshotDownloadUrl;
        return this;
    }

    /**
     * <p>
     * Returns the specific operating system (for example Windows Server 2012 or
     * Amazon Linux 2015.09) on the instance for the specified patch snapshot.
     * </p>
     *
     * @return <p>
     *         Returns the specific operating system (for example Windows Server
     *         2012 or Amazon Linux 2015.09) on the instance for the specified
     *         patch snapshot.
     *         </p>
     */
    public String getProduct() {
        return product;
    }

    /**
     * <p>
     * Returns the specific operating system (for example Windows Server 2012 or
     * Amazon Linux 2015.09) on the instance for the specified patch snapshot.
     * </p>
     *
     * @param product <p>
     *            Returns the specific operating system (for example Windows
     *            Server 2012 or Amazon Linux 2015.09) on the instance for the
     *            specified patch snapshot.
     *            </p>
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * <p>
     * Returns the specific operating system (for example Windows Server 2012 or
     * Amazon Linux 2015.09) on the instance for the specified patch snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param product <p>
     *            Returns the specific operating system (for example Windows
     *            Server 2012 or Amazon Linux 2015.09) on the instance for the
     *            specified patch snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDeployablePatchSnapshotForInstanceResult withProduct(String product) {
        this.product = product;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getSnapshotDownloadUrl() != null)
            sb.append("SnapshotDownloadUrl: " + getSnapshotDownloadUrl() + ",");
        if (getProduct() != null)
            sb.append("Product: " + getProduct());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotDownloadUrl() == null) ? 0 : getSnapshotDownloadUrl().hashCode());
        hashCode = prime * hashCode + ((getProduct() == null) ? 0 : getProduct().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeployablePatchSnapshotForInstanceResult == false)
            return false;
        GetDeployablePatchSnapshotForInstanceResult other = (GetDeployablePatchSnapshotForInstanceResult) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null
                && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getSnapshotDownloadUrl() == null ^ this.getSnapshotDownloadUrl() == null)
            return false;
        if (other.getSnapshotDownloadUrl() != null
                && other.getSnapshotDownloadUrl().equals(this.getSnapshotDownloadUrl()) == false)
            return false;
        if (other.getProduct() == null ^ this.getProduct() == null)
            return false;
        if (other.getProduct() != null && other.getProduct().equals(this.getProduct()) == false)
            return false;
        return true;
    }
}
