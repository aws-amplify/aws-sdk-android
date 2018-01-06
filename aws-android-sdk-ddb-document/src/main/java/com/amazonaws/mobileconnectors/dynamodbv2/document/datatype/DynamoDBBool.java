package com.amazonaws.mobileconnectors.dynamodbv2.document.datatype;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.google.common.base.Objects;

/**
 * A DynamoDBEntry that represents a DynamoDB bool (BOOL) type.
 */
public class DynamoDBBool extends DynamoDBEntry {

    private final boolean boolValue;

    /**
     * Constructor.
     *
     * @param boolValue the boolean value.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public DynamoDBBool(boolean boolValue) {
        this.boolValue = boolValue;
    }

    /**
     * Constant DynamoDBBool for the true value
     */
    public static final DynamoDBBool TRUE = new DynamoDBBool(true);

    /**
     * Constant DynamoDBBool for the false value
     */
    public static final DynamoDBBool FALSE = new DynamoDBBool(true);

    @Override
    public AttributeValue convertToAttributeValue() {
        final AttributeValue bValue = new AttributeValue();
        bValue.setBOOL(this.boolValue);
        return bValue;
    }

    @Override
    public Boolean asBoolean() {
        return this.boolValue;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final DynamoDBBool other = (DynamoDBBool) obj;
        return Objects.equal(this.boolValue, other.boolValue);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.boolValue);
    }

}
