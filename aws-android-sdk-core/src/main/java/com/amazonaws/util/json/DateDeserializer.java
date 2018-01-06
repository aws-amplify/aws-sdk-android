package com.amazonaws.util.json;

import com.amazonaws.util.DateUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * The DateDeserializer class.
 */
public class DateDeserializer implements JsonDeserializer<Date>, JsonSerializer<Date> {

    private SimpleDateFormat mSimpleDateFormat;
    private final List<String> dateFormats;
    private final SimpleDateFormat mIso8601DateFormat;

    /**
     * Constructor.
     * @param dateFormats the array of date formats.
     */
    public DateDeserializer(String[] dateFormats) {
        this.dateFormats = Arrays.asList(dateFormats);
        this.mIso8601DateFormat = new SimpleDateFormat(DateUtils.ISO8601_DATE_PATTERN);
    }

    @Override
    @SuppressWarnings("checkstyle:emptyblock")
    public Date deserialize(JsonElement element, Type arg1, JsonDeserializationContext context) {
        final String dateString = element.getAsString();
        Date date = null;
        for (final String df : dateFormats) {
            try {
                date = new Date();
                mSimpleDateFormat = new SimpleDateFormat(df);
                date.setTime(mSimpleDateFormat.parse(dateString).getTime());
                return date;
            } catch (final ParseException e) {
                // swallow , will try next type of date format
            }
        }
        // default to default implementation
        try {
            return DateFormat.getDateInstance(DateFormat.DEFAULT).parse(dateString);
        } catch (final ParseException e) {
            throw new JsonParseException(e.getMessage(), e);
        }

    }

    @Override
    public JsonElement serialize(Date src, Type typeOfSrc,
            JsonSerializationContext context) {
        synchronized (mIso8601DateFormat) {
            final String dateFormatAsString = mIso8601DateFormat.format(src);
            return new JsonPrimitive(dateFormatAsString);
        }
    }
}
