/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of CreateSnapshot.
 * </p>
 */
public class CreateSnapshotResult implements Serializable {

    /**
     * Information about the snapshot.
     */
    private Snapshot snapshot;

    /**
     * Information about the snapshot.
     *
     * @return Information about the snapshot.
     */
    public Snapshot getSnapshot() {
        return snapshot;
    }
    
    /**
     * Information about the snapshot.
     *
     * @param snapshot Information about the snapshot.
     */
    public void setSnapshot(Snapshot snapshot) {
        this.snapshot = snapshot;
    }
    
    /**
     * Information about the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshot Information about the snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateSnapshotResult withSnapshot(Snapshot snapshot) {
        this.snapshot = snapshot;
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
        if (getSnapshot() != null) sb.append("Snapshot: " + getSnapshot() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSnapshot() == null) ? 0 : getSnapshot().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateSnapshotResult == false) return false;
        CreateSnapshotResult other = (CreateSnapshotResult)obj;
        
        if (other.getSnapshot() == null ^ this.getSnapshot() == null) return false;
        if (other.getSnapshot() != null && other.getSnapshot().equals(this.getSnapshot()) == false) return false; 
        return true;
    }
    
}
    