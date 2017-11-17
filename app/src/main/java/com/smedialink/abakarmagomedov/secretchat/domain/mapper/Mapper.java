package com.smedialink.abakarmagomedov.secretchat.domain.mapper;

/**
 * Created by abakarmagomedov on 17/11/2017.
 */

public interface Mapper<FROM, TO> {

    TO mapTo(FROM t);
    FROM mapFrom(TO m);
}
