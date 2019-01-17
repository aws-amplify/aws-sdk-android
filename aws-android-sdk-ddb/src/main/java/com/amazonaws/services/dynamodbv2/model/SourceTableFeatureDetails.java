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

/**
 * <p>
 * Contains the details of the features enabled on the table when the backup was
 * created. For example, LSIs, GSIs, streams, TTL.
 * </p>
 */
public class SourceTableFeatureDetails implements Serializable {
    /**
     * <p>
     * Represents the LSI properties for the table when the backup was created.
     * It includes the IndexName, KeySchema and Projection for the LSIs on the
     * table at the time of backup.
     * </p>
     */
    private java.util.List<LocalSecondaryIndexInfo> localSecondaryIndexes;

    /**
     * <p>
     * Represents the GSI properties for the table when the backup was created.
     * It includes the IndexName, KeySchema, Projection and
     * ProvisionedThroughput for the GSIs on the table at the time of backup.
     * </p>
     */
    private java.util.List<GlobalSecondaryIndexInfo> globalSecondaryIndexes;

    /**
     * <p>
     * Stream settings on the table when the backup was created.
     * </p>
     */
    private StreamSpecification streamDescription;

    /**
     * <p>
     * Time to Live settings on the table when the backup was created.
     * </p>
     */
    private TimeToLiveDescription timeToLiveDescription;

    /**
     * <p>
     * The description of the server-side encryption status on the table when
     * the backup was created.
     * </p>
     */
    private SSEDescription sSEDescription;

    /**
     * <p>
     * Represents the LSI properties for the table when the backup was created.
     * It includes the IndexName, KeySchema and Projection for the LSIs on the
     * table at the time of backup.
     * </p>
     *
     * @return <p>
     *         Represents the LSI properties for the table when the backup was
     *         created. It includes the IndexName, KeySchema and Projection for
     *         the LSIs on the table at the time of backup.
     *         </p>
     */
    public java.util.List<LocalSecondaryIndexInfo> getLocalSecondaryIndexes() {
        return localSecondaryIndexes;
    }

    /**
     * <p>
     * Represents the LSI properties for the table when the backup was created.
     * It includes the IndexName, KeySchema and Projection for the LSIs on the
     * table at the time of backup.
     * </p>
     *
     * @param localSecondaryIndexes <p>
     *            Represents the LSI properties for the table when the backup
     *            was created. It includes the IndexName, KeySchema and
     *            Projection for the LSIs on the table at the time of backup.
     *            </p>
     */
    public void setLocalSecondaryIndexes(
            java.util.Collection<LocalSecondaryIndexInfo> localSecondaryIndexes) {
        if (localSecondaryIndexes == null) {
            this.localSecondaryIndexes = null;
            return;
        }

        this.localSecondaryIndexes = new java.util.ArrayList<LocalSecondaryIndexInfo>(
                localSecondaryIndexes);
    }

    /**
     * <p>
     * Represents the LSI properties for the table when the backup was created.
     * It includes the IndexName, KeySchema and Projection for the LSIs on the
     * table at the time of backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localSecondaryIndexes <p>
     *            Represents the LSI properties for the table when the backup
     *            was created. It includes the IndexName, KeySchema and
     *            Projection for the LSIs on the table at the time of backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceTableFeatureDetails withLocalSecondaryIndexes(
            LocalSecondaryIndexInfo... localSecondaryIndexes) {
        if (getLocalSecondaryIndexes() == null) {
            this.localSecondaryIndexes = new java.util.ArrayList<LocalSecondaryIndexInfo>(
                    localSecondaryIndexes.length);
        }
        for (LocalSecondaryIndexInfo value : localSecondaryIndexes) {
            this.localSecondaryIndexes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Represents the LSI properties for the table when the backup was created.
     * It includes the IndexName, KeySchema and Projection for the LSIs on the
     * table at the time of backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localSecondaryIndexes <p>
     *            Represents the LSI properties for the table when the backup
     *            was created. It includes the IndexName, KeySchema and
     *            Projection for the LSIs on the table at the time of backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceTableFeatureDetails withLocalSecondaryIndexes(
            java.util.Collection<LocalSecondaryIndexInfo> localSecondaryIndexes) {
        setLocalSecondaryIndexes(localSecondaryIndexes);
        return this;
    }

    /**
     * <p>
     * Represents the GSI properties for the table when the backup was created.
     * It includes the IndexName, KeySchema, Projection and
     * ProvisionedThroughput for the GSIs on the table at the time of backup.
     * </p>
     *
     * @return <p>
     *         Represents the GSI properties for the table when the backup was
     *         created. It includes the IndexName, KeySchema, Projection and
     *         ProvisionedThroughput for the GSIs on the table at the time of
     *         backup.
     *         </p>
     */
    public java.util.List<GlobalSecondaryIndexInfo> getGlobalSecondaryIndexes() {
        return globalSecondaryIndexes;
    }

