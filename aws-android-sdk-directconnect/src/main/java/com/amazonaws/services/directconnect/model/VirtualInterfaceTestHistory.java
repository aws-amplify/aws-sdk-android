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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the virtual interface failover test.
 * </p>
 */
public class VirtualInterfaceTestHistory implements Serializable {
    /**
     * <p>
     * The ID of the virtual interface failover test.
     * </p>
     */
    private String testId;

    /**
     * <p>
     * The ID of the tested virtual interface.
     * </p>
     */
    private String virtualInterfaceId;

    /**
     * <p>
     * The BGP peers that were put in the DOWN state as part of the virtual
     * interface failover test.
     * </p>
     */
    private java.util.List<String> bgpPeers;

    /**
     * <p>
     * The status of the virtual interface failover test.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The owner ID of the tested virtual interface.
     * </p>
     */
    private String ownerAccount;

    /**
     * <p>
     * The time that the virtual interface failover test ran in minutes.
     * </p>
     */
    private Integer testDurationInMinutes;

    /**
     * <p>
     * The time that the virtual interface moves to the DOWN state.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The time that the virtual interface moves out of the DOWN state.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The ID of the virtual interface failover test.
     * </p>
     *
     * @return <p>
     *         The ID of the virtual interface failover test.
     *         </p>
     */
    public String getTestId() {
        return testId;
    }

    /**
     * <p>
     * The ID of the virtual interface failover test.
     * </p>
     *
     * @param testId <p>
     *            The ID of the virtual interface failover test.
     *            </p>
     */
    public void setTestId(String testId) {
        this.testId = testId;
    }

    /**
     * <p>
     * The ID of the virtual interface failover test.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param testId <p>
     *            The ID of the virtual interface failover test.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualInterfaceTestHistory withTestId(String testId) {
        this.testId = testId;
        return this;
    }

    /**
     * <p>
     * The ID of the tested virtual interface.
     * </p>
     *
     * @return <p>
     *         The ID of the tested virtual interface.
     *         </p>
     */
    public String getVirtualInterfaceId() {
        return virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the tested virtual interface.
     * </p>
     *
     * @param virtualInterfaceId <p>
     *            The ID of the tested virtual interface.
     *            </p>
     */
    public void setVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the tested virtual interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualInterfaceId <p>
     *            The ID of the tested virtual interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualInterfaceTestHistory withVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
        return this;
    }

    /**
     * <p>
     * The BGP peers that were put in the DOWN state as part of the virtual
     * interface failover test.
     * </p>
     *
     * @return <p>
     *         The BGP peers that were put in the DOWN state as part of the
     *         virtual interface failover test.
     *         </p>
     */
    public java.util.List<String> getBgpPeers() {
        return bgpPeers;
    }

    /**
     * <p>
     * The BGP peers that were put in the DOWN state as part of the virtual
     * interface failover test.
     * </p>
     *
     * @param bgpPeers <p>
     *            The BGP peers that were put in the DOWN state as part of the
     *            virtual interface failover test.
     *            </p>
     */
    public void setBgpPeers(java.util.Collection<String> bgpPeers) {
        if (bgpPeers == null) {
            this.bgpPeers = null;
            return;
        }

        this.bgpPeers = new java.util.ArrayList<String>(bgpPeers);
    }

    /**
     * <p>
     * The BGP peers that were put in the DOWN state as part of the virtual
     * interface failover test.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bgpPeers <p>
     *            The BGP peers that were put in the DOWN state as part of the
     *            virtual interface failover test.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualInterfaceTestHistory withBgpPeers(String... bgpPeers) {
        if (getBgpPeers() == null) {
            this.bgpPeers = new java.util.ArrayList<String>(bgpPeers.length);
        }
        for (String value : bgpPeers) {
            this.bgpPeers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The BGP peers that were put in the DOWN state as part of the virtual
     * interface failover test.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bgpPeers <p>
     *            The BGP peers that were put in the DOWN state as part of the
     *            virtual interface failover test.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualInterfaceTestHistory withBgpPeers(java.util.Collection<String> bgpPeers) {
        setBgpPeers(bgpPeers);
        return this;
    }

    /**
     * <p>
     * The status of the virtual interface failover test.
     * </p>
     *
     * @return <p>
     *         The status of the virtual interface failover test.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the virtual interface failover test.
     * </p>
     *
     * @param status <p>
     *            The status of the virtual interface failover test.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the virtual interface failover test.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the virtual interface failover test.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualInterfaceTestHistory withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The owner ID of the tested virtual interface.
     * </p>
     *
     * @return <p>
     *         The owner ID of the tested virtual interface.
     *         </p>
     */
    public String getOwnerAccount() {
        return ownerAccount;
    }

