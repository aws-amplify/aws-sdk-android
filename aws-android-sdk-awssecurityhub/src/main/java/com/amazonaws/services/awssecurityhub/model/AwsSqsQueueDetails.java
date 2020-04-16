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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * Data about a queue.
 * </p>
 */
public class AwsSqsQueueDetails implements Serializable {
    /**
     * <p>
     * The length of time, in seconds, for which Amazon SQS can reuse a data key
     * to encrypt or decrypt messages before calling AWS KMS again.
     * </p>
     */
    private Integer kmsDataKeyReusePeriodSeconds;

    /**
     * <p>
     * The ID of an AWS-managed customer master key (CMK) for Amazon SQS or a
     * custom CMK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String kmsMasterKeyId;

    /**
     * <p>
     * The name of the new queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String queueName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon
     * SQS moves messages after the value of <code>maxReceiveCount</code> is
     * exceeded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String deadLetterTargetArn;

    /**
     * <p>
     * The length of time, in seconds, for which Amazon SQS can reuse a data key
     * to encrypt or decrypt messages before calling AWS KMS again.
     * </p>
     *
     * @return <p>
     *         The length of time, in seconds, for which Amazon SQS can reuse a
     *         data key to encrypt or decrypt messages before calling AWS KMS
     *         again.
     *         </p>
     */
    public Integer getKmsDataKeyReusePeriodSeconds() {
        return kmsDataKeyReusePeriodSeconds;
    }

    /**
     * <p>
     * The length of time, in seconds, for which Amazon SQS can reuse a data key
     * to encrypt or decrypt messages before calling AWS KMS again.
     * </p>
     *
     * @param kmsDataKeyReusePeriodSeconds <p>
     *            The length of time, in seconds, for which Amazon SQS can reuse
     *            a data key to encrypt or decrypt messages before calling AWS
     *            KMS again.
     *            </p>
     */
    public void setKmsDataKeyReusePeriodSeconds(Integer kmsDataKeyReusePeriodSeconds) {
        this.kmsDataKeyReusePeriodSeconds = kmsDataKeyReusePeriodSeconds;
    }

    /**
     * <p>
     * The length of time, in seconds, for which Amazon SQS can reuse a data key
     * to encrypt or decrypt messages before calling AWS KMS again.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsDataKeyReusePeriodSeconds <p>
     *            The length of time, in seconds, for which Amazon SQS can reuse
     *            a data key to encrypt or decrypt messages before calling AWS
     *            KMS again.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsSqsQueueDetails withKmsDataKeyReusePeriodSeconds(Integer kmsDataKeyReusePeriodSeconds) {
        this.kmsDataKeyReusePeriodSeconds = kmsDataKeyReusePeriodSeconds;
        return this;
    }

    /**
     * <p>
     * The ID of an AWS-managed customer master key (CMK) for Amazon SQS or a
     * custom CMK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ID of an AWS-managed customer master key (CMK) for Amazon SQS
     *         or a custom CMK.
     *         </p>
     */
    public String getKmsMasterKeyId() {
        return kmsMasterKeyId;
    }

    /**
     * <p>
     * The ID of an AWS-managed customer master key (CMK) for Amazon SQS or a
     * custom CMK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param kmsMasterKeyId <p>
     *            The ID of an AWS-managed customer master key (CMK) for Amazon
     *            SQS or a custom CMK.
     *            </p>
     */
    public void setKmsMasterKeyId(String kmsMasterKeyId) {
        this.kmsMasterKeyId = kmsMasterKeyId;
    }

    /**
     * <p>
     * The ID of an AWS-managed customer master key (CMK) for Amazon SQS or a
     * custom CMK.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param kmsMasterKeyId <p>
     *            The ID of an AWS-managed customer master key (CMK) for Amazon
     *            SQS or a custom CMK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsSqsQueueDetails withKmsMasterKeyId(String kmsMasterKeyId) {
        this.kmsMasterKeyId = kmsMasterKeyId;
        return this;
    }

    /**
     * <p>
     * The name of the new queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The name of the new queue.
     *         </p>
     */
    public String getQueueName() {
        return queueName;
    }

