package com.guman.common.json.joda;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.datatype.joda.cfg.JacksonJodaDateFormat;
import com.fasterxml.jackson.datatype.joda.deser.DateTimeDeserializer;

import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.format.DateTimeFormat;

/**
 * @author duanhaoran
 * @since 2019/4/15 7:53 PM
 */
public class JodaModule extends com.fasterxml.jackson.datatype.joda.JodaModule {

    protected JacksonJodaDateFormat jacksonJodaDateFormat;

    public JodaModule(String pattern) {
        jacksonJodaDateFormat = new JacksonJodaDateFormat(DateTimeFormat.forPattern(pattern));
        addSerializer(DateTime.class, new DateTimeSerializer(jacksonJodaDateFormat, false));
        addDeserializer(DateTime.class, forType(DateTime.class));
    }

    @SuppressWarnings("unchecked")
    public <T extends ReadableInstant> JsonDeserializer<T> forType(Class<T> cls) {
        return (JsonDeserializer<T>) new DateTimeDeserializer(cls, jacksonJodaDateFormat);
    }
}