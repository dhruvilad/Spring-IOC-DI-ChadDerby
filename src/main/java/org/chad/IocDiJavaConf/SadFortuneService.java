package org.chad.IocDiJavaConf;

import org.chad.IocDiAnnotation.FortuneService;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "today is a sad day............";
    }
}
