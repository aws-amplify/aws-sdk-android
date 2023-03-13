/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Replicates an Amazon Connect instance in the specified Amazon Web Services
 * Region.
 * </p>
 * <p>
 * For more information about replicating an Amazon Connect instance, see <a
 * href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/create-replica-connect-instance.html"
 * >Create a replica of your existing Amazon Connect instance</a> in the
 * <i>Amazon Connect Administrator Guide</i>.
 * </p>
 */
public class ReplicateInstanceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance. You can provide the <code>InstanceId</code>, or the entire ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     * <b>Pattern:
     * </b>^(arn:(aws|aws-us-gov):connect:[a-z]{2}-[a-z]+-[0-9]{1}:[0
     * -9]{1,20}:instance
     * /)?[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The Amazon Web Services Region where to replicate the Amazon Connect
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 31<br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     */
    private String replicaRegion;

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The alias for the replicated instance. The <code>ReplicaAlias</code> must
     * be unique.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 45<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*$<br/>
     */
    private String replicaAlias;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance. You can provide the <code>InstanceId</code>, or the entire ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     * <b>Pattern:
     * </b>^(arn:(aws|aws-us-gov):connect:[a-z]{2}-[a-z]+-[0-9]{1}:[0
     * -9]{1,20}:instance
     * /)?[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *         >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *         the instance. You can provide the <code>InstanceId</code>, or the
     *         entire ARN.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance. You can provide the <code>InstanceId</code>, or the entire ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     * <b>Pattern:
     * </b>^(arn:(aws|aws-us-gov):connect:[a-z]{2}-[a-z]+-[0-9]{1}:[0
     * -9]{1,20}:instance
     * /)?[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance. You can provide the <code>InstanceId</code>, or
     *            the entire ARN.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance. You can provide the <code>InstanceId</code>, or the entire ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     * <b>Pattern:
     * </b>^(arn:(aws|aws-us-gov):connect:[a-z]{2}-[a-z]+-[0-9]{1}:[0
     * -9]{1,20}:instance
     * /)?[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance. You can provide the <code>InstanceId</code>, or
     *            the entire ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicateInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region where to replicate the Amazon Connect
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 31<br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     *
     * @return <p>
     *         The Amazon Web Services Region where to replicate the Amazon
     *         Connect instance.
     *         </p>
     */
    public String getReplicaRegion() {
        return replicaRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region where to replicate the Amazon Connect
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 31<br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     *
     * @param replicaRegion <p>
     *            The Amazon Web Services Region where to replicate the Amazon
     *            Connect instance.
     *            </p>
     */
    public void setReplicaRegion(String replicaRegion) {
        this.replicaRegion = replicaRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region where to replicate the Amazon Connect
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 31<br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     *
     * @param replicaRegion <p>
     *            The Amazon Web Services Region where to replicate the Amazon
     *            Connect instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicateInstanceRequest withReplicaRegion(String replicaRegion) {
        this.replicaRegion = replicaRegion;
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         A unique, case-sensitive identifier that you provide to ensure
     *         the idempotency of the request. If not provided, the Amazon Web
     *         Services SDK populates this field. For more information about
     *         idempotency, see <a href=
     *         "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     *         >Making retries safe with idempotent APIs</a>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. If not provided, the Amazon
     *            Web Services SDK populates this field. For more information
     *            about idempotency, see <a href=
     *            "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     *            >Making retries safe with idempotent APIs</a>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. If not provided, the Amazon
     *            Web Services SDK populates this field. For more information
     *            about idempotency, see <a href=
     *            "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     *            >Making retries safe with idempotent APIs</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicateInstanceRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The alias for the replicated instance. The <code>ReplicaAlias</code> must
     * be unique.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 45<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*$<br/>
     *
     * @return <p>
     *         The alias for the replicated instance. The
     *         <code>ReplicaAlias</code> must be unique.
     *         </p>
     */
    public String getReplicaAlias() {
        return replicaAlias;
    }

    /**
     * <p>
     * The alias for the replicated instance. The <code>ReplicaAlias</code> must
     * be unique.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 45<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*$<br/>
     *
     * @param replicaAlias <p>
     *            The alias for the replicated instance. The
     *            <code>ReplicaAlias</code> must be unique.
     *            </p>
     */
    public void setReplicaAlias(String replicaAlias) {
        this.replicaAlias = replicaAlias;
    }

    /**
     * <p>
     * The alias for the replicated instance. The <code>ReplicaAlias</code> must
     * be unique.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 45<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*$<br/>
     *
     * @param replicaAlias <p>
     *            The alias for the replicated instance. The
     *            <code>ReplicaAlias</code> must be unique.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicateInstanceRequest withReplicaAlias(String replicaAlias) {
        this.replicaAlias = replicaAlias;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getReplicaRegion() != null)
            sb.append("ReplicaRegion: " + getReplicaRegion() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getReplicaAlias() != null)
            sb.append("ReplicaAlias: " + getReplicaAlias());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getReplicaRegion() == null) ? 0 : getReplicaRegion().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getReplicaAlias() == null) ? 0 : getReplicaAlias().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicateInstanceRequest == false)
            return false;
        ReplicateInstanceRequest other = (ReplicateInstanceRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getReplicaRegion() == null ^ this.getReplicaRegion() == null)
            return false;
        if (other.getReplicaRegion() != null
                && other.getReplicaRegion().equals(this.getReplicaRegion()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getReplicaAlias() == null ^ this.getReplicaAlias() == null)
            return false;
        if (other.getReplicaAlias() != null
                && other.getReplicaAlias().equals(this.getReplicaAlias()) == false)
            return false;
        return true;
    }
}
