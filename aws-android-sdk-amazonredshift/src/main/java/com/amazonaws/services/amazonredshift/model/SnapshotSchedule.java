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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a snapshot schedule. You can set a regular interval for creating
 * snapshots of a cluster. You can also schedule snapshots for specific dates.
 * </p>
 */
public class SnapshotSchedule implements Serializable {
    /**
     * <p>
     * A list of ScheduleDefinitions.
     * </p>
     */
    private java.util.List<String> scheduleDefinitions;

    /**
     * <p>
     * A unique identifier for the schedule.
     * </p>
     */
    private String scheduleIdentifier;

    /**
     * <p>
     * The description of the schedule.
     * </p>
     */
    private String scheduleDescription;

    /**
     * <p>
     * An optional set of tags describing the schedule.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p/>
     */
    private java.util.List<java.util.Date> nextInvocations;

    /**
     * <p>
     * The number of clusters associated with the schedule.
     * </p>
     */
    private Integer associatedClusterCount;

    /**
     * <p>
     * A list of clusters associated with the schedule. A maximum of 100
     * clusters is returned.
     * </p>
     */
    private java.util.List<ClusterAssociatedToSchedule> associatedClusters;

    /**
     * <p>
     * A list of ScheduleDefinitions.
     * </p>
     *
     * @return <p>
     *         A list of ScheduleDefinitions.
     *         </p>
     */
    public java.util.List<String> getScheduleDefinitions() {
        return scheduleDefinitions;
    }

    /**
     * <p>
     * A list of ScheduleDefinitions.
     * </p>
     *
     * @param scheduleDefinitions <p>
     *            A list of ScheduleDefinitions.
     *            </p>
     */
    public void setScheduleDefinitions(java.util.Collection<String> scheduleDefinitions) {
        if (scheduleDefinitions == null) {
            this.scheduleDefinitions = null;
            return;
        }

        this.scheduleDefinitions = new java.util.ArrayList<String>(scheduleDefinitions);
    }

