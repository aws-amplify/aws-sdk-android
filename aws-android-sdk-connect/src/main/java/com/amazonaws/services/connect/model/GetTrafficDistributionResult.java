/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class GetTrafficDistributionResult implements Serializable {
    /**
     * <p>
     * The distribution of traffic between the instance and its replicas.
     * </p>
     */
    private TelephonyConfig telephonyConfig;

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or
     * the ARN if the API is being called in the Region where the traffic
     * distribution group was created. The ARN must be provided if the call is
     * from the replicated Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$<br/>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic distribution group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-us-gov):connect:[a-z]{2}-[a-z]+-[0-9]{1}:[0-
     * 9]{1,20}:traffic
     * -distribution-group/[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a
     * -f0-9]{4}-[a-f0-9]{12}$<br/>
     */
    private String arn;

    /**
     * <p>
     * The distribution of traffic between the instance and its replicas.
     * </p>
     *
     * @return <p>
     *         The distribution of traffic between the instance and its
     *         replicas.
     *         </p>
     */
    public TelephonyConfig getTelephonyConfig() {
        return telephonyConfig;
    }

    /**
     * <p>
     * The distribution of traffic between the instance and its replicas.
     * </p>
     *
     * @param telephonyConfig <p>
     *            The distribution of traffic between the instance and its
     *            replicas.
     *            </p>
     */
    public void setTelephonyConfig(TelephonyConfig telephonyConfig) {
        this.telephonyConfig = telephonyConfig;
    }

    /**
     * <p>
     * The distribution of traffic between the instance and its replicas.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param telephonyConfig <p>
     *            The distribution of traffic between the instance and its
     *            replicas.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTrafficDistributionResult withTelephonyConfig(TelephonyConfig telephonyConfig) {
        this.telephonyConfig = telephonyConfig;
        return this;
    }

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or
     * the ARN if the API is being called in the Region where the traffic
     * distribution group was created. The ARN must be provided if the call is
     * from the replicated Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$<br/>
     *
     * @return <p>
     *         The identifier of the traffic distribution group. This can be the
     *         ID or the ARN if the API is being called in the Region where the
     *         traffic distribution group was created. The ARN must be provided
     *         if the call is from the replicated Region.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or
     * the ARN if the API is being called in the Region where the traffic
     * distribution group was created. The ARN must be provided if the call is
     * from the replicated Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$<br/>
     *
     * @param id <p>
     *            The identifier of the traffic distribution group. This can be
     *            the ID or the ARN if the API is being called in the Region
     *            where the traffic distribution group was created. The ARN must
     *            be provided if the call is from the replicated Region.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or
     * the ARN if the API is being called in the Region where the traffic
     * distribution group was created. The ARN must be provided if the call is
     * from the replicated Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$<br/>
     *
     * @param id <p>
     *            The identifier of the traffic distribution group. This can be
     *            the ID or the ARN if the API is being called in the Region
     *            where the traffic distribution group was created. The ARN must
     *            be provided if the call is from the replicated Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTrafficDistributionResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic distribution group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-us-gov):connect:[a-z]{2}-[a-z]+-[0-9]{1}:[0-
     * 9]{1,20}:traffic
     * -distribution-group/[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a
     * -f0-9]{4}-[a-f0-9]{12}$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the traffic distribution group.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic distribution group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-us-gov):connect:[a-z]{2}-[a-z]+-[0-9]{1}:[0-
     * 9]{1,20}:traffic
     * -distribution-group/[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a
     * -f0-9]{4}-[a-f0-9]{12}$<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the traffic distribution
     *            group.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic distribution group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-us-gov):connect:[a-z]{2}-[a-z]+-[0-9]{1}:[0-
     * 9]{1,20}:traffic
     * -distribution-group/[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a
     * -f0-9]{4}-[a-f0-9]{12}$<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the traffic distribution
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTrafficDistributionResult withArn(String arn) {
        this.arn = arn;
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
        if (getTelephonyConfig() != null)
            sb.append("TelephonyConfig: " + getTelephonyConfig() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTelephonyConfig() == null) ? 0 : getTelephonyConfig().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTrafficDistributionResult == false)
            return false;
        GetTrafficDistributionResult other = (GetTrafficDistributionResult) obj;

        if (other.getTelephonyConfig() == null ^ this.getTelephonyConfig() == null)
            return false;
        if (other.getTelephonyConfig() != null
                && other.getTelephonyConfig().equals(this.getTelephonyConfig()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }
}