    /**
     * <p>
     * Represents the GSI properties for the table when the backup was created.
     * It includes the IndexName, KeySchema, Projection and
     * ProvisionedThroughput for the GSIs on the table at the time of backup.
     * </p>
     *
     * @param globalSecondaryIndexes <p>
     *            Represents the GSI properties for the table when the backup
     *            was created. It includes the IndexName, KeySchema, Projection
     *            and ProvisionedThroughput for the GSIs on the table at the
     *            time of backup.
     *            </p>
     */
    public void setGlobalSecondaryIndexes(
            java.util.Collection<GlobalSecondaryIndexInfo> globalSecondaryIndexes) {
        if (globalSecondaryIndexes == null) {
            this.globalSecondaryIndexes = null;
            return;
        }

        this.globalSecondaryIndexes = new java.util.ArrayList<GlobalSecondaryIndexInfo>(
                globalSecondaryIndexes);
    }

    /**
     * <p>
     * Represents the GSI properties for the table when the backup was created.
     * It includes the IndexName, KeySchema, Projection and
     * ProvisionedThroughput for the GSIs on the table at the time of backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalSecondaryIndexes <p>
     *            Represents the GSI properties for the table when the backup
     *            was created. It includes the IndexName, KeySchema, Projection
     *            and ProvisionedThroughput for the GSIs on the table at the
     *            time of backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceTableFeatureDetails withGlobalSecondaryIndexes(
            GlobalSecondaryIndexInfo... globalSecondaryIndexes) {
        if (getGlobalSecondaryIndexes() == null) {
            this.globalSecondaryIndexes = new java.util.ArrayList<GlobalSecondaryIndexInfo>(
                    globalSecondaryIndexes.length);
        }
        for (GlobalSecondaryIndexInfo value : globalSecondaryIndexes) {
            this.globalSecondaryIndexes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Represents the GSI properties for the table when the backup was created.
     * It includes the IndexName, KeySchema, Projection and
     * ProvisionedThroughput for the GSIs on the table at the time of backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalSecondaryIndexes <p>
     *            Represents the GSI properties for the table when the backup
     *            was created. It includes the IndexName, KeySchema, Projection
     *            and ProvisionedThroughput for the GSIs on the table at the
     *            time of backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceTableFeatureDetails withGlobalSecondaryIndexes(
            java.util.Collection<GlobalSecondaryIndexInfo> globalSecondaryIndexes) {
        setGlobalSecondaryIndexes(globalSecondaryIndexes);
        return this;
    }

    /**
     * <p>
     * Stream settings on the table when the backup was created.
     * </p>
     *
     * @return <p>
     *         Stream settings on the table when the backup was created.
     *         </p>
     */
    public StreamSpecification getStreamDescription() {
        return streamDescription;
    }

    /**
     * <p>
     * Stream settings on the table when the backup was created.
     * </p>
     *
     * @param streamDescription <p>
     *            Stream settings on the table when the backup was created.
     *            </p>
     */
    public void setStreamDescription(StreamSpecification streamDescription) {
        this.streamDescription = streamDescription;
    }

    /**
     * <p>
     * Stream settings on the table when the backup was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamDescription <p>
     *            Stream settings on the table when the backup was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceTableFeatureDetails withStreamDescription(StreamSpecification streamDescription) {
        this.streamDescription = streamDescription;
        return this;
    }

    /**
     * <p>
     * Time to Live settings on the table when the backup was created.
     * </p>
     *
     * @return <p>
     *         Time to Live settings on the table when the backup was created.
     *         </p>
     */
    public TimeToLiveDescription getTimeToLiveDescription() {
        return timeToLiveDescription;
    }

