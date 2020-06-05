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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

public class CreateBatchInferenceJobResult implements Serializable {
    /**
     * <p>
     * The ARN of the batch inference job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String batchInferenceJobArn;

    /**
     * <p>
     * The ARN of the batch inference job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The ARN of the batch inference job.
     *         </p>
     */
    public String getBatchInferenceJobArn() {
        return batchInferenceJobArn;
    }

    /**
     * <p>
     * The ARN of the batch inference job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param batchInferenceJobArn <p>
     *            The ARN of the batch inference job.
     *            </p>
     */
    public void setBatchInferenceJobArn(String batchInferenceJobArn) {
        this.batchInferenceJobArn = batchInferenceJobArn;
    }

    /**
     * <p>
     * The ARN of the batch inference job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param batchInferenceJobArn <p>
     *            The ARN of the batch inference job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBatchInferenceJobResult withBatchInferenceJobArn(String batchInferenceJobArn) {
        this.batchInferenceJobArn = batchInferenceJobArn;
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
        if (getBatchInferenceJobArn() != null)
            sb.append("batchInferenceJobArn: " + getBatchInferenceJobArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBatchInferenceJobArn() == null) ? 0 : getBatchInferenceJobArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBatchInferenceJobResult == false)
            return false;
        CreateBatchInferenceJobResult other = (CreateBatchInferenceJobResult) obj;

        if (other.getBatchInferenceJobArn() == null ^ this.getBatchInferenceJobArn() == null)
            return false;
        if (other.getBatchInferenceJobArn() != null
                && other.getBatchInferenceJobArn().equals(this.getBatchInferenceJobArn()) == false)
            return false;
        return true;
    }
}
