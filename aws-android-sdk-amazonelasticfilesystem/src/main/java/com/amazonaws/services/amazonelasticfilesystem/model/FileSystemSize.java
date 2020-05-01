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

package com.amazonaws.services.amazonelasticfilesystem.model;

import java.io.Serializable;

/**
 * <p>
 * The latest known metered size (in bytes) of data stored in the file system,
 * in its <code>Value</code> field, and the time at which that size was
 * determined in its <code>Timestamp</code> field. The value doesn't represent
 * the size of a consistent snapshot of the file system, but it is eventually
 * consistent when there are no writes to the file system. That is, the value
 * represents the actual size only if the file system is not modified for a
 * period longer than a couple of hours. Otherwise, the value is not necessarily
 * the exact size the file system was at any instant in time.
 * </p>
 */
public class FileSystemSize implements Serializable {
    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the file
     * system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long value;

    /**
     * <p>
     * The time at which the size of data, returned in the <code>Value</code>
     * field, was determined. The value is the integer number of seconds since
     * 1970-01-01T00:00:00Z.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the Infrequent
     * Access storage class.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long valueInIA;

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the Standard
     * storage class.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long valueInStandard;

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the file
     * system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The latest known metered size (in bytes) of data stored in the
     *         file system.
     *         </p>
     */
    public Long getValue() {
        return value;
    }

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the file
     * system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param value <p>
     *            The latest known metered size (in bytes) of data stored in the
     *            file system.
     *            </p>
     */
    public void setValue(Long value) {
        this.value = value;
    }

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the file
     * system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param value <p>
     *            The latest known metered size (in bytes) of data stored in the
     *            file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSystemSize withValue(Long value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The time at which the size of data, returned in the <code>Value</code>
     * field, was determined. The value is the integer number of seconds since
     * 1970-01-01T00:00:00Z.
     * </p>
     *
     * @return <p>
     *         The time at which the size of data, returned in the
     *         <code>Value</code> field, was determined. The value is the
     *         integer number of seconds since 1970-01-01T00:00:00Z.
     *         </p>
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * The time at which the size of data, returned in the <code>Value</code>
     * field, was determined. The value is the integer number of seconds since
     * 1970-01-01T00:00:00Z.
     * </p>
     *
     * @param timestamp <p>
     *            The time at which the size of data, returned in the
     *            <code>Value</code> field, was determined. The value is the
     *            integer number of seconds since 1970-01-01T00:00:00Z.
     *            </p>
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time at which the size of data, returned in the <code>Value</code>
     * field, was determined. The value is the integer number of seconds since
     * 1970-01-01T00:00:00Z.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            The time at which the size of data, returned in the
     *            <code>Value</code> field, was determined. The value is the
     *            integer number of seconds since 1970-01-01T00:00:00Z.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSystemSize withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the Infrequent
     * Access storage class.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The latest known metered size (in bytes) of data stored in the
     *         Infrequent Access storage class.
     *         </p>
     */
    public Long getValueInIA() {
        return valueInIA;
    }

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the Infrequent
     * Access storage class.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param valueInIA <p>
     *            The latest known metered size (in bytes) of data stored in the
     *            Infrequent Access storage class.
     *            </p>
     */
    public void setValueInIA(Long valueInIA) {
        this.valueInIA = valueInIA;
    }

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the Infrequent
     * Access storage class.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param valueInIA <p>
     *            The latest known metered size (in bytes) of data stored in the
     *            Infrequent Access storage class.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSystemSize withValueInIA(Long valueInIA) {
        this.valueInIA = valueInIA;
        return this;
    }

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the Standard
     * storage class.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The latest known metered size (in bytes) of data stored in the
     *         Standard storage class.
     *         </p>
     */
    public Long getValueInStandard() {
        return valueInStandard;
    }

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the Standard
     * storage class.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param valueInStandard <p>
     *            The latest known metered size (in bytes) of data stored in the
     *            Standard storage class.
     *            </p>
     */
    public void setValueInStandard(Long valueInStandard) {
        this.valueInStandard = valueInStandard;
    }

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the Standard
     * storage class.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param valueInStandard <p>
     *            The latest known metered size (in bytes) of data stored in the
     *            Standard storage class.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSystemSize withValueInStandard(Long valueInStandard) {
        this.valueInStandard = valueInStandard;
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
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp() + ",");
        if (getValueInIA() != null)
            sb.append("ValueInIA: " + getValueInIA() + ",");
        if (getValueInStandard() != null)
            sb.append("ValueInStandard: " + getValueInStandard());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getValueInIA() == null) ? 0 : getValueInIA().hashCode());
        hashCode = prime * hashCode
                + ((getValueInStandard() == null) ? 0 : getValueInStandard().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileSystemSize == false)
            return false;
        FileSystemSize other = (FileSystemSize) obj;

        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getValueInIA() == null ^ this.getValueInIA() == null)
            return false;
        if (other.getValueInIA() != null
                && other.getValueInIA().equals(this.getValueInIA()) == false)
            return false;
        if (other.getValueInStandard() == null ^ this.getValueInStandard() == null)
            return false;
        if (other.getValueInStandard() != null
                && other.getValueInStandard().equals(this.getValueInStandard()) == false)
            return false;
        return true;
    }
}
