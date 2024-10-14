package com.osmeldevs.base.name.application.configuration;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.osmeldevs.base.name.application.exception.ValueDeserializationException;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.util.UUID;

@RequiredArgsConstructor
public class UUIDDeserializer extends JsonDeserializer<UUID> {

    @SneakyThrows
    @Override
    public UUID deserialize(
            JsonParser jsonParser, DeserializationContext deserializationContext
    ) {
        String uuid = jsonParser.getValueAsString();
        String fieldName = jsonParser.currentName();
        try {
            return UUID.fromString(uuid);
        } catch (IllegalArgumentException e) {
            throw new ValueDeserializationException("cannot.deserialize.to.uuid", fieldName, e);
        }
    }

}

