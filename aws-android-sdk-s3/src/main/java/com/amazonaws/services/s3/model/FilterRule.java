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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the Amazon S3 object key name to filter on and whether to filter on
 * the suffix or prefix of the key name.
 * </p>
 */
public class FilterRule implements Serializable {
    /**
     * <p>
     * The object key name prefix or suffix identifying one or more objects to
     * which the filtering rule applies. The maximum length is 1,024 characters.
     * Overlapping prefixes and suffixes are not supported. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     * >Configuring Event Notifications</a> in the <i>Amazon Simple Storage
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>prefix, suffix
     */
    private String name;

    /**
     * <p>
     * The value that the filter searches for in object key names.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The object key name prefix or suffix identifying one or more objects to
     * which the filtering rule applies. The maximum length is 1,024 characters.
     * Overlapping prefixes and suffixes are not supported. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     * >Configuring Event Notifications</a> in the <i>Amazon Simple Storage
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>prefix, suffix
     *
     * @return <p>
     *         The object key name prefix or suffix identifying one or more
     *         objects to which the filtering rule applies. The maximum length
     *         is 1,024 characters. Overlapping prefixes and suffixes are not
     *         supported. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     *         >Configuring Event Notifications</a> in the <i>Amazon Simple
     *         Storage Service Developer Guide</i>.
     *         </p>
     * @see FilterRuleName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The object key name prefix or suffix identifying one or more objects to
     * which the filtering rule applies. The maximum length is 1,024 characters.
     * Overlapping prefixes and suffixes are not supported. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     * >Configuring Event Notifications</a> in the <i>Amazon Simple Storage
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>prefix, suffix
     *
     * @param name <p>
     *            The object key name prefix or suffix identifying one or more
     *            objects to which the filtering rule applies. The maximum
     *            length is 1,024 characters. Overlapping prefixes and suffixes
     *            are not supported. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     *            >Configuring Event Notifications</a> in the <i>Amazon Simple
     *            Storage Service Developer Guide</i>.
     *            </p>
     * @see FilterRuleName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The object key name prefix or suffix identifying one or more objects to
     * which the filtering rule applies. The maximum length is 1,024 characters.
     * Overlapping prefixes and suffixes are not supported. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     * >Configuring Event Notifications</a> in the <i>Amazon Simple Storage
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>prefix, suffix
     *
     * @param name <p>
     *            The object key name prefix or suffix identifying one or more
     *            objects to which the filtering rule applies. The maximum
     *            length is 1,024 characters. Overlapping prefixes and suffixes
     *            are not supported. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     *            >Configuring Event Notifications</a> in the <i>Amazon Simple
     *            Storage Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FilterRuleName
     */
    public FilterRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The object key name prefix or suffix identifying one or more objects to
     * which the filtering rule applies. The maximum length is 1,024 characters.
     * Overlapping prefixes and suffixes are not supported. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     * >Configuring Event Notifications</a> in the <i>Amazon Simple Storage
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>prefix, suffix
     *
     * @param name <p>
     *            The object key name prefix or suffix identifying one or more
     *            objects to which the filtering rule applies. The maximum
     *            length is 1,024 characters. Overlapping prefixes and suffixes
     *            are not supported. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     *            >Configuring Event Notifications</a> in the <i>Amazon Simple
     *            Storage Service Developer Guide</i>.
     *            </p>
     * @see FilterRuleName
     */
    public void setName(FilterRuleName name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * The object key name prefix or suffix identifying one or more objects to
     * which the filtering rule applies. The maximum length is 1,024 characters.
     * Overlapping prefixes and suffixes are not supported. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     * >Configuring Event Notifications</a> in the <i>Amazon Simple Storage
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>prefix, suffix
     *
     * @param name <p>
     *            The object key name prefix or suffix identifying one or more
     *            objects to which the filtering rule applies. The maximum
     *            length is 1,024 characters. Overlapping prefixes and suffixes
     *            are not supported. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     *            >Configuring Event Notifications</a> in the <i>Amazon Simple
     *            Storage Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FilterRuleName
     */
    public FilterRule withName(FilterRuleName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The value that the filter searches for in object key names.
     * </p>
     *
     * @return <p>
     *         The value that the filter searches for in object key names.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value that the filter searches for in object key names.
     * </p>
     *
     * @param value <p>
     *            The value that the filter searches for in object key names.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value that the filter searches for in object key names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value that the filter searches for in object key names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FilterRule withValue(String value) {
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterRule == false)
            return false;
        FilterRule other = (FilterRule) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
