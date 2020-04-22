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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Create a snapshot schedule that can be associated to a cluster and which
 * overrides the default system backup schedule.
 * </p>
 */
public class CreateSnapshotScheduleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The definition of the snapshot schedule. The definition is made up of
     * schedule expressions, for example "cron(30 12 *)" or "rate(12 hours)".
     * </p>
     */
    private java.util.List<String> scheduleDefinitions;

    /**
     * <p>
     * A unique identifier for a snapshot schedule. Only alphanumeric characters
     * are allowed for the identifier.
     * </p>
     */
    private String scheduleIdentifier;

    /**
     * <p>
     * The description of the snapshot schedule.
     * </p>
     */
    private String scheduleDescription;

    /**
     * <p>
     * An optional set of tags you can use to search for the schedule.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p/>
     */
    private Boolean dryRun;

    /**
     * <p/>
     */
    private Integer nextInvocations;

    /**
     * <p>
     * The definition of the snapshot schedule. The definition is made up of
     * schedule expressions, for example "cron(30 12 *)" or "rate(12 hours)".
     * </p>
     *
     * @return <p>
     *         The definition of the snapshot schedule. The definition is made
     *         up of schedule expressions, for example "cron(30 12 *)" or
     *         "rate(12 hours)".
     *         </p>
     */
    public java.util.List<String> getScheduleDefinitions() {
        return scheduleDefinitions;
    }

    /**
     * <p>
     * The definition of the snapshot schedule. The definition is made up of
     * schedule expressions, for example "cron(30 12 *)" or "rate(12 hours)".
     * </p>
     *
     * @param scheduleDefinitions <p>
     *            The definition of the snapshot schedule. The definition is
     *            made up of schedule expressions, for example "cron(30 12 *)"
     *            or "rate(12 hours)".
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
     * The definition of the snapshot schedule. The definition is made up of
     * schedule expressions, for example "cron(30 12 *)" or "rate(12 hours)".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleDefinitions <p>
     *            The definition of the snapshot schedule. The definition is
     *            made up of schedule expressions, for example "cron(30 12 *)"
     *            or "rate(12 hours)".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotScheduleRequest withScheduleDefinitions(String... scheduleDefinitions) {
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
     * The definition of the snapshot schedule. The definition is made up of
     * schedule expressions, for example "cron(30 12 *)" or "rate(12 hours)".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleDefinitions <p>
     *            The definition of the snapshot schedule. The definition is
     *            made up of schedule expressions, for example "cron(30 12 *)"
     *            or "rate(12 hours)".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotScheduleRequest withScheduleDefinitions(
            java.util.Collection<String> scheduleDefinitions) {
        setScheduleDefinitions(scheduleDefinitions);
        return this;
    }

    /**
     * <p>
     * A unique identifier for a snapshot schedule. Only alphanumeric characters
     * are allowed for the identifier.
     * </p>
     *
     * @return <p>
     *         A unique identifier for a snapshot schedule. Only alphanumeric
     *         characters are allowed for the identifier.
     *         </p>
     */
    public String getScheduleIdentifier() {
        return scheduleIdentifier;
    }

    /**
     * <p>
     * A unique identifier for a snapshot schedule. Only alphanumeric characters
     * are allowed for the identifier.
     * </p>
     *
     * @param scheduleIdentifier <p>
     *            A unique identifier for a snapshot schedule. Only alphanumeric
     *            characters are allowed for the identifier.
     *            </p>
     */
    public void setScheduleIdentifier(String scheduleIdentifier) {
        this.scheduleIdentifier = scheduleIdentifier;
    }

    /**
     * <p>
     * A unique identifier for a snapshot schedule. Only alphanumeric characters
     * are allowed for the identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleIdentifier <p>
     *            A unique identifier for a snapshot schedule. Only alphanumeric
     *            characters are allowed for the identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotScheduleRequest withScheduleIdentifier(String scheduleIdentifier) {
        this.scheduleIdentifier = scheduleIdentifier;
        return this;
    }

    /**
     * <p>
     * The description of the snapshot schedule.
     * </p>
     *
     * @return <p>
     *         The description of the snapshot schedule.
     *         </p>
     */
    public String getScheduleDescription() {
        return scheduleDescription;
    }

    /**
     * <p>
     * The description of the snapshot schedule.
     * </p>
     *
     * @param scheduleDescription <p>
     *            The description of the snapshot schedule.
     *            </p>
     */
    public void setScheduleDescription(String scheduleDescription) {
        this.scheduleDescription = scheduleDescription;
    }

    /**
     * <p>
     * The description of the snapshot schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleDescription <p>
     *            The description of the snapshot schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotScheduleRequest withScheduleDescription(String scheduleDescription) {
        this.scheduleDescription = scheduleDescription;
        return this;
    }

    /**
     * <p>
     * An optional set of tags you can use to search for the schedule.
     * </p>
     *
     * @return <p>
     *         An optional set of tags you can use to search for the schedule.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An optional set of tags you can use to search for the schedule.
     * </p>
     *
     * @param tags <p>
     *            An optional set of tags you can use to search for the
     *            schedule.
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
     * An optional set of tags you can use to search for the schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An optional set of tags you can use to search for the
     *            schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotScheduleRequest withTags(Tag... tags) {
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
     * An optional set of tags you can use to search for the schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An optional set of tags you can use to search for the
     *            schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotScheduleRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p/>
     *
     * @param dryRun <p/>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotScheduleRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public Integer getNextInvocations() {
        return nextInvocations;
    }

    /**
     * <p/>
     *
     * @param nextInvocations <p/>
     */
    public void setNextInvocations(Integer nextInvocations) {
        this.nextInvocations = nextInvocations;
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
    public CreateSnapshotScheduleRequest withNextInvocations(Integer nextInvocations) {
        this.nextInvocations = nextInvocations;
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getNextInvocations() != null)
            sb.append("NextInvocations: " + getNextInvocations());
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
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getNextInvocations() == null) ? 0 : getNextInvocations().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSnapshotScheduleRequest == false)
            return false;
        CreateSnapshotScheduleRequest other = (CreateSnapshotScheduleRequest) obj;

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
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getNextInvocations() == null ^ this.getNextInvocations() == null)
            return false;
        if (other.getNextInvocations() != null
                && other.getNextInvocations().equals(this.getNextInvocations()) == false)
            return false;
        return true;
    }
}
