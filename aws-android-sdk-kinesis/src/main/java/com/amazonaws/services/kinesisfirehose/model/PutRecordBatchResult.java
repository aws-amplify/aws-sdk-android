/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of PutRecordBatch.
 * </p>
 */
public class PutRecordBatchResult implements Serializable {

    /**
     * The number of unsuccessfully written records.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer failedPutCount;

    /**
     * The results for the individual records. The index of each element
     * matches the same index in which records were sent.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PutRecordBatchResponseEntry> requestResponses;

    /**
     * The number of unsuccessfully written records.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The number of unsuccessfully written records.
     */
    public Integer getFailedPutCount() {
        return failedPutCount;
    }
    
    /**
     * The number of unsuccessfully written records.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param failedPutCount The number of unsuccessfully written records.
     */
    public void setFailedPutCount(Integer failedPutCount) {
        this.failedPutCount = failedPutCount;
    }
    
    /**
     * The number of unsuccessfully written records.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param failedPutCount The number of unsuccessfully written records.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutRecordBatchResult withFailedPutCount(Integer failedPutCount) {
        this.failedPutCount = failedPutCount;
        return this;
    }

    /**
     * The results for the individual records. The index of each element
     * matches the same index in which records were sent.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @return The results for the individual records. The index of each element
     *         matches the same index in which records were sent.
     */
    public java.util.List<PutRecordBatchResponseEntry> getRequestResponses() {
        if (requestResponses == null) {
              requestResponses = new com.amazonaws.internal.ListWithAutoConstructFlag<PutRecordBatchResponseEntry>();
              requestResponses.setAutoConstruct(true);
        }
        return requestResponses;
    }
    
    /**
     * The results for the individual records. The index of each element
     * matches the same index in which records were sent.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param requestResponses The results for the individual records. The index of each element
     *         matches the same index in which records were sent.
     */
    public void setRequestResponses(java.util.Collection<PutRecordBatchResponseEntry> requestResponses) {
        if (requestResponses == null) {
            this.requestResponses = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PutRecordBatchResponseEntry> requestResponsesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PutRecordBatchResponseEntry>(requestResponses.size());
        requestResponsesCopy.addAll(requestResponses);
        this.requestResponses = requestResponsesCopy;
    }
    
    /**
     * The results for the individual records. The index of each element
     * matches the same index in which records were sent.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param requestResponses The results for the individual records. The index of each element
     *         matches the same index in which records were sent.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutRecordBatchResult withRequestResponses(PutRecordBatchResponseEntry... requestResponses) {
        if (getRequestResponses() == null) setRequestResponses(new java.util.ArrayList<PutRecordBatchResponseEntry>(requestResponses.length));
        for (PutRecordBatchResponseEntry value : requestResponses) {
            getRequestResponses().add(value);
        }
        return this;
    }
    
    /**
     * The results for the individual records. The index of each element
     * matches the same index in which records were sent.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param requestResponses The results for the individual records. The index of each element
     *         matches the same index in which records were sent.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutRecordBatchResult withRequestResponses(java.util.Collection<PutRecordBatchResponseEntry> requestResponses) {
        if (requestResponses == null) {
            this.requestResponses = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PutRecordBatchResponseEntry> requestResponsesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PutRecordBatchResponseEntry>(requestResponses.size());
            requestResponsesCopy.addAll(requestResponses);
            this.requestResponses = requestResponsesCopy;
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
        if (getFailedPutCount() != null) sb.append("FailedPutCount: " + getFailedPutCount() + ",");
        if (getRequestResponses() != null) sb.append("RequestResponses: " + getRequestResponses() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFailedPutCount() == null) ? 0 : getFailedPutCount().hashCode()); 
        hashCode = prime * hashCode + ((getRequestResponses() == null) ? 0 : getRequestResponses().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutRecordBatchResult == false) return false;
        PutRecordBatchResult other = (PutRecordBatchResult)obj;
        
        if (other.getFailedPutCount() == null ^ this.getFailedPutCount() == null) return false;
        if (other.getFailedPutCount() != null && other.getFailedPutCount().equals(this.getFailedPutCount()) == false) return false; 
        if (other.getRequestResponses() == null ^ this.getRequestResponses() == null) return false;
        if (other.getRequestResponses() != null && other.getRequestResponses().equals(this.getRequestResponses()) == false) return false; 
        return true;
    }
    
}
    