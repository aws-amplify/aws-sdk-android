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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts the virtual interface failover test that verifies your configuration
 * meets your resiliency requirements by placing the BGP peering session in the
 * DOWN state. You can then send traffic to verify that there are no outages.
 * </p>
 * <p>
 * You can run the test on public, private, transit, and hosted virtual
 * interfaces.
 * </p>
 * <p>
 * You can use <a href=
 * "https://docs.aws.amazon.com/directconnect/latest/APIReference/API_ListVirtualInterfaceTestHistory.html"
 * >ListVirtualInterfaceTestHistory</a> to view the virtual interface test
 * history.
 * </p>
 * <p>
 * If you need to stop the test before the test interval completes, use <a href=
 * "https://docs.aws.amazon.com/directconnect/latest/APIReference/API_StopBgpFailoverTest.html"
 * >StopBgpFailoverTest</a>.
 * </p>
 */
public class StartBgpFailoverTestRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the virtual interface you want to test.
     * </p>
     */
    private String virtualInterfaceId;

    /**
     * <p>
     * The BGP peers to place in the DOWN state.
     * </p>
     */
    private java.util.List<String> bgpPeers;

    /**
     * <p>
     * The time in minutes that the virtual interface failover test will last.
     * </p>
     * <p>
     * Maximum value: 180 minutes (3 hours).
     * </p>
     * <p>
     * Default: 180 minutes (3 hours).
     * </p>
     */
    private Integer testDurationInMinutes;

    /**
     * <p>
     * The ID of the virtual interface you want to test.
     * </p>
     *
     * @return <p>
     *         The ID of the virtual interface you want to test.
     *         </p>
     */
    public String getVirtualInterfaceId() {
        return virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface you want to test.
     * </p>
     *
     * @param virtualInterfaceId <p>
     *            The ID of the virtual interface you want to test.
     *            </p>
     */
    public void setVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface you want to test.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualInterfaceId <p>
     *            The ID of the virtual interface you want to test.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBgpFailoverTestRequest withVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
        return this;
    }

    /**
     * <p>
     * The BGP peers to place in the DOWN state.
     * </p>
     *
     * @return <p>
     *         The BGP peers to place in the DOWN state.
     *         </p>
     */
    public java.util.List<String> getBgpPeers() {
        return bgpPeers;
    }

    /**
     * <p>
     * The BGP peers to place in the DOWN state.
     * </p>
     *
     * @param bgpPeers <p>
     *            The BGP peers to place in the DOWN state.
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
     * The BGP peers to place in the DOWN state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bgpPeers <p>
     *            The BGP peers to place in the DOWN state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBgpFailoverTestRequest withBgpPeers(String... bgpPeers) {
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
     * The BGP peers to place in the DOWN state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bgpPeers <p>
     *            The BGP peers to place in the DOWN state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBgpFailoverTestRequest withBgpPeers(java.util.Collection<String> bgpPeers) {
        setBgpPeers(bgpPeers);
        return this;
    }

    /**
     * <p>
     * The time in minutes that the virtual interface failover test will last.
     * </p>
     * <p>
     * Maximum value: 180 minutes (3 hours).
     * </p>
     * <p>
     * Default: 180 minutes (3 hours).
     * </p>
     *
     * @return <p>
     *         The time in minutes that the virtual interface failover test will
     *         last.
     *         </p>
     *         <p>
     *         Maximum value: 180 minutes (3 hours).
     *         </p>
     *         <p>
     *         Default: 180 minutes (3 hours).
     *         </p>
     */
    public Integer getTestDurationInMinutes() {
        return testDurationInMinutes;
    }

    /**
     * <p>
     * The time in minutes that the virtual interface failover test will last.
     * </p>
     * <p>
     * Maximum value: 180 minutes (3 hours).
     * </p>
     * <p>
     * Default: 180 minutes (3 hours).
     * </p>
     *
     * @param testDurationInMinutes <p>
     *            The time in minutes that the virtual interface failover test
     *            will last.
     *            </p>
     *            <p>
     *            Maximum value: 180 minutes (3 hours).
     *            </p>
     *            <p>
     *            Default: 180 minutes (3 hours).
     *            </p>
     */
    public void setTestDurationInMinutes(Integer testDurationInMinutes) {
        this.testDurationInMinutes = testDurationInMinutes;
    }

    /**
     * <p>
     * The time in minutes that the virtual interface failover test will last.
     * </p>
     * <p>
     * Maximum value: 180 minutes (3 hours).
     * </p>
     * <p>
     * Default: 180 minutes (3 hours).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param testDurationInMinutes <p>
     *            The time in minutes that the virtual interface failover test
     *            will last.
     *            </p>
     *            <p>
     *            Maximum value: 180 minutes (3 hours).
     *            </p>
     *            <p>
     *            Default: 180 minutes (3 hours).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBgpFailoverTestRequest withTestDurationInMinutes(Integer testDurationInMinutes) {
        this.testDurationInMinutes = testDurationInMinutes;
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
        if (getVirtualInterfaceId() != null)
            sb.append("virtualInterfaceId: " + getVirtualInterfaceId() + ",");
        if (getBgpPeers() != null)
            sb.append("bgpPeers: " + getBgpPeers() + ",");
        if (getTestDurationInMinutes() != null)
            sb.append("testDurationInMinutes: " + getTestDurationInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVirtualInterfaceId() == null) ? 0 : getVirtualInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getBgpPeers() == null) ? 0 : getBgpPeers().hashCode());
        hashCode = prime
                * hashCode
                + ((getTestDurationInMinutes() == null) ? 0 : getTestDurationInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartBgpFailoverTestRequest == false)
            return false;
        StartBgpFailoverTestRequest other = (StartBgpFailoverTestRequest) obj;

        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null)
            return false;
        if (other.getVirtualInterfaceId() != null
                && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false)
            return false;
        if (other.getBgpPeers() == null ^ this.getBgpPeers() == null)
            return false;
        if (other.getBgpPeers() != null && other.getBgpPeers().equals(this.getBgpPeers()) == false)
            return false;
        if (other.getTestDurationInMinutes() == null ^ this.getTestDurationInMinutes() == null)
            return false;
        if (other.getTestDurationInMinutes() != null
                && other.getTestDurationInMinutes().equals(this.getTestDurationInMinutes()) == false)
            return false;
        return true;
    }
}
