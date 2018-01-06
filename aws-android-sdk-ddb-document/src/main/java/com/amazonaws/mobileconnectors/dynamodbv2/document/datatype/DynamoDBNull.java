package com.amazonaws.mobileconnectors.dynamodbv2.document.datatype;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * A DynamoDBEntry that represents a DynamoDB null (NULL) type.
 */
public class DynamoDBNull extends DynamoDBEntry {

    /**
     * Constructor.
     */
    public DynamoDBNull() {
    }

    /**
     * Constant DynamoDBNull for the Null value.
     */
    public static final DynamoDBNull NULL = new DynamoDBNull();

    @Override
    public AttributeValue convertToAttributeValue() {
        final AttributeValue nullValue = new AttributeValue();
        nullValue.setNULL(true);
        return nullValue;
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

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

}
