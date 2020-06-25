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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the placement group support of the instance type.
 * </p>
 */
public class PlacementGroupInfo implements Serializable {
    /**
     * <p>
     * A list of supported placement groups types.
     * </p>
     */
    private java.util.List<String> supportedStrategies;

    /**
     * <p>
     * A list of supported placement groups types.
     * </p>
     *
     * @return <p>
     *         A list of supported placement groups types.
     *         </p>
     */
    public java.util.List<String> getSupportedStrategies() {
        return supportedStrategies;
    }

    /**
     * <p>
     * A list of supported placement groups types.
     * </p>
     *
     * @param supportedStrategies <p>
     *            A list of supported placement groups types.
     *            </p>
     */
    public void setSupportedStrategies(java.util.Collection<String> supportedStrategies) {
        if (supportedStrategies == null) {
            this.supportedStrategies = null;
            return;
        }

        this.supportedStrategies = new java.util.ArrayList<String>(supportedStrategies);
    }

    /**
     * <p>
     * A list of supported placement groups types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedStrategies <p>
     *            A list of supported placement groups types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlacementGroupInfo withSupportedStrategies(String... supportedStrategies) {
        if (getSupportedStrategies() == null) {
            this.supportedStrategies = new java.util.ArrayList<String>(supportedStrategies.length);
        }
        for (String value : supportedStrategies) {
            this.supportedStrategies.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of supported placement groups types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedStrategies <p>
     *            A list of supported placement groups types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlacementGroupInfo withSupportedStrategies(
            java.util.Collection<String> supportedStrategies) {
        setSupportedStrategies(supportedStrategies);
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
        if (getSupportedStrategies() != null)
            sb.append("SupportedStrategies: " + getSupportedStrategies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSupportedStrategies() == null) ? 0 : getSupportedStrategies().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlacementGroupInfo == false)
            return false;
        PlacementGroupInfo other = (PlacementGroupInfo) obj;

        if (other.getSupportedStrategies() == null ^ this.getSupportedStrategies() == null)
            return false;
        if (other.getSupportedStrategies() != null
                && other.getSupportedStrategies().equals(this.getSupportedStrategies()) == false)
            return false;
        return true;
    }
}
