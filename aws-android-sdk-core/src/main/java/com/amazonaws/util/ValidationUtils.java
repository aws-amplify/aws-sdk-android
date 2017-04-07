package com.amazonaws.util;

import java.util.Collection;

/**
 * ValidationUtils class.
 */
public class ValidationUtils {
    /**
     * Asserts that the given object is non-null and returns it.
     *
     * @param object Object to assert on
     * @param fieldName Field name to display in exception message if null
     * @param <T> the type of object.
     * @return Object if non null
     */
    public static <T> T assertNotNull(T object, String fieldName) {
        if (object == null) {
            throw new IllegalArgumentException(String.format("%s cannot be null", fieldName));
        }
        return object;
    }

    /**
     * <p>
     * Asserts that the specified parameter value is not <code>null</code> and
     * if it is, throws an <code>IllegalArgumentException</code> with the
     * specified error message.
     * </p>
     *
     * @param parameterValue The parameter value being checked.
     * @param errorMessage The error message to include in the
     *            IllegalArgumentException if the specified parameter is null.
     */
    public static void assertParameterNotNull(Object parameterValue, String errorMessage) {
        if (parameterValue == null) {
            throw new IllegalArgumentException(errorMessage);
        }
    }

    /**
     * Asserts that all of the objects are null.
     * @param messageIfNull message.
     * @param objects objects.
     * @throws IllegalArgumentException if any object provided was NOT null.
     */
    public static void assertAllAreNull(String messageIfNull, Object... objects) {
        for (final Object object : objects) {
            if (object != null) {
                throw new IllegalArgumentException(messageIfNull);
            }
        }
    }

    /**
     * Asserts that the given number is positive (non-negative and non-zero).
     *
     * @param num Number to validate
     * @param fieldName Field name to display in exception message if not
     *            positive.
     * @return Number if positive.
     */
    public static int assertIsPositive(int num, String fieldName) {
        if (num <= 0) {
            throw new IllegalArgumentException(String.format("%s must be positive", fieldName));
        }
        return num;
    }

    /**
     * Asserts that it is not empty.
     * @param collection collection.
     * @param fieldName field name.
     * @param <T> the collection type.
     * @return collection.
     */
    public static <T extends Collection<?>> T assertNotEmpty(T collection, String fieldName) {
        assertNotNull(collection, fieldName);
        if (collection.isEmpty()) {
            throw new IllegalArgumentException(String.format("%s cannot be empty", fieldName));
        }
        return collection;
    }

    /**
     * Asserts that it is not empty.
     * @param array array.
     * @param fieldName field name.
     * @param <T> array type.
     * @return array.
     */
    public static <T> T[] assertNotEmpty(T[] array, String fieldName) {
        assertNotNull(array, fieldName);
        if (array.length == 0) {
            throw new IllegalArgumentException(String.format("%s cannot be empty", fieldName));
        }
        return array;
    }

    /**
     * Asserts that the string is not empty.
     * @param string the string.
     * @param fieldName the field name.
     * @return the string.
     */
    public static String assertStringNotEmpty(String string, String fieldName) {
        assertNotNull(string, fieldName);
        if (string.isEmpty()) {
            throw new IllegalArgumentException(String.format("%s cannot be empty", fieldName));
        }
        return string;
    }
}
