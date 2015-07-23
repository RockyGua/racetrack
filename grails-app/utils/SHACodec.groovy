import java.security.MessageDigest

/*
 * Copyright (C) 2015 Epic Games, Inc. All Rights Reserved.
 */

class SHACodec {

    static encode = {target ->
        MessageDigest md = MessageDigest.getInstance('SHA')
        md.update(target.getBytes('UTF-8'));
        return new String(md.digest()).encodeAsBase64()
    }

}
