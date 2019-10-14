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
 * <p>
 * Specifies the settings for a campaign treatment. A treatment is a variation
 * of a campaign that's used for A/B testing of a campaign.
 * </p>
 */
public class TreatmentResource implements Serializable {
    /**
     * <p>
     * The unique identifier for the treatment.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The message configuration settings for the treatment.
     * </p>
     */
    private MessageConfiguration messageConfiguration;

    /**
     * <p>
     * The schedule settings for the treatment.
     * </p>
     */
    private Schedule schedule;

    /**
     * <p>
     * The allocated percentage of users (segment members) that the treatment is
     * sent to.
     * </p>
     */
    private Integer sizePercent;

    /**
     * <p>
     * The status of the treatment.
     * </p>
     */
    private CampaignState state;

    /**
     * <p>
     * Specifies the message template to use for the message, for each type of
     * channel.
     * </p>
     */
    private TemplateConfiguration templateConfiguration;

    /**
     * <p>
     * The custom description of the treatment.
     * </p>
     */
    private String treatmentDescription;

    /**
     * <p>
     * The custom name of the treatment. A treatment is a variation of a
     * campaign that's used for A/B testing of a campaign.
     * </p>
     */
    private String treatmentName;

    /**
     * <p>
     * The unique identifier for the treatment.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the treatment.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the treatment.
     * </p>
     *
     * @param id <p>
     *            The unique identifier for the treatment.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the treatment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier for the treatment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TreatmentResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The message configuration settings for the treatment.
     * </p>
     *
     * @return <p>
     *         The message configuration settings for the treatment.
     *         </p>
     */
    public MessageConfiguration getMessageConfiguration() {
        return messageConfiguration;
    }

    /**
     * <p>
     * The message configuration settings for the treatment.
     * </p>
     *
     * @param messageConfiguration <p>
     *            The message configuration settings for the treatment.
     *            </p>
     */
    public void setMessageConfiguration(MessageConfiguration messageConfiguration) {
        this.messageConfiguration = messageConfiguration;
    }

    /**
     * <p>
     * The message configuration settings for the treatment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageConfiguration <p>
     *            The message configuration settings for the treatment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TreatmentResource withMessageConfiguration(MessageConfiguration messageConfiguration) {
        this.messageConfiguration = messageConfiguration;
        return this;
    }

    /**
     * <p>
     * The schedule settings for the treatment.
     * </p>
     *
     * @return <p>
     *         The schedule settings for the treatment.
     *         </p>
     */
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * <p>
     * The schedule settings for the treatment.
     * </p>
     *
     * @param schedule <p>
     *            The schedule settings for the treatment.
     *            </p>
     */
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule settings for the treatment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schedule <p>
     *            The schedule settings for the treatment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TreatmentResource withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * <p>
     * The allocated percentage of users (segment members) that the treatment is
     * sent to.
     * </p>
     *
     * @return <p>
     *         The allocated percentage of users (segment members) that the
     *         treatment is sent to.
     *         </p>
     */
    public Integer getSizePercent() {
        return sizePercent;
    }

    /**
     * <p>
     * The allocated percentage of users (segment members) that the treatment is
     * sent to.
     * </p>
     *
     * @param sizePercent <p>
     *            The allocated percentage of users (segment members) that the
     *            treatment is sent to.
     *            </p>
     */
    public void setSizePercent(Integer sizePercent) {
        this.sizePercent = sizePercent;
    }

    /**
     * <p>
     * The allocated percentage of users (segment members) that the treatment is
     * sent to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sizePercent <p>
     *            The allocated percentage of users (segment members) that the
     *            treatment is sent to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TreatmentResource withSizePercent(Integer sizePercent) {
        this.sizePercent = sizePercent;
        return this;
    }

    /**
     * <p>
     * The status of the treatment.
     * </p>
     *
     * @return <p>
     *         The status of the treatment.
     *         </p>
     */
    public CampaignState getState() {
        return state;
    }

    /**
     * <p>
     * The status of the treatment.
     * </p>
     *
     * @param state <p>
     *            The status of the treatment.
     *            </p>
     */
    public void setState(CampaignState state) {
        this.state = state;
    }

