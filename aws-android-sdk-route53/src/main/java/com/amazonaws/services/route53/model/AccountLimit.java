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
 * A complex type that contains the type of limit that you specified in the
 * request and the current value for that limit.
 * </p>
 */
public class AccountLimit implements Serializable {
    /**
     * <p>
     * The limit that you requested. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MAX_HEALTH_CHECKS_BY_OWNER</b>: The maximum number of health checks
     * that you can create using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_HOSTED_ZONES_BY_OWNER</b>: The maximum number of hosted zones that
     * you can create using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_REUSABLE_DELEGATION_SETS_BY_OWNER</b>: The maximum number of
     * reusable delegation sets that you can create using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_TRAFFIC_POLICIES_BY_OWNER</b>: The maximum number of traffic
     * policies that you can create using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER</b>: The maximum number of
     * traffic policy instances that you can create using the current account.
     * (Traffic policy instances are referred to as traffic flow policy records
     * in the Amazon Route 53 console.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_HEALTH_CHECKS_BY_OWNER,
     * MAX_HOSTED_ZONES_BY_OWNER, MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER,
     * MAX_REUSABLE_DELEGATION_SETS_BY_OWNER, MAX_TRAFFIC_POLICIES_BY_OWNER
     */
    private String type;

    /**
     * <p>
     * The current value for the limit that is specified by <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AccountLimit.html#Route53-Type-AccountLimit-Type"
     * >Type</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long value;

    /**
     * <p>
     * The limit that you requested. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MAX_HEALTH_CHECKS_BY_OWNER</b>: The maximum number of health checks
     * that you can create using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_HOSTED_ZONES_BY_OWNER</b>: The maximum number of hosted zones that
     * you can create using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_REUSABLE_DELEGATION_SETS_BY_OWNER</b>: The maximum number of
     * reusable delegation sets that you can create using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_TRAFFIC_POLICIES_BY_OWNER</b>: The maximum number of traffic
     * policies that you can create using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER</b>: The maximum number of
     * traffic policy instances that you can create using the current account.
     * (Traffic policy instances are referred to as traffic flow policy records
     * in the Amazon Route 53 console.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_HEALTH_CHECKS_BY_OWNER,
     * MAX_HOSTED_ZONES_BY_OWNER, MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER,
     * MAX_REUSABLE_DELEGATION_SETS_BY_OWNER, MAX_TRAFFIC_POLICIES_BY_OWNER
     *
     * @return <p>
     *         The limit that you requested. Valid values include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>MAX_HEALTH_CHECKS_BY_OWNER</b>: The maximum number of health
     *         checks that you can create using the current account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MAX_HOSTED_ZONES_BY_OWNER</b>: The maximum number of hosted
     *         zones that you can create using the current account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MAX_REUSABLE_DELEGATION_SETS_BY_OWNER</b>: The maximum number
     *         of reusable delegation sets that you can create using the current
     *         account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MAX_TRAFFIC_POLICIES_BY_OWNER</b>: The maximum number of
     *         traffic policies that you can create using the current account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER</b>: The maximum number
     *         of traffic policy instances that you can create using the current
     *         account. (Traffic policy instances are referred to as traffic
     *         flow policy records in the Amazon Route 53 console.)
     *         </p>
     *         </li>
     *         </ul>
     * @see AccountLimitType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The limit that you requested. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MAX_HEALTH_CHECKS_BY_OWNER</b>: The maximum number of health checks
     * that you can create using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_HOSTED_ZONES_BY_OWNER</b>: The maximum number of hosted zones that
     * you can create using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_REUSABLE_DELEGATION_SETS_BY_OWNER</b>: The maximum number of
     * reusable delegation sets that you can create using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_TRAFFIC_POLICIES_BY_OWNER</b>: The maximum number of traffic
     * policies that you can create using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER</b>: The maximum number of
     * traffic policy instances that you can create using the current account.
     * (Traffic policy instances are referred to as traffic flow policy records
     * in the Amazon Route 53 console.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_HEALTH_CHECKS_BY_OWNER,
     * MAX_HOSTED_ZONES_BY_OWNER, MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER,
     * MAX_REUSABLE_DELEGATION_SETS_BY_OWNER, MAX_TRAFFIC_POLICIES_BY_OWNER
     *
     * @param type <p>
     *            The limit that you requested. Valid values include the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>MAX_HEALTH_CHECKS_BY_OWNER</b>: The maximum number of
     *            health checks that you can create using the current account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>MAX_HOSTED_ZONES_BY_OWNER</b>: The maximum number of hosted
     *            zones that you can create using the current account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>MAX_REUSABLE_DELEGATION_SETS_BY_OWNER</b>: The maximum
     *            number of reusable delegation sets that you can create using
     *            the current account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>MAX_TRAFFIC_POLICIES_BY_OWNER</b>: The maximum number of
     *            traffic policies that you can create using the current
     *            account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER</b>: The maximum
     *            number of traffic policy instances that you can create using
     *            the current account. (Traffic policy instances are referred to
     *            as traffic flow policy records in the Amazon Route 53
     *            console.)
     *            </p>
     *            </li>
     *            </ul>
     * @see AccountLimitType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The limit that you requested. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MAX_HEALTH_CHECKS_BY_OWNER</b>: The maximum number of health checks
     * that you can create using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_HOSTED_ZONES_BY_OWNER</b>: The maximum number of hosted zones that
     * you can create using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_REUSABLE_DELEGATION_SETS_BY_OWNER</b>: The maximum number of
     * reusable delegation sets that you can create using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_TRAFFIC_POLICIES_BY_OWNER</b>: The maximum number of traffic
     * policies that you can create using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER</b>: The maximum number of
     * traffic policy instances that you can create using the current account.
     * (Traffic policy instances are referred to as traffic flow policy records
     * in the Amazon Route 53 console.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_HEALTH_CHECKS_BY_OWNER,
     * MAX_HOSTED_ZONES_BY_OWNER, MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER,
     * MAX_REUSABLE_DELEGATION_SETS_BY_OWNER, MAX_TRAFFIC_POLICIES_BY_OWNER
     *
     * @param type <p>
     *            The limit that you requested. Valid values include the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>MAX_HEALTH_CHECKS_BY_OWNER</b>: The maximum number of
     *            health checks that you can create using the current account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>MAX_HOSTED_ZONES_BY_OWNER</b>: The maximum number of hosted
     *            zones that you can create using the current account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>MAX_REUSABLE_DELEGATION_SETS_BY_OWNER</b>: The maximum
     *            number of reusable delegation sets that you can create using
     *            the current account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>MAX_TRAFFIC_POLICIES_BY_OWNER</b>: The maximum number of
     *            traffic policies that you can create using the current
     *            account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER</b>: The maximum
     *            number of traffic policy instances that you can create using
     *            the current account. (Traffic policy instances are referred to
     *            as traffic flow policy records in the Amazon Route 53
     *            console.)
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccountLimitType
     */
    public AccountLimit withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The limit that you requested. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MAX_HEALTH_CHECKS_BY_OWNER</b>: The maximum number of health checks
     * that you can create using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_HOSTED_ZONES_BY_OWNER</b>: The maximum number of hosted zones that
     * you can create using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_REUSABLE_DELEGATION_SETS_BY_OWNER</b>: The maximum number of
     * reusable delegation sets that you can create using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_TRAFFIC_POLICIES_BY_OWNER</b>: The maximum number of traffic
     * policies that you can create using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER</b>: The maximum number of
     * traffic policy instances that you can create using the current account.
     * (Traffic policy instances are referred to as traffic flow policy records
     * in the Amazon Route 53 console.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_HEALTH_CHECKS_BY_OWNER,
     * MAX_HOSTED_ZONES_BY_OWNER, MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER,
     * MAX_REUSABLE_DELEGATION_SETS_BY_OWNER, MAX_TRAFFIC_POLICIES_BY_OWNER
     *
     * @param type <p>
     *            The limit that you requested. Valid values include the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>MAX_HEALTH_CHECKS_BY_OWNER</b>: The maximum number of
     *            health checks that you can create using the current account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>MAX_HOSTED_ZONES_BY_OWNER</b>: The maximum number of hosted
     *            zones that you can create using the current account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>MAX_REUSABLE_DELEGATION_SETS_BY_OWNER</b>: The maximum
     *            number of reusable delegation sets that you can create using
     *            the current account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>MAX_TRAFFIC_POLICIES_BY_OWNER</b>: The maximum number of
     *            traffic policies that you can create using the current
     *            account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER</b>: The maximum
     *            number of traffic policy instances that you can create using
     *            the current account. (Traffic policy instances are referred to
     *            as traffic flow policy records in the Amazon Route 53
     *            console.)
     *            </p>
     *            </li>
     *            </ul>
     * @see AccountLimitType
     */
    public void setType(AccountLimitType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The limit that you requested. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MAX_HEALTH_CHECKS_BY_OWNER</b>: The maximum number of health checks
     * that you can create using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_HOSTED_ZONES_BY_OWNER</b>: The maximum number of hosted zones that
     * you can create using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_REUSABLE_DELEGATION_SETS_BY_OWNER</b>: The maximum number of
     * reusable delegation sets that you can create using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_TRAFFIC_POLICIES_BY_OWNER</b>: The maximum number of traffic
     * policies that you can create using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER</b>: The maximum number of
     * traffic policy instances that you can create using the current account.
     * (Traffic policy instances are referred to as traffic flow policy records
     * in the Amazon Route 53 console.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_HEALTH_CHECKS_BY_OWNER,
     * MAX_HOSTED_ZONES_BY_OWNER, MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER,
     * MAX_REUSABLE_DELEGATION_SETS_BY_OWNER, MAX_TRAFFIC_POLICIES_BY_OWNER
     *
     * @param type <p>
     *            The limit that you requested. Valid values include the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>MAX_HEALTH_CHECKS_BY_OWNER</b>: The maximum number of
     *            health checks that you can create using the current account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>MAX_HOSTED_ZONES_BY_OWNER</b>: The maximum number of hosted
     *            zones that you can create using the current account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>MAX_REUSABLE_DELEGATION_SETS_BY_OWNER</b>: The maximum
     *            number of reusable delegation sets that you can create using
     *            the current account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>MAX_TRAFFIC_POLICIES_BY_OWNER</b>: The maximum number of
     *            traffic policies that you can create using the current
     *            account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER</b>: The maximum
     *            number of traffic policy instances that you can create using
     *            the current account. (Traffic policy instances are referred to
     *            as traffic flow policy records in the Amazon Route 53
     *            console.)
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccountLimitType
     */
    public AccountLimit withType(AccountLimitType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The current value for the limit that is specified by <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AccountLimit.html#Route53-Type-AccountLimit-Type"
     * >Type</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The current value for the limit that is specified by <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AccountLimit.html#Route53-Type-AccountLimit-Type"
     *         >Type</a>.
     *         </p>
     */
    public Long getValue() {
        return value;
    }

    /**
     * <p>
     * The current value for the limit that is specified by <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AccountLimit.html#Route53-Type-AccountLimit-Type"
     * >Type</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param value <p>
     *            The current value for the limit that is specified by <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AccountLimit.html#Route53-Type-AccountLimit-Type"
     *            >Type</a>.
     *            </p>
     */
    public void setValue(Long value) {
        this.value = value;
    }

    /**
     * <p>
     * The current value for the limit that is specified by <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AccountLimit.html#Route53-Type-AccountLimit-Type"
     * >Type</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param value <p>
     *            The current value for the limit that is specified by <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AccountLimit.html#Route53-Type-AccountLimit-Type"
     *            >Type</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccountLimit withValue(Long value) {
        this.value = value;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountLimit == false)
            return false;
        AccountLimit other = (AccountLimit) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