    /**
     * <p>
     * The owner ID of the tested virtual interface.
     * </p>
     *
     * @param ownerAccount <p>
     *            The owner ID of the tested virtual interface.
     *            </p>
     */
    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The owner ID of the tested virtual interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerAccount <p>
     *            The owner ID of the tested virtual interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualInterfaceTestHistory withOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }

    /**
     * <p>
     * The time that the virtual interface failover test ran in minutes.
     * </p>
     *
     * @return <p>
     *         The time that the virtual interface failover test ran in minutes.
     *         </p>
     */
    public Integer getTestDurationInMinutes() {
        return testDurationInMinutes;
    }

    /**
     * <p>
     * The time that the virtual interface failover test ran in minutes.
     * </p>
     *
     * @param testDurationInMinutes <p>
     *            The time that the virtual interface failover test ran in
     *            minutes.
     *            </p>
     */
    public void setTestDurationInMinutes(Integer testDurationInMinutes) {
        this.testDurationInMinutes = testDurationInMinutes;
    }

    /**
     * <p>
     * The time that the virtual interface failover test ran in minutes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param testDurationInMinutes <p>
     *            The time that the virtual interface failover test ran in
     *            minutes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualInterfaceTestHistory withTestDurationInMinutes(Integer testDurationInMinutes) {
        this.testDurationInMinutes = testDurationInMinutes;
        return this;
    }

    /**
     * <p>
     * The time that the virtual interface moves to the DOWN state.
     * </p>
     *
     * @return <p>
     *         The time that the virtual interface moves to the DOWN state.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The time that the virtual interface moves to the DOWN state.
     * </p>
     *
     * @param startTime <p>
     *            The time that the virtual interface moves to the DOWN state.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time that the virtual interface moves to the DOWN state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The time that the virtual interface moves to the DOWN state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualInterfaceTestHistory withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The time that the virtual interface moves out of the DOWN state.
     * </p>
     *
     * @return <p>
     *         The time that the virtual interface moves out of the DOWN state.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The time that the virtual interface moves out of the DOWN state.
     * </p>
     *
     * @param endTime <p>
     *            The time that the virtual interface moves out of the DOWN
     *            state.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time that the virtual interface moves out of the DOWN state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The time that the virtual interface moves out of the DOWN
     *            state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualInterfaceTestHistory withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
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
        if (getTestId() != null)
            sb.append("testId: " + getTestId() + ",");
        if (getVirtualInterfaceId() != null)
            sb.append("virtualInterfaceId: " + getVirtualInterfaceId() + ",");
        if (getBgpPeers() != null)
            sb.append("bgpPeers: " + getBgpPeers() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getOwnerAccount() != null)
            sb.append("ownerAccount: " + getOwnerAccount() + ",");
        if (getTestDurationInMinutes() != null)
            sb.append("testDurationInMinutes: " + getTestDurationInMinutes() + ",");
        if (getStartTime() != null)
            sb.append("startTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("endTime: " + getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestId() == null) ? 0 : getTestId().hashCode());
        hashCode = prime * hashCode
                + ((getVirtualInterfaceId() == null) ? 0 : getVirtualInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getBgpPeers() == null) ? 0 : getBgpPeers().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime
                * hashCode
                + ((getTestDurationInMinutes() == null) ? 0 : getTestDurationInMinutes().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualInterfaceTestHistory == false)
            return false;
        VirtualInterfaceTestHistory other = (VirtualInterfaceTestHistory) obj;

        if (other.getTestId() == null ^ this.getTestId() == null)
            return false;
        if (other.getTestId() != null && other.getTestId().equals(this.getTestId()) == false)
            return false;
        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null)
            return false;
        if (other.getVirtualInterfaceId() != null
                && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false)
            return false;
        if (other.getBgpPeers() == null ^ this.getBgpPeers() == null)
            return false;
        if (other.getBgpPeers() != null && other.getBgpPeers().equals(this.getBgpPeers()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null
                && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getTestDurationInMinutes() == null ^ this.getTestDurationInMinutes() == null)
            return false;
        if (other.getTestDurationInMinutes() != null
                && other.getTestDurationInMinutes().equals(this.getTestDurationInMinutes()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }
}