    /**
     * <p>
     * The status of the treatment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param state <p>
     *            The status of the treatment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TreatmentResource withState(CampaignState state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * Specifies the message template to use for the message, for each type of
     * channel.
     * </p>
     *
     * @return <p>
     *         Specifies the message template to use for the message, for each
     *         type of channel.
     *         </p>
     */
    public TemplateConfiguration getTemplateConfiguration() {
        return templateConfiguration;
    }

    /**
     * <p>
     * Specifies the message template to use for the message, for each type of
     * channel.
     * </p>
     *
     * @param templateConfiguration <p>
     *            Specifies the message template to use for the message, for
     *            each type of channel.
     *            </p>
     */
    public void setTemplateConfiguration(TemplateConfiguration templateConfiguration) {
        this.templateConfiguration = templateConfiguration;
    }

    /**
     * <p>
     * Specifies the message template to use for the message, for each type of
     * channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateConfiguration <p>
     *            Specifies the message template to use for the message, for
     *            each type of channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TreatmentResource withTemplateConfiguration(TemplateConfiguration templateConfiguration) {
        this.templateConfiguration = templateConfiguration;
        return this;
    }

    /**
     * <p>
     * The custom description of the treatment.
     * </p>
     *
     * @return <p>
     *         The custom description of the treatment.
     *         </p>
     */
    public String getTreatmentDescription() {
        return treatmentDescription;
    }

    /**
     * <p>
     * The custom description of the treatment.
     * </p>
     *
     * @param treatmentDescription <p>
     *            The custom description of the treatment.
     *            </p>
     */
    public void setTreatmentDescription(String treatmentDescription) {
        this.treatmentDescription = treatmentDescription;
    }

    /**
     * <p>
     * The custom description of the treatment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param treatmentDescription <p>
     *            The custom description of the treatment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TreatmentResource withTreatmentDescription(String treatmentDescription) {
        this.treatmentDescription = treatmentDescription;
        return this;
    }

    /**
     * <p>
     * The custom name of the treatment. A treatment is a variation of a
     * campaign that's used for A/B testing of a campaign.
     * </p>
     *
     * @return <p>
     *         The custom name of the treatment. A treatment is a variation of a
     *         campaign that's used for A/B testing of a campaign.
     *         </p>
     */
    public String getTreatmentName() {
        return treatmentName;
    }

    /**
     * <p>
     * The custom name of the treatment. A treatment is a variation of a
     * campaign that's used for A/B testing of a campaign.
     * </p>
     *
     * @param treatmentName <p>
     *            The custom name of the treatment. A treatment is a variation
     *            of a campaign that's used for A/B testing of a campaign.
     *            </p>
     */
    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    /**
     * <p>
     * The custom name of the treatment. A treatment is a variation of a
     * campaign that's used for A/B testing of a campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param treatmentName <p>
     *            The custom name of the treatment. A treatment is a variation
     *            of a campaign that's used for A/B testing of a campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TreatmentResource withTreatmentName(String treatmentName) {
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getMessageConfiguration() != null)
            sb.append("MessageConfiguration: " + getMessageConfiguration() + ",");
        if (getSchedule() != null)
            sb.append("Schedule: " + getSchedule() + ",");
        if (getSizePercent() != null)
            sb.append("SizePercent: " + getSizePercent() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getTemplateConfiguration() != null)
            sb.append("TemplateConfiguration: " + getTemplateConfiguration() + ",");
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getMessageConfiguration() == null) ? 0 : getMessageConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode
                + ((getSizePercent() == null) ? 0 : getSizePercent().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime
                * hashCode
                + ((getTemplateConfiguration() == null) ? 0 : getTemplateConfiguration().hashCode());
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

        if (obj instanceof TreatmentResource == false)
            return false;
        TreatmentResource other = (TreatmentResource) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
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
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTemplateConfiguration() == null ^ this.getTemplateConfiguration() == null)
            return false;
        if (other.getTemplateConfiguration() != null
                && other.getTemplateConfiguration().equals(this.getTemplateConfiguration()) == false)
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