    /**
     * <p>
     * Time to Live settings on the table when the backup was created.
     * </p>
     *
     * @param timeToLiveDescription <p>
     *            Time to Live settings on the table when the backup was
     *            created.
     *            </p>
     */
    public void setTimeToLiveDescription(TimeToLiveDescription timeToLiveDescription) {
        this.timeToLiveDescription = timeToLiveDescription;
    }

    /**
     * <p>
     * Time to Live settings on the table when the backup was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeToLiveDescription <p>
     *            Time to Live settings on the table when the backup was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceTableFeatureDetails withTimeToLiveDescription(
            TimeToLiveDescription timeToLiveDescription) {
        this.timeToLiveDescription = timeToLiveDescription;
        return this;
    }

    /**
     * <p>
     * The description of the server-side encryption status on the table when
     * the backup was created.
     * </p>
     *
     * @return <p>
     *         The description of the server-side encryption status on the table
     *         when the backup was created.
     *         </p>
     */
    public SSEDescription getSSEDescription() {
        return sSEDescription;
    }

    /**
     * <p>
     * The description of the server-side encryption status on the table when
     * the backup was created.
     * </p>
     *
     * @param sSEDescription <p>
     *            The description of the server-side encryption status on the
     *            table when the backup was created.
     *            </p>
     */
    public void setSSEDescription(SSEDescription sSEDescription) {
        this.sSEDescription = sSEDescription;
    }

    /**
     * <p>
     * The description of the server-side encryption status on the table when
     * the backup was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSEDescription <p>
     *            The description of the server-side encryption status on the
     *            table when the backup was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceTableFeatureDetails withSSEDescription(SSEDescription sSEDescription) {
        this.sSEDescription = sSEDescription;
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
        if (getLocalSecondaryIndexes() != null)
            sb.append("LocalSecondaryIndexes: " + getLocalSecondaryIndexes() + ",");
        if (getGlobalSecondaryIndexes() != null)
            sb.append("GlobalSecondaryIndexes: " + getGlobalSecondaryIndexes() + ",");
        if (getStreamDescription() != null)
            sb.append("StreamDescription: " + getStreamDescription() + ",");
        if (getTimeToLiveDescription() != null)
            sb.append("TimeToLiveDescription: " + getTimeToLiveDescription() + ",");
        if (getSSEDescription() != null)
            sb.append("SSEDescription: " + getSSEDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLocalSecondaryIndexes() == null) ? 0 : getLocalSecondaryIndexes().hashCode());
        hashCode = prime
                * hashCode
                + ((getGlobalSecondaryIndexes() == null) ? 0 : getGlobalSecondaryIndexes()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getStreamDescription() == null) ? 0 : getStreamDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getTimeToLiveDescription() == null) ? 0 : getTimeToLiveDescription().hashCode());
        hashCode = prime * hashCode
                + ((getSSEDescription() == null) ? 0 : getSSEDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceTableFeatureDetails == false)
            return false;
        SourceTableFeatureDetails other = (SourceTableFeatureDetails) obj;

        if (other.getLocalSecondaryIndexes() == null ^ this.getLocalSecondaryIndexes() == null)
            return false;
        if (other.getLocalSecondaryIndexes() != null
                && other.getLocalSecondaryIndexes().equals(this.getLocalSecondaryIndexes()) == false)
            return false;
        if (other.getGlobalSecondaryIndexes() == null ^ this.getGlobalSecondaryIndexes() == null)
            return false;
        if (other.getGlobalSecondaryIndexes() != null
                && other.getGlobalSecondaryIndexes().equals(this.getGlobalSecondaryIndexes()) == false)
            return false;
        if (other.getStreamDescription() == null ^ this.getStreamDescription() == null)
            return false;
        if (other.getStreamDescription() != null
                && other.getStreamDescription().equals(this.getStreamDescription()) == false)
            return false;
        if (other.getTimeToLiveDescription() == null ^ this.getTimeToLiveDescription() == null)
            return false;
        if (other.getTimeToLiveDescription() != null
                && other.getTimeToLiveDescription().equals(this.getTimeToLiveDescription()) == false)
            return false;
        if (other.getSSEDescription() == null ^ this.getSSEDescription() == null)
            return false;
        if (other.getSSEDescription() != null
                && other.getSSEDescription().equals(this.getSSEDescription()) == false)
            return false;
        return true;
    }
}
