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


/**
 * <p>Synchronize Systems Manager Inventory data from multiple AWS accounts defined in AWS Organizations to a centralized S3 bucket. Data is synchronized to individual key prefixes in the central bucket. Each key prefix represents a different AWS account ID.</p>
 */
public class ResourceDataSyncDestinationDataSharing implements Serializable {
    /**
     * <p>The sharing data type. Only <code>Organization</code> is supported.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String destinationDataSharingType;

    /**
     * <p>The sharing data type. Only <code>Organization</code> is supported.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>The sharing data type. Only <code>Organization</code> is supported.</p>
     */
    public String getDestinationDataSharingType() {
        return destinationDataSharingType;
    }

    /**
     * <p>The sharing data type. Only <code>Organization</code> is supported.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param destinationDataSharingType <p>The sharing data type. Only <code>Organization</code> is supported.</p>
     */
    public void setDestinationDataSharingType(String destinationDataSharingType) {
        this.destinationDataSharingType = destinationDataSharingType;
    }

    /**
     * <p>The sharing data type. Only <code>Organization</code> is supported.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param destinationDataSharingType <p>The sharing data type. Only <code>Organization</code> is supported.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ResourceDataSyncDestinationDataSharing withDestinationDataSharingType(String destinationDataSharingType) {
        this.destinationDataSharingType = destinationDataSharingType;
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
        if (getDestinationDataSharingType() != null) sb.append("DestinationDataSharingType: " + getDestinationDataSharingType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationDataSharingType() == null) ? 0 : getDestinationDataSharingType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ResourceDataSyncDestinationDataSharing == false) return false;
        ResourceDataSyncDestinationDataSharing other = (ResourceDataSyncDestinationDataSharing)obj;

        if (other.getDestinationDataSharingType() == null ^ this.getDestinationDataSharingType() == null) return false;
        if (other.getDestinationDataSharingType() != null && other.getDestinationDataSharingType().equals(this.getDestinationDataSharingType()) == false) return false;
        return true;
    }
}
