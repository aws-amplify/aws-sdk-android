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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * Used to create a campaign treatment.
 */
public class WriteTreatmentResource implements Serializable {
    /**
     * The message configuration settings.
     */
    private MessageConfiguration messageConfiguration;

    /**
     * The campaign schedule.
     */
    private Schedule schedule;

    /**
     * The allocated percentage of users for this treatment.
     */
    private Integer sizePercent;

    /**
     * A custom description for the treatment.
     */
    private String treatmentDescription;

    /**
     * The custom name of a variation of the campaign used for A/B testing.
     */
    private String treatmentName;

    /**
     * The message configuration settings.
     *
     * @return The message configuration settings.
     */
    public MessageConfiguration getMessageConfiguration() {
        return messageConfiguration;
    }

    /**
     * The message configuration settings.
     *
     * @param messageConfiguration The message configuration settings.
     */
    public void setMessageConfiguration(MessageConfiguration messageConfiguration) {
        this.messageConfiguration = messageConfiguration;
    }

    /**
     * The message configuration settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageConfiguration The message configuration settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteTreatmentResource withMessageConfiguration(MessageConfiguration messageConfiguration) {
        this.messageConfiguration = messageConfiguration;
        return this;
    }

    /**
     * The campaign schedule.
     *
     * @return The campaign schedule.
     */
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * The campaign schedule.
     *
     * @param schedule The campaign schedule.
     */
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * The campaign schedule.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schedule The campaign schedule.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteTreatmentResource withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * The allocated percentage of users for this treatment.
     *
     * @return The allocated percentage of users for this treatment.
     */
    public Integer getSizePercent() {
        return sizePercent;
    }

    /**
     * The allocated percentage of users for this treatment.
     *
     * @param sizePercent The allocated percentage of users for this treatment.
     */
    public void setSizePercent(Integer sizePercent) {
        this.sizePercent = sizePercent;
    }

    /**
     * The allocated percentage of users for this treatment.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sizePercent The allocated percentage of users for this treatment.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteTreatmentResource withSizePercent(Integer sizePercent) {
        this.sizePercent = sizePercent;
        return this;
    }

    /**
     * A custom description for the treatment.
     *
     * @return A custom description for the treatment.
     */
    public String getTreatmentDescription() {
        return treatmentDescription;
    }

    /**
     * A custom description for the treatment.
     *
     * @param treatmentDescription A custom description for the treatment.
     */
    public void setTreatmentDescription(String treatmentDescription) {
        this.treatmentDescription = treatmentDescription;
    }

    /**
     * A custom description for the treatment.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param treatmentDescription A custom description for the treatment.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteTreatmentResource withTreatmentDescription(String treatmentDescription) {
        this.treatmentDescription = treatmentDescription;
        return this;
    }

    /**
     * The custom name of a variation of the campaign used for A/B testing.
     *
     * @return The custom name of a variation of the campaign used for A/B
     *         testing.
     */
    public String getTreatmentName() {
        return treatmentName;
    }

    /**
     * The custom name of a variation of the campaign used for A/B testing.
     *
     * @param treatmentName The custom name of a variation of the campaign used
     *            for A/B testing.
     */
    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    /**
     * The custom name of a variation of the campaign used for A/B testing.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param treatmentName The custom name of a variation of the campaign used
     *            for A/B testing.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteTreatmentResource withTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
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
        if (getMessageConfiguration() != null)
            sb.append("MessageConfiguration: " + getMessageConfiguration() + ",");
        if (getSchedule() != null)
            sb.append("Schedule: " + getSchedule() + ",");
        if (getSizePercent() != null)
            sb.append("SizePercent: " + getSizePercent() + ",");
        if (getTreatmentDescription() != null)
            sb.append("TreatmentDescription: " + getTreatmentDescription() + ",");
        if (getTreatmentName() != null)
            sb.append("TreatmentName: " + getTreatmentName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMessageConfiguration() == null) ? 0 : getMessageConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode
                + ((getSizePercent() == null) ? 0 : getSizePercent().hashCode());
        hashCode = prime * hashCode
                + ((getTreatmentDescription() == null) ? 0 : getTreatmentDescription().hashCode());
        hashCode = prime * hashCode
                + ((getTreatmentName() == null) ? 0 : getTreatmentName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WriteTreatmentResource == false)
            return false;
        WriteTreatmentResource other = (WriteTreatmentResource) obj;

        if (other.getMessageConfiguration() == null ^ this.getMessageConfiguration() == null)
            return false;
        if (other.getMessageConfiguration() != null
                && other.getMessageConfiguration().equals(this.getMessageConfiguration()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getSizePercent() == null ^ this.getSizePercent() == null)
            return false;
        if (other.getSizePercent() != null
                && other.getSizePercent().equals(this.getSizePercent()) == false)
            return false;
        if (other.getTreatmentDescription() == null ^ this.getTreatmentDescription() == null)
            return false;
        if (other.getTreatmentDescription() != null
                && other.getTreatmentDescription().equals(this.getTreatmentDescription()) == false)
            return false;
        if (other.getTreatmentName() == null ^ this.getTreatmentName() == null)
            return false;
        if (other.getTreatmentName() != null
                && other.getTreatmentName().equals(this.getTreatmentName()) == false)
            return false;
        return true;
    }
}