    /**
     * <p>
     * A list of ScheduleDefinitions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleDefinitions <p>
     *            A list of ScheduleDefinitions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotSchedule withScheduleDefinitions(String... scheduleDefinitions) {
        if (getScheduleDefinitions() == null) {
            this.scheduleDefinitions = new java.util.ArrayList<String>(scheduleDefinitions.length);
        }
        for (String value : scheduleDefinitions) {
            this.scheduleDefinitions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of ScheduleDefinitions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleDefinitions <p>
     *            A list of ScheduleDefinitions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotSchedule withScheduleDefinitions(java.util.Collection<String> scheduleDefinitions) {
        setScheduleDefinitions(scheduleDefinitions);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the schedule.
     * </p>
     *
     * @return <p>
     *         A unique identifier for the schedule.
     *         </p>
     */
    public String getScheduleIdentifier() {
        return scheduleIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the schedule.
     * </p>
     *
     * @param scheduleIdentifier <p>
     *            A unique identifier for the schedule.
     *            </p>
     */
    public void setScheduleIdentifier(String scheduleIdentifier) {
        this.scheduleIdentifier = scheduleIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleIdentifier <p>
     *            A unique identifier for the schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotSchedule withScheduleIdentifier(String scheduleIdentifier) {
        this.scheduleIdentifier = scheduleIdentifier;
        return this;
    }

    /**
     * <p>
     * The description of the schedule.
     * </p>
     *
     * @return <p>
     *         The description of the schedule.
     *         </p>
     */
    public String getScheduleDescription() {
        return scheduleDescription;
    }

    /**
     * <p>
     * The description of the schedule.
     * </p>
     *
     * @param scheduleDescription <p>
     *            The description of the schedule.
     *            </p>
     */
    public void setScheduleDescription(String scheduleDescription) {
        this.scheduleDescription = scheduleDescription;
    }

    /**
     * <p>
     * The description of the schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleDescription <p>
     *            The description of the schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotSchedule withScheduleDescription(String scheduleDescription) {
        this.scheduleDescription = scheduleDescription;
        return this;
    }

    /**
     * <p>
     * An optional set of tags describing the schedule.
     * </p>
     *
     * @return <p>
     *         An optional set of tags describing the schedule.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An optional set of tags describing the schedule.
     * </p>
     *
     * @param tags <p>
     *            An optional set of tags describing the schedule.
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
     * An optional set of tags describing the schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An optional set of tags describing the schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotSchedule withTags(Tag... tags) {
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
     * An optional set of tags describing the schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An optional set of tags describing the schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotSchedule withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public java.util.List<java.util.Date> getNextInvocations() {
        return nextInvocations;
    }

    /**
     * <p/>
     *
     * @param nextInvocations <p/>
     */
    public void setNextInvocations(java.util.Collection<java.util.Date> nextInvocations) {
        if (nextInvocations == null) {
            this.nextInvocations = null;
            return;
        }

        this.nextInvocations = new java.util.ArrayList<java.util.Date>(nextInvocations);
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextInvocations <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotSchedule withNextInvocations(java.util.Date... nextInvocations) {
        if (getNextInvocations() == null) {
            this.nextInvocations = new java.util.ArrayList<java.util.Date>(nextInvocations.length);
        }
        for (java.util.Date value : nextInvocations) {
            this.nextInvocations.add(value);
        }
        return this;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextInvocations <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotSchedule withNextInvocations(java.util.Collection<java.util.Date> nextInvocations) {
        setNextInvocations(nextInvocations);
        return this;
    }

    /**
     * <p>
     * The number of clusters associated with the schedule.
     * </p>
     *
     * @return <p>
     *         The number of clusters associated with the schedule.
     *         </p>
     */
    public Integer getAssociatedClusterCount() {
        return associatedClusterCount;
    }

    /**
     * <p>
     * The number of clusters associated with the schedule.
     * </p>
     *
     * @param associatedClusterCount <p>
     *            The number of clusters associated with the schedule.
     *            </p>
     */
    public void setAssociatedClusterCount(Integer associatedClusterCount) {
        this.associatedClusterCount = associatedClusterCount;
    }

    /**
     * <p>
     * The number of clusters associated with the schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedClusterCount <p>
     *            The number of clusters associated with the schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotSchedule withAssociatedClusterCount(Integer associatedClusterCount) {
        this.associatedClusterCount = associatedClusterCount;
        return this;
    }

    /**
     * <p>
     * A list of clusters associated with the schedule. A maximum of 100
     * clusters is returned.
     * </p>
     *
     * @return <p>
     *         A list of clusters associated with the schedule. A maximum of 100
     *         clusters is returned.
     *         </p>
     */
    public java.util.List<ClusterAssociatedToSchedule> getAssociatedClusters() {
        return associatedClusters;
    }

    /**
     * <p>
     * A list of clusters associated with the schedule. A maximum of 100
     * clusters is returned.
     * </p>
     *
     * @param associatedClusters <p>
     *            A list of clusters associated with the schedule. A maximum of
     *            100 clusters is returned.
     *            </p>
     */
    public void setAssociatedClusters(
            java.util.Collection<ClusterAssociatedToSchedule> associatedClusters) {
        if (associatedClusters == null) {
            this.associatedClusters = null;
            return;
        }

        this.associatedClusters = new java.util.ArrayList<ClusterAssociatedToSchedule>(
                associatedClusters);
    }

    /**
     * <p>
     * A list of clusters associated with the schedule. A maximum of 100
     * clusters is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedClusters <p>
     *            A list of clusters associated with the schedule. A maximum of
     *            100 clusters is returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotSchedule withAssociatedClusters(
            ClusterAssociatedToSchedule... associatedClusters) {
        if (getAssociatedClusters() == null) {
            this.associatedClusters = new java.util.ArrayList<ClusterAssociatedToSchedule>(
                    associatedClusters.length);
        }
        for (ClusterAssociatedToSchedule value : associatedClusters) {
            this.associatedClusters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of clusters associated with the schedule. A maximum of 100
     * clusters is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedClusters <p>
     *            A list of clusters associated with the schedule. A maximum of
     *            100 clusters is returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotSchedule withAssociatedClusters(
            java.util.Collection<ClusterAssociatedToSchedule> associatedClusters) {
        setAssociatedClusters(associatedClusters);
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
        if (getScheduleDefinitions() != null)
            sb.append("ScheduleDefinitions: " + getScheduleDefinitions() + ",");
        if (getScheduleIdentifier() != null)
            sb.append("ScheduleIdentifier: " + getScheduleIdentifier() + ",");
        if (getScheduleDescription() != null)
            sb.append("ScheduleDescription: " + getScheduleDescription() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getNextInvocations() != null)
            sb.append("NextInvocations: " + getNextInvocations() + ",");
        if (getAssociatedClusterCount() != null)
            sb.append("AssociatedClusterCount: " + getAssociatedClusterCount() + ",");
        if (getAssociatedClusters() != null)
            sb.append("AssociatedClusters: " + getAssociatedClusters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getScheduleDefinitions() == null) ? 0 : getScheduleDefinitions().hashCode());
        hashCode = prime * hashCode
                + ((getScheduleIdentifier() == null) ? 0 : getScheduleIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getScheduleDescription() == null) ? 0 : getScheduleDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getNextInvocations() == null) ? 0 : getNextInvocations().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssociatedClusterCount() == null) ? 0 : getAssociatedClusterCount()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAssociatedClusters() == null) ? 0 : getAssociatedClusters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapshotSchedule == false)
            return false;
        SnapshotSchedule other = (SnapshotSchedule) obj;

        if (other.getScheduleDefinitions() == null ^ this.getScheduleDefinitions() == null)
            return false;
        if (other.getScheduleDefinitions() != null
                && other.getScheduleDefinitions().equals(this.getScheduleDefinitions()) == false)
            return false;
        if (other.getScheduleIdentifier() == null ^ this.getScheduleIdentifier() == null)
            return false;
        if (other.getScheduleIdentifier() != null
                && other.getScheduleIdentifier().equals(this.getScheduleIdentifier()) == false)
            return false;
        if (other.getScheduleDescription() == null ^ this.getScheduleDescription() == null)
            return false;
        if (other.getScheduleDescription() != null
                && other.getScheduleDescription().equals(this.getScheduleDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getNextInvocations() == null ^ this.getNextInvocations() == null)
            return false;
        if (other.getNextInvocations() != null
                && other.getNextInvocations().equals(this.getNextInvocations()) == false)
            return false;
        if (other.getAssociatedClusterCount() == null ^ this.getAssociatedClusterCount() == null)
            return false;
        if (other.getAssociatedClusterCount() != null
                && other.getAssociatedClusterCount().equals(this.getAssociatedClusterCount()) == false)
            return false;
        if (other.getAssociatedClusters() == null ^ this.getAssociatedClusters() == null)
            return false;
        if (other.getAssociatedClusters() != null
                && other.getAssociatedClusters().equals(this.getAssociatedClusters()) == false)
            return false;
        return true;
    }
}
