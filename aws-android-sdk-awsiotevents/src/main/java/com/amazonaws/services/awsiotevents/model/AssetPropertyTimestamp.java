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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

/**
 * <p>
 * A structure that contains timestamp information. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_TimeInNanos.html"
 * >TimeInNanos</a> in the <i>AWS IoT SiteWise API Reference</i>.
 * </p>
 * <p>
 * For parameters that are string data type, you can specify the following
 * options:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use a string. For example, the <code>timeInSeconds</code> value can be
 * <code>'1586400675'</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use an expression. For example, the <code>timeInSeconds</code> value can be
 * <code>'${$input.TemperatureInput.sensorData.timestamp/1000}'</code>.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html"
 * >Expressions</a> in the <i>AWS IoT Events Developer Guide</i>.
 * </p>
 * </li>
 * </ul>
 */
public class AssetPropertyTimestamp implements Serializable {
    /**
     * <p>
     * The timestamp, in seconds, in the Unix epoch format. The valid range is
     * between 1-31556889864403199. You can also specify an expression.
     * </p>
     */
    private String timeInSeconds;

    /**
     * <p>
     * The nanosecond offset converted from <code>timeInSeconds</code>. The
     * valid range is between 0-999999999. You can also specify an expression.
     * </p>
     */
    private String offsetInNanos;

    /**
     * <p>
     * The timestamp, in seconds, in the Unix epoch format. The valid range is
     * between 1-31556889864403199. You can also specify an expression.
     * </p>
     *
     * @return <p>
     *         The timestamp, in seconds, in the Unix epoch format. The valid
     *         range is between 1-31556889864403199. You can also specify an
     *         expression.
     *         </p>
     */
    public String getTimeInSeconds() {
        return timeInSeconds;
    }

    /**
     * <p>
     * The timestamp, in seconds, in the Unix epoch format. The valid range is
     * between 1-31556889864403199. You can also specify an expression.
     * </p>
     *
     * @param timeInSeconds <p>
     *            The timestamp, in seconds, in the Unix epoch format. The valid
     *            range is between 1-31556889864403199. You can also specify an
     *            expression.
     *            </p>
     */
    public void setTimeInSeconds(String timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }

    /**
     * <p>
     * The timestamp, in seconds, in the Unix epoch format. The valid range is
     * between 1-31556889864403199. You can also specify an expression.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeInSeconds <p>
     *            The timestamp, in seconds, in the Unix epoch format. The valid
     *            range is between 1-31556889864403199. You can also specify an
     *            expression.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetPropertyTimestamp withTimeInSeconds(String timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
        return this;
    }

    /**
     * <p>
     * The nanosecond offset converted from <code>timeInSeconds</code>. The
     * valid range is between 0-999999999. You can also specify an expression.
     * </p>
     *
     * @return <p>
     *         The nanosecond offset converted from <code>timeInSeconds</code>.
     *         The valid range is between 0-999999999. You can also specify an
     *         expression.
     *         </p>
     */
    public String getOffsetInNanos() {
        return offsetInNanos;
    }

    /**
     * <p>
     * The nanosecond offset converted from <code>timeInSeconds</code>. The
     * valid range is between 0-999999999. You can also specify an expression.
     * </p>
     *
     * @param offsetInNanos <p>
     *            The nanosecond offset converted from
     *            <code>timeInSeconds</code>. The valid range is between
     *            0-999999999. You can also specify an expression.
     *            </p>
     */
    public void setOffsetInNanos(String offsetInNanos) {
        this.offsetInNanos = offsetInNanos;
    }

    /**
     * <p>
     * The nanosecond offset converted from <code>timeInSeconds</code>. The
     * valid range is between 0-999999999. You can also specify an expression.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param offsetInNanos <p>
     *            The nanosecond offset converted from
     *            <code>timeInSeconds</code>. The valid range is between
     *            0-999999999. You can also specify an expression.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetPropertyTimestamp withOffsetInNanos(String offsetInNanos) {
        this.offsetInNanos = offsetInNanos;
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
        if (getTimeInSeconds() != null)
            sb.append("timeInSeconds: " + getTimeInSeconds() + ",");
        if (getOffsetInNanos() != null)
            sb.append("offsetInNanos: " + getOffsetInNanos());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTimeInSeconds() == null) ? 0 : getTimeInSeconds().hashCode());
        hashCode = prime * hashCode
                + ((getOffsetInNanos() == null) ? 0 : getOffsetInNanos().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetPropertyTimestamp == false)
            return false;
        AssetPropertyTimestamp other = (AssetPropertyTimestamp) obj;

        if (other.getTimeInSeconds() == null ^ this.getTimeInSeconds() == null)
            return false;
        if (other.getTimeInSeconds() != null
                && other.getTimeInSeconds().equals(this.getTimeInSeconds()) == false)
            return false;
        if (other.getOffsetInNanos() == null ^ this.getOffsetInNanos() == null)
            return false;
        if (other.getOffsetInNanos() != null
                && other.getOffsetInNanos().equals(this.getOffsetInNanos()) == false)
            return false;
        return true;
    }
}
