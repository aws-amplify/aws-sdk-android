/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

public class UpdateGlobalTableSettingsResult implements Serializable {
    /**
     * <p>
     * The name of the global table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String globalTableName;

    /**
     * <p>
     * The region specific settings for the global table.
     * </p>
     */
    private java.util.List<ReplicaSettingsDescription> replicaSettings;

    /**
     * <p>
     * The name of the global table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the global table.
     *         </p>
     */
    public String getGlobalTableName() {
        return globalTableName;
    }

    /**
     * <p>
     * The name of the global table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param globalTableName <p>
     *            The name of the global table.
     *            </p>
     */
    public void setGlobalTableName(String globalTableName) {
        this.globalTableName = globalTableName;
    }

    /**
     * <p>
     * The name of the global table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param globalTableName <p>
     *            The name of the global table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGlobalTableSettingsResult withGlobalTableName(String globalTableName) {
        this.globalTableName = globalTableName;
        return this;
    }

    /**
     * <p>
     * The region specific settings for the global table.
     * </p>
     *
     * @return <p>
     *         The region specific settings for the global table.
     *         </p>
     */
    public java.util.List<ReplicaSettingsDescription> getReplicaSettings() {
        return replicaSettings;
    }

    /**
     * <p>
     * The region specific settings for the global table.
     * </p>
     *
     * @param replicaSettings <p>
     *            The region specific settings for the global table.
     *            </p>
     */
    public void setReplicaSettings(java.util.Collection<ReplicaSettingsDescription> replicaSettings) {
        if (replicaSettings == null) {
            this.replicaSettings = null;
            return;
        }

        this.replicaSettings = new java.util.ArrayList<ReplicaSettingsDescription>(replicaSettings);
    }

    /**
     * <p>
     * The region specific settings for the global table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaSettings <p>
     *            The region specific settings for the global table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGlobalTableSettingsResult withReplicaSettings(
            ReplicaSettingsDescription... replicaSettings) {
        if (getReplicaSettings() == null) {
            this.replicaSettings = new java.util.ArrayList<ReplicaSettingsDescription>(
                    replicaSettings.length);
        }
        for (ReplicaSettingsDescription value : replicaSettings) {
            this.replicaSettings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The region specific settings for the global table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaSettings <p>
     *            The region specific settings for the global table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGlobalTableSettingsResult withReplicaSettings(
            java.util.Collection<ReplicaSettingsDescription> replicaSettings) {
        setReplicaSettings(replicaSettings);
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
        if (getGlobalTableName() != null)
            sb.append("GlobalTableName: " + getGlobalTableName() + ",");
        if (getReplicaSettings() != null)
            sb.append("ReplicaSettings: " + getReplicaSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGlobalTableName() == null) ? 0 : getGlobalTableName().hashCode());
        hashCode = prime * hashCode
                + ((getReplicaSettings() == null) ? 0 : getReplicaSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGlobalTableSettingsResult == false)
            return false;
        UpdateGlobalTableSettingsResult other = (UpdateGlobalTableSettingsResult) obj;

        if (other.getGlobalTableName() == null ^ this.getGlobalTableName() == null)
            return false;
        if (other.getGlobalTableName() != null
                && other.getGlobalTableName().equals(this.getGlobalTableName()) == false)
            return false;
        if (other.getReplicaSettings() == null ^ this.getReplicaSettings() == null)
            return false;
        if (other.getReplicaSettings() != null
                && other.getReplicaSettings().equals(this.getReplicaSettings()) == false)
            return false;
        return true;
    }
}
