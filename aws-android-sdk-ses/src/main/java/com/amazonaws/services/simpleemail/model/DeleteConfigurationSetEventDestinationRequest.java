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
 * Deletes a configuration set event destination. Configuration set event
 * destinations are associated with configuration sets, which enable you to
 * publish email sending events. For information about using configuration sets,
 * see the <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 * <p>
 * You can execute this operation no more than once per second.
 * </p>
 */
public class DeleteConfigurationSetEventDestinationRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The name of the configuration set from which to delete the event
     * destination.
     * </p>
     */
    private String configurationSetName;

    /**
     * <p>
     * The name of the event destination to delete.
     * </p>
     */
    private String eventDestinationName;

    /**
     * <p>
     * The name of the configuration set from which to delete the event
     * destination.
     * </p>
     *
     * @return <p>
     *         The name of the configuration set from which to delete the event
     *         destination.
     *         </p>
     */
    public String getConfigurationSetName() {
        return configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set from which to delete the event
     * destination.
     * </p>
     *
     * @param configurationSetName <p>
     *            The name of the configuration set from which to delete the
     *            event destination.
     *            </p>
     */
    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set from which to delete the event
     * destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationSetName <p>
     *            The name of the configuration set from which to delete the
     *            event destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteConfigurationSetEventDestinationRequest withConfigurationSetName(
            String configurationSetName) {
        this.configurationSetName = configurationSetName;
        return this;
    }

    /**
     * <p>
     * The name of the event destination to delete.
     * </p>
     *
     * @return <p>
     *         The name of the event destination to delete.
     *         </p>
     */
    public String getEventDestinationName() {
        return eventDestinationName;
    }

    /**
     * <p>
     * The name of the event destination to delete.
     * </p>
     *
     * @param eventDestinationName <p>
     *            The name of the event destination to delete.
     *            </p>
     */
    public void setEventDestinationName(String eventDestinationName) {
        this.eventDestinationName = eventDestinationName;
    }

    /**
     * <p>
     * The name of the event destination to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventDestinationName <p>
     *            The name of the event destination to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteConfigurationSetEventDestinationRequest withEventDestinationName(
            String eventDestinationName) {
        this.eventDestinationName = eventDestinationName;
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
        if (getEventDestinationName() != null)
            sb.append("EventDestinationName: " + getEventDestinationName());
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
                + ((getEventDestinationName() == null) ? 0 : getEventDestinationName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteConfigurationSetEventDestinationRequest == false)
            return false;
        DeleteConfigurationSetEventDestinationRequest other = (DeleteConfigurationSetEventDestinationRequest) obj;

        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null
                && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getEventDestinationName() == null ^ this.getEventDestinationName() == null)
            return false;
        if (other.getEventDestinationName() != null
                && other.getEventDestinationName().equals(this.getEventDestinationName()) == false)
            return false;
        return true;
    }
}
