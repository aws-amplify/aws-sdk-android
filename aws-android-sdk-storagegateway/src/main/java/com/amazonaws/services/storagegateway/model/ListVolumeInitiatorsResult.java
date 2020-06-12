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

package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

/**
 * <p>
 * ListVolumeInitiatorsOutput
 * </p>
 */
public class ListVolumeInitiatorsResult implements Serializable {
    /**
     * <p>
     * The host names and port numbers of all iSCSI initiators that are
     * connected to the gateway.
     * </p>
     */
    private java.util.List<String> initiators;

    /**
     * <p>
     * The host names and port numbers of all iSCSI initiators that are
     * connected to the gateway.
     * </p>
     *
     * @return <p>
     *         The host names and port numbers of all iSCSI initiators that are
     *         connected to the gateway.
     *         </p>
     */
    public java.util.List<String> getInitiators() {
        return initiators;
    }

    /**
     * <p>
     * The host names and port numbers of all iSCSI initiators that are
     * connected to the gateway.
     * </p>
     *
     * @param initiators <p>
     *            The host names and port numbers of all iSCSI initiators that
     *            are connected to the gateway.
     *            </p>
     */
    public void setInitiators(java.util.Collection<String> initiators) {
        if (initiators == null) {
            this.initiators = null;
            return;
        }

        this.initiators = new java.util.ArrayList<String>(initiators);
    }

    /**
     * <p>
     * The host names and port numbers of all iSCSI initiators that are
     * connected to the gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param initiators <p>
     *            The host names and port numbers of all iSCSI initiators that
     *            are connected to the gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVolumeInitiatorsResult withInitiators(String... initiators) {
        if (getInitiators() == null) {
            this.initiators = new java.util.ArrayList<String>(initiators.length);
        }
        for (String value : initiators) {
            this.initiators.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The host names and port numbers of all iSCSI initiators that are
     * connected to the gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param initiators <p>
     *            The host names and port numbers of all iSCSI initiators that
     *            are connected to the gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVolumeInitiatorsResult withInitiators(java.util.Collection<String> initiators) {
        setInitiators(initiators);
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
        if (getInitiators() != null)
            sb.append("Initiators: " + getInitiators());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInitiators() == null) ? 0 : getInitiators().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVolumeInitiatorsResult == false)
            return false;
        ListVolumeInitiatorsResult other = (ListVolumeInitiatorsResult) obj;

        if (other.getInitiators() == null ^ this.getInitiators() == null)
            return false;
        if (other.getInitiators() != null
                && other.getInitiators().equals(this.getInitiators()) == false)
            return false;
        return true;
    }
}
