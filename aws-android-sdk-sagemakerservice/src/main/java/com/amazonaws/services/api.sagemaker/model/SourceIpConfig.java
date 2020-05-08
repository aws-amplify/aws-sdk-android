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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * A list of IP address ranges (<a
 * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
 * >CIDRs</a>). Used to create an allow list of IP addresses for a private
 * workforce. For more information, see .
 * </p>
 */
public class SourceIpConfig implements Serializable {
    /**
     * <p>
     * A list of one to four <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     * >Classless Inter-Domain Routing</a> (CIDR) values.
     * </p>
     * <p>
     * Maximum: Four CIDR values
     * </p>
     * <note>
     * <p>
     * The following Length Constraints apply to individual CIDR values in the
     * CIDR value list.
     * </p>
     * </note>
     */
    private java.util.List<String> cidrs;

    /**
     * <p>
     * A list of one to four <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     * >Classless Inter-Domain Routing</a> (CIDR) values.
     * </p>
     * <p>
     * Maximum: Four CIDR values
     * </p>
     * <note>
     * <p>
     * The following Length Constraints apply to individual CIDR values in the
     * CIDR value list.
     * </p>
     * </note>
     *
     * @return <p>
     *         A list of one to four <a href=
     *         "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     *         >Classless Inter-Domain Routing</a> (CIDR) values.
     *         </p>
     *         <p>
     *         Maximum: Four CIDR values
     *         </p>
     *         <note>
     *         <p>
     *         The following Length Constraints apply to individual CIDR values
     *         in the CIDR value list.
     *         </p>
     *         </note>
     */
    public java.util.List<String> getCidrs() {
        return cidrs;
    }

    /**
     * <p>
     * A list of one to four <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     * >Classless Inter-Domain Routing</a> (CIDR) values.
     * </p>
     * <p>
     * Maximum: Four CIDR values
     * </p>
     * <note>
     * <p>
     * The following Length Constraints apply to individual CIDR values in the
     * CIDR value list.
     * </p>
     * </note>
     *
     * @param cidrs <p>
     *            A list of one to four <a href=
     *            "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     *            >Classless Inter-Domain Routing</a> (CIDR) values.
     *            </p>
     *            <p>
     *            Maximum: Four CIDR values
     *            </p>
     *            <note>
     *            <p>
     *            The following Length Constraints apply to individual CIDR
     *            values in the CIDR value list.
     *            </p>
     *            </note>
     */
    public void setCidrs(java.util.Collection<String> cidrs) {
        if (cidrs == null) {
            this.cidrs = null;
            return;
        }

        this.cidrs = new java.util.ArrayList<String>(cidrs);
    }

    /**
     * <p>
     * A list of one to four <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     * >Classless Inter-Domain Routing</a> (CIDR) values.
     * </p>
     * <p>
     * Maximum: Four CIDR values
     * </p>
     * <note>
     * <p>
     * The following Length Constraints apply to individual CIDR values in the
     * CIDR value list.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrs <p>
     *            A list of one to four <a href=
     *            "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     *            >Classless Inter-Domain Routing</a> (CIDR) values.
     *            </p>
     *            <p>
     *            Maximum: Four CIDR values
     *            </p>
     *            <note>
     *            <p>
     *            The following Length Constraints apply to individual CIDR
     *            values in the CIDR value list.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceIpConfig withCidrs(String... cidrs) {
        if (getCidrs() == null) {
            this.cidrs = new java.util.ArrayList<String>(cidrs.length);
        }
        for (String value : cidrs) {
            this.cidrs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of one to four <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     * >Classless Inter-Domain Routing</a> (CIDR) values.
     * </p>
     * <p>
     * Maximum: Four CIDR values
     * </p>
     * <note>
     * <p>
     * The following Length Constraints apply to individual CIDR values in the
     * CIDR value list.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrs <p>
     *            A list of one to four <a href=
     *            "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     *            >Classless Inter-Domain Routing</a> (CIDR) values.
     *            </p>
     *            <p>
     *            Maximum: Four CIDR values
     *            </p>
     *            <note>
     *            <p>
     *            The following Length Constraints apply to individual CIDR
     *            values in the CIDR value list.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceIpConfig withCidrs(java.util.Collection<String> cidrs) {
        setCidrs(cidrs);
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
        if (getCidrs() != null)
            sb.append("Cidrs: " + getCidrs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrs() == null) ? 0 : getCidrs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceIpConfig == false)
            return false;
        SourceIpConfig other = (SourceIpConfig) obj;

        if (other.getCidrs() == null ^ this.getCidrs() == null)
            return false;
        if (other.getCidrs() != null && other.getCidrs().equals(this.getCidrs()) == false)
            return false;
        return true;
    }
}
