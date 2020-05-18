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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

public class GetEventsConfigurationResult implements Serializable {
    /**
     * <p>
     * The events configuration details.
     * </p>
     */
    private EventsConfiguration eventsConfiguration;

    /**
     * <p>
     * The events configuration details.
     * </p>
     *
     * @return <p>
     *         The events configuration details.
     *         </p>
     */
    public EventsConfiguration getEventsConfiguration() {
        return eventsConfiguration;
    }

    /**
     * <p>
     * The events configuration details.
     * </p>
     *
     * @param eventsConfiguration <p>
     *            The events configuration details.
     *            </p>
     */
    public void setEventsConfiguration(EventsConfiguration eventsConfiguration) {
        this.eventsConfiguration = eventsConfiguration;
    }

    /**
     * <p>
     * The events configuration details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventsConfiguration <p>
     *            The events configuration details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetEventsConfigurationResult withEventsConfiguration(
            EventsConfiguration eventsConfiguration) {
        this.eventsConfiguration = eventsConfiguration;
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
        if (getEventsConfiguration() != null)
            sb.append("EventsConfiguration: " + getEventsConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEventsConfiguration() == null) ? 0 : getEventsConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEventsConfigurationResult == false)
            return false;
        GetEventsConfigurationResult other = (GetEventsConfigurationResult) obj;

        if (other.getEventsConfiguration() == null ^ this.getEventsConfiguration() == null)
            return false;
        if (other.getEventsConfiguration() != null
                && other.getEventsConfiguration().equals(this.getEventsConfiguration()) == false)
            return false;
        return true;
    }
}
