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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This API is in preview release for Amazon Connect and is subject to change.
 * </p>
 * <p>
 * Updates routing priority and age on the contact (<b>QueuePriority</b> and
 * <b>QueueTimeAdjustmentInSeconds</b>). These properties can be used to change
 * a customer's position in the queue. For example, you can move a contact to
 * the back of the queue by setting a lower routing priority relative to other
 * contacts in queue; or you can move a contact to the front of the queue by
 * increasing the routing age which will make the contact look artificially
 * older and therefore higher up in the first-in-first-out routing order. Note
 * that adjusting the routing age of a contact affects only its position in
 * queue, and not its actual queue wait time as reported through metrics. These
 * properties can also be updated by using <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/change-routing-priority.html"
 * >the Set routing priority / age flow block</a>.
 * </p>
 */
public class UpdateContactRoutingDataRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String contactId;

    /**
     * <p>
     * The number of seconds to add or subtract from the contact's routing age.
     * Contacts are routed to agents on a first-come, first-serve basis. This
     * means that changing their amount of time in queue compared to others also
     * changes their position in queue.
     * </p>
     */
    private Integer queueTimeAdjustmentSeconds;

    /**
     * <p>
     * Priority of the contact in the queue. The default priority for new
     * contacts is 5. You can raise the priority of a contact compared to other
     * contacts in the queue by assigning them a higher priority, such as 1 or
     * 2.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 9223372036854775807<br/>
     */
    private Long queuePriority;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *         >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *         the instance.
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
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
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
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactRoutingDataRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier of the contact in this instance of Amazon Connect.
     *         </p>
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactId <p>
     *            The identifier of the contact in this instance of Amazon
     *            Connect.
     *            </p>
     */
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactId <p>
     *            The identifier of the contact in this instance of Amazon
     *            Connect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactRoutingDataRequest withContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }

    /**
     * <p>
     * The number of seconds to add or subtract from the contact's routing age.
     * Contacts are routed to agents on a first-come, first-serve basis. This
     * means that changing their amount of time in queue compared to others also
     * changes their position in queue.
     * </p>
     *
     * @return <p>
     *         The number of seconds to add or subtract from the contact's
     *         routing age. Contacts are routed to agents on a first-come,
     *         first-serve basis. This means that changing their amount of time
     *         in queue compared to others also changes their position in queue.
     *         </p>
     */
    public Integer getQueueTimeAdjustmentSeconds() {
        return queueTimeAdjustmentSeconds;
    }

    /**
     * <p>
     * The number of seconds to add or subtract from the contact's routing age.
     * Contacts are routed to agents on a first-come, first-serve basis. This
     * means that changing their amount of time in queue compared to others also
     * changes their position in queue.
     * </p>
     *
     * @param queueTimeAdjustmentSeconds <p>
     *            The number of seconds to add or subtract from the contact's
     *            routing age. Contacts are routed to agents on a first-come,
     *            first-serve basis. This means that changing their amount of
     *            time in queue compared to others also changes their position
     *            in queue.
     *            </p>
     */
    public void setQueueTimeAdjustmentSeconds(Integer queueTimeAdjustmentSeconds) {
        this.queueTimeAdjustmentSeconds = queueTimeAdjustmentSeconds;
    }

    /**
     * <p>
     * The number of seconds to add or subtract from the contact's routing age.
     * Contacts are routed to agents on a first-come, first-serve basis. This
     * means that changing their amount of time in queue compared to others also
     * changes their position in queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueTimeAdjustmentSeconds <p>
     *            The number of seconds to add or subtract from the contact's
     *            routing age. Contacts are routed to agents on a first-come,
     *            first-serve basis. This means that changing their amount of
     *            time in queue compared to others also changes their position
     *            in queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactRoutingDataRequest withQueueTimeAdjustmentSeconds(
            Integer queueTimeAdjustmentSeconds) {
        this.queueTimeAdjustmentSeconds = queueTimeAdjustmentSeconds;
        return this;
    }

    /**
     * <p>
     * Priority of the contact in the queue. The default priority for new
     * contacts is 5. You can raise the priority of a contact compared to other
     * contacts in the queue by assigning them a higher priority, such as 1 or
     * 2.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 9223372036854775807<br/>
     *
     * @return <p>
     *         Priority of the contact in the queue. The default priority for
     *         new contacts is 5. You can raise the priority of a contact
     *         compared to other contacts in the queue by assigning them a
     *         higher priority, such as 1 or 2.
     *         </p>
     */
    public Long getQueuePriority() {
        return queuePriority;
    }

    /**
     * <p>
     * Priority of the contact in the queue. The default priority for new
     * contacts is 5. You can raise the priority of a contact compared to other
     * contacts in the queue by assigning them a higher priority, such as 1 or
     * 2.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 9223372036854775807<br/>
     *
     * @param queuePriority <p>
     *            Priority of the contact in the queue. The default priority for
     *            new contacts is 5. You can raise the priority of a contact
     *            compared to other contacts in the queue by assigning them a
     *            higher priority, such as 1 or 2.
     *            </p>
     */
    public void setQueuePriority(Long queuePriority) {
        this.queuePriority = queuePriority;
    }

    /**
     * <p>
     * Priority of the contact in the queue. The default priority for new
     * contacts is 5. You can raise the priority of a contact compared to other
     * contacts in the queue by assigning them a higher priority, such as 1 or
     * 2.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 9223372036854775807<br/>
     *
     * @param queuePriority <p>
     *            Priority of the contact in the queue. The default priority for
     *            new contacts is 5. You can raise the priority of a contact
     *            compared to other contacts in the queue by assigning them a
     *            higher priority, such as 1 or 2.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactRoutingDataRequest withQueuePriority(Long queuePriority) {
        this.queuePriority = queuePriority;
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
        if (getContactId() != null)
            sb.append("ContactId: " + getContactId() + ",");
        if (getQueueTimeAdjustmentSeconds() != null)
            sb.append("QueueTimeAdjustmentSeconds: " + getQueueTimeAdjustmentSeconds() + ",");
        if (getQueuePriority() != null)
            sb.append("QueuePriority: " + getQueuePriority());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime
                * hashCode
                + ((getQueueTimeAdjustmentSeconds() == null) ? 0 : getQueueTimeAdjustmentSeconds()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getQueuePriority() == null) ? 0 : getQueuePriority().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateContactRoutingDataRequest == false)
            return false;
        UpdateContactRoutingDataRequest other = (UpdateContactRoutingDataRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null
                && other.getContactId().equals(this.getContactId()) == false)
            return false;
        if (other.getQueueTimeAdjustmentSeconds() == null
                ^ this.getQueueTimeAdjustmentSeconds() == null)
            return false;
        if (other.getQueueTimeAdjustmentSeconds() != null
                && other.getQueueTimeAdjustmentSeconds().equals(
                        this.getQueueTimeAdjustmentSeconds()) == false)
            return false;
        if (other.getQueuePriority() == null ^ this.getQueuePriority() == null)
            return false;
        if (other.getQueuePriority() != null
                && other.getQueuePriority().equals(this.getQueuePriority()) == false)
            return false;
        return true;
    }
}
