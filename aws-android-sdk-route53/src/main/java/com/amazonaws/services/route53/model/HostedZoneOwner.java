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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that identifies a hosted zone that a specified Amazon VPC is
 * associated with and the owner of the hosted zone. If there is a value for
 * <code>OwningAccount</code>, there is no value for <code>OwningService</code>,
 * and vice versa.
 * </p>
 */
public class HostedZoneOwner implements Serializable {
    /**
     * <p>
     * If the hosted zone was created by an AWS account, or was created by an
     * AWS service that creates hosted zones using the current account,
     * <code>OwningAccount</code> contains the account ID of that account. For
     * example, when you use AWS Cloud Map to create a hosted zone, Cloud Map
     * creates the hosted zone using the current AWS account.
     * </p>
     */
    private String owningAccount;

    /**
     * <p>
     * If an AWS service uses its own account to create a hosted zone and
     * associate the specified VPC with that hosted zone,
     * <code>OwningService</code> contains an abbreviation that identifies the
     * service. For example, if Amazon Elastic File System (Amazon EFS) created
     * a hosted zone and associated a VPC with the hosted zone, the value of
     * <code>OwningService</code> is <code>efs.amazonaws.com</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     */
    private String owningService;

    /**
     * <p>
     * If the hosted zone was created by an AWS account, or was created by an
     * AWS service that creates hosted zones using the current account,
     * <code>OwningAccount</code> contains the account ID of that account. For
     * example, when you use AWS Cloud Map to create a hosted zone, Cloud Map
     * creates the hosted zone using the current AWS account.
     * </p>
     *
     * @return <p>
     *         If the hosted zone was created by an AWS account, or was created
     *         by an AWS service that creates hosted zones using the current
     *         account, <code>OwningAccount</code> contains the account ID of
     *         that account. For example, when you use AWS Cloud Map to create a
     *         hosted zone, Cloud Map creates the hosted zone using the current
     *         AWS account.
     *         </p>
     */
    public String getOwningAccount() {
        return owningAccount;
    }

    /**
     * <p>
     * If the hosted zone was created by an AWS account, or was created by an
     * AWS service that creates hosted zones using the current account,
     * <code>OwningAccount</code> contains the account ID of that account. For
     * example, when you use AWS Cloud Map to create a hosted zone, Cloud Map
     * creates the hosted zone using the current AWS account.
     * </p>
     *
     * @param owningAccount <p>
     *            If the hosted zone was created by an AWS account, or was
     *            created by an AWS service that creates hosted zones using the
     *            current account, <code>OwningAccount</code> contains the
     *            account ID of that account. For example, when you use AWS
     *            Cloud Map to create a hosted zone, Cloud Map creates the
     *            hosted zone using the current AWS account.
     *            </p>
     */
    public void setOwningAccount(String owningAccount) {
        this.owningAccount = owningAccount;
    }

    /**
     * <p>
     * If the hosted zone was created by an AWS account, or was created by an
     * AWS service that creates hosted zones using the current account,
     * <code>OwningAccount</code> contains the account ID of that account. For
     * example, when you use AWS Cloud Map to create a hosted zone, Cloud Map
     * creates the hosted zone using the current AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param owningAccount <p>
     *            If the hosted zone was created by an AWS account, or was
     *            created by an AWS service that creates hosted zones using the
     *            current account, <code>OwningAccount</code> contains the
     *            account ID of that account. For example, when you use AWS
     *            Cloud Map to create a hosted zone, Cloud Map creates the
     *            hosted zone using the current AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostedZoneOwner withOwningAccount(String owningAccount) {
        this.owningAccount = owningAccount;
        return this;
    }

    /**
     * <p>
     * If an AWS service uses its own account to create a hosted zone and
     * associate the specified VPC with that hosted zone,
     * <code>OwningService</code> contains an abbreviation that identifies the
     * service. For example, if Amazon Elastic File System (Amazon EFS) created
     * a hosted zone and associated a VPC with the hosted zone, the value of
     * <code>OwningService</code> is <code>efs.amazonaws.com</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @return <p>
     *         If an AWS service uses its own account to create a hosted zone
     *         and associate the specified VPC with that hosted zone,
     *         <code>OwningService</code> contains an abbreviation that
     *         identifies the service. For example, if Amazon Elastic File
     *         System (Amazon EFS) created a hosted zone and associated a VPC
     *         with the hosted zone, the value of <code>OwningService</code> is
     *         <code>efs.amazonaws.com</code>.
     *         </p>
     */
    public String getOwningService() {
        return owningService;
    }

    /**
     * <p>
     * If an AWS service uses its own account to create a hosted zone and
     * associate the specified VPC with that hosted zone,
     * <code>OwningService</code> contains an abbreviation that identifies the
     * service. For example, if Amazon Elastic File System (Amazon EFS) created
     * a hosted zone and associated a VPC with the hosted zone, the value of
     * <code>OwningService</code> is <code>efs.amazonaws.com</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param owningService <p>
     *            If an AWS service uses its own account to create a hosted zone
     *            and associate the specified VPC with that hosted zone,
     *            <code>OwningService</code> contains an abbreviation that
     *            identifies the service. For example, if Amazon Elastic File
     *            System (Amazon EFS) created a hosted zone and associated a VPC
     *            with the hosted zone, the value of <code>OwningService</code>
     *            is <code>efs.amazonaws.com</code>.
     *            </p>
     */
    public void setOwningService(String owningService) {
        this.owningService = owningService;
    }

    /**
     * <p>
     * If an AWS service uses its own account to create a hosted zone and
     * associate the specified VPC with that hosted zone,
     * <code>OwningService</code> contains an abbreviation that identifies the
     * service. For example, if Amazon Elastic File System (Amazon EFS) created
     * a hosted zone and associated a VPC with the hosted zone, the value of
     * <code>OwningService</code> is <code>efs.amazonaws.com</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param owningService <p>
     *            If an AWS service uses its own account to create a hosted zone
     *            and associate the specified VPC with that hosted zone,
     *            <code>OwningService</code> contains an abbreviation that
     *            identifies the service. For example, if Amazon Elastic File
     *            System (Amazon EFS) created a hosted zone and associated a VPC
     *            with the hosted zone, the value of <code>OwningService</code>
     *            is <code>efs.amazonaws.com</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostedZoneOwner withOwningService(String owningService) {
        this.owningService = owningService;
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
        if (getOwningAccount() != null)
            sb.append("OwningAccount: " + getOwningAccount() + ",");
        if (getOwningService() != null)
            sb.append("OwningService: " + getOwningService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOwningAccount() == null) ? 0 : getOwningAccount().hashCode());
        hashCode = prime * hashCode
                + ((getOwningService() == null) ? 0 : getOwningService().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HostedZoneOwner == false)
            return false;
        HostedZoneOwner other = (HostedZoneOwner) obj;

        if (other.getOwningAccount() == null ^ this.getOwningAccount() == null)
            return false;
        if (other.getOwningAccount() != null
                && other.getOwningAccount().equals(this.getOwningAccount()) == false)
            return false;
        if (other.getOwningService() == null ^ this.getOwningService() == null)
            return false;
        if (other.getOwningService() != null
                && other.getOwningService().equals(this.getOwningService()) == false)
            return false;
        return true;
    }
}
