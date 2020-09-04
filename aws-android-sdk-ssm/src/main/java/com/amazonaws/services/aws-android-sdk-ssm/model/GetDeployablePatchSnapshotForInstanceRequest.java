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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Retrieves the current snapshot for the patch baseline the instance uses. This API is primarily used by the AWS-RunPatchBaseline Systems Manager document. </p>
 */
public class GetDeployablePatchSnapshotForInstanceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The ID of the instance for which the appropriate patch snapshot should be retrieved.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     */
    private String instanceId;

    /**
     * <p>The user-defined snapshot ID.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$<br/>
     */
    private String snapshotId;

    /**
     * <p>The ID of the instance for which the appropriate patch snapshot should be retrieved.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @return <p>The ID of the instance for which the appropriate patch snapshot should be retrieved.</p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>The ID of the instance for which the appropriate patch snapshot should be retrieved.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>The ID of the instance for which the appropriate patch snapshot should be retrieved.</p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>The ID of the instance for which the appropriate patch snapshot should be retrieved.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>The ID of the instance for which the appropriate patch snapshot should be retrieved.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetDeployablePatchSnapshotForInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>The user-defined snapshot ID.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$<br/>
     *
     * @return <p>The user-defined snapshot ID.</p>
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * <p>The user-defined snapshot ID.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$<br/>
     *
     * @param snapshotId <p>The user-defined snapshot ID.</p>
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>The user-defined snapshot ID.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$<br/>
     *
     * @param snapshotId <p>The user-defined snapshot ID.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetDeployablePatchSnapshotForInstanceRequest withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getSnapshotId() != null) sb.append("SnapshotId: " + getSnapshotId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetDeployablePatchSnapshotForInstanceRequest == false) return false;
        GetDeployablePatchSnapshotForInstanceRequest other = (GetDeployablePatchSnapshotForInstanceRequest)obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null) return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false) return false;
        return true;
    }
}
