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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves the results of a specific Face Liveness session. It requires the
 * <code>sessionId</code> as input, which was created using
 * <code>CreateFaceLivenessSession</code>. Returns the corresponding Face
 * Liveness confidence score, a reference image that includes a face bounding
 * box, and audit images that also contain face bounding boxes. The Face
 * Liveness confidence score ranges from 0 to 100.
 * </p>
 * <p>
 * The number of audit images returned by
 * <code>GetFaceLivenessSessionResults</code> is defined by the
 * <code>AuditImagesLimit</code> paramater when calling
 * <code>CreateFaceLivenessSession</code>. Reference images are always returned
 * when possible.
 * </p>
 */
public class GetFaceLivenessSessionResultsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A unique 128-bit UUID. This is used to uniquely identify the session and
     * also acts as an idempotency token for all operations associated with the
     * session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     */
    private String sessionId;

    /**
     * <p>
     * A unique 128-bit UUID. This is used to uniquely identify the session and
     * also acts as an idempotency token for all operations associated with the
     * session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @return <p>
     *         A unique 128-bit UUID. This is used to uniquely identify the
     *         session and also acts as an idempotency token for all operations
     *         associated with the session.
     *         </p>
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * <p>
     * A unique 128-bit UUID. This is used to uniquely identify the session and
     * also acts as an idempotency token for all operations associated with the
     * session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param sessionId <p>
     *            A unique 128-bit UUID. This is used to uniquely identify the
     *            session and also acts as an idempotency token for all
     *            operations associated with the session.
     *            </p>
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * A unique 128-bit UUID. This is used to uniquely identify the session and
     * also acts as an idempotency token for all operations associated with the
     * session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param sessionId <p>
     *            A unique 128-bit UUID. This is used to uniquely identify the
     *            session and also acts as an idempotency token for all
     *            operations associated with the session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFaceLivenessSessionResultsRequest withSessionId(String sessionId) {
        this.sessionId = sessionId;
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
        if (getSessionId() != null)
            sb.append("SessionId: " + getSessionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFaceLivenessSessionResultsRequest == false)
            return false;
        GetFaceLivenessSessionResultsRequest other = (GetFaceLivenessSessionResultsRequest) obj;

        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null
                && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        return true;
    }
}
