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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the event destination of a configuration set. Event destinations are
 * associated with configuration sets, which enable you to publish email sending
 * events to Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple
 * Notification Service (Amazon SNS). For information about using configuration
 * sets, see <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
 * >Monitoring Your Amazon SES Sending Activity</a> in the <i>Amazon SES
 * Developer Guide.</i>
 * </p>
 * <note>
 * <p>
 * When you create or update an event destination, you must provide one, and
 * only one, destination. The destination can be Amazon CloudWatch, Amazon
 * Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS).
 * </p>
 * </note>
 * <p>
 * You can execute this operation no more than once per second.
 * </p>
 */
public class UpdateConfigurationSetEventDestinationRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The name of the configuration set that contains the event destination
     * that you want to update.
     * </p>
     */
    private String configurationSetName;

    /**
     * <p>
     * The event destination object that you want to apply to the specified
     * configuration set.
     * </p>
     */
    private EventDestination eventDestination;

    /**
     * <p>
     * The name of the configuration set that contains the event destination
     * that you want to update.
     * </p>
     *
     * @return <p>
     *         The name of the configuration set that contains the event
     *         destination that you want to update.
     *         </p>
     */
    public String getConfigurationSetName() {
        return configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that contains the event destination
     * that you want to update.
     * </p>
     *
     * @param configurationSetName <p>
     *            The name of the configuration set that contains the event
     *            destination that you want to update.
     *            </p>
     */
    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that contains the event destination
     * that you want to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationSetName <p>
     *            The name of the configuration set that contains the event
     *            destination that you want to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateConfigurationSetEventDestinationRequest withConfigurationSetName(
            String configurationSetName) {
        this.configurationSetName = configurationSetName;
        return this;
    }

    /**
     * <p>
     * The event destination object that you want to apply to the specified
     * configuration set.
     * </p>
     *
     * @return <p>
     *         The event destination object that you want to apply to the
     *         specified configuration set.
     *         </p>
     */
    public EventDestination getEventDestination() {
        return eventDestination;
    }

    /**
     * <p>
     * The event destination object that you want to apply to the specified
     * configuration set.
     * </p>
     *
     * @param eventDestination <p>
     *            The event destination object that you want to apply to the
     *            specified configuration set.
     *            </p>
     */
    public void setEventDestination(EventDestination eventDestination) {
        this.eventDestination = eventDestination;
    }

    /**
     * <p>
     * The event destination object that you want to apply to the specified
     * configuration set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventDestination <p>
     *            The event destination object that you want to apply to the
     *            specified configuration set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateConfigurationSetEventDestinationRequest withEventDestination(
            EventDestination eventDestination) {
        this.eventDestination = eventDestination;
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
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: " + getConfigurationSetName() + ",");
        if (getEventDestination() != null)
            sb.append("EventDestination: " + getEventDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode
                + ((getEventDestination() == null) ? 0 : getEventDestination().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConfigurationSetEventDestinationRequest == false)
            return false;
        UpdateConfigurationSetEventDestinationRequest other = (UpdateConfigurationSetEventDestinationRequest) obj;

        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null
                && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getEventDestination() == null ^ this.getEventDestination() == null)
            return false;
        if (other.getEventDestination() != null
                && other.getEventDestination().equals(this.getEventDestination()) == false)
            return false;
        return true;
    }
}
