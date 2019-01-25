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

/**
 * <p>
 * Represents the details of a configuration set. Configuration sets enable you
 * to publish email sending events. For information about using configuration
 * sets, see the <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 */
public class DescribeConfigurationSetResult implements Serializable {
    /**
     * <p>
     * The configuration set object associated with the specified configuration
     * set.
     * </p>
     */
    private ConfigurationSet configurationSet;

    /**
     * <p>
     * A list of event destinations associated with the configuration set.
     * </p>
     */
    private java.util.List<EventDestination> eventDestinations = new java.util.ArrayList<EventDestination>();

    /**
     * <p>
     * The name of the custom open and click tracking domain associated with the
     * configuration set.
     * </p>
     */
    private TrackingOptions trackingOptions;

    /**
     * <p>
     * An object that represents the reputation settings for the configuration
     * set.
     * </p>
     */
    private ReputationOptions reputationOptions;

    /**
     * <p>
     * The configuration set object associated with the specified configuration
     * set.
     * </p>
     *
     * @return <p>
     *         The configuration set object associated with the specified
     *         configuration set.
     *         </p>
     */
    public ConfigurationSet getConfigurationSet() {
        return configurationSet;
    }

    /**
     * <p>
     * The configuration set object associated with the specified configuration
     * set.
     * </p>
     *
     * @param configurationSet <p>
     *            The configuration set object associated with the specified
     *            configuration set.
     *            </p>
     */
    public void setConfigurationSet(ConfigurationSet configurationSet) {
        this.configurationSet = configurationSet;
    }

    /**
     * <p>
     * The configuration set object associated with the specified configuration
     * set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationSet <p>
     *            The configuration set object associated with the specified
     *            configuration set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeConfigurationSetResult withConfigurationSet(ConfigurationSet configurationSet) {
        this.configurationSet = configurationSet;
        return this;
    }

    /**
     * <p>
     * A list of event destinations associated with the configuration set.
     * </p>
     *
     * @return <p>
     *         A list of event destinations associated with the configuration
     *         set.
     *         </p>
     */
    public java.util.List<EventDestination> getEventDestinations() {
        return eventDestinations;
    }

    /**
     * <p>
     * A list of event destinations associated with the configuration set.
     * </p>
     *
     * @param eventDestinations <p>
     *            A list of event destinations associated with the configuration
     *            set.
     *            </p>
     */
    public void setEventDestinations(java.util.Collection<EventDestination> eventDestinations) {
        if (eventDestinations == null) {
            this.eventDestinations = null;
            return;
        }

        this.eventDestinations = new java.util.ArrayList<EventDestination>(eventDestinations);
    }

    /**
     * <p>
     * A list of event destinations associated with the configuration set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventDestinations <p>
     *            A list of event destinations associated with the configuration
     *            set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeConfigurationSetResult withEventDestinations(
            EventDestination... eventDestinations) {
        if (getEventDestinations() == null) {
            this.eventDestinations = new java.util.ArrayList<EventDestination>(
                    eventDestinations.length);
        }
        for (EventDestination value : eventDestinations) {
            this.eventDestinations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of event destinations associated with the configuration set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventDestinations <p>
     *            A list of event destinations associated with the configuration
     *            set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeConfigurationSetResult withEventDestinations(
            java.util.Collection<EventDestination> eventDestinations) {
        setEventDestinations(eventDestinations);
        return this;
    }

    /**
     * <p>
     * The name of the custom open and click tracking domain associated with the
     * configuration set.
     * </p>
     *
     * @return <p>
     *         The name of the custom open and click tracking domain associated
     *         with the configuration set.
     *         </p>
     */
    public TrackingOptions getTrackingOptions() {
        return trackingOptions;
    }

    /**
     * <p>
     * The name of the custom open and click tracking domain associated with the
     * configuration set.
     * </p>
     *
     * @param trackingOptions <p>
     *            The name of the custom open and click tracking domain
     *            associated with the configuration set.
     *            </p>
     */
    public void setTrackingOptions(TrackingOptions trackingOptions) {
        this.trackingOptions = trackingOptions;
    }

    /**
     * <p>
     * The name of the custom open and click tracking domain associated with the
     * configuration set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trackingOptions <p>
     *            The name of the custom open and click tracking domain
     *            associated with the configuration set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeConfigurationSetResult withTrackingOptions(TrackingOptions trackingOptions) {
        this.trackingOptions = trackingOptions;
        return this;
    }

    /**
     * <p>
     * An object that represents the reputation settings for the configuration
     * set.
     * </p>
     *
     * @return <p>
     *         An object that represents the reputation settings for the
     *         configuration set.
     *         </p>
     */
    public ReputationOptions getReputationOptions() {
        return reputationOptions;
    }

    /**
     * <p>
     * An object that represents the reputation settings for the configuration
     * set.
     * </p>
     *
     * @param reputationOptions <p>
     *            An object that represents the reputation settings for the
     *            configuration set.
     *            </p>
     */
    public void setReputationOptions(ReputationOptions reputationOptions) {
        this.reputationOptions = reputationOptions;
    }

    /**
     * <p>
     * An object that represents the reputation settings for the configuration
     * set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reputationOptions <p>
     *            An object that represents the reputation settings for the
     *            configuration set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeConfigurationSetResult withReputationOptions(ReputationOptions reputationOptions) {
        this.reputationOptions = reputationOptions;
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
        if (getConfigurationSet() != null)
            sb.append("ConfigurationSet: " + getConfigurationSet() + ",");
        if (getEventDestinations() != null)
            sb.append("EventDestinations: " + getEventDestinations() + ",");
        if (getTrackingOptions() != null)
            sb.append("TrackingOptions: " + getTrackingOptions() + ",");
        if (getReputationOptions() != null)
            sb.append("ReputationOptions: " + getReputationOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConfigurationSet() == null) ? 0 : getConfigurationSet().hashCode());
        hashCode = prime * hashCode
                + ((getEventDestinations() == null) ? 0 : getEventDestinations().hashCode());
        hashCode = prime * hashCode
                + ((getTrackingOptions() == null) ? 0 : getTrackingOptions().hashCode());
        hashCode = prime * hashCode
                + ((getReputationOptions() == null) ? 0 : getReputationOptions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConfigurationSetResult == false)
            return false;
        DescribeConfigurationSetResult other = (DescribeConfigurationSetResult) obj;

        if (other.getConfigurationSet() == null ^ this.getConfigurationSet() == null)
            return false;
        if (other.getConfigurationSet() != null
                && other.getConfigurationSet().equals(this.getConfigurationSet()) == false)
            return false;
        if (other.getEventDestinations() == null ^ this.getEventDestinations() == null)
            return false;
        if (other.getEventDestinations() != null
                && other.getEventDestinations().equals(this.getEventDestinations()) == false)
            return false;
        if (other.getTrackingOptions() == null ^ this.getTrackingOptions() == null)
            return false;
        if (other.getTrackingOptions() != null
                && other.getTrackingOptions().equals(this.getTrackingOptions()) == false)
            return false;
        if (other.getReputationOptions() == null ^ this.getReputationOptions() == null)
            return false;
        if (other.getReputationOptions() != null
                && other.getReputationOptions().equals(this.getReputationOptions()) == false)
            return false;
        return true;
    }
}
