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

/**
 * <p>
 * Thing group indexing configuration.
 * </p>
 */
public class ThingGroupIndexingConfiguration implements Serializable {
    /**
     * <p>
     * Thing group indexing mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON
     */
    private String thingGroupIndexingMode;

    /**
     * <p>
     * Thing group indexing mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON
     *
     * @return <p>
     *         Thing group indexing mode.
     *         </p>
     * @see ThingGroupIndexingMode
     */
    public String getThingGroupIndexingMode() {
        return thingGroupIndexingMode;
    }

    /**
     * <p>
     * Thing group indexing mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON
     *
     * @param thingGroupIndexingMode <p>
     *            Thing group indexing mode.
     *            </p>
     * @see ThingGroupIndexingMode
     */
    public void setThingGroupIndexingMode(String thingGroupIndexingMode) {
        this.thingGroupIndexingMode = thingGroupIndexingMode;
    }

    /**
     * <p>
     * Thing group indexing mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON
     *
     * @param thingGroupIndexingMode <p>
     *            Thing group indexing mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ThingGroupIndexingMode
     */
    public ThingGroupIndexingConfiguration withThingGroupIndexingMode(String thingGroupIndexingMode) {
        this.thingGroupIndexingMode = thingGroupIndexingMode;
        return this;
    }

    /**
     * <p>
     * Thing group indexing mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON
     *
     * @param thingGroupIndexingMode <p>
     *            Thing group indexing mode.
     *            </p>
     * @see ThingGroupIndexingMode
     */
    public void setThingGroupIndexingMode(ThingGroupIndexingMode thingGroupIndexingMode) {
        this.thingGroupIndexingMode = thingGroupIndexingMode.toString();
    }

    /**
     * <p>
     * Thing group indexing mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON
     *
     * @param thingGroupIndexingMode <p>
     *            Thing group indexing mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ThingGroupIndexingMode
     */
    public ThingGroupIndexingConfiguration withThingGroupIndexingMode(
            ThingGroupIndexingMode thingGroupIndexingMode) {
        this.thingGroupIndexingMode = thingGroupIndexingMode.toString();
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
        if (getThingGroupIndexingMode() != null)
            sb.append("thingGroupIndexingMode: " + getThingGroupIndexingMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getThingGroupIndexingMode() == null) ? 0 : getThingGroupIndexingMode()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThingGroupIndexingConfiguration == false)
            return false;
        ThingGroupIndexingConfiguration other = (ThingGroupIndexingConfiguration) obj;

        if (other.getThingGroupIndexingMode() == null ^ this.getThingGroupIndexingMode() == null)
            return false;
        if (other.getThingGroupIndexingMode() != null
                && other.getThingGroupIndexingMode().equals(this.getThingGroupIndexingMode()) == false)
            return false;
        return true;
    }
}
