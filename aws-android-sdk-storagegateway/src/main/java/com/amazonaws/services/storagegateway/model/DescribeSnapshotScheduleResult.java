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

package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

public class DescribeSnapshotScheduleResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume that was specified in the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String volumeARN;

    /**
     * <p>
     * The hour of the day at which the snapshot schedule begins represented as
     * <i>hh</i>, where <i>hh</i> is the hour (0 to 23). The hour of the day is
     * in the time zone of the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     */
    private Integer startAt;

    /**
     * <p>
     * The number of hours between snapshots.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     */
    private Integer recurrenceInHours;

    /**
     * <p>
     * The snapshot description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String description;

    /**
     * <p>
     * A value that indicates the time zone of the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     */
    private String timezone;

    /**
     * <p>
     * A list of up to 50 tags assigned to the snapshot schedule, sorted
     * alphabetically by key name. Each tag is a key-value pair. For a gateway
     * with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume that was specified in the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the volume that was specified
     *         in the request.
     *         </p>
     */
    public String getVolumeARN() {
        return volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume that was specified in the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN <p>
     *            The Amazon Resource Name (ARN) of the volume that was
     *            specified in the request.
     *            </p>
     */
    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume that was specified in the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN <p>
     *            The Amazon Resource Name (ARN) of the volume that was
     *            specified in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotScheduleResult withVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
        return this;
    }

    /**
     * <p>
     * The hour of the day at which the snapshot schedule begins represented as
     * <i>hh</i>, where <i>hh</i> is the hour (0 to 23). The hour of the day is
     * in the time zone of the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @return <p>
     *         The hour of the day at which the snapshot schedule begins
     *         represented as <i>hh</i>, where <i>hh</i> is the hour (0 to 23).
     *         The hour of the day is in the time zone of the gateway.
     *         </p>
     */
    public Integer getStartAt() {
        return startAt;
    }

    /**
     * <p>
     * The hour of the day at which the snapshot schedule begins represented as
     * <i>hh</i>, where <i>hh</i> is the hour (0 to 23). The hour of the day is
     * in the time zone of the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @param startAt <p>
     *            The hour of the day at which the snapshot schedule begins
     *            represented as <i>hh</i>, where <i>hh</i> is the hour (0 to
     *            23). The hour of the day is in the time zone of the gateway.
     *            </p>
     */
    public void setStartAt(Integer startAt) {
        this.startAt = startAt;
    }

    /**
     * <p>
     * The hour of the day at which the snapshot schedule begins represented as
     * <i>hh</i>, where <i>hh</i> is the hour (0 to 23). The hour of the day is
     * in the time zone of the gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @param startAt <p>
     *            The hour of the day at which the snapshot schedule begins
     *            represented as <i>hh</i>, where <i>hh</i> is the hour (0 to
     *            23). The hour of the day is in the time zone of the gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotScheduleResult withStartAt(Integer startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * <p>
     * The number of hours between snapshots.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @return <p>
     *         The number of hours between snapshots.
     *         </p>
     */
    public Integer getRecurrenceInHours() {
        return recurrenceInHours;
    }

    /**
     * <p>
     * The number of hours between snapshots.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @param recurrenceInHours <p>
     *            The number of hours between snapshots.
     *            </p>
     */
    public void setRecurrenceInHours(Integer recurrenceInHours) {
        this.recurrenceInHours = recurrenceInHours;
    }

    /**
     * <p>
     * The number of hours between snapshots.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @param recurrenceInHours <p>
     *            The number of hours between snapshots.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotScheduleResult withRecurrenceInHours(Integer recurrenceInHours) {
        this.recurrenceInHours = recurrenceInHours;
        return this;
    }

    /**
     * <p>
     * The snapshot description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The snapshot description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The snapshot description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param description <p>
     *            The snapshot description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The snapshot description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param description <p>
     *            The snapshot description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotScheduleResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A value that indicates the time zone of the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @return <p>
     *         A value that indicates the time zone of the gateway.
     *         </p>
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * <p>
     * A value that indicates the time zone of the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @param timezone <p>
     *            A value that indicates the time zone of the gateway.
     *            </p>
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * A value that indicates the time zone of the gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @param timezone <p>
     *            A value that indicates the time zone of the gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotScheduleResult withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags assigned to the snapshot schedule, sorted
     * alphabetically by key name. Each tag is a key-value pair. For a gateway
     * with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     *
     * @return <p>
     *         A list of up to 50 tags assigned to the snapshot schedule, sorted
     *         alphabetically by key name. Each tag is a key-value pair. For a
     *         gateway with more than 10 tags assigned, you can view all tags
     *         using the <code>ListTagsForResource</code> API operation.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of up to 50 tags assigned to the snapshot schedule, sorted
     * alphabetically by key name. Each tag is a key-value pair. For a gateway
     * with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     *
     * @param tags <p>
     *            A list of up to 50 tags assigned to the snapshot schedule,
     *            sorted alphabetically by key name. Each tag is a key-value
     *            pair. For a gateway with more than 10 tags assigned, you can
     *            view all tags using the <code>ListTagsForResource</code> API
     *            operation.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of up to 50 tags assigned to the snapshot schedule, sorted
     * alphabetically by key name. Each tag is a key-value pair. For a gateway
     * with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of up to 50 tags assigned to the snapshot schedule,
     *            sorted alphabetically by key name. Each tag is a key-value
     *            pair. For a gateway with more than 10 tags assigned, you can
     *            view all tags using the <code>ListTagsForResource</code> API
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotScheduleResult withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags assigned to the snapshot schedule, sorted
     * alphabetically by key name. Each tag is a key-value pair. For a gateway
     * with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of up to 50 tags assigned to the snapshot schedule,
     *            sorted alphabetically by key name. Each tag is a key-value
     *            pair. For a gateway with more than 10 tags assigned, you can
     *            view all tags using the <code>ListTagsForResource</code> API
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotScheduleResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getVolumeARN() != null)
            sb.append("VolumeARN: " + getVolumeARN() + ",");
        if (getStartAt() != null)
            sb.append("StartAt: " + getStartAt() + ",");
        if (getRecurrenceInHours() != null)
            sb.append("RecurrenceInHours: " + getRecurrenceInHours() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getTimezone() != null)
            sb.append("Timezone: " + getTimezone() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode());
        hashCode = prime * hashCode + ((getStartAt() == null) ? 0 : getStartAt().hashCode());
        hashCode = prime * hashCode
                + ((getRecurrenceInHours() == null) ? 0 : getRecurrenceInHours().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSnapshotScheduleResult == false)
            return false;
        DescribeSnapshotScheduleResult other = (DescribeSnapshotScheduleResult) obj;

        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null)
            return false;
        if (other.getVolumeARN() != null
                && other.getVolumeARN().equals(this.getVolumeARN()) == false)
            return false;
        if (other.getStartAt() == null ^ this.getStartAt() == null)
            return false;
        if (other.getStartAt() != null && other.getStartAt().equals(this.getStartAt()) == false)
            return false;
        if (other.getRecurrenceInHours() == null ^ this.getRecurrenceInHours() == null)
            return false;
        if (other.getRecurrenceInHours() != null
                && other.getRecurrenceInHours().equals(this.getRecurrenceInHours()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
