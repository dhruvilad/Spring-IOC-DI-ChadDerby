package org.chad.IocDiAnnotation;

import org.chad.IocDiAnnotation.Coach;
import org.chad.IocDiAnnotation.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "DatabaseFortuneService............";
    }
}
