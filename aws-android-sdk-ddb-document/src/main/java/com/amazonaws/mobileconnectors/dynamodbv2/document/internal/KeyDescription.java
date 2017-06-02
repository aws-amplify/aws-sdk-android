package com.amazonaws.mobileconnectors.dynamodbv2.document.internal;

import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.Primitive.DynamoDBPrimitiveType;

public class KeyDescription {
    private DynamoDBPrimitiveType type;
    private boolean hash;

    public DynamoDBPrimitiveType getType() {
        return type;
    }

    public void setType(DynamoDBPrimitiveType type) {
        this.type = type;
    }
    public boolean isHash() {
        return hash;
    }

    public void setHash(boolean hash) {
        this.hash = hash;
    }

}