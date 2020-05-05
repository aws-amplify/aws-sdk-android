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

public class ReleaseHostsResult implements Serializable {
    /**
     * <p>
     * The IDs of the Dedicated Hosts that were successfully released.
     * </p>
     */
    private java.util.List<String> successful;

    /**
     * <p>
     * The IDs of the Dedicated Hosts that could not be released, including an
     * error message.
     * </p>
     */
    private java.util.List<UnsuccessfulItem> unsuccessful;

    /**
     * <p>
     * The IDs of the Dedicated Hosts that were successfully released.
     * </p>
     *
     * @return <p>
     *         The IDs of the Dedicated Hosts that were successfully released.
     *         </p>
     */
    public java.util.List<String> getSuccessful() {
        return successful;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts that were successfully released.
     * </p>
     *
     * @param successful <p>
     *            The IDs of the Dedicated Hosts that were successfully
     *            released.
     *            </p>
     */
    public void setSuccessful(java.util.Collection<String> successful) {
        if (successful == null) {
            this.successful = null;
            return;
        }

        this.successful = new java.util.ArrayList<String>(successful);
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts that were successfully released.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successful <p>
     *            The IDs of the Dedicated Hosts that were successfully
     *            released.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReleaseHostsResult withSuccessful(String... successful) {
        if (getSuccessful() == null) {
            this.successful = new java.util.ArrayList<String>(successful.length);
        }
        for (String value : successful) {
            this.successful.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts that were successfully released.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successful <p>
     *            The IDs of the Dedicated Hosts that were successfully
     *            released.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReleaseHostsResult withSuccessful(java.util.Collection<String> successful) {
        setSuccessful(successful);
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts that could not be released, including an
     * error message.
     * </p>
     *
     * @return <p>
     *         The IDs of the Dedicated Hosts that could not be released,
     *         including an error message.
     *         </p>
     */
    public java.util.List<UnsuccessfulItem> getUnsuccessful() {
        return unsuccessful;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts that could not be released, including an
     * error message.
     * </p>
     *
     * @param unsuccessful <p>
     *            The IDs of the Dedicated Hosts that could not be released,
     *            including an error message.
     *            </p>
     */
    public void setUnsuccessful(java.util.Collection<UnsuccessfulItem> unsuccessful) {
        if (unsuccessful == null) {
            this.unsuccessful = null;
            return;
        }

        this.unsuccessful = new java.util.ArrayList<UnsuccessfulItem>(unsuccessful);
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts that could not be released, including an
     * error message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unsuccessful <p>
     *            The IDs of the Dedicated Hosts that could not be released,
     *            including an error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReleaseHostsResult withUnsuccessful(UnsuccessfulItem... unsuccessful) {
        if (getUnsuccessful() == null) {
            this.unsuccessful = new java.util.ArrayList<UnsuccessfulItem>(unsuccessful.length);
        }
        for (UnsuccessfulItem value : unsuccessful) {
            this.unsuccessful.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts that could not be released, including an
     * error message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unsuccessful <p>
     *            The IDs of the Dedicated Hosts that could not be released,
     *            including an error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReleaseHostsResult withUnsuccessful(java.util.Collection<UnsuccessfulItem> unsuccessful) {
        setUnsuccessful(unsuccessful);
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
        if (getSuccessful() != null)
            sb.append("Successful: " + getSuccessful() + ",");
        if (getUnsuccessful() != null)
            sb.append("Unsuccessful: " + getUnsuccessful());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessful() == null) ? 0 : getSuccessful().hashCode());
        hashCode = prime * hashCode
                + ((getUnsuccessful() == null) ? 0 : getUnsuccessful().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReleaseHostsResult == false)
            return false;
        ReleaseHostsResult other = (ReleaseHostsResult) obj;

        if (other.getSuccessful() == null ^ this.getSuccessful() == null)
            return false;
        if (other.getSuccessful() != null
                && other.getSuccessful().equals(this.getSuccessful()) == false)
            return false;
        if (other.getUnsuccessful() == null ^ this.getUnsuccessful() == null)
            return false;
        if (other.getUnsuccessful() != null
                && other.getUnsuccessful().equals(this.getUnsuccessful()) == false)
            return false;
        return true;
    }
}