    /**
     * <p>
     * The name of the new queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param queueName <p>
     *            The name of the new queue.
     *            </p>
     */
    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    /**
     * <p>
     * The name of the new queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param queueName <p>
     *            The name of the new queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsSqsQueueDetails withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon
     * SQS moves messages after the value of <code>maxReceiveCount</code> is
     * exceeded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the dead-letter queue to which
     *         Amazon SQS moves messages after the value of
     *         <code>maxReceiveCount</code> is exceeded.
     *         </p>
     */
    public String getDeadLetterTargetArn() {
        return deadLetterTargetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon
     * SQS moves messages after the value of <code>maxReceiveCount</code> is
     * exceeded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param deadLetterTargetArn <p>
     *            The Amazon Resource Name (ARN) of the dead-letter queue to
     *            which Amazon SQS moves messages after the value of
     *            <code>maxReceiveCount</code> is exceeded.
     *            </p>
     */
    public void setDeadLetterTargetArn(String deadLetterTargetArn) {
        this.deadLetterTargetArn = deadLetterTargetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon
     * SQS moves messages after the value of <code>maxReceiveCount</code> is
     * exceeded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param deadLetterTargetArn <p>
     *            The Amazon Resource Name (ARN) of the dead-letter queue to
     *            which Amazon SQS moves messages after the value of
     *            <code>maxReceiveCount</code> is exceeded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsSqsQueueDetails withDeadLetterTargetArn(String deadLetterTargetArn) {
        this.deadLetterTargetArn = deadLetterTargetArn;
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
        if (getKmsDataKeyReusePeriodSeconds() != null)
            sb.append("KmsDataKeyReusePeriodSeconds: " + getKmsDataKeyReusePeriodSeconds() + ",");
        if (getKmsMasterKeyId() != null)
            sb.append("KmsMasterKeyId: " + getKmsMasterKeyId() + ",");
        if (getQueueName() != null)
            sb.append("QueueName: " + getQueueName() + ",");
        if (getDeadLetterTargetArn() != null)
            sb.append("DeadLetterTargetArn: " + getDeadLetterTargetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getKmsDataKeyReusePeriodSeconds() == null) ? 0
                        : getKmsDataKeyReusePeriodSeconds().hashCode());
        hashCode = prime * hashCode
                + ((getKmsMasterKeyId() == null) ? 0 : getKmsMasterKeyId().hashCode());
        hashCode = prime * hashCode + ((getQueueName() == null) ? 0 : getQueueName().hashCode());
        hashCode = prime * hashCode
                + ((getDeadLetterTargetArn() == null) ? 0 : getDeadLetterTargetArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsSqsQueueDetails == false)
            return false;
        AwsSqsQueueDetails other = (AwsSqsQueueDetails) obj;

        if (other.getKmsDataKeyReusePeriodSeconds() == null
                ^ this.getKmsDataKeyReusePeriodSeconds() == null)
            return false;
        if (other.getKmsDataKeyReusePeriodSeconds() != null
                && other.getKmsDataKeyReusePeriodSeconds().equals(
                        this.getKmsDataKeyReusePeriodSeconds()) == false)
            return false;
        if (other.getKmsMasterKeyId() == null ^ this.getKmsMasterKeyId() == null)
            return false;
        if (other.getKmsMasterKeyId() != null
                && other.getKmsMasterKeyId().equals(this.getKmsMasterKeyId()) == false)
            return false;
        if (other.getQueueName() == null ^ this.getQueueName() == null)
            return false;
        if (other.getQueueName() != null
                && other.getQueueName().equals(this.getQueueName()) == false)
            return false;
        if (other.getDeadLetterTargetArn() == null ^ this.getDeadLetterTargetArn() == null)
            return false;
        if (other.getDeadLetterTargetArn() != null
                && other.getDeadLetterTargetArn().equals(this.getDeadLetterTargetArn()) == false)
            return false;
        return true;
    }
}
