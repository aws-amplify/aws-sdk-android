/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class ReplicateInstanceResult implements Serializable {
    /**
     * <p>
     * The identifier of the replicated instance. You can find the
     * <code>instanceId</code> in the ARN of the instance. The replicated
     * instance has the same identifier as the instance it was replicated from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicated instance.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The identifier of the replicated instance. You can find the
     * <code>instanceId</code> in the ARN of the instance. The replicated
     * instance has the same identifier as the instance it was replicated from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the replicated instance. You can find the
     *         <code>instanceId</code> in the ARN of the instance. The
     *         replicated instance has the same identifier as the instance it
     *         was replicated from.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the replicated instance. You can find the
     * <code>instanceId</code> in the ARN of the instance. The replicated
     * instance has the same identifier as the instance it was replicated from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param id <p>
     *            The identifier of the replicated instance. You can find the
     *            <code>instanceId</code> in the ARN of the instance. The
     *            replicated instance has the same identifier as the instance it
     *            was replicated from.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the replicated instance. You can find the
     * <code>instanceId</code> in the ARN of the instance. The replicated
     * instance has the same identifier as the instance it was replicated from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param id <p>
     *            The identifier of the replicated instance. You can find the
     *            <code>instanceId</code> in the ARN of the instance. The
     *            replicated instance has the same identifier as the instance it
     *            was replicated from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicateInstanceResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicated instance.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the replicated instance.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicated instance.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the replicated instance.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicated instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the replicated instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicateInstanceResult withArn(String arn) {
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

        if (obj instanceof ReplicateInstanceResult == false)
            return false;
        ReplicateInstanceResult other = (ReplicateInstanceResult) obj;

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
