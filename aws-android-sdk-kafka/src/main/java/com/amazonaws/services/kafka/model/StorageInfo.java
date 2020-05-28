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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

/**
 * 
 <p>
 * Contains information about storage volumes attached to MSK broker nodes.
 * </p>
 */
public class StorageInfo implements Serializable {
    /**
     * 
     <p>
     * EBS volume information.
     * </p>
     */
    private EBSStorageInfo ebsStorageInfo;

    /**
     * 
     <p>
     * EBS volume information.
     * </p>
     * 
     * @return <p>
     *         EBS volume information.
     *         </p>
     */
    public EBSStorageInfo getEbsStorageInfo() {
        return ebsStorageInfo;
    }

    /**
     * 
     <p>
     * EBS volume information.
     * </p>
     * 
     * @param ebsStorageInfo <p>
     *            EBS volume information.
     *            </p>
     */
    public void setEbsStorageInfo(EBSStorageInfo ebsStorageInfo) {
        this.ebsStorageInfo = ebsStorageInfo;
    }

    /**
     * 
     <p>
     * EBS volume information.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebsStorageInfo <p>
     *            EBS volume information.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StorageInfo withEbsStorageInfo(EBSStorageInfo ebsStorageInfo) {
        this.ebsStorageInfo = ebsStorageInfo;
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
        if (getEbsStorageInfo() != null)
            sb.append("EbsStorageInfo: " + getEbsStorageInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEbsStorageInfo() == null) ? 0 : getEbsStorageInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageInfo == false)
            return false;
        StorageInfo other = (StorageInfo) obj;

        if (other.getEbsStorageInfo() == null ^ this.getEbsStorageInfo() == null)
            return false;
        if (other.getEbsStorageInfo() != null
                && other.getEbsStorageInfo().equals(this.getEbsStorageInfo()) == false)
            return false;
        return true;
    }
}
