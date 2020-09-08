package com.jb.Coupon_System_20;


import com.jb.Coupon_System_20.rest.ClientSession;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.Map;

@Component
public class SessionCheck {
    int deleteTimeInMSec = 180000;
    private Map<String, ClientSession> tokensMap;

    public SessionCheck(@Qualifier("tokens") Map<String, ClientSession> tokensMap) {
        this.tokensMap = tokensMap;
    }

    @Scheduled(fixedRate = 500)
    public void check() {

        Iterator<Map.Entry<String, ClientSession>> iterator = tokensMap.entrySet().iterator();

        while (iterator.hasNext()) {
            long lastAccessMillis = iterator.next().getValue().getLastAccessMillis();
            long timePass = System.currentTimeMillis() - lastAccessMillis;

            if (timePass > deleteTimeInMSec)
                iterator.remove();
        }
    }
}
