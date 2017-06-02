package com.amazonaws.mobileconnectors.dynamodbv2.document.internal;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import java.util.HashMap;
import java.util.Map;

public class Key extends HashMap<String, AttributeValue> {

    public Key() {
        this(new HashMap<String, AttributeValue>());
    }

    public Key(Map<String, AttributeValue> paramMap) {
        super(paramMap);
    }
}
