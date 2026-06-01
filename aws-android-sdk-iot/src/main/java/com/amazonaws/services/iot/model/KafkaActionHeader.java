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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies a Kafka header using key-value pairs when you create a Rule’s Kafka
 * Action. You can use these headers to route data from IoT clients to
 * downstream Kafka clusters without modifying your message payload.
 * </p>
 * <p>
 * For more information about Rule's Kafka action, see <a href=
 * "https://docs.aws.amazon.com/iot/latest/developerguide/apache-kafka-rule-action.html"
 * >Apache Kafka</a>.
 * </p>
 */
public class KafkaActionHeader implements Serializable {
    /**
     * <p>
     * The key of the Kafka header.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 16384<br/>
     */
    private String key;

    /**
     * <p>
     * The value of the Kafka header.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 16384<br/>
     */
    private String value;

    /**
     * <p>
     * The key of the Kafka header.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 16384<br/>
     *
     * @return <p>
     *         The key of the Kafka header.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The key of the Kafka header.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 16384<br/>
     *
     * @param key <p>
     *            The key of the Kafka header.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key of the Kafka header.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 16384<br/>
     *
     * @param key <p>
     *            The key of the Kafka header.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KafkaActionHeader withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The value of the Kafka header.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 16384<br/>
     *
     * @return <p>
     *         The value of the Kafka header.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value of the Kafka header.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 16384<br/>
     *
     * @param value <p>
     *            The value of the Kafka header.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the Kafka header.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 16384<br/>
     *
     * @param value <p>
     *            The value of the Kafka header.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KafkaActionHeader withValue(String value) {
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
        if (getKey() != null)
            sb.append("key: " + getKey() + ",");
        if (getValue() != null)
            sb.append("value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KafkaActionHeader == false)
            return false;
        KafkaActionHeader other = (KafkaActionHeader) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
