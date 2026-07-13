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

/**
 * <p>
 * Request for which contact failed to be generated.
 * </p>
 */
public class FailedRequest implements Serializable {
    /**
     * <p>
     * Request identifier provided in the API call in the ContactDataRequest to
     * create a contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 80<br/>
     */
    private String requestIdentifier;

    /**
     * <p>
     * Reason code for the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_ATTRIBUTE_KEY, INVALID_CUSTOMER_ENDPOINT,
     * INVALID_SYSTEM_ENDPOINT, INVALID_QUEUE, MISSING_CAMPAIGN,
     * MISSING_CUSTOMER_ENDPOINT, MISSING_QUEUE_ID_AND_SYSTEM_ENDPOINT,
     * REQUEST_THROTTLED, IDEMPOTENCY_EXCEPTION, INTERNAL_ERROR
     */
    private String failureReasonCode;

    /**
     * <p>
     * Why the request to create a contact failed.
     * </p>
     */
    private String failureReasonMessage;

    /**
     * <p>
     * Request identifier provided in the API call in the ContactDataRequest to
     * create a contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 80<br/>
     *
     * @return <p>
     *         Request identifier provided in the API call in the
     *         ContactDataRequest to create a contact.
     *         </p>
     */
    public String getRequestIdentifier() {
        return requestIdentifier;
    }

    /**
     * <p>
     * Request identifier provided in the API call in the ContactDataRequest to
     * create a contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 80<br/>
     *
     * @param requestIdentifier <p>
     *            Request identifier provided in the API call in the
     *            ContactDataRequest to create a contact.
     *            </p>
     */
    public void setRequestIdentifier(String requestIdentifier) {
        this.requestIdentifier = requestIdentifier;
    }

    /**
     * <p>
     * Request identifier provided in the API call in the ContactDataRequest to
     * create a contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 80<br/>
     *
     * @param requestIdentifier <p>
     *            Request identifier provided in the API call in the
     *            ContactDataRequest to create a contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FailedRequest withRequestIdentifier(String requestIdentifier) {
        this.requestIdentifier = requestIdentifier;
        return this;
    }

    /**
     * <p>
     * Reason code for the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_ATTRIBUTE_KEY, INVALID_CUSTOMER_ENDPOINT,
     * INVALID_SYSTEM_ENDPOINT, INVALID_QUEUE, MISSING_CAMPAIGN,
     * MISSING_CUSTOMER_ENDPOINT, MISSING_QUEUE_ID_AND_SYSTEM_ENDPOINT,
     * REQUEST_THROTTLED, IDEMPOTENCY_EXCEPTION, INTERNAL_ERROR
     *
     * @return <p>
     *         Reason code for the failure.
     *         </p>
     * @see FailureReasonCode
     */
    public String getFailureReasonCode() {
        return failureReasonCode;
    }

    /**
     * <p>
     * Reason code for the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_ATTRIBUTE_KEY, INVALID_CUSTOMER_ENDPOINT,
     * INVALID_SYSTEM_ENDPOINT, INVALID_QUEUE, MISSING_CAMPAIGN,
     * MISSING_CUSTOMER_ENDPOINT, MISSING_QUEUE_ID_AND_SYSTEM_ENDPOINT,
     * REQUEST_THROTTLED, IDEMPOTENCY_EXCEPTION, INTERNAL_ERROR
     *
     * @param failureReasonCode <p>
     *            Reason code for the failure.
     *            </p>
     * @see FailureReasonCode
     */
    public void setFailureReasonCode(String failureReasonCode) {
        this.failureReasonCode = failureReasonCode;
    }

    /**
     * <p>
     * Reason code for the failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_ATTRIBUTE_KEY, INVALID_CUSTOMER_ENDPOINT,
     * INVALID_SYSTEM_ENDPOINT, INVALID_QUEUE, MISSING_CAMPAIGN,
     * MISSING_CUSTOMER_ENDPOINT, MISSING_QUEUE_ID_AND_SYSTEM_ENDPOINT,
     * REQUEST_THROTTLED, IDEMPOTENCY_EXCEPTION, INTERNAL_ERROR
     *
     * @param failureReasonCode <p>
     *            Reason code for the failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FailureReasonCode
     */
    public FailedRequest withFailureReasonCode(String failureReasonCode) {
        this.failureReasonCode = failureReasonCode;
        return this;
    }

