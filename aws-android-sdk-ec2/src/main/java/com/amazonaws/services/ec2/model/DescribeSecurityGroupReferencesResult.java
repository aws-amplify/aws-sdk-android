/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 */
public class DescribeSecurityGroupReferencesResult implements Serializable {

    /**
     * Information about the VPCs with the referencing security groups.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<SecurityGroupReference> securityGroupReferenceSet;

    /**
     * Information about the VPCs with the referencing security groups.
     *
     * @return Information about the VPCs with the referencing security groups.
     */
    public java.util.List<SecurityGroupReference> getSecurityGroupReferenceSet() {
        if (securityGroupReferenceSet == null) {
              securityGroupReferenceSet = new com.amazonaws.internal.ListWithAutoConstructFlag<SecurityGroupReference>();
              securityGroupReferenceSet.setAutoConstruct(true);
        }
        return securityGroupReferenceSet;
    }
    
    /**
     * Information about the VPCs with the referencing security groups.
     *
     * @param securityGroupReferenceSet Information about the VPCs with the referencing security groups.
     */
    public void setSecurityGroupReferenceSet(java.util.Collection<SecurityGroupReference> securityGroupReferenceSet) {
        if (securityGroupReferenceSet == null) {
            this.securityGroupReferenceSet = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<SecurityGroupReference> securityGroupReferenceSetCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SecurityGroupReference>(securityGroupReferenceSet.size());
        securityGroupReferenceSetCopy.addAll(securityGroupReferenceSet);
        this.securityGroupReferenceSet = securityGroupReferenceSetCopy;
    }
    
    /**
     * Information about the VPCs with the referencing security groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroupReferenceSet Information about the VPCs with the referencing security groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSecurityGroupReferencesResult withSecurityGroupReferenceSet(SecurityGroupReference... securityGroupReferenceSet) {
        if (getSecurityGroupReferenceSet() == null) setSecurityGroupReferenceSet(new java.util.ArrayList<SecurityGroupReference>(securityGroupReferenceSet.length));
        for (SecurityGroupReference value : securityGroupReferenceSet) {
            getSecurityGroupReferenceSet().add(value);
        }
        return this;
    }
    
    /**
     * Information about the VPCs with the referencing security groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroupReferenceSet Information about the VPCs with the referencing security groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSecurityGroupReferencesResult withSecurityGroupReferenceSet(java.util.Collection<SecurityGroupReference> securityGroupReferenceSet) {
        if (securityGroupReferenceSet == null) {
            this.securityGroupReferenceSet = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<SecurityGroupReference> securityGroupReferenceSetCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SecurityGroupReference>(securityGroupReferenceSet.size());
            securityGroupReferenceSetCopy.addAll(securityGroupReferenceSet);
            this.securityGroupReferenceSet = securityGroupReferenceSetCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSecurityGroupReferenceSet() != null) sb.append("SecurityGroupReferenceSet: " + getSecurityGroupReferenceSet() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSecurityGroupReferenceSet() == null) ? 0 : getSecurityGroupReferenceSet().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSecurityGroupReferencesResult == false) return false;
        DescribeSecurityGroupReferencesResult other = (DescribeSecurityGroupReferencesResult)obj;
        
        if (other.getSecurityGroupReferenceSet() == null ^ this.getSecurityGroupReferenceSet() == null) return false;
        if (other.getSecurityGroupReferenceSet() != null && other.getSecurityGroupReferenceSet().equals(this.getSecurityGroupReferenceSet()) == false) return false; 
        return true;
    }
    
}
    