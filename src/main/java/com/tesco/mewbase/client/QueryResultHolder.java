package com.tesco.mewbase.client;

import com.tesco.mewbase.bson.BsonObject;

/**
 * Created by tim on 22/09/16.
 */
public interface QueryResultHolder {

    BsonObject document();

    void done();
}
