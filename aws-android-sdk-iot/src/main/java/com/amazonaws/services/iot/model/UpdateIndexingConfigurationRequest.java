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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the search configuration.
 * </p>
 */
public class UpdateIndexingConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Thing indexing configuration.
     * </p>
     */
    private ThingIndexingConfiguration thingIndexingConfiguration;

    /**
     * <p>
     * Thing group indexing configuration.
     * </p>
     */
    private ThingGroupIndexingConfiguration thingGroupIndexingConfiguration;

    /**
     * <p>
     * Thing indexing configuration.
     * </p>
     *
     * @return <p>
     *         Thing indexing configuration.
     *         </p>
     */
    public ThingIndexingConfiguration getThingIndexingConfiguration() {
        return thingIndexingConfiguration;
    }

    /**
     * <p>
     * Thing indexing configuration.
     * </p>
     *
     * @param thingIndexingConfiguration <p>
     *            Thing indexing configuration.
     *            </p>
     */
    public void setThingIndexingConfiguration(ThingIndexingConfiguration thingIndexingConfiguration) {
        this.thingIndexingConfiguration = thingIndexingConfiguration;
    }

    /**
     * <p>
     * Thing indexing configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingIndexingConfiguration <p>
     *            Thing indexing configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIndexingConfigurationRequest withThingIndexingConfiguration(
            ThingIndexingConfiguration thingIndexingConfiguration) {
        this.thingIndexingConfiguration = thingIndexingConfiguration;
        return this;
    }

    /**
     * <p>
     * Thing group indexing configuration.
     * </p>
     *
     * @return <p>
     *         Thing group indexing configuration.
     *         </p>
     */
    public ThingGroupIndexingConfiguration getThingGroupIndexingConfiguration() {
        return thingGroupIndexingConfiguration;
    }

    /**
     * <p>
     * Thing group indexing configuration.
     * </p>
     *
     * @param thingGroupIndexingConfiguration <p>
     *            Thing group indexing configuration.
     *            </p>
     */
    public void setThingGroupIndexingConfiguration(
            ThingGroupIndexingConfiguration thingGroupIndexingConfiguration) {
        this.thingGroupIndexingConfiguration = thingGroupIndexingConfiguration;
    }

    /**
     * <p>
     * Thing group indexing configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingGroupIndexingConfiguration <p>
     *            Thing group indexing configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIndexingConfigurationRequest withThingGroupIndexingConfiguration(
            ThingGroupIndexingConfiguration thingGroupIndexingConfiguration) {
        this.thingGroupIndexingConfiguration = thingGroupIndexingConfiguration;
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
        if (getThingIndexingConfiguration() != null)
            sb.append("thingIndexingConfiguration: " + getThingIndexingConfiguration() + ",");
        if (getThingGroupIndexingConfiguration() != null)
            sb.append("thingGroupIndexingConfiguration: " + getThingGroupIndexingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getThingIndexingConfiguration() == null) ? 0 : getThingIndexingConfiguration()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getThingGroupIndexingConfiguration() == null) ? 0
                        : getThingGroupIndexingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIndexingConfigurationRequest == false)
            return false;
        UpdateIndexingConfigurationRequest other = (UpdateIndexingConfigurationRequest) obj;

        if (other.getThingIndexingConfiguration() == null
                ^ this.getThingIndexingConfiguration() == null)
            return false;
        if (other.getThingIndexingConfiguration() != null
                && other.getThingIndexingConfiguration().equals(
                        this.getThingIndexingConfiguration()) == false)
            return false;
        if (other.getThingGroupIndexingConfiguration() == null
                ^ this.getThingGroupIndexingConfiguration() == null)
            return false;
        if (other.getThingGroupIndexingConfiguration() != null
                && other.getThingGroupIndexingConfiguration().equals(
                        this.getThingGroupIndexingConfiguration()) == false)
            return false;
        return true;
    }
}