    /**
     * <p>
     * Reason code for the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_ATTRIBUTE_KEY, INVALID_CUSTOMER_ENDPOINT,
     * INVALID_SYSTEM_ENDPOINT, INVALID_QUEUE, MISSING_CAMPAIGN,
     * MISSING_CUSTOMER_ENDPOINT, MISSING_QUEUE_ID_AND_SYSTEM_ENDPOINT,
     * REQUEST_THROTTLED, IDEMPOTENCY_EXCEPTION, INTERNAL_ERROR
     *
     * @param failureReasonCode <p>
     *            Reason code for the failure.
     *            </p>
     * @see FailureReasonCode
     */
    public void setFailureReasonCode(FailureReasonCode failureReasonCode) {
        this.failureReasonCode = failureReasonCode.toString();
    }

    /**
     * <p>
     * Reason code for the failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_ATTRIBUTE_KEY, INVALID_CUSTOMER_ENDPOINT,
     * INVALID_SYSTEM_ENDPOINT, INVALID_QUEUE, MISSING_CAMPAIGN,
     * MISSING_CUSTOMER_ENDPOINT, MISSING_QUEUE_ID_AND_SYSTEM_ENDPOINT,
     * REQUEST_THROTTLED, IDEMPOTENCY_EXCEPTION, INTERNAL_ERROR
     *
     * @param failureReasonCode <p>
     *            Reason code for the failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FailureReasonCode
     */
    public FailedRequest withFailureReasonCode(FailureReasonCode failureReasonCode) {
        this.failureReasonCode = failureReasonCode.toString();
        return this;
    }

    /**
     * <p>
     * Why the request to create a contact failed.
     * </p>
     *
     * @return <p>
     *         Why the request to create a contact failed.
     *         </p>
     */
    public String getFailureReasonMessage() {
        return failureReasonMessage;
    }

    /**
     * <p>
     * Why the request to create a contact failed.
     * </p>
     *
     * @param failureReasonMessage <p>
     *            Why the request to create a contact failed.
     *            </p>
     */
    public void setFailureReasonMessage(String failureReasonMessage) {
        this.failureReasonMessage = failureReasonMessage;
    }

    /**
     * <p>
     * Why the request to create a contact failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureReasonMessage <p>
     *            Why the request to create a contact failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FailedRequest withFailureReasonMessage(String failureReasonMessage) {
        this.failureReasonMessage = failureReasonMessage;
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
        if (getRequestIdentifier() != null)
            sb.append("RequestIdentifier: " + getRequestIdentifier() + ",");
        if (getFailureReasonCode() != null)
            sb.append("FailureReasonCode: " + getFailureReasonCode() + ",");
        if (getFailureReasonMessage() != null)
            sb.append("FailureReasonMessage: " + getFailureReasonMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRequestIdentifier() == null) ? 0 : getRequestIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReasonCode() == null) ? 0 : getFailureReasonCode().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReasonMessage() == null) ? 0 : getFailureReasonMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailedRequest == false)
            return false;
        FailedRequest other = (FailedRequest) obj;

        if (other.getRequestIdentifier() == null ^ this.getRequestIdentifier() == null)
            return false;
        if (other.getRequestIdentifier() != null
                && other.getRequestIdentifier().equals(this.getRequestIdentifier()) == false)
            return false;
        if (other.getFailureReasonCode() == null ^ this.getFailureReasonCode() == null)
            return false;
        if (other.getFailureReasonCode() != null
                && other.getFailureReasonCode().equals(this.getFailureReasonCode()) == false)
            return false;
        if (other.getFailureReasonMessage() == null ^ this.getFailureReasonMessage() == null)
            return false;
        if (other.getFailureReasonMessage() != null
                && other.getFailureReasonMessage().equals(this.getFailureReasonMessage()) == false)
            return false;
        return true;
    }
}
