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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modify the auto-placement setting of a Dedicated Host. When auto-placement is
 * enabled, any instances that you launch with a tenancy of <code>host</code>
 * but without a specific host ID are placed onto any available Dedicated Host
 * in your account that has auto-placement enabled. When auto-placement is
 * disabled, you need to provide a host ID to have the instance launch onto a
 * specific host. If no host ID is provided, the instance is launched onto a
 * suitable host with auto-placement enabled.
 * </p>
 * <p>
 * You can also use this API action to modify a Dedicated Host to support either
 * multiple instance types in an instance family, or to support a specific
 * instance type only.
 * </p>
 */
public class ModifyHostsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specify whether to enable or disable auto-placement.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     */
    private String autoPlacement;

    /**
     * <p>
     * The IDs of the Dedicated Hosts to modify.
     * </p>
     */
    private java.util.List<String> hostIds;

    /**
     * <p>
     * Indicates whether to enable or disable host recovery for the Dedicated
     * Host. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"
     * > Host Recovery</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     */
    private String hostRecovery;

    /**
     * <p>
     * Specifies the instance type to be supported by the Dedicated Host.
     * Specify this parameter to modify a Dedicated Host to support only a
     * specific instance type.
     * </p>
     * <p>
     * If you want to modify a Dedicated Host to support multiple instance types
     * in its current instance family, omit this parameter and specify
     * <b>InstanceFamily</b> instead. You cannot specify <b>InstanceType</b> and
     * <b>InstanceFamily</b> in the same request.
     * </p>
     */
    private String instanceType;

    /**
     * <p>
     * Specifies the instance family to be supported by the Dedicated Host.
     * Specify this parameter to modify a Dedicated Host to support multiple
     * instance types within its current instance family.
     * </p>
     * <p>
     * If you want to modify a Dedicated Host to support a specific instance
     * type only, omit this parameter and specify <b>InstanceType</b> instead.
     * You cannot specify <b>InstanceFamily</b> and <b>InstanceType</b> in the
     * same request.
     * </p>
     */
    private String instanceFamily;

    /**
     * <p>
     * Specify whether to enable or disable auto-placement.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @return <p>
     *         Specify whether to enable or disable auto-placement.
     *         </p>
     * @see AutoPlacement
     */
    public String getAutoPlacement() {
        return autoPlacement;
    }

    /**
     * <p>
     * Specify whether to enable or disable auto-placement.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param autoPlacement <p>
     *            Specify whether to enable or disable auto-placement.
     *            </p>
     * @see AutoPlacement
     */
    public void setAutoPlacement(String autoPlacement) {
        this.autoPlacement = autoPlacement;
    }

    /**
     * <p>
     * Specify whether to enable or disable auto-placement.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param autoPlacement <p>
     *            Specify whether to enable or disable auto-placement.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoPlacement
     */
    public ModifyHostsRequest withAutoPlacement(String autoPlacement) {
        this.autoPlacement = autoPlacement;
        return this;
    }

    /**
     * <p>
     * Specify whether to enable or disable auto-placement.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param autoPlacement <p>
     *            Specify whether to enable or disable auto-placement.
     *            </p>
     * @see AutoPlacement
     */
    public void setAutoPlacement(AutoPlacement autoPlacement) {
        this.autoPlacement = autoPlacement.toString();
    }

    /**
     * <p>
     * Specify whether to enable or disable auto-placement.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param autoPlacement <p>
     *            Specify whether to enable or disable auto-placement.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoPlacement
     */
    public ModifyHostsRequest withAutoPlacement(AutoPlacement autoPlacement) {
        this.autoPlacement = autoPlacement.toString();
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts to modify.
     * </p>
     *
     * @return <p>
     *         The IDs of the Dedicated Hosts to modify.
     *         </p>
     */
    public java.util.List<String> getHostIds() {
        return hostIds;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts to modify.
     * </p>
     *
     * @param hostIds <p>
     *            The IDs of the Dedicated Hosts to modify.
     *            </p>
     */
    public void setHostIds(java.util.Collection<String> hostIds) {
        if (hostIds == null) {
            this.hostIds = null;
            return;
        }

        this.hostIds = new java.util.ArrayList<String>(hostIds);
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostIds <p>
     *            The IDs of the Dedicated Hosts to modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyHostsRequest withHostIds(String... hostIds) {
        if (getHostIds() == null) {
            this.hostIds = new java.util.ArrayList<String>(hostIds.length);
        }
        for (String value : hostIds) {
            this.hostIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostIds <p>
     *            The IDs of the Dedicated Hosts to modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyHostsRequest withHostIds(java.util.Collection<String> hostIds) {
        setHostIds(hostIds);
        return this;
    }

    /**
     * <p>
     * Indicates whether to enable or disable host recovery for the Dedicated
     * Host. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"
     * > Host Recovery</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @return <p>
     *         Indicates whether to enable or disable host recovery for the
     *         Dedicated Host. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"
     *         > Host Recovery</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     *         </p>
     * @see HostRecovery
     */
    public String getHostRecovery() {
        return hostRecovery;
    }

    /**
     * <p>
     * Indicates whether to enable or disable host recovery for the Dedicated
     * Host. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"
     * > Host Recovery</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param hostRecovery <p>
     *            Indicates whether to enable or disable host recovery for the
     *            Dedicated Host. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"
     *            > Host Recovery</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     * @see HostRecovery
     */
    public void setHostRecovery(String hostRecovery) {
        this.hostRecovery = hostRecovery;
    }

    /**
     * <p>
     * Indicates whether to enable or disable host recovery for the Dedicated
     * Host. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"
     * > Host Recovery</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param hostRecovery <p>
     *            Indicates whether to enable or disable host recovery for the
     *            Dedicated Host. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"
     *            > Host Recovery</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HostRecovery
     */
    public ModifyHostsRequest withHostRecovery(String hostRecovery) {
        this.hostRecovery = hostRecovery;
        return this;
    }

    /**
     * <p>
     * Indicates whether to enable or disable host recovery for the Dedicated
     * Host. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"
     * > Host Recovery</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param hostRecovery <p>
     *            Indicates whether to enable or disable host recovery for the
     *            Dedicated Host. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"
     *            > Host Recovery</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     * @see HostRecovery
     */
    public void setHostRecovery(HostRecovery hostRecovery) {
        this.hostRecovery = hostRecovery.toString();
    }

    /**
     * <p>
     * Indicates whether to enable or disable host recovery for the Dedicated
     * Host. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"
     * > Host Recovery</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param hostRecovery <p>
     *            Indicates whether to enable or disable host recovery for the
     *            Dedicated Host. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"
     *            > Host Recovery</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HostRecovery
     */
    public ModifyHostsRequest withHostRecovery(HostRecovery hostRecovery) {
        this.hostRecovery = hostRecovery.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the instance type to be supported by the Dedicated Host.
     * Specify this parameter to modify a Dedicated Host to support only a
     * specific instance type.
     * </p>
     * <p>
     * If you want to modify a Dedicated Host to support multiple instance types
     * in its current instance family, omit this parameter and specify
     * <b>InstanceFamily</b> instead. You cannot specify <b>InstanceType</b> and
     * <b>InstanceFamily</b> in the same request.
     * </p>
     *
     * @return <p>
     *         Specifies the instance type to be supported by the Dedicated
     *         Host. Specify this parameter to modify a Dedicated Host to
     *         support only a specific instance type.
     *         </p>
     *         <p>
     *         If you want to modify a Dedicated Host to support multiple
     *         instance types in its current instance family, omit this
     *         parameter and specify <b>InstanceFamily</b> instead. You cannot
     *         specify <b>InstanceType</b> and <b>InstanceFamily</b> in the same
     *         request.
     *         </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * Specifies the instance type to be supported by the Dedicated Host.
     * Specify this parameter to modify a Dedicated Host to support only a
     * specific instance type.
     * </p>
     * <p>
     * If you want to modify a Dedicated Host to support multiple instance types
     * in its current instance family, omit this parameter and specify
     * <b>InstanceFamily</b> instead. You cannot specify <b>InstanceType</b> and
     * <b>InstanceFamily</b> in the same request.
     * </p>
     *
     * @param instanceType <p>
     *            Specifies the instance type to be supported by the Dedicated
     *            Host. Specify this parameter to modify a Dedicated Host to
     *            support only a specific instance type.
     *            </p>
     *            <p>
     *            If you want to modify a Dedicated Host to support multiple
     *            instance types in its current instance family, omit this
     *            parameter and specify <b>InstanceFamily</b> instead. You
     *            cannot specify <b>InstanceType</b> and <b>InstanceFamily</b>
     *            in the same request.
     *            </p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * Specifies the instance type to be supported by the Dedicated Host.
     * Specify this parameter to modify a Dedicated Host to support only a
     * specific instance type.
     * </p>
     * <p>
     * If you want to modify a Dedicated Host to support multiple instance types
     * in its current instance family, omit this parameter and specify
     * <b>InstanceFamily</b> instead. You cannot specify <b>InstanceType</b> and
     * <b>InstanceFamily</b> in the same request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceType <p>
     *            Specifies the instance type to be supported by the Dedicated
     *            Host. Specify this parameter to modify a Dedicated Host to
     *            support only a specific instance type.
     *            </p>
     *            <p>
     *            If you want to modify a Dedicated Host to support multiple
     *            instance types in its current instance family, omit this
     *            parameter and specify <b>InstanceFamily</b> instead. You
     *            cannot specify <b>InstanceType</b> and <b>InstanceFamily</b>
     *            in the same request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyHostsRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * Specifies the instance family to be supported by the Dedicated Host.
     * Specify this parameter to modify a Dedicated Host to support multiple
     * instance types within its current instance family.
     * </p>
     * <p>
     * If you want to modify a Dedicated Host to support a specific instance
     * type only, omit this parameter and specify <b>InstanceType</b> instead.
     * You cannot specify <b>InstanceFamily</b> and <b>InstanceType</b> in the
     * same request.
     * </p>
     *
     * @return <p>
     *         Specifies the instance family to be supported by the Dedicated
     *         Host. Specify this parameter to modify a Dedicated Host to
     *         support multiple instance types within its current instance
     *         family.
     *         </p>
     *         <p>
     *         If you want to modify a Dedicated Host to support a specific
     *         instance type only, omit this parameter and specify
     *         <b>InstanceType</b> instead. You cannot specify
     *         <b>InstanceFamily</b> and <b>InstanceType</b> in the same
     *         request.
     *         </p>
     */
    public String getInstanceFamily() {
        return instanceFamily;
    }

    /**
     * <p>
     * Specifies the instance family to be supported by the Dedicated Host.
     * Specify this parameter to modify a Dedicated Host to support multiple
     * instance types within its current instance family.
     * </p>
     * <p>
     * If you want to modify a Dedicated Host to support a specific instance
     * type only, omit this parameter and specify <b>InstanceType</b> instead.
     * You cannot specify <b>InstanceFamily</b> and <b>InstanceType</b> in the
     * same request.
     * </p>
     *
     * @param instanceFamily <p>
     *            Specifies the instance family to be supported by the Dedicated
     *            Host. Specify this parameter to modify a Dedicated Host to
     *            support multiple instance types within its current instance
     *            family.
     *            </p>
     *            <p>
     *            If you want to modify a Dedicated Host to support a specific
     *            instance type only, omit this parameter and specify
     *            <b>InstanceType</b> instead. You cannot specify
     *            <b>InstanceFamily</b> and <b>InstanceType</b> in the same
     *            request.
     *            </p>
     */
    public void setInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
    }

    /**
     * <p>
     * Specifies the instance family to be supported by the Dedicated Host.
     * Specify this parameter to modify a Dedicated Host to support multiple
     * instance types within its current instance family.
     * </p>
     * <p>
     * If you want to modify a Dedicated Host to support a specific instance
     * type only, omit this parameter and specify <b>InstanceType</b> instead.
     * You cannot specify <b>InstanceFamily</b> and <b>InstanceType</b> in the
     * same request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceFamily <p>
     *            Specifies the instance family to be supported by the Dedicated
     *            Host. Specify this parameter to modify a Dedicated Host to
     *            support multiple instance types within its current instance
     *            family.
     *            </p>
     *            <p>
     *            If you want to modify a Dedicated Host to support a specific
     *            instance type only, omit this parameter and specify
     *            <b>InstanceType</b> instead. You cannot specify
     *            <b>InstanceFamily</b> and <b>InstanceType</b> in the same
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyHostsRequest withInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
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
        if (getAutoPlacement() != null)
            sb.append("AutoPlacement: " + getAutoPlacement() + ",");
        if (getHostIds() != null)
            sb.append("HostIds: " + getHostIds() + ",");
        if (getHostRecovery() != null)
            sb.append("HostRecovery: " + getHostRecovery() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getInstanceFamily() != null)
            sb.append("InstanceFamily: " + getInstanceFamily());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAutoPlacement() == null) ? 0 : getAutoPlacement().hashCode());
        hashCode = prime * hashCode + ((getHostIds() == null) ? 0 : getHostIds().hashCode());
        hashCode = prime * hashCode
                + ((getHostRecovery() == null) ? 0 : getHostRecovery().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceFamily() == null) ? 0 : getInstanceFamily().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyHostsRequest == false)
            return false;
        ModifyHostsRequest other = (ModifyHostsRequest) obj;

        if (other.getAutoPlacement() == null ^ this.getAutoPlacement() == null)
            return false;
        if (other.getAutoPlacement() != null
                && other.getAutoPlacement().equals(this.getAutoPlacement()) == false)
            return false;
        if (other.getHostIds() == null ^ this.getHostIds() == null)
            return false;
        if (other.getHostIds() != null && other.getHostIds().equals(this.getHostIds()) == false)
            return false;
        if (other.getHostRecovery() == null ^ this.getHostRecovery() == null)
            return false;
        if (other.getHostRecovery() != null
                && other.getHostRecovery().equals(this.getHostRecovery()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInstanceFamily() == null ^ this.getInstanceFamily() == null)
            return false;
        if (other.getInstanceFamily() != null
                && other.getInstanceFamily().equals(this.getInstanceFamily()) == false)
            return false;
        return true;
    }
}
