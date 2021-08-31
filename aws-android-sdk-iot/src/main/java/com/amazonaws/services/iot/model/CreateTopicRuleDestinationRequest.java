/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a topic rule destination. The destination must be confirmed prior to
 * use.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >CreateTopicRuleDestination</a> action.
 * </p>
 */
public class CreateTopicRuleDestinationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The topic rule destination configuration.
     * </p>
     */
    private TopicRuleDestinationConfiguration destinationConfiguration;

    /**
     * <p>
     * The topic rule destination configuration.
     * </p>
     *
     * @return <p>
     *         The topic rule destination configuration.
     *         </p>
     */
    public TopicRuleDestinationConfiguration getDestinationConfiguration() {
        return destinationConfiguration;
    }

    /**
     * <p>
     * The topic rule destination configuration.
     * </p>
     *
     * @param destinationConfiguration <p>
     *            The topic rule destination configuration.
     *            </p>
     */
    public void setDestinationConfiguration(
            TopicRuleDestinationConfiguration destinationConfiguration) {
        this.destinationConfiguration = destinationConfiguration;
    }

    /**
     * <p>
     * The topic rule destination configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationConfiguration <p>
     *            The topic rule destination configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTopicRuleDestinationRequest withDestinationConfiguration(
            TopicRuleDestinationConfiguration destinationConfiguration) {
        this.destinationConfiguration = destinationConfiguration;
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
        if (getDestinationConfiguration() != null)
            sb.append("destinationConfiguration: " + getDestinationConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDestinationConfiguration() == null) ? 0 : getDestinationConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTopicRuleDestinationRequest == false)
            return false;
        CreateTopicRuleDestinationRequest other = (CreateTopicRuleDestinationRequest) obj;

        if (other.getDestinationConfiguration() == null
                ^ this.getDestinationConfiguration() == null)
            return false;
        if (other.getDestinationConfiguration() != null
                && other.getDestinationConfiguration().equals(this.getDestinationConfiguration()) == false)
            return false;
        return true;
    }
}
